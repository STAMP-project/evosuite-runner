/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Nov 06 13:12:37 GMT 2019
 */

package jaw.gui;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ConexaoBD_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "jaw.gui.ConexaoBD"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ConexaoBD_ESTest_scaffolding.class.getClassLoader() ,
      "jaw.gui.ProcessarEntidadesTabela$2",
      "jaw.gui.ProcessarEntidadesTabela$1",
      "jaw.configuracoes.ConexaoBD",
      "jaw.configuracoes.Configuracao",
      "jaw.gui.ProcessarEntidades",
      "jaw.gui.ProcessarEntidadesTabela$4",
      "jaw.gui.ProcessarEntidadesTabela$3",
      "jaw.metamodelo.Entidade",
      "jaw.Main",
      "jaw.gui.ConexaoBD",
      "jaw.gui.ConexaoBD$8",
      "jaw.gui.ProcessarEntidadesTabela",
      "jaw.util.Conversor",
      "jaw.gui.ConexaoBD$3",
      "jaw.gui.ConexaoBD$2",
      "jaw.gui.ConexaoBD$1",
      "jaw.gui.ProcessarEntidadesTree$1",
      "jaw.gui.ConexaoBD$7",
      "jaw.gui.ConexaoBD$6",
      "jaw.gui.ProcessarEntidadesTree",
      "jaw.metamodelo.Atributo",
      "jaw.gui.ConexaoBD$5",
      "jaw.gui.ConexaoBD$4"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ConexaoBD_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "jaw.gui.ConexaoBD",
      "jaw.gui.ConexaoBD$1",
      "jaw.gui.ConexaoBD$2",
      "jaw.gui.ConexaoBD$3",
      "jaw.gui.ConexaoBD$4",
      "jaw.gui.ConexaoBD$5",
      "jaw.gui.ConexaoBD$6",
      "jaw.gui.ConexaoBD$7",
      "jaw.gui.ConexaoBD$8",
      "jaw.Main",
      "jaw.configuracoes.ConexaoBD",
      "jaw.gui.ProcessarEntidadesTree",
      "jaw.gui.ProcessarEntidadesTabela",
      "jaw.gui.ProcessarEntidadesTabela$1",
      "jaw.gui.ProcessarEntidadesTabela$2",
      "jaw.gui.ProcessarEntidadesTabela$3",
      "jaw.gui.ProcessarEntidadesTabela$4",
      "jaw.util.Conversor",
      "jaw.gui.ProcessarEntidadesTree$1",
      "jaw.gui.ProcessarEntidades",
      "jaw.metamodelo.Atributo",
      "jaw.metamodelo.Entidade"
    );
  }
}
