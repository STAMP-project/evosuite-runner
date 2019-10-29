/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Oct 28 22:45:11 GMT 2019
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
public class ConfigModule_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "module.ConfigModule"; 
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
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ConfigModule_ESTest_scaffolding.class.getClassLoader() ,
      "module.MessageProcessingException",
      "module.ExampleModule",
      "module.MessageDeliveryException",
      "state.Packable",
      "module.RuleSet",
      "module.ModuleSubscriptionException",
      "state.Party",
      "module.cvs",
      "module.ModuleRegisterException",
      "module.mod",
      "module.IRCSession",
      "module.ClientNetworkModule",
      "module.Kernel",
      "state.GameState",
      "module.ModuleInfo",
      "module.MessageFactory",
      "module.NetworkModule",
      "module.AbstractModule",
      "util.ManagedObject",
      "module.Message",
      "util.AbstractFactory",
      "state.Action",
      "module.NetworkException",
      "util.ObjectManager",
      "module.MessageTimeoutException",
      "state.Player",
      "module.IRCProxyModule",
      "module.ConfigModule",
      "state.NetworkData",
      "module.ServerNetworkModule",
      "module.GameModule",
      "util.TaintedByteArrayOutputStream",
      "module.ModuleLoadException",
      "state.PackingException",
      "module.ModuleUnloadException",
      "module.Connection",
      "module.MessageRuleSet",
      "module.Module",
      "state.TextMessage",
      "module.Logger",
      "util.TaintedByteArrayInputStream"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ConfigModule_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "module.AbstractModule",
      "module.ConfigModule",
      "module.Kernel",
      "module.ModuleInfo",
      "util.AbstractFactory",
      "module.MessageFactory",
      "util.ManagedObject",
      "module.Message",
      "module.ServerNetworkModule",
      "module.ModuleLoadException",
      "module.ExampleModule",
      "module.ClientNetworkModule",
      "module.ModuleRegisterException",
      "module.ModuleUnloadException",
      "module.MessageDeliveryException",
      "module.Logger",
      "module.IRCProxyModule",
      "module.GameModule",
      "module.MessageTimeoutException",
      "module.ModuleSubscriptionException"
    );
  }
}
