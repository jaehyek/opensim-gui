/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class SetBodies extends OpenSimObject {
  private transient long swigCPtr;

  public SetBodies(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.SetBodies_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(SetBodies obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_SetBodies(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static SetBodies safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.SetBodies_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new SetBodies(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.SetBodies_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.SetBodies_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.SetBodies_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new SetBodies(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.SetBodies_getConcreteClassName(swigCPtr, this);
  }

  public SetBodies() {
    this(opensimSimulationJNI.new_SetBodies__SWIG_0(), true);
  }

  public SetBodies(String aFileName, boolean aUpdateFromXMLNode) {
    this(opensimSimulationJNI.new_SetBodies__SWIG_1(aFileName, aUpdateFromXMLNode), true);
  }

  public SetBodies(String aFileName) {
    this(opensimSimulationJNI.new_SetBodies__SWIG_2(aFileName), true);
  }

  public SetBodies(SetBodies aSet) {
    this(opensimSimulationJNI.new_SetBodies__SWIG_3(SetBodies.getCPtr(aSet), aSet), true);
  }

  public void setupGroups() {
    opensimSimulationJNI.SetBodies_setupGroups(swigCPtr, this);
  }

  public void setMemoryOwner(boolean aTrueFalse) {
    opensimSimulationJNI.SetBodies_setMemoryOwner(swigCPtr, this, aTrueFalse);
  }

  public boolean setSize(int aSize) {
    return opensimSimulationJNI.SetBodies_setSize(swigCPtr, this, aSize);
  }

  public int getSize() {
    return opensimSimulationJNI.SetBodies_getSize(swigCPtr, this);
  }

  public int getIndex(Body aObject, int aStartIndex) {
    return opensimSimulationJNI.SetBodies_getIndex__SWIG_0(swigCPtr, this, Body.getCPtr(aObject), aObject, aStartIndex);
  }

  public int getIndex(Body aObject) {
    return opensimSimulationJNI.SetBodies_getIndex__SWIG_1(swigCPtr, this, Body.getCPtr(aObject), aObject);
  }

  public int getIndex(String aName, int aStartIndex) {
    return opensimSimulationJNI.SetBodies_getIndex__SWIG_2(swigCPtr, this, aName, aStartIndex);
  }

  public int getIndex(String aName) {
    return opensimSimulationJNI.SetBodies_getIndex__SWIG_3(swigCPtr, this, aName);
  }

  public void getGroupNamesContaining(String aObjectName, ArrayStr rGroupNames) {
    opensimSimulationJNI.SetBodies_getGroupNamesContaining(swigCPtr, this, aObjectName, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public boolean adoptAndAppend(Body aObject) {
    return opensimSimulationJNI.SetBodies_adoptAndAppend(swigCPtr, this, Body.getCPtr(aObject), aObject);
  }

  public boolean cloneAndAppend(Body aObject) {
    return opensimSimulationJNI.SetBodies_cloneAndAppend(swigCPtr, this, Body.getCPtr(aObject), aObject);
  }

  public boolean insert(int aIndex, Body aObject) {
    return opensimSimulationJNI.SetBodies_insert(swigCPtr, this, aIndex, Body.getCPtr(aObject), aObject);
  }

  public boolean remove(int aIndex) {
    return opensimSimulationJNI.SetBodies_remove__SWIG_0(swigCPtr, this, aIndex);
  }

  public boolean remove(Body aObject) {
    return opensimSimulationJNI.SetBodies_remove__SWIG_1(swigCPtr, this, Body.getCPtr(aObject), aObject);
  }

  public void clearAndDestroy() {
    opensimSimulationJNI.SetBodies_clearAndDestroy(swigCPtr, this);
  }

  public boolean set(int aIndex, Body aObject, boolean preserveGroups) {
    return opensimSimulationJNI.SetBodies_set__SWIG_0(swigCPtr, this, aIndex, Body.getCPtr(aObject), aObject, preserveGroups);
  }

  public boolean set(int aIndex, Body aObject) {
    return opensimSimulationJNI.SetBodies_set__SWIG_1(swigCPtr, this, aIndex, Body.getCPtr(aObject), aObject);
  }

  public Body get(int aIndex) {
    return new Body(opensimSimulationJNI.SetBodies_get__SWIG_0(swigCPtr, this, aIndex), false);
  }

  public Body get(String aName) {
    return new Body(opensimSimulationJNI.SetBodies_get__SWIG_1(swigCPtr, this, aName), false);
  }

  public boolean contains(String aName) {
    return opensimSimulationJNI.SetBodies_contains(swigCPtr, this, aName);
  }

  public void getNames(ArrayStr rNames) {
    opensimSimulationJNI.SetBodies_getNames(swigCPtr, this, ArrayStr.getCPtr(rNames), rNames);
  }

  public int getNumGroups() {
    return opensimSimulationJNI.SetBodies_getNumGroups(swigCPtr, this);
  }

  public void addGroup(String aGroupName) {
    opensimSimulationJNI.SetBodies_addGroup(swigCPtr, this, aGroupName);
  }

  public void removeGroup(String aGroupName) {
    opensimSimulationJNI.SetBodies_removeGroup(swigCPtr, this, aGroupName);
  }

  public void renameGroup(String oldGroupName, String newGroupName) {
    opensimSimulationJNI.SetBodies_renameGroup(swigCPtr, this, oldGroupName, newGroupName);
  }

  public void addObjectToGroup(String aGroupName, String aObjectName) {
    opensimSimulationJNI.SetBodies_addObjectToGroup(swigCPtr, this, aGroupName, aObjectName);
  }

  public void getGroupNames(ArrayStr rGroupNames) {
    opensimSimulationJNI.SetBodies_getGroupNames(swigCPtr, this, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public ObjectGroup getGroup(String aGroupName) {
    long cPtr = opensimSimulationJNI.SetBodies_getGroup__SWIG_0(swigCPtr, this, aGroupName);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

  public ObjectGroup getGroup(int aIndex) {
    long cPtr = opensimSimulationJNI.SetBodies_getGroup__SWIG_1(swigCPtr, this, aIndex);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

}
