/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class StdVectorInt {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public StdVectorInt(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(StdVectorInt obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimbodyJNI.delete_StdVectorInt(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StdVectorInt() {
    this(opensimSimbodyJNI.new_StdVectorInt__SWIG_0(), true);
  }

  public StdVectorInt(long n) {
    this(opensimSimbodyJNI.new_StdVectorInt__SWIG_1(n), true);
  }

  public long size() {
    return opensimSimbodyJNI.StdVectorInt_size(swigCPtr, this);
  }

  public long capacity() {
    return opensimSimbodyJNI.StdVectorInt_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    opensimSimbodyJNI.StdVectorInt_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return opensimSimbodyJNI.StdVectorInt_isEmpty(swigCPtr, this);
  }

  public void clear() {
    opensimSimbodyJNI.StdVectorInt_clear(swigCPtr, this);
  }

  public void add(int x) {
    opensimSimbodyJNI.StdVectorInt_add(swigCPtr, this, x);
  }

  public int get(int i) {
    return opensimSimbodyJNI.StdVectorInt_get(swigCPtr, this, i);
  }

  public void set(int i, int val) {
    opensimSimbodyJNI.StdVectorInt_set(swigCPtr, this, i, val);
  }

}
