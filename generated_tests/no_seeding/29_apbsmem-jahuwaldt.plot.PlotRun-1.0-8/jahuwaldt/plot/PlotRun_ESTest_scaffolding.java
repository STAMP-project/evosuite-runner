/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Oct 28 21:53:45 GMT 2019
 */

package jahuwaldt.plot;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class PlotRun_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "jahuwaldt.plot.PlotRun"; 
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
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.home", "/home/pderakhshanfar"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(PlotRun_ESTest_scaffolding.class.getClassLoader() ,
      "jahuwaldt.plot.PlotRun",
      "jahuwaldt.plot.TabLSymbol",
      "jahuwaldt.plot.ThinRect1Symbol",
      "jahuwaldt.plot.BoxLLSymbol",
      "jahuwaldt.plot.PolygonSymbol",
      "jahuwaldt.plot.Triangle1Symbol",
      "jahuwaldt.plot.RTriangle4Symbol",
      "jahuwaldt.plot.Triangle3Symbol",
      "jahuwaldt.plot.XSymbol",
      "jahuwaldt.plot.BoxULSymbol",
      "jahuwaldt.plot.Triangle4Symbol",
      "jahuwaldt.plot.TabUpSymbol",
      "jahuwaldt.plot.RTriangle2Symbol",
      "jahuwaldt.plot.BoxURSymbol",
      "jahuwaldt.plot.CircleSymbol",
      "jahuwaldt.plot.TabRSymbol",
      "jahuwaldt.plot.Triangle2Symbol",
      "jahuwaldt.plot.BoxLRSymbol",
      "jahuwaldt.plot.ThinRect2Symbol",
      "jahuwaldt.plot.DiamondSymbol",
      "jahuwaldt.plot.SquareSymbol",
      "jahuwaldt.plot.RTriangle3Symbol",
      "jahuwaldt.plot.PlotSymbol",
      "jahuwaldt.plot.TabDSymbol",
      "jahuwaldt.plot.PlotDatum",
      "jahuwaldt.plot.RTriangle1Symbol"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(PlotRun_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "jahuwaldt.plot.PlotRun",
      "jahuwaldt.plot.PlotSymbol",
      "jahuwaldt.plot.XSymbol",
      "jahuwaldt.plot.PolygonSymbol",
      "jahuwaldt.plot.BoxULSymbol",
      "jahuwaldt.plot.Triangle2Symbol",
      "jahuwaldt.plot.PlotDatum",
      "jahuwaldt.plot.RTriangle2Symbol",
      "jahuwaldt.plot.BoxLLSymbol",
      "jahuwaldt.plot.DiamondSymbol",
      "jahuwaldt.plot.SquareSymbol",
      "jahuwaldt.plot.Triangle1Symbol",
      "jahuwaldt.plot.CircleSymbol",
      "jahuwaldt.plot.Triangle4Symbol",
      "jahuwaldt.plot.BoxURSymbol",
      "jahuwaldt.plot.RTriangle4Symbol",
      "jahuwaldt.plot.TabDSymbol",
      "jahuwaldt.plot.BoxLRSymbol",
      "jahuwaldt.plot.ThinRect2Symbol",
      "jahuwaldt.plot.Triangle3Symbol",
      "jahuwaldt.plot.TabUpSymbol",
      "jahuwaldt.plot.TabRSymbol",
      "jahuwaldt.plot.RTriangle1Symbol",
      "jahuwaldt.plot.TabLSymbol",
      "jahuwaldt.plot.ThinRect1Symbol",
      "jahuwaldt.plot.RTriangle3Symbol"
    );
  }
}
