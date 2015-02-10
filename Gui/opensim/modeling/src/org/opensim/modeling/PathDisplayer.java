/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class PathDisplayer extends DefaultDisplayer {
  private long swigCPtr;

  public PathDisplayer(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.PathDisplayer_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(PathDisplayer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_PathDisplayer(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public PathDisplayer() {
    this(opensimModelJNI.new_PathDisplayer(), true);
  }

  public DisplayerInterface clone() {
    long cPtr = opensimModelJNI.PathDisplayer_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new PathDisplayer(cPtr, true);
  }

  public void generateDecorations(ModelComponent gp, boolean fixed, ModelDisplayHints hints, State state, ArrayDecorativeGeometry appendToThis) {
    opensimModelJNI.PathDisplayer_generateDecorations(swigCPtr, this, ModelComponent.getCPtr(gp), gp, fixed, ModelDisplayHints.getCPtr(hints), hints, State.getCPtr(state), state, ArrayDecorativeGeometry.getCPtr(appendToThis), appendToThis);
  }

}