/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class MatrixViewVec3 extends MatrixBaseVec3 {
  private transient long swigCPtr;

  protected MatrixViewVec3(long cPtr, boolean cMemoryOwn) {
    super(opensimSimbodyJNI.MatrixViewVec3_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MatrixViewVec3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimbodyJNI.delete_MatrixViewVec3(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public MatrixViewVec3(MatrixViewVec3 m) {
    this(opensimSimbodyJNI.new_MatrixViewVec3(MatrixViewVec3.getCPtr(m), m), true);
  }

}
