/* -------------------------------------------------------------------------- *
 * OpenSim: OneMarkerNode.java                                                *
 * -------------------------------------------------------------------------- *
 * OpenSim is a toolkit for musculoskeletal modeling and simulation,          *
 * developed as an open source project by a worldwide community. Development  *
 * and support is coordinated from Stanford University, with funding from the *
 * U.S. NIH and DARPA. See http://opensim.stanford.edu and the README file    *
 * for more information including specific grant numbers.                     *
 *                                                                            *
 * Copyright (c) 2005-2017 Stanford University and the Authors                *
 * Author(s): Ayman Habib                                                     *
 *                                                                            *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may    *
 * not use this file except in compliance with the License. You may obtain a  *
 * copy of the License at http://www.apache.org/licenses/LICENSE-2.0          *
 *                                                                            *
 * Unless required by applicable law or agreed to in writing, software        *
 * distributed under the License is distributed on an "AS IS" BASIS,          *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.   *
 * See the License for the specific language governing permissions and        *
 * limitations under the License.                                             *
 * -------------------------------------------------------------------------- */
package org.opensim.view.nodes;

import java.awt.Image;
import java.beans.PropertyEditorSupport;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.undo.AbstractUndoableEdit;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.nodes.PropertySupport;
import org.openide.nodes.PropertySupport.Reflection;
import org.openide.nodes.Sheet;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle;
import org.opensim.modeling.AbstractSocket;
import org.opensim.modeling.Component;
import org.opensim.modeling.Marker;
import org.opensim.modeling.Model;
import org.opensim.modeling.OpenSimContext;
import org.opensim.modeling.OpenSimObject;
import org.opensim.modeling.PhysicalFrame;
import org.opensim.view.ExplorerTopComponent;
import org.opensim.view.SingleModelGuiElements;
import org.opensim.view.markerEditor.OneMarkerDeleteAction;
import org.opensim.view.nodes.OpenSimObjectNode.displayOption;
import org.opensim.view.pub.OpenSimDB;
import org.opensim.view.pub.ViewDB;

/** Node class to wrap AbstractMarker objects */
public class OneMarkerNode extends OneComponentNode{
   private static ResourceBundle bundle = NbBundle.getBundle(OneMarkerNode.class);
   public OneMarkerNode(OpenSimObject b) {
      super(b);
      setChildren(Children.LEAF);      
      addDisplayOption(displayOption.Isolatable);
      addDisplayOption(displayOption.Showable);
   }

    public Node cloneNode() {
        return new OneMarkerNode(getOpenSimObject());
    }
    /**
     * Icon for the marker node 
     **/
    public Image getIcon(int i) {
        URL imageURL = this.getClass().getResource("/org/opensim/view/nodes/icons/markerNode.png");
        if (imageURL != null) {
            return new ImageIcon(imageURL, "Marker").getImage();
        } else {
            return null;
        }
    }

    public Image getOpenedIcon(int i) {
        return getIcon(i);
    }

    public Action[] getActions(boolean b) {
        // Get actions from parent (generic object menu for review, display)
        Action[] superActions = (Action[]) super.getActions(b);
        // Arrays are fixed size, onvert to a List
        List<Action> actions = java.util.Arrays.asList(superActions);
        // Create new Array of proper size
        Action[] retActions = new Action[actions.size()+1];
        actions.toArray(retActions);
        // append new command to the end of the list of actions
        //retActions[actions.size()] = new MarkerEditorAction();
        try {
            retActions[actions.size()] = (OneMarkerDeleteAction) OneMarkerDeleteAction.findObject(
                     (Class)Class.forName("org.opensim.view.markerEditor.OneMarkerDeleteAction"), true);
        } catch (ClassNotFoundException ex) {
            Exceptions.printStackTrace(ex);
        }
        return retActions;
    }

    @Override
    public Sheet createSheet() {
        Sheet sheet;

        sheet = super.createSheet();
        Sheet.Set set = sheet.get(Sheet.PROPERTIES);
        // Add property for Location
        Marker obj = Marker.safeDownCast(getOpenSimObject());
        MarkerAdapter gMarker = new MarkerAdapter(obj);
        Model theModel = getModelForNode();
        try {
            
            set.remove("name");
            Reflection nextNodeProp = createNodePropForObjectName(obj, theModel, true);
            if (nextNodeProp != null) {
                nextNodeProp.setName("name");
                nextNodeProp.setShortDescription("Name of the Object");
                nextNodeProp.setValue("suppressCustomEditor", Boolean.TRUE);
                set.put(nextNodeProp);
            }

            // customize offset
            set.remove("location");
            PropertySupport.Reflection locationNodeProp;
            locationNodeProp = new PropertySupport.Reflection(gMarker, String.class, "getOffsetString", "setOffsetString");
            ((Node.Property) locationNodeProp).setValue("oneline", Boolean.TRUE);
            ((Node.Property) locationNodeProp).setValue("suppressCustomEditor", Boolean.TRUE);
            locationNodeProp.setName("location");
            locationNodeProp.setShortDescription(getPropertyComment("location"));
            set.put(locationNodeProp);
            // Also replace seocket so we can fix frame/location
            Sheet.Set setSockets = sheet.get(Sheet.EXPERT);
            setSockets.remove("PhysicalFrame:parent_frame");
            AbstractSocket sock = obj.getSocket("parent_frame");
            String connecteeType = sock.getConnecteeTypeName();
            String connectionName = sock.getName();
            
            PropertySupport.Reflection nextNodePropFrame = 
                    new PropertySupport.Reflection(this,
                    String.class,
                    "getConnectedToFrame",
                    "setConnectedToFrame");
            nextNodePropFrame.setValue("canEditAsText", Boolean.TRUE);
            nextNodePropFrame.setValue("suppressCustomEditor", Boolean.TRUE);
            nextNodePropFrame.setName(connecteeType + ":" + connectionName);
            PropertyEditorSupport editor = EditorRegistry.getEditor(connecteeType);
            if (editor != null)
                nextNodePropFrame.setPropertyEditorClass(editor.getClass());
            setSockets.put(nextNodePropFrame);
           
        } catch (NoSuchMethodException ex) {
            Exceptions.printStackTrace(ex);
        }

        return sheet;
    }
    public String getConnectedToFrame() {
        Marker obj = Marker.safeDownCast(getOpenSimObject());
        return obj.getParentFrame().getName();
    }
    public void setConnectedToFrame(String newParentFrame) {
        Marker obj = Marker.safeDownCast(getOpenSimObject());
        Model model = getModelForNode();
        OpenSimContext context = OpenSimDB.getInstance().getContext(model);
        Component comp=model.getComponent(newParentFrame);
        final String saveFrame= getConnectedToFrame();
        final String newFrame = newParentFrame;
        //        
        AbstractUndoableEdit auEdit = new AbstractUndoableEdit(){
           public boolean canUndo() {
               return true;
           }
           public boolean canRedo() {
               return true;
           }
           public void undo() throws CannotUndoException {
               super.undo();
               setConnectedToFrame(saveFrame);
           }
           public void redo() throws CannotRedoException {
               super.redo();
               setConnectedToFrame(newFrame);
           }

           @Override
           public String getRedoPresentationName() {
               return "Redo frame change";
            }

           @Override
           public String getUndoPresentationName() {
               return "Undo frame change";
           }
           
       };
       ExplorerTopComponent.addUndoableEdit(auEdit);

        obj.changeFramePreserveLocation(context.getCurrentStateRef(), PhysicalFrame.safeDownCast(comp));
        //System.out.println(obj.dump());
        ViewDB.getInstance().updateComponentVisuals(model, obj, true);
        // Mark model dirty
        SingleModelGuiElements guiElem = OpenSimDB.getInstance().getModelGuiElements(model);
        guiElem.setUnsavedChangesFlag(true);
        refreshNode();
    }
}
