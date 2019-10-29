/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Oct 28 13:16:57 GMT 2019
 */

package module;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class MessageFactory_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "module.MessageFactory"; 
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
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.home", "/home/pderakhshanfar"); 
    java.lang.System.setProperty("user.dir", "/home/pderakhshanfar/evosuite-model-seeding-ee/evosuite-model-seeding-empirical-evaluation"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(MessageFactory_ESTest_scaffolding.class.getClassLoader() ,
      "module.ExampleModule",
      "state.Packable",
      "gui.GroupPanel",
      "gui.PlayerTree",
      "module.RuleSet",
      "module.ModuleRegisterException",
      "module.mod",
      "module.Kernel",
      "gui.GUIFrame",
      "state.GameState",
      "module.ModuleInfo",
      "module.MessageFactory",
      "module.NetworkModule",
      "gui.GUIState",
      "module.NetworkException",
      "module.MessageTimeoutException",
      "state.NetworkData",
      "module.ConfigModule",
      "module.ServerNetworkModule",
      "module.GameModule",
      "state.PackingException",
      "module.Module",
      "module.Logger",
      "util.TaintedByteArrayInputStream",
      "module.MessageProcessingException",
      "module.MessageDeliveryException",
      "gui.PlayerPanel",
      "gui.ChatPanel$ChatTabPanel",
      "module.ModuleSubscriptionException",
      "state.Party",
      "gui.GroupPanel$GroupButtonListener",
      "module.cvs",
      "module.IRCSession",
      "module.ClientNetworkModule",
      "util.AbstractFactory",
      "util.ManagedObject",
      "module.Message",
      "module.AbstractModule",
      "state.Action",
      "util.ObjectManager",
      "state.Player",
      "module.IRCProxyModule",
      "gui.WorldGLPanel",
      "util.TaintedByteArrayOutputStream",
      "module.ModuleLoadException",
      "module.ModuleUnloadException",
      "module.Connection",
      "module.MessageRuleSet",
      "gui.GUIGLState",
      "state.TextMessage",
      "gui.ChatPanel"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(MessageFactory_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "util.AbstractFactory",
      "module.MessageFactory",
      "util.ManagedObject",
      "module.Message",
      "module.AbstractModule",
      "module.ClientNetworkModule",
      "module.ServerNetworkModule",
      "gui.GUIFrame",
      "module.Kernel",
      "module.ModuleInfo",
      "module.MessageDeliveryException",
      "module.GameModule",
      "module.Logger",
      "module.IRCProxyModule",
      "module.ExampleModule",
      "module.ConfigModule",
      "module.MessageTimeoutException",
      "module.ModuleRegisterException",
      "module.ModuleUnloadException",
      "module.ModuleSubscriptionException",
      "gui.GroupPanel",
      "gui.GroupPanel$GroupButtonListener",
      "module.ModuleLoadException"
    );
  }
}
