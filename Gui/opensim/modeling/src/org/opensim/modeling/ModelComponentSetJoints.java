/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ModelComponentSetJoints extends SetJoints {
  private long swigCPtr;

  public ModelComponentSetJoints(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.ModelComponentSetJoints_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ModelComponentSetJoints obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_ModelComponentSetJoints(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ModelComponentSetJoints() {
    this(opensimModelJNI.new_ModelComponentSetJoints__SWIG_0(), true);
  }

  public ModelComponentSetJoints(Model model) {
    this(opensimModelJNI.new_ModelComponentSetJoints__SWIG_1(Model.getCPtr(model), model), true);
  }

  public ModelComponentSetJoints(Model model, String fileName, boolean aUpdateFromXMLNode) {
    this(opensimModelJNI.new_ModelComponentSetJoints__SWIG_2(Model.getCPtr(model), model, fileName, aUpdateFromXMLNode), true);
  }

  public ModelComponentSetJoints(Model model, String fileName) {
    this(opensimModelJNI.new_ModelComponentSetJoints__SWIG_3(Model.getCPtr(model), model, fileName), true);
  }

  public ModelComponentSetJoints(ModelComponentSetJoints source) {
    this(opensimModelJNI.new_ModelComponentSetJoints__SWIG_4(ModelComponentSetJoints.getCPtr(source), source), true);
  }

  public OpenSimObject copy() {
    long cPtr = opensimModelJNI.ModelComponentSetJoints_copy(swigCPtr, this);
    return (cPtr == 0) ? null : new OpenSimObject(cPtr, false);
  }

  public boolean append(Joint aObject) {
    return opensimModelJNI.ModelComponentSetJoints_append(swigCPtr, this, Joint.getCPtr(aObject), aObject);
  }

  public boolean insert(int aIndex, Joint aObject) {
    return opensimModelJNI.ModelComponentSetJoints_insert(swigCPtr, this, aIndex, Joint.getCPtr(aObject), aObject);
  }

  public boolean set(int aIndex, Joint aObject, boolean preserveGroups) {
    return opensimModelJNI.ModelComponentSetJoints_set__SWIG_0(swigCPtr, this, aIndex, Joint.getCPtr(aObject), aObject, preserveGroups);
  }

  public boolean set(int aIndex, Joint aObject) {
    return opensimModelJNI.ModelComponentSetJoints_set__SWIG_1(swigCPtr, this, aIndex, Joint.getCPtr(aObject), aObject);
  }

}
