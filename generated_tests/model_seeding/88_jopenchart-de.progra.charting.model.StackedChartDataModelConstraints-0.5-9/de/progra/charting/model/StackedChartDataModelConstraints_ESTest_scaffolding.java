/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Nov 06 21:49:02 GMT 2019
 */

package de.progra.charting.model;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class StackedChartDataModelConstraints_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "de.progra.charting.model.StackedChartDataModelConstraints"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.dir", "/home/pderakhshanfar/evosuite-model-seeding-ee/evosuite-model-seeding-empirical-evaluation"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(StackedChartDataModelConstraints_ESTest_scaffolding.class.getClassLoader() ,
      "de.progra.charting.render.LineChartRenderer",
      "de.progra.charting.model.StackedChartDataModelConstraints",
      "de.progra.charting.model.DefaultDataSet",
      "de.progra.charting.ChartUtilities",
      "de.progra.charting.model.AbstractChartDataModel",
      "de.progra.charting.model.DefaultChartDataModelConstraints",
      "de.progra.charting.render.Renderer",
      "de.progra.charting.model.ChartDataModelConstraints",
      "de.progra.charting.model.DataSet",
      "de.progra.charting.model.EditableDataSet",
      "de.progra.charting.Chart",
      "de.progra.charting.test.ImageFilter",
      "de.progra.charting.model.ObjectChartDataModel",
      "de.progra.charting.swing.ChartPanel",
      "de.progra.charting.model.DefaultChartDataModel",
      "de.progra.charting.render.AbstractChartRenderer",
      "de.progra.charting.model.EditableChartDataModel",
      "de.progra.charting.event.ChartDataModelListener",
      "de.progra.charting.test.GraphFrame",
      "de.progra.charting.model.ChartDataModel"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("de.progra.charting.model.AbstractChartDataModel", false, StackedChartDataModelConstraints_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(StackedChartDataModelConstraints_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "de.progra.charting.model.StackedChartDataModelConstraints",
      "de.progra.charting.model.EditableChartDataModel",
      "de.progra.charting.model.DefaultChartDataModelConstraints",
      "de.progra.charting.ChartUtilities",
      "de.progra.charting.model.ObjectChartDataModel",
      "de.progra.charting.model.DefaultDataSet",
      "de.progra.charting.model.EditableDataSet",
      "de.progra.charting.test.GraphFrame",
      "de.progra.charting.event.ChartDataModelEvent",
      "de.progra.charting.model.AbstractChartDataModel",
      "de.progra.charting.model.DefaultChartDataModel"
    );
  }
}
