/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Nov 06 18:20:25 GMT 2019
 */

package weka.filters.unsupervised.attribute;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class FirstOrder_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "weka.filters.unsupervised.attribute.FirstOrder"; 
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
    org.evosuite.runtime.util.SystemInUtil.getInstance().initForTestCase(); 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(FirstOrder_ESTest_scaffolding.class.getClassLoader() ,
      "weka.core.FastVector",
      "weka.core.Copyable",
      "weka.core.Capabilities",
      "weka.core.AttributeLocator",
      "weka.core.converters.ArffLoader",
      "weka.core.OptionHandler",
      "weka.core.WekaException",
      "weka.core.RevisionUtils",
      "weka.filters.StreamableFilter",
      "weka.core.Instance",
      "weka.core.Range",
      "weka.filters.UnsupervisedFilter",
      "weka.core.converters.Loader",
      "weka.filters.unsupervised.attribute.FirstOrder",
      "weka.core.StringLocator",
      "weka.core.SparseInstance",
      "weka.core.DenseInstance",
      "weka.core.AttributeStats",
      "weka.core.CapabilitiesHandler",
      "weka.core.converters.IncrementalConverter",
      "weka.core.AbstractInstance",
      "weka.core.Instances",
      "weka.core.converters.AbstractFileLoader",
      "weka.core.UnassignedClassException",
      "weka.core.converters.URLSourcedLoader",
      "weka.core.converters.FileSourcedConverter",
      "weka.core.Queue",
      "weka.core.Option",
      "weka.core.EnvironmentHandler",
      "weka.core.converters.AbstractLoader",
      "weka.core.RelationalLocator",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.filters.Sourcable",
      "weka.core.Utils",
      "weka.core.RevisionHandler",
      "weka.core.CustomDisplayStringProvider",
      "weka.core.converters.ConverterUtils$DataSource",
      "weka.core.converters.BatchConverter",
      "weka.filters.Filter",
      "weka.core.Attribute",
      "weka.core.NoSupportForMissingValuesException",
      "weka.core.converters.ArffLoader$ArffReader"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(FirstOrder_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "weka.filters.Filter",
      "weka.filters.unsupervised.attribute.FirstOrder",
      "weka.core.Capabilities$Capability",
      "weka.core.BinarySparseInstance",
      "weka.core.ProtectedProperties",
      "weka.core.UnassignedDatasetException",
      "weka.core.Utils",
      "weka.core.Option",
      "weka.core.RevisionUtils",
      "weka.core.Capabilities",
      "weka.filters.AllFilter",
      "weka.core.Version",
      "weka.core.SerializedObject",
      "weka.core.converters.ArffLoader$ArffReader",
      "weka.core.converters.ConverterUtils$DataSource",
      "weka.core.converters.AbstractLoader",
      "weka.core.converters.AbstractFileLoader",
      "weka.core.converters.ArffLoader",
      "weka.filters.SimpleFilter",
      "weka.filters.SimpleStreamFilter",
      "weka.filters.MultiFilter",
      "weka.core.DenseInstance",
      "weka.core.Range",
      "weka.core.Instances",
      "weka.core.UnassignedClassException",
      "weka.core.Queue"
    );
  }
}
