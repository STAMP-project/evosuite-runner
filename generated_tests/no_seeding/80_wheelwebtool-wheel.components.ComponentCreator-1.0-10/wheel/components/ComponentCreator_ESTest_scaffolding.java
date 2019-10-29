/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Oct 29 00:19:33 GMT 2019
 */

package wheel.components;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ComponentCreator_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "wheel.components.ComponentCreator"; 
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
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.dir", "/home/pderakhshanfar/evosuite-model-seeding-ee/evosuite-model-seeding-empirical-evaluation"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ComponentCreator_ESTest_scaffolding.class.getClassLoader() ,
      "wheel.components.Image",
      "wheel.components.Any",
      "wheel.components.NumberInput",
      "wheel.components.ISelectModel",
      "wheel.components.ComponentCreator",
      "wheel.util.DynamicSelectModel",
      "wheel.components.RadioGroup",
      "wheel.components.ElExpression",
      "wheel.components.Select",
      "wheel.components.FileInput",
      "org.xmlpull.v1.XmlSerializer",
      "wheel.components.Checkbox",
      "wheel.components.TableBlock",
      "wheel.components.TextArea",
      "wheel.components.Form$Method",
      "wheel.components.Form",
      "wheel.components.StandaloneComponent",
      "wheel.util.WrappedException",
      "wheel.components.Label",
      "wheel.components.ActionExpression",
      "wheel.components.Hidden",
      "wheel.components.RenderableComponent",
      "wheel.components.IContainer",
      "wheel.IEngine",
      "wheel.components.Component",
      "wheel.components.TextInput",
      "wheel.components.RenderableComponentConfiguration",
      "wheel.util.StringSelectModel",
      "wheel.WheelException",
      "wheel.components.XmlEntityRef",
      "wheel.components.Link",
      "wheel.components.Table",
      "wheel.components.Radio",
      "wheel.AbstractEngine$1",
      "wheel.components.SelectModelFormElement",
      "wheel.components.Text",
      "wheel.components.FormElement",
      "wheel.components.Expression",
      "wheel.components.DateInput",
      "wheel.components.IBuildableComponent",
      "wheel.components.Submit",
      "wheel.components.CheckboxGroup",
      "wheel.components.TableRow",
      "wheel.components.Block",
      "wheel.AbstractEngine"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ComponentCreator_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "wheel.components.ComponentCreator",
      "wheel.components.Component",
      "wheel.components.RenderableComponent",
      "wheel.components.XmlEntityRef",
      "wheel.components.FormElement",
      "wheel.components.Checkbox",
      "wheel.WheelException",
      "wheel.components.Form",
      "wheel.components.Form$Method",
      "wheel.components.Expression",
      "wheel.components.ElExpression",
      "wheel.util.DynamicSelectModel",
      "wheel.components.Block",
      "wheel.components.TextArea",
      "wheel.components.Link",
      "wheel.components.SelectModelFormElement",
      "wheel.components.Select",
      "wheel.components.StandaloneComponent",
      "wheel.ErrorPage",
      "wheel.components.Submit",
      "wheel.components.TableBlock",
      "wheel.components.NumberInput",
      "wheel.components.FileInput",
      "wheel.components.Text",
      "wheel.components.Hidden",
      "wheel.components.Image",
      "wheel.components.ActionExpression",
      "wheel.components.Any",
      "wheel.components.Table",
      "wheel.components.TableRow",
      "wheel.components.Label",
      "wheel.components.ValidationRule",
      "wheel.util.StringSelectModel",
      "wheel.components.DateInput",
      "wheel.components.Radio",
      "wheel.components.CheckboxGroup",
      "wheel.components.RenderableComponentConfiguration",
      "wheel.components.TextInput",
      "wheel.components.RadioGroup",
      "wheel.components.ValidationError",
      "wheel.util.WrappedException"
    );
  }
}
