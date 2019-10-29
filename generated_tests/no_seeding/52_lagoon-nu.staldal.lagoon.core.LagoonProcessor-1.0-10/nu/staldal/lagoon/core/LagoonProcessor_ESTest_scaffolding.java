/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Oct 29 00:06:40 GMT 2019
 */

package nu.staldal.lagoon.core;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class LagoonProcessor_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "nu.staldal.lagoon.core.LagoonProcessor"; 
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
    java.lang.System.setProperty("user.home", "/home/pderakhshanfar"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(LagoonProcessor_ESTest_scaffolding.class.getClassLoader() ,
      "nu.staldal.lagoon.core.FileEntry$TempOutputHandler",
      "nu.staldal.xtree.Node",
      "nu.staldal.lagoon.core.Target",
      "nu.staldal.lagoon.core.LagoonProcessor",
      "nu.staldal.lagoon.core.AuthenticationMissingException",
      "nu.staldal.lagoon.core.OutputHandler",
      "nu.staldal.lagoon.core.SourceManager",
      "nu.staldal.lagoon.core.Sitemap",
      "nu.staldal.lagoon.core.XMLStreamProducer",
      "nu.staldal.lagoon.filestorage.FTPFileStorage",
      "nu.staldal.lagoon.filestorage.FTPFileStorage$FTPOutputHandler",
      "nu.staldal.lagoon.filestorage.LocalFileStorage$LocalOutputHandler",
      "nu.staldal.lagoon.core.LagoonException",
      "nu.staldal.lagoon.core.Producer",
      "nu.staldal.lagoon.core.SitemapEntry",
      "nu.staldal.lagoon.core.EntryWithSource",
      "nu.staldal.util.Utils",
      "nu.staldal.xtree.NodeWithChildren",
      "nu.staldal.lagoon.core.FileStorage",
      "nu.staldal.lagoon.core.FileTarget",
      "nu.staldal.lagoon.core.FileEntry",
      "nu.staldal.lagoon.core.LagoonContext",
      "nu.staldal.xtree.Element",
      "nu.staldal.lagoon.core.RemoteFileStorage",
      "nu.staldal.lagoon.core.ProducerInterface",
      "nu.staldal.lagoon.core.PartEntry",
      "nu.staldal.lagoon.core.SourceManagerProvider",
      "nu.staldal.lagoon.filestorage.LocalFileStorage",
      "nu.staldal.lagoon.core.AuthenticationException"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(LagoonProcessor_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "nu.staldal.lagoon.core.LagoonProcessor",
      "nu.staldal.xtree.Node",
      "nu.staldal.xtree.NodeWithChildren",
      "nu.staldal.xtree.Element",
      "nu.staldal.lagoon.core.Producer",
      "nu.staldal.lagoon.core.XMLStreamConsumer",
      "nu.staldal.lagoon.core.Transform",
      "nu.staldal.lagoon.producer.BasicSplit",
      "nu.staldal.util.Utils",
      "nu.staldal.lagoon.filestorage.LocalFileStorage",
      "nu.staldal.lagoon.core.LagoonException",
      "nu.staldal.xtree.ProcessingInstruction",
      "nu.staldal.lagoon.core.Sitemap",
      "nu.staldal.xtree.Text",
      "nu.staldal.lagoon.core.RemoteFileStorage",
      "nu.staldal.lagoon.filestorage.SSHFileStorage",
      "nu.staldal.lagoon.producer.IslandSplit",
      "nu.staldal.lagoon.filestorage.FTPFileStorage",
      "nu.staldal.lagoon.core.AuthenticationException",
      "nu.staldal.lagoon.core.AuthenticationMissingException",
      "nu.staldal.lagoon.producer.LSSITransformer",
      "nu.staldal.lagoon.core.Read",
      "nu.staldal.lagoon.producer.FileRead",
      "nu.staldal.lagoon.core.Source",
      "nu.staldal.lagoon.producer.DirSource",
      "nu.staldal.lagoon.producer.FileSource",
      "nu.staldal.lagoon.core.EntryWithSource",
      "nu.staldal.lagoon.core.FileEntry",
      "nu.staldal.ftp.FTPClient",
      "nu.staldal.lagoon.core.Format",
      "nu.staldal.lagoon.producer.XMLFormatter",
      "nu.staldal.lagoon.core.ByteStreamConsumer",
      "nu.staldal.lagoon.core.Parse",
      "nu.staldal.lagoon.producer.XMLParse",
      "nu.staldal.lagoon.producer.XSLTransformer",
      "nu.staldal.lagoon.core.DeleteEntry"
    );
  }
}
