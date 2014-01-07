/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Vec6 {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public Vec6(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Vec6 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_Vec6(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static int size() {
    return opensimModelJNI.Vec6_size();
  }

  public static int nrow() {
    return opensimModelJNI.Vec6_nrow();
  }

  public static int ncol() {
    return opensimModelJNI.Vec6_ncol();
  }

  public Vec6() {
    this(opensimModelJNI.new_Vec6__SWIG_0(), true);
  }

  public Vec6(Vec6 src) {
    this(opensimModelJNI.new_Vec6__SWIG_1(Vec6.getCPtr(src), src), true);
  }

  public Vec6(double e) {
    this(opensimModelJNI.new_Vec6__SWIG_2(e), true);
  }

  public Vec6(int i) {
    this(opensimModelJNI.new_Vec6__SWIG_3(i), true);
  }

  public Vec6(double e0, double e1) {
    this(opensimModelJNI.new_Vec6__SWIG_4(e0, e1), true);
  }

  public Vec6(double e0, double e1, double e2) {
    this(opensimModelJNI.new_Vec6__SWIG_5(e0, e1, e2), true);
  }

  public Vec6(double e0, double e1, double e2, double e3) {
    this(opensimModelJNI.new_Vec6__SWIG_6(e0, e1, e2, e3), true);
  }

  public Vec6(double e0, double e1, double e2, double e3, double e4) {
    this(opensimModelJNI.new_Vec6__SWIG_7(e0, e1, e2, e3, e4), true);
  }

  public Vec6(double e0, double e1, double e2, double e3, double e4, double e5) {
    this(opensimModelJNI.new_Vec6__SWIG_8(e0, e1, e2, e3, e4, e5), true);
  }

  public Vec6(double e0, double e1, double e2, double e3, double e4, double e5, double e6) {
    this(opensimModelJNI.new_Vec6__SWIG_9(e0, e1, e2, e3, e4, e5, e6), true);
  }

  public Vec6(double e0, double e1, double e2, double e3, double e4, double e5, double e6, double e7) {
    this(opensimModelJNI.new_Vec6__SWIG_10(e0, e1, e2, e3, e4, e5, e6, e7), true);
  }

  public Vec6(double e0, double e1, double e2, double e3, double e4, double e5, double e6, double e7, double e8) {
    this(opensimModelJNI.new_Vec6__SWIG_11(e0, e1, e2, e3, e4, e5, e6, e7, e8), true);
  }

  public void setToNaN() {
    opensimModelJNI.Vec6_setToNaN(swigCPtr, this);
  }

  public void setToZero() {
    opensimModelJNI.Vec6_setToZero(swigCPtr, this);
  }

  public boolean isNaN() {
    return opensimModelJNI.Vec6_isNaN(swigCPtr, this);
  }

  public boolean isInf() {
    return opensimModelJNI.Vec6_isInf(swigCPtr, this);
  }

  public boolean isFinite() {
    return opensimModelJNI.Vec6_isFinite(swigCPtr, this);
  }

  public static double getDefaultTolerance() {
    return opensimModelJNI.Vec6_getDefaultTolerance();
  }

  public boolean isNumericallyEqual(double e, double tol) {
    return opensimModelJNI.Vec6_isNumericallyEqual__SWIG_2(swigCPtr, this, e, tol);
  }

  public boolean isNumericallyEqual(double e) {
    return opensimModelJNI.Vec6_isNumericallyEqual__SWIG_3(swigCPtr, this, e);
  }

  public String toString() {
    return opensimModelJNI.Vec6_toString(swigCPtr, this);
  }

  public void set(int i, double value) {
    opensimModelJNI.Vec6_set(swigCPtr, this, i, value);
  }

  public double get(int i) {
    return opensimModelJNI.Vec6_get(swigCPtr, this, i);
  }

}