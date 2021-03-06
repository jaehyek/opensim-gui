/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class BodyIterator {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public BodyIterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(BodyIterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_BodyIterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean equals(BodyIterator other) {
    return opensimSimulationJNI.BodyIterator_equals(swigCPtr, this, BodyIterator.getCPtr(other), other);
  }

  public Body __ref__() {
    return new Body(opensimSimulationJNI.BodyIterator___ref__(swigCPtr, this), false);
  }

  public Body __deref__() {
    long cPtr = opensimSimulationJNI.BodyIterator___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new Body(cPtr, false);
  }

  public BodyIterator next() {
    return new BodyIterator(opensimSimulationJNI.BodyIterator_next(swigCPtr, this), false);
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.BodyIterator_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Body(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.BodyIterator_getConcreteClassName(swigCPtr, this);
  }

  public double get_mass(int i) {
    return opensimSimulationJNI.BodyIterator_get_mass__SWIG_0(swigCPtr, this, i);
  }

  public double get_mass() {
    return opensimSimulationJNI.BodyIterator_get_mass__SWIG_1(swigCPtr, this);
  }

  public Vec3 get_mass_center(int i) {
    return new Vec3(opensimSimulationJNI.BodyIterator_get_mass_center__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 get_mass_center() {
    return new Vec3(opensimSimulationJNI.BodyIterator_get_mass_center__SWIG_1(swigCPtr, this), false);
  }

  public Vec6 get_inertia(int i) {
    return new Vec6(opensimSimulationJNI.BodyIterator_get_inertia__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec6 get_inertia() {
    return new Vec6(opensimSimulationJNI.BodyIterator_get_inertia__SWIG_1(swigCPtr, this), false);
  }

  public double getMass() {
    return opensimSimulationJNI.BodyIterator_getMass(swigCPtr, this);
  }

  public Vec3 getMassCenter() {
    return new Vec3(opensimSimulationJNI.BodyIterator_getMassCenter(swigCPtr, this), false);
  }

  public Inertia getInertia() {
    return new Inertia(opensimSimulationJNI.BodyIterator_getInertia__SWIG_0(swigCPtr, this), false);
  }

  public MassProperties getMassProperties() {
    return new MassProperties(opensimSimulationJNI.BodyIterator_getMassProperties(swigCPtr, this), true);
  }

  public WrapObjectSet get_WrapObjectSet(int i) {
    return new WrapObjectSet(opensimSimulationJNI.BodyIterator_get_WrapObjectSet__SWIG_0(swigCPtr, this, i), false);
  }

  public WrapObjectSet get_WrapObjectSet() {
    return new WrapObjectSet(opensimSimulationJNI.BodyIterator_get_WrapObjectSet__SWIG_1(swigCPtr, this), false);
  }

  public int getMobilizedBodyIndex() {
    return opensimSimulationJNI.BodyIterator_getMobilizedBodyIndex(swigCPtr, this);
  }

  public SWIGTYPE_p_SimTK__MobilizedBody getMobilizedBody() {
    return new SWIGTYPE_p_SimTK__MobilizedBody(opensimSimulationJNI.BodyIterator_getMobilizedBody(swigCPtr, this), false);
  }

  public WrapObject getWrapObject(String aName) {
    long cPtr = opensimSimulationJNI.BodyIterator_getWrapObject(swigCPtr, this, aName);
    return (cPtr == 0) ? null : new WrapObject(cPtr, false);
  }

  public WrapObjectSet getWrapObjectSet() {
    return new WrapObjectSet(opensimSimulationJNI.BodyIterator_getWrapObjectSet(swigCPtr, this), false);
  }

  public FrameGeometry get_frame_geometry(int i) {
    return new FrameGeometry(opensimSimulationJNI.BodyIterator_get_frame_geometry__SWIG_0(swigCPtr, this, i), false);
  }

  public FrameGeometry get_frame_geometry() {
    return new FrameGeometry(opensimSimulationJNI.BodyIterator_get_frame_geometry__SWIG_1(swigCPtr, this), false);
  }

  public Geometry get_attached_geometry(int i) {
    return new Geometry(opensimSimulationJNI.BodyIterator_get_attached_geometry(swigCPtr, this, i), false);
  }

  public boolean get_has_output_position() {
    return opensimSimulationJNI.BodyIterator__has_output_position_get(swigCPtr, this);
  }

  public boolean get_has_output_transform() {
    return opensimSimulationJNI.BodyIterator__has_output_transform_get(swigCPtr, this);
  }

  public boolean get_has_output_velocity() {
    return opensimSimulationJNI.BodyIterator__has_output_velocity_get(swigCPtr, this);
  }

  public boolean get_has_output_angular_velocity() {
    return opensimSimulationJNI.BodyIterator__has_output_angular_velocity_get(swigCPtr, this);
  }

  public boolean get_has_output_linear_velocity() {
    return opensimSimulationJNI.BodyIterator__has_output_linear_velocity_get(swigCPtr, this);
  }

  public boolean get_has_output_acceleration() {
    return opensimSimulationJNI.BodyIterator__has_output_acceleration_get(swigCPtr, this);
  }

  public boolean get_has_output_angular_acceleration() {
    return opensimSimulationJNI.BodyIterator__has_output_angular_acceleration_get(swigCPtr, this);
  }

  public boolean get_has_output_linear_acceleration() {
    return opensimSimulationJNI.BodyIterator__has_output_linear_acceleration_get(swigCPtr, this);
  }

  public Transform getTransformInGround(State state) {
    return new Transform(opensimSimulationJNI.BodyIterator_getTransformInGround(swigCPtr, this, State.getCPtr(state), state), false);
  }

  public SpatialVec getVelocityInGround(State state) {
    return new SpatialVec(opensimSimulationJNI.BodyIterator_getVelocityInGround(swigCPtr, this, State.getCPtr(state), state), false);
  }

  public Vec3 getAngularVelocityInGround(State state) {
    return new Vec3(opensimSimulationJNI.BodyIterator_getAngularVelocityInGround(swigCPtr, this, State.getCPtr(state), state), false);
  }

  public Vec3 getLinearVelocityInGround(State state) {
    return new Vec3(opensimSimulationJNI.BodyIterator_getLinearVelocityInGround(swigCPtr, this, State.getCPtr(state), state), false);
  }

  public SpatialVec getAccelerationInGround(State state) {
    return new SpatialVec(opensimSimulationJNI.BodyIterator_getAccelerationInGround(swigCPtr, this, State.getCPtr(state), state), false);
  }

  public Vec3 getAngularAccelerationInGround(State state) {
    return new Vec3(opensimSimulationJNI.BodyIterator_getAngularAccelerationInGround(swigCPtr, this, State.getCPtr(state), state), false);
  }

  public Vec3 getLinearAccelerationInGround(State state) {
    return new Vec3(opensimSimulationJNI.BodyIterator_getLinearAccelerationInGround(swigCPtr, this, State.getCPtr(state), state), false);
  }

  public Transform findTransformBetween(State state, Frame otherFrame) {
    return new Transform(opensimSimulationJNI.BodyIterator_findTransformBetween(swigCPtr, this, State.getCPtr(state), state, Frame.getCPtr(otherFrame), otherFrame), true);
  }

  public Vec3 expressVectorInAnotherFrame(State state, Vec3 vec_F, Frame otherFrame) {
    return new Vec3(opensimSimulationJNI.BodyIterator_expressVectorInAnotherFrame(swigCPtr, this, State.getCPtr(state), state, Vec3.getCPtr(vec_F), vec_F, Frame.getCPtr(otherFrame), otherFrame), true);
  }

  public Vec3 expressVectorInGround(State state, Vec3 vec_F) {
    return new Vec3(opensimSimulationJNI.BodyIterator_expressVectorInGround(swigCPtr, this, State.getCPtr(state), state, Vec3.getCPtr(vec_F), vec_F), true);
  }

  public Vec3 findStationLocationInAnotherFrame(State state, Vec3 station_F, Frame otherFrame) {
    return new Vec3(opensimSimulationJNI.BodyIterator_findStationLocationInAnotherFrame(swigCPtr, this, State.getCPtr(state), state, Vec3.getCPtr(station_F), station_F, Frame.getCPtr(otherFrame), otherFrame), true);
  }

  public Vec3 findStationLocationInGround(State state, Vec3 station_F) {
    return new Vec3(opensimSimulationJNI.BodyIterator_findStationLocationInGround(swigCPtr, this, State.getCPtr(state), state, Vec3.getCPtr(station_F), station_F), true);
  }

  public Vec3 findStationVelocityInGround(State state, Vec3 station_F) {
    return new Vec3(opensimSimulationJNI.BodyIterator_findStationVelocityInGround(swigCPtr, this, State.getCPtr(state), state, Vec3.getCPtr(station_F), station_F), true);
  }

  public Vec3 findStationAccelerationInGround(State state, Vec3 station_F) {
    return new Vec3(opensimSimulationJNI.BodyIterator_findStationAccelerationInGround(swigCPtr, this, State.getCPtr(state), state, Vec3.getCPtr(station_F), station_F), true);
  }

  public Frame findBaseFrame() {
    return new Frame(opensimSimulationJNI.BodyIterator_findBaseFrame(swigCPtr, this), false);
  }

  public Transform findTransformInBaseFrame() {
    return new Transform(opensimSimulationJNI.BodyIterator_findTransformInBaseFrame(swigCPtr, this), true);
  }

  public Vec3 getPositionInGround(State state) {
    return new Vec3(opensimSimulationJNI.BodyIterator_getPositionInGround(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public Model getModel() {
    return new Model(opensimSimulationJNI.BodyIterator_getModel(swigCPtr, this), false);
  }

  public boolean hasModel() {
    return opensimSimulationJNI.BodyIterator_hasModel(swigCPtr, this);
  }

  public void addToSystem(SWIGTYPE_p_SimTK__MultibodySystem system) {
    opensimSimulationJNI.BodyIterator_addToSystem(swigCPtr, this, SWIGTYPE_p_SimTK__MultibodySystem.getCPtr(system));
  }

  public void initStateFromProperties(State state) {
    opensimSimulationJNI.BodyIterator_initStateFromProperties(swigCPtr, this, State.getCPtr(state), state);
  }

  public void generateDecorations(boolean fixed, ModelDisplayHints hints, State state, ArrayDecorativeGeometry appendToThis) {
    opensimSimulationJNI.BodyIterator_generateDecorations(swigCPtr, this, fixed, ModelDisplayHints.getCPtr(hints), hints, State.getCPtr(state), state, ArrayDecorativeGeometry.getCPtr(appendToThis), appendToThis);
  }

  public SWIGTYPE_p_SimTK__MultibodySystem getSystem() {
    return new SWIGTYPE_p_SimTK__MultibodySystem(opensimSimulationJNI.BodyIterator_getSystem(swigCPtr, this), false);
  }

  public boolean hasSystem() {
    return opensimSimulationJNI.BodyIterator_hasSystem(swigCPtr, this);
  }

  public String getAbsolutePathString() {
    return opensimSimulationJNI.BodyIterator_getAbsolutePathString(swigCPtr, this);
  }

  public SWIGTYPE_p_ComponentPath getAbsolutePath() {
    return new SWIGTYPE_p_ComponentPath(opensimSimulationJNI.BodyIterator_getAbsolutePath(swigCPtr, this), true);
  }

  public String getRelativePathName(Component wrt) {
    return opensimSimulationJNI.BodyIterator_getRelativePathName(swigCPtr, this, Component.getCPtr(wrt), wrt);
  }

  public boolean hasComponent(String pathname) {
    return opensimSimulationJNI.BodyIterator_hasComponent(swigCPtr, this, pathname);
  }

  public Component getComponent(String pathname) {
    return new Component(opensimSimulationJNI.BodyIterator_getComponent(swigCPtr, this, pathname), false);
  }

  public long printComponentsMatching(String substring) {
    return opensimSimulationJNI.BodyIterator_printComponentsMatching(swigCPtr, this, substring);
  }

  public int getNumStateVariables() {
    return opensimSimulationJNI.BodyIterator_getNumStateVariables(swigCPtr, this);
  }

  public ArrayStr getStateVariableNames() {
    return new ArrayStr(opensimSimulationJNI.BodyIterator_getStateVariableNames(swigCPtr, this), true);
  }

  public int getNumSockets() {
    return opensimSimulationJNI.BodyIterator_getNumSockets(swigCPtr, this);
  }

  public OpenSimObject getConnectee(String name) {
    return new OpenSimObject(opensimSimulationJNI.BodyIterator_getConnectee(swigCPtr, this, name), false);
  }

  public AbstractSocket getSocket(String name) {
    return new AbstractSocket(opensimSimulationJNI.BodyIterator_getSocket(swigCPtr, this, name), false);
  }

  public int getNumInputs() {
    return opensimSimulationJNI.BodyIterator_getNumInputs(swigCPtr, this);
  }

  public int getNumOutputs() {
    return opensimSimulationJNI.BodyIterator_getNumOutputs(swigCPtr, this);
  }

  public StdVectorString getInputNames() {
    return new StdVectorString(opensimSimulationJNI.BodyIterator_getInputNames(swigCPtr, this), true);
  }

  public StdVectorString getOutputNames() {
    return new StdVectorString(opensimSimulationJNI.BodyIterator_getOutputNames(swigCPtr, this), true);
  }

  public AbstractInput getInput(String name) {
    return new AbstractInput(opensimSimulationJNI.BodyIterator_getInput(swigCPtr, this, name), false);
  }

  public AbstractOutput getOutput(String name) {
    return new AbstractOutput(opensimSimulationJNI.BodyIterator_getOutput(swigCPtr, this, name), false);
  }

  public int getModelingOption(State state, String name) {
    return opensimSimulationJNI.BodyIterator_getModelingOption(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setModelingOption(State state, String name, int flag) {
    opensimSimulationJNI.BodyIterator_setModelingOption(swigCPtr, this, State.getCPtr(state), state, name, flag);
  }

  public double getStateVariableValue(State state, String name) {
    return opensimSimulationJNI.BodyIterator_getStateVariableValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setStateVariableValue(State state, String name, double value) {
    opensimSimulationJNI.BodyIterator_setStateVariableValue(swigCPtr, this, State.getCPtr(state), state, name, value);
  }

  public Vector getStateVariableValues(State state) {
    return new Vector(opensimSimulationJNI.BodyIterator_getStateVariableValues(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public void setStateVariableValues(State state, Vector values) {
    opensimSimulationJNI.BodyIterator_setStateVariableValues(swigCPtr, this, State.getCPtr(state), state, Vector.getCPtr(values), values);
  }

  public double getStateVariableDerivativeValue(State state, String name) {
    return opensimSimulationJNI.BodyIterator_getStateVariableDerivativeValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public double getDiscreteVariableValue(State state, String name) {
    return opensimSimulationJNI.BodyIterator_getDiscreteVariableValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setDiscreteVariableValue(State state, String name, double value) {
    opensimSimulationJNI.BodyIterator_setDiscreteVariableValue(swigCPtr, this, State.getCPtr(state), state, name, value);
  }

  public void markCacheVariableValid(State state, String name) {
    opensimSimulationJNI.BodyIterator_markCacheVariableValid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void markCacheVariableInvalid(State state, String name) {
    opensimSimulationJNI.BodyIterator_markCacheVariableInvalid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public boolean isCacheVariableValid(State state, String name) {
    return opensimSimulationJNI.BodyIterator_isCacheVariableValid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void printSubcomponentInfo() {
    opensimSimulationJNI.BodyIterator_printSubcomponentInfo(swigCPtr, this);
  }

  public void printSocketInfo() {
    opensimSimulationJNI.BodyIterator_printSocketInfo(swigCPtr, this);
  }

  public void printInputInfo() {
    opensimSimulationJNI.BodyIterator_printInputInfo(swigCPtr, this);
  }

  public void printOutputInfo(boolean includeDescendants) {
    opensimSimulationJNI.BodyIterator_printOutputInfo__SWIG_0(swigCPtr, this, includeDescendants);
  }

  public void printOutputInfo() {
    opensimSimulationJNI.BodyIterator_printOutputInfo__SWIG_1(swigCPtr, this);
  }

  public Component getOwner() {
    return new Component(opensimSimulationJNI.BodyIterator_getOwner(swigCPtr, this), false);
  }

  public boolean hasOwner() {
    return opensimSimulationJNI.BodyIterator_hasOwner(swigCPtr, this);
  }

  public ComponentsList getComponentsList() {
    return new ComponentsList(opensimSimulationJNI.BodyIterator_getComponentsList(swigCPtr, this), true);
  }

  public boolean isEqualTo(OpenSimObject aObject) {
    return opensimSimulationJNI.BodyIterator_isEqualTo(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public String getName() {
    return opensimSimulationJNI.BodyIterator_getName(swigCPtr, this);
  }

  public String getDescription() {
    return opensimSimulationJNI.BodyIterator_getDescription(swigCPtr, this);
  }

  public String getAuthors() {
    return opensimSimulationJNI.BodyIterator_getAuthors(swigCPtr, this);
  }

  public String getReferences() {
    return opensimSimulationJNI.BodyIterator_getReferences(swigCPtr, this);
  }

  public int getNumProperties() {
    return opensimSimulationJNI.BodyIterator_getNumProperties(swigCPtr, this);
  }

  public AbstractProperty getPropertyByIndex(int propertyIndex) {
    return new AbstractProperty(opensimSimulationJNI.BodyIterator_getPropertyByIndex(swigCPtr, this, propertyIndex), false);
  }

  public boolean hasProperty(String name) {
    return opensimSimulationJNI.BodyIterator_hasProperty(swigCPtr, this, name);
  }

  public AbstractProperty getPropertyByName(String name) {
    return new AbstractProperty(opensimSimulationJNI.BodyIterator_getPropertyByName(swigCPtr, this, name), false);
  }

  public boolean isObjectUpToDateWithProperties() {
    return opensimSimulationJNI.BodyIterator_isObjectUpToDateWithProperties(swigCPtr, this);
  }

  public void updateXMLNode(SWIGTYPE_p_SimTK__Xml__Element parent, AbstractProperty prop) {
    opensimSimulationJNI.BodyIterator_updateXMLNode__SWIG_0(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(parent), AbstractProperty.getCPtr(prop), prop);
  }

  public void updateXMLNode(SWIGTYPE_p_SimTK__Xml__Element parent) {
    opensimSimulationJNI.BodyIterator_updateXMLNode__SWIG_1(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(parent));
  }

  public boolean getInlined() {
    return opensimSimulationJNI.BodyIterator_getInlined(swigCPtr, this);
  }

  public String getDocumentFileName() {
    return opensimSimulationJNI.BodyIterator_getDocumentFileName(swigCPtr, this);
  }

  public int getDocumentFileVersion() {
    return opensimSimulationJNI.BodyIterator_getDocumentFileVersion(swigCPtr, this);
  }

  public boolean print(String fileName) {
    return opensimSimulationJNI.BodyIterator_print(swigCPtr, this, fileName);
  }

  public boolean isA(String type) {
    return opensimSimulationJNI.BodyIterator_isA(swigCPtr, this, type);
  }

  public String toString() {
    return opensimSimulationJNI.BodyIterator_toString(swigCPtr, this);
  }

}
