/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Feb 18 16:02:01 GMT 2019
 */

package org.sat4j.core;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class VecInt_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.sat4j.core.VecInt"; 
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
    java.lang.System.setProperty("user.dir", "/home/pderakhshanfar/common-uncommon-behaviour-testing-experiment"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(VecInt_ESTest_scaffolding.class.getClassLoader() ,
      "org.sat4j.minisat.core.Solver$2",
      "org.sat4j.minisat.core.Solver$1",
      "org.sat4j.specs.UnitClauseProvider",
      "org.sat4j.minisat.core.ConflictTimerAdapter",
      "org.sat4j.minisat.core.Solver$4",
      "org.sat4j.minisat.core.Solver$3",
      "org.sat4j.minisat.core.LearnedConstraintsEvaluationType",
      "org.sat4j.core.VecInt$1",
      "org.sat4j.minisat.core.DataStructureFactory",
      "org.sat4j.specs.UnitPropagationListener",
      "org.sat4j.minisat.core.SizeComparator",
      "org.sat4j.minisat.core.Glucose2LCDS",
      "org.sat4j.minisat.core.Solver$6",
      "org.sat4j.minisat.core.SolverStats",
      "org.sat4j.minisat.core.Solver$8",
      "org.sat4j.minisat.core.ConstrActivityListener",
      "org.sat4j.minisat.core.IPhaseSelectionStrategy",
      "org.sat4j.minisat.core.Counter",
      "org.sat4j.specs.Propagatable",
      "org.sat4j.minisat.constraints.cnf.Clauses",
      "org.sat4j.core.EmptyVecInt",
      "org.sat4j.minisat.core.Pair",
      "org.sat4j.specs.IVec",
      "org.sat4j.minisat.orders.AbstractPhaserecordingSelectionStrategy",
      "org.sat4j.minisat.constraints.cnf.UnitClause",
      "org.sat4j.specs.Lbool",
      "org.sat4j.specs.SearchListener",
      "org.sat4j.specs.SearchListenerAdapter",
      "org.sat4j.minisat.core.SimplificationType",
      "org.sat4j.minisat.core.SearchParams",
      "org.sat4j.minisat.core.ActivityLCDS",
      "org.sat4j.specs.ILogAble$1",
      "org.sat4j.specs.TimeoutException",
      "org.sat4j.specs.Constr",
      "org.sat4j.minisat.core.ConflictTimerContainer",
      "org.sat4j.specs.ISolverService",
      "org.sat4j.minisat.orders.RSATPhaseSelectionStrategy",
      "org.sat4j.minisat.core.LearningStrategy",
      "org.sat4j.specs.IteratorInt",
      "org.sat4j.minisat.core.ISimplifier",
      "org.sat4j.specs.ISolver",
      "org.sat4j.minisat.core.ConflictTimer",
      "org.sat4j.minisat.core.VarActivityListener",
      "org.sat4j.specs.UnitClauseProvider$1",
      "org.sat4j.specs.Constr$1",
      "org.sat4j.specs.VarMapper",
      "org.sat4j.specs.RandomAccessModel",
      "org.sat4j.minisat.core.CircularBuffer",
      "org.sat4j.minisat.core.VoidTracing",
      "org.sat4j.minisat.core.ActivityListener",
      "org.sat4j.minisat.restarts.Glucose21Restarts",
      "org.sat4j.minisat.core.LBDConflictTimer",
      "org.sat4j.minisat.core.GlucoseLCDS",
      "org.sat4j.minisat.core.ILits",
      "org.sat4j.specs.ILogAble",
      "org.sat4j.specs.ContradictionException",
      "org.sat4j.minisat.core.SizeLCDS",
      "org.sat4j.minisat.core.RestartStrategy",
      "org.sat4j.specs.IConstr",
      "org.sat4j.specs.IVecInt",
      "org.sat4j.minisat.core.AgeLCDS",
      "org.sat4j.minisat.core.PrimeImplicantStrategy",
      "org.sat4j.core.ReadOnlyVecInt",
      "org.sat4j.minisat.orders.VariableComparator",
      "org.sat4j.minisat.core.IOrder",
      "org.sat4j.minisat.orders.ActivityBasedVariableComparator",
      "org.sat4j.minisat.core.Learner",
      "org.sat4j.minisat.core.ActivityComparator",
      "org.sat4j.specs.MandatoryLiteralListener",
      "org.sat4j.specs.IProblem",
      "org.sat4j.minisat.core.ICDCL",
      "org.sat4j.core.VecInt",
      "org.sat4j.minisat.core.LearnedConstraintsDeletionStrategy",
      "org.sat4j.minisat.core.Solver",
      "org.sat4j.core.EmptyVecInt$1",
      "org.sat4j.minisat.core.MemoryBasedConflictTimer"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.util.Comparator", false, VecInt_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(VecInt_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.sat4j.core.EmptyVecInt",
      "org.sat4j.core.VecInt",
      "org.sat4j.core.VecInt$1",
      "org.sat4j.minisat.orders.ActivityBasedVariableComparator",
      "org.sat4j.minisat.core.Solver$1",
      "org.sat4j.minisat.core.Solver",
      "org.sat4j.specs.ILogAble$1",
      "org.sat4j.specs.ILogAble",
      "org.sat4j.minisat.core.ActivityComparator",
      "org.sat4j.minisat.core.SolverStats",
      "org.sat4j.specs.SearchListenerAdapter",
      "org.sat4j.minisat.core.VoidTracing",
      "org.sat4j.specs.UnitClauseProvider$1",
      "org.sat4j.specs.UnitClauseProvider",
      "org.sat4j.minisat.core.Solver$2",
      "org.sat4j.minisat.core.Solver$3",
      "org.sat4j.minisat.core.Solver$4",
      "org.sat4j.minisat.core.Pair",
      "org.sat4j.minisat.core.ConflictTimerAdapter",
      "org.sat4j.minisat.core.MemoryBasedConflictTimer",
      "org.sat4j.minisat.core.ActivityLCDS",
      "org.sat4j.minisat.core.LBDConflictTimer",
      "org.sat4j.minisat.core.GlucoseLCDS",
      "org.sat4j.minisat.core.Glucose2LCDS",
      "org.sat4j.minisat.core.AgeLCDS",
      "org.sat4j.minisat.core.SizeLCDS",
      "org.sat4j.minisat.core.Solver$8",
      "org.sat4j.minisat.orders.RSATPhaseSelectionStrategy",
      "org.sat4j.minisat.restarts.Glucose21Restarts",
      "org.sat4j.minisat.core.CircularBuffer",
      "org.sat4j.minisat.constraints.cnf.Clauses",
      "org.sat4j.minisat.constraints.cnf.UnitClause",
      "org.sat4j.minisat.core.Counter",
      "org.sat4j.specs.Lbool",
      "org.sat4j.core.EmptyVecInt$1",
      "org.sat4j.minisat.core.ConflictTimerContainer",
      "org.sat4j.minisat.core.Solver$6",
      "org.sat4j.specs.ContradictionException",
      "org.sat4j.core.ReadOnlyVecInt"
    );
  }
}
