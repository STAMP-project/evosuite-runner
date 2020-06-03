/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Nov 07 12:52:37 GMT 2019
 */

package jahuwaldt.plot;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class LinearAxisScale_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "jahuwaldt.plot.LinearAxisScale"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(LinearAxisScale_ESTest_scaffolding.class.getClassLoader() ,
      "jahuwaldt.plot.TabLSymbol",
      "jahuwaldt.plot.ThinRect1Symbol",
      "jahuwaldt.plot.CircleSymbol",
      "jahuwaldt.plot.BoxLLSymbol",
      "jahuwaldt.plot.Triangle2Symbol",
      "jahuwaldt.plot.PolygonSymbol",
      "jahuwaldt.plot.TickMarkData",
      "jahuwaldt.plot.BoxLRSymbol",
      "jahuwaldt.plot.ThinRect2Symbol",
      "jahuwaldt.plot.DiamondSymbol",
      "jahuwaldt.plot.PlotAxisScale",
      "jahuwaldt.plot.AxisLimitData",
      "jahuwaldt.plot.RTriangle4Symbol",
      "jahuwaldt.plot.LinearAxisScale",
      "jahuwaldt.plot.Triangle3Symbol",
      "jahuwaldt.plot.XSymbol",
      "jahuwaldt.plot.SquareSymbol",
      "jahuwaldt.plot.RTriangle3Symbol",
      "jahuwaldt.plot.BoxULSymbol",
      "jahuwaldt.plot.Triangle4Symbol",
      "jahuwaldt.plot.PlotSymbol",
      "jahuwaldt.plot.BoxURSymbol",
      "jahuwaldt.plot.PlotDatum",
      "jahuwaldt.plot.RTriangle1Symbol"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("jahuwaldt.plot.PlotSymbol", false, LinearAxisScale_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(LinearAxisScale_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "jahuwaldt.plot.LinearAxisScale",
      "jahuwaldt.plot.TickMarkData",
      "jahuwaldt.plot.PolygonSymbol",
      "jahuwaldt.plot.RTriangle1Symbol",
      "jahuwaldt.plot.BoxURSymbol",
      "jahuwaldt.plot.TabLSymbol",
      "jahuwaldt.plot.BoxULSymbol",
      "jahuwaldt.plot.BoxLRSymbol",
      "jahuwaldt.plot.SquareSymbol",
      "jahuwaldt.plot.RTriangle3Symbol",
      "jahuwaldt.plot.Triangle4Symbol",
      "jahuwaldt.plot.ThinRect1Symbol",
      "jahuwaldt.plot.BoxLLSymbol",
      "jahuwaldt.plot.Triangle2Symbol",
      "jahuwaldt.plot.Triangle3Symbol",
      "jahuwaldt.plot.RTriangle4Symbol",
      "jahuwaldt.plot.DiamondSymbol",
      "jahuwaldt.plot.XSymbol",
      "jahuwaldt.plot.CircleSymbol",
      "jahuwaldt.plot.ThinRect2Symbol",
      "jahuwaldt.plot.PlotDatum",
      "jahuwaldt.plot.AxisLimitData",
      "jahuwaldt.plot.PlotSymbol"
    );
  }
}
