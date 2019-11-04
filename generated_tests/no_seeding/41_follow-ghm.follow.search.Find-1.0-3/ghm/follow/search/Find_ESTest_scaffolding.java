/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Nov 04 11:30:33 GMT 2019
 */

package ghm.follow.search;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Find_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "ghm.follow.search.Find"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Find_ESTest_scaffolding.class.getClassLoader() ,
      "ghm.follow.gui.Exit",
      "ghm.follow.gui.Delete",
      "ghm.follow.search.ClearHighlights",
      "ghm.follow.io.FilterableOutputDestination",
      "ghm.follow.nav.PreviousTab",
      "ghm.follow.config.Configure$CfgFontSelectionPanel",
      "ghm.follow.gui.ClearAll",
      "ghm.follow.search.LineResult",
      "ghm.follow.gui.Debug",
      "ghm.follow.gui.FollowAppAction$ActionContext",
      "ghm.follow.systemInterface.DefaultSystemInterface",
      "ghm.follow.FollowApp",
      "ghm.follow.font.FontSelectionPanel",
      "ghm.follow.gui.LineTextUI",
      "ghm.follow.gui.StartupStatus$Task",
      "ghm.follow.search.SearchableTextPane",
      "ghm.follow.gui.LineTextUI$1",
      "ghm.follow.gui.StartupStatus",
      "ghm.follow.gui.Close",
      "ghm.follow.gui.Edit",
      "ghm.follow.gui.TabbedPane",
      "ghm.follow.gui.WhatIsThis",
      "ghm.follow.gui.FollowAppAction",
      "ghm.follow.gui.DeleteAll",
      "ghm.follow.gui.LineView",
      "ghm.follow.nav.Bottom",
      "ghm.follow.nav.NextTab",
      "ghm.follow.search.ClearAllHighlights",
      "ghm.follow.config.FollowAppAttributes",
      "ghm.follow.gui.FileFollowingPane",
      "ghm.follow.gui.Menu",
      "ghm.follow.gui.About",
      "ghm.follow.search.Find",
      "ghm.follow.search.WordResult",
      "ghm.follow.nav.Top",
      "ghm.follow.config.Configure",
      "ghm.follow.config.EnumeratedProperties",
      "ghm.follow.config.Configure$CfgDialog",
      "ghm.follow.InvalidVkException",
      "ghm.follow.io.JTextComponentDestination",
      "ghm.follow.gui.Clear",
      "ghm.follow.gui.PopupMenu",
      "ghm.follow.gui.Pause",
      "ghm.follow.io.OutputDestination",
      "ghm.follow.gui.Reset",
      "ghm.follow.systemInterface.SystemInterface",
      "ghm.follow.gui.Open",
      "ghm.follow.config.Configure$TabPlacementValue",
      "ghm.follow.gui.ToolBar",
      "ghm.follow.FileFollower",
      "ghm.follow.config.Configure$BooleanComboBox"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Find_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "ghm.follow.gui.FollowAppAction",
      "ghm.follow.search.Find",
      "ghm.follow.FollowApp",
      "ghm.follow.gui.FollowAppAction$ActionContext",
      "ghm.follow.gui.StartupStatus",
      "ghm.follow.systemInterface.DefaultSystemInterface",
      "ghm.follow.gui.ClearAll",
      "ghm.follow.gui.Reset",
      "ghm.follow.gui.DeleteAll",
      "ghm.follow.gui.Debug",
      "ghm.follow.gui.FileFollowingPane",
      "ghm.follow.search.SearchableTextPane",
      "ghm.follow.gui.LineTextUI",
      "ghm.follow.gui.LineTextUI$1",
      "ghm.follow.gui.LineView",
      "ghm.follow.io.FilterableOutputDestination",
      "ghm.follow.io.JTextComponentDestination",
      "ghm.follow.FileFollower",
      "ghm.follow.gui.Edit",
      "ghm.follow.gui.Pause",
      "ghm.follow.gui.Open",
      "ghm.follow.gui.Delete",
      "ghm.follow.gui.Exit",
      "ghm.follow.gui.Close",
      "ghm.follow.gui.About",
      "ghm.follow.gui.Clear"
    );
  }
}
