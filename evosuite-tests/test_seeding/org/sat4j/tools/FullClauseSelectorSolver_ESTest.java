/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 17 07:57:45 GMT 2019
 */

package org.sat4j.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.LightFactory;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.CardinalityDataStructure;
import org.sat4j.minisat.constraints.cnf.OriginalBinaryClause;
import org.sat4j.minisat.core.ILits;
import org.sat4j.minisat.core.RestartStrategy;
import org.sat4j.minisat.core.SearchParams;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.ClauseOnlyLearning;
import org.sat4j.minisat.orders.LevelBasedVarOrderHeap;
import org.sat4j.minisat.orders.NaturalStaticOrder;
import org.sat4j.minisat.orders.TabuListDecorator;
import org.sat4j.minisat.restarts.FixedPeriodRestarts;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.AbstractMinimalModel;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.FullClauseSelectorSolver;
import org.sat4j.tools.GroupClauseSelectorSolver;
import org.sat4j.tools.ManyCore;
import org.sat4j.tools.Minimal4CardinalityModel;
import org.sat4j.tools.Minimal4InclusionModel;
import org.sat4j.tools.ModelIterator;
import org.sat4j.tools.ModelIteratorToSATAdapter;
import org.sat4j.tools.SolutionCounter;
import org.sat4j.tools.SolutionFoundListener;
import org.sat4j.tools.StatisticsSolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FullClauseSelectorSolver_ESTest extends FullClauseSelectorSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 24;
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = mock(ModelIteratorToSATAdapter.class, new ViolatedAssumptionAnswer());
      doReturn(intArray0).when(modelIteratorToSATAdapter0).modelWithInternalVariables();
      FullClauseSelectorSolver<ModelIterator> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<ModelIterator>(modelIteratorToSATAdapter0, true);
      int[] intArray1 = fullClauseSelectorSolver0.model();
      assertNotSame(intArray1, intArray0);
      assertArrayEquals(new int[] {24}, intArray1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.lightSolver();
      SolutionCounter solutionCounter0 = new SolutionCounter(iSolver0);
      solutionCounter0.countSolutions();
      FullClauseSelectorSolver<SolutionCounter> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<SolutionCounter>(solutionCounter0, false);
      int[] intArray0 = fullClauseSelectorSolver0.model();
      assertArrayEquals(new int[] {}, intArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      ModelIterator modelIterator0 = new ModelIterator(iSolver0);
      FullClauseSelectorSolver<ModelIterator> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<ModelIterator>(modelIterator0, true);
      boolean boolean0 = fullClauseSelectorSolver0.isSkipDuplicatedEntries();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      FullClauseSelectorSolver<DimacsStringSolver> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<DimacsStringSolver>(dimacsStringSolver0, true);
      IVecInt iVecInt0 = mock(IVecInt.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(iVecInt0).get(anyInt());
      ILits iLits0 = mock(ILits.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(iLits0).valueToString(anyInt());
      OriginalBinaryClause originalBinaryClause0 = new OriginalBinaryClause(iVecInt0, iLits0);
      fullClauseSelectorSolver0.setLastConstr(originalBinaryClause0);
      IConstr iConstr0 = fullClauseSelectorSolver0.getLastConstr();
      assertFalse(iConstr0.learnt());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ManyCore<StatisticsSolver> manyCore0 = (ManyCore<StatisticsSolver>) mock(ManyCore.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null).when(manyCore0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(0).when(manyCore0).nextFreeVarId(anyBoolean());
      FullClauseSelectorSolver<ManyCore<StatisticsSolver>> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<ManyCore<StatisticsSolver>>(manyCore0, false);
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      ClauseOnlyLearning<CardinalityDataStructure> clauseOnlyLearning0 = new ClauseOnlyLearning<CardinalityDataStructure>();
      SearchParams searchParams0 = new SearchParams(2974);
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(levelBasedVarOrderHeap0, 0);
      FixedPeriodRestarts fixedPeriodRestarts0 = new FixedPeriodRestarts();
      Solver<CardinalityDataStructure> solver0 = new Solver<CardinalityDataStructure>(clauseOnlyLearning0, cardinalityDataStructure0, searchParams0, tabuListDecorator0, fixedPeriodRestarts0);
      IVecInt iVecInt0 = solver0.getOutLearnt();
      ModelIterator modelIterator0 = new ModelIterator(fullClauseSelectorSolver0);
      FullClauseSelectorSolver<ModelIterator> fullClauseSelectorSolver1 = new FullClauseSelectorSolver<ModelIterator>(modelIterator0, false);
      fullClauseSelectorSolver1.addNonControlableClause(iVecInt0);
      assertEquals(0, iVecInt0.last());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ModelIteratorToSATAdapter[] modelIteratorToSATAdapterArray0 = new ModelIteratorToSATAdapter[1];
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = mock(ModelIteratorToSATAdapter.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null).when(modelIteratorToSATAdapter0).addClause(any(org.sat4j.specs.IVecInt.class));
      modelIteratorToSATAdapterArray0[0] = modelIteratorToSATAdapter0;
      ManyCore<ModelIteratorToSATAdapter> manyCore0 = new ManyCore<ModelIteratorToSATAdapter>(modelIteratorToSATAdapterArray0);
      VecInt vecInt0 = new VecInt(2857);
      ModelIterator modelIterator0 = new ModelIterator(manyCore0);
      FullClauseSelectorSolver<ModelIterator> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<ModelIterator>(modelIterator0, true);
      fullClauseSelectorSolver0.addNonControlableClause(vecInt0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IVecInt iVecInt0 = mock(IVecInt.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(iVecInt0).get(anyInt());
      ILits iLits0 = mock(ILits.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null).when(iLits0).valueToString(anyInt());
      OriginalBinaryClause originalBinaryClause0 = new OriginalBinaryClause(iVecInt0, iLits0);
      ManyCore<StatisticsSolver> manyCore0 = (ManyCore<StatisticsSolver>) mock(ManyCore.class, new ViolatedAssumptionAnswer());
      doReturn(originalBinaryClause0).when(manyCore0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(5000).when(manyCore0).nextFreeVarId(anyBoolean());
      FullClauseSelectorSolver<ManyCore<StatisticsSolver>> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<ManyCore<StatisticsSolver>>(manyCore0, false);
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      ClauseOnlyLearning<CardinalityDataStructure> clauseOnlyLearning0 = new ClauseOnlyLearning<CardinalityDataStructure>();
      SearchParams searchParams0 = new SearchParams(2974);
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(levelBasedVarOrderHeap0, 0);
      FixedPeriodRestarts fixedPeriodRestarts0 = new FixedPeriodRestarts();
      Solver<CardinalityDataStructure> solver0 = new Solver<CardinalityDataStructure>(clauseOnlyLearning0, cardinalityDataStructure0, searchParams0, tabuListDecorator0, fixedPeriodRestarts0);
      IVecInt iVecInt1 = solver0.getOutLearnt();
      fullClauseSelectorSolver0.addClause(iVecInt1);
      assertEquals(5000, iVecInt1.last());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 0;
      ModelIteratorToSATAdapter[] modelIteratorToSATAdapterArray0 = new ModelIteratorToSATAdapter[1];
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = mock(ModelIteratorToSATAdapter.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null).when(modelIteratorToSATAdapter0).addClause(any(org.sat4j.specs.IVecInt.class));
      modelIteratorToSATAdapterArray0[0] = modelIteratorToSATAdapter0;
      ManyCore<ModelIteratorToSATAdapter> manyCore0 = new ManyCore<ModelIteratorToSATAdapter>(modelIteratorToSATAdapterArray0);
      VecInt vecInt0 = new VecInt(2857);
      IVecInt iVecInt0 = vecInt0.push((-1));
      IConstr iConstr0 = manyCore0.addClause(iVecInt0);
      iConstr0.canBePropagatedMultipleTimes();
      iConstr0.size();
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iSolver0).isSatisfiable(anyBoolean());
      doReturn((Object) intArray0, (Object) null).when(iSolver0).model();
      doReturn(0, 0).when(iSolver0).nVars();
      doReturn((IConstr) null).when(iSolver0).addAtMost(any(org.sat4j.specs.IVecInt.class) , anyInt());
      doReturn(iConstr0, (IConstr) null).when(iSolver0).discardCurrentModel();
      doReturn((Object) intArray0, (Object) null).when(iSolver0).modelWithInternalVariables();
      ModelIterator modelIterator0 = new ModelIterator(iSolver0);
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(modelIterator0);
      GroupClauseSelectorSolver<AbstractMinimalModel> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<AbstractMinimalModel>(minimal4CardinalityModel0);
      FullClauseSelectorSolver<GroupClauseSelectorSolver<AbstractMinimalModel>> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<GroupClauseSelectorSolver<AbstractMinimalModel>>(groupClauseSelectorSolver0, false);
      // Undeclared exception!
      try { 
        fullClauseSelectorSolver0.model();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.Minimal4CardinalityModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClauseOnlyLearning<CardinalityDataStructure> clauseOnlyLearning0 = new ClauseOnlyLearning<CardinalityDataStructure>();
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      NaturalStaticOrder naturalStaticOrder0 = new NaturalStaticOrder();
      Solver<CardinalityDataStructure> solver0 = new Solver<CardinalityDataStructure>(clauseOnlyLearning0, cardinalityDataStructure0, naturalStaticOrder0, (RestartStrategy) null);
      FullClauseSelectorSolver<Solver<CardinalityDataStructure>> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<Solver<CardinalityDataStructure>>(solver0, true);
      // Undeclared exception!
      try { 
        fullClauseSelectorSolver0.model();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Call the solve method first!!!
         //
         verifyException("org.sat4j.minisat.core.Solver", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      ModelIterator modelIterator0 = new ModelIterator(dimacsStringSolver0);
      IVecInt iVecInt0 = VecInt.EMPTY;
      FullClauseSelectorSolver<ModelIterator> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<ModelIterator>(modelIterator0, false);
      // Undeclared exception!
      try { 
        fullClauseSelectorSolver0.addControlableClause(iVecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.EmptyVecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FullClauseSelectorSolver<Solver<CardinalityDataStructure>> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<Solver<CardinalityDataStructure>>((Solver<CardinalityDataStructure>) null, false);
      // Undeclared exception!
      try { 
        fullClauseSelectorSolver0.addControlableClause((IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AbstractClauseSelectorSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      VecInt vecInt0 = new VecInt(0, 1485);
      IVecInt iVecInt0 = vecInt0.push((-5));
      ClauseOnlyLearning<CardinalityDataStructure> clauseOnlyLearning0 = new ClauseOnlyLearning<CardinalityDataStructure>();
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      NaturalStaticOrder naturalStaticOrder0 = new NaturalStaticOrder();
      Solver<CardinalityDataStructure> solver0 = new Solver<CardinalityDataStructure>(clauseOnlyLearning0, cardinalityDataStructure0, naturalStaticOrder0, (RestartStrategy) null);
      FullClauseSelectorSolver<Solver<CardinalityDataStructure>> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<Solver<CardinalityDataStructure>>(solver0, true);
      // Undeclared exception!
      try { 
        fullClauseSelectorSolver0.addControlableClause(iVecInt0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Please call newVar(int) before adding constraints!!!
         //
         verifyException("org.sat4j.tools.AbstractClauseSelectorSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      VecInt vecInt0 = new VecInt(0, 1485);
      IVecInt iVecInt0 = vecInt0.push(0);
      ClauseOnlyLearning<CardinalityDataStructure> clauseOnlyLearning0 = new ClauseOnlyLearning<CardinalityDataStructure>();
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      NaturalStaticOrder naturalStaticOrder0 = new NaturalStaticOrder();
      Solver<CardinalityDataStructure> solver0 = new Solver<CardinalityDataStructure>(clauseOnlyLearning0, cardinalityDataStructure0, naturalStaticOrder0, (RestartStrategy) null);
      FullClauseSelectorSolver<Solver<CardinalityDataStructure>> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<Solver<CardinalityDataStructure>>(solver0, true);
      // Undeclared exception!
      try { 
        fullClauseSelectorSolver0.addControlableClause(iVecInt0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is not a valid variable identifier
         //
         verifyException("org.sat4j.minisat.core.Solver", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      VecInt vecInt0 = new VecInt(0, 1517);
      ClauseOnlyLearning<CardinalityDataStructure> clauseOnlyLearning0 = new ClauseOnlyLearning<CardinalityDataStructure>();
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      NaturalStaticOrder naturalStaticOrder0 = new NaturalStaticOrder();
      vecInt0.shrinkTo(7);
      Solver<CardinalityDataStructure> solver0 = new Solver<CardinalityDataStructure>(clauseOnlyLearning0, cardinalityDataStructure0, naturalStaticOrder0, (RestartStrategy) null);
      FullClauseSelectorSolver<Solver<CardinalityDataStructure>> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<Solver<CardinalityDataStructure>>(solver0, true);
      // Undeclared exception!
      try { 
        fullClauseSelectorSolver0.addControlableClause(vecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      FullClauseSelectorSolver<StatisticsSolver> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<StatisticsSolver>(statisticsSolver0, false);
      // Undeclared exception!
      try { 
        fullClauseSelectorSolver0.addClause((IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AbstractClauseSelectorSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ModelIteratorToSATAdapter[] modelIteratorToSATAdapterArray0 = new ModelIteratorToSATAdapter[1];
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = mock(ModelIteratorToSATAdapter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(modelIteratorToSATAdapter0).nextFreeVarId(anyBoolean());
      modelIteratorToSATAdapterArray0[0] = modelIteratorToSATAdapter0;
      VecInt vecInt0 = new VecInt(2857);
      IVecInt iVecInt0 = vecInt0.push((-1));
      FullClauseSelectorSolver<ModelIterator> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<ModelIterator>(modelIteratorToSATAdapterArray0[0], true);
      // Undeclared exception!
      try { 
        fullClauseSelectorSolver0.addClause(iVecInt0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Please call newVar(int) before adding constraints!!!
         //
         verifyException("org.sat4j.tools.AbstractClauseSelectorSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FullClauseSelectorSolver<Solver<CardinalityDataStructure>> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<Solver<CardinalityDataStructure>>((Solver<CardinalityDataStructure>) null, true);
      VecInt vecInt0 = new VecInt();
      IConstr iConstr0 = fullClauseSelectorSolver0.addControlableClause(vecInt0);
      assertNull(iConstr0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn((int[]) null).when(iSolver0).modelWithInternalVariables();
      ModelIterator modelIterator0 = new ModelIterator(iSolver0);
      FullClauseSelectorSolver<ModelIterator> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<ModelIterator>(modelIterator0, false);
      int[] intArray0 = fullClauseSelectorSolver0.model();
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      VecInt vecInt0 = new VecInt(0, 1485);
      IVecInt iVecInt0 = vecInt0.push((-1));
      ClauseOnlyLearning<CardinalityDataStructure> clauseOnlyLearning0 = new ClauseOnlyLearning<CardinalityDataStructure>();
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      NaturalStaticOrder naturalStaticOrder0 = new NaturalStaticOrder();
      Solver<CardinalityDataStructure> solver0 = new Solver<CardinalityDataStructure>(clauseOnlyLearning0, cardinalityDataStructure0, naturalStaticOrder0, (RestartStrategy) null);
      FullClauseSelectorSolver<Solver<CardinalityDataStructure>> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<Solver<CardinalityDataStructure>>(solver0, true);
      fullClauseSelectorSolver0.addControlableClause(iVecInt0);
      //  // Unstable assertion: assertEquals(1, solver0.getPropagationLevel());
      //  // Unstable assertion: assertEquals(1, vecInt0.last());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      VecInt vecInt0 = new VecInt(2846);
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver(102);
      FullClauseSelectorSolver<DimacsStringSolver> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<DimacsStringSolver>(dimacsStringSolver0, false);
      fullClauseSelectorSolver0.addControlableClause(vecInt0);
      assertEquals(1, vecInt0.last());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      FullClauseSelectorSolver<StatisticsSolver> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<StatisticsSolver>(statisticsSolver0, false);
      Collection<IConstr> collection0 = fullClauseSelectorSolver0.getConstraints();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = new ModelIteratorToSATAdapter((ISolver) null, 2210L, (SolutionFoundListener) null);
      FullClauseSelectorSolver<ModelIteratorToSATAdapter> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<ModelIteratorToSATAdapter>(modelIteratorToSATAdapter0, true);
      // Undeclared exception!
      try { 
        fullClauseSelectorSolver0.addNonControlableClause((IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FullClauseSelectorSolver<Minimal4InclusionModel> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<Minimal4InclusionModel>((Minimal4InclusionModel) null, true);
      Collection<Integer> collection0 = fullClauseSelectorSolver0.getAddedVars();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      ModelIterator modelIterator0 = new ModelIterator(iSolver0);
      FullClauseSelectorSolver<ModelIterator> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<ModelIterator>(modelIterator0, false);
      boolean boolean0 = fullClauseSelectorSolver0.isSkipDuplicatedEntries();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      FullClauseSelectorSolver<DimacsStringSolver> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<DimacsStringSolver>(dimacsStringSolver0, true);
      IVecInt iVecInt0 = fullClauseSelectorSolver0.getLastClause();
      assertTrue(iVecInt0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FullClauseSelectorSolver<Minimal4InclusionModel> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<Minimal4InclusionModel>((Minimal4InclusionModel) null, true);
      Map<Integer, IConstr> map0 = fullClauseSelectorSolver0.getConstrs();
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      FullClauseSelectorSolver<DimacsStringSolver> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<DimacsStringSolver>(dimacsStringSolver0, true);
      IConstr iConstr0 = fullClauseSelectorSolver0.getLastConstr();
      assertNull(iConstr0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ModelIteratorToSATAdapter[] modelIteratorToSATAdapterArray0 = new ModelIteratorToSATAdapter[1];
      VecInt vecInt0 = new VecInt(2857);
      FullClauseSelectorSolver<ModelIterator> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<ModelIterator>(modelIteratorToSATAdapterArray0[0], true);
      IConstr iConstr0 = fullClauseSelectorSolver0.addClause(vecInt0);
      assertNull(iConstr0);
  }
}
