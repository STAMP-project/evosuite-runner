/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 15:59:44 GMT 2019
 */

package org.sat4j.tools.encoding;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PrintWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.BasicLauncher;
import org.sat4j.LightFactory;
import org.sat4j.core.ASolverFactory;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.MixedDataStructureSingleWL;
import org.sat4j.minisat.core.SearchParams;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.ActiveLearning;
import org.sat4j.minisat.learning.ClauseOnlyLearning;
import org.sat4j.minisat.learning.FixedLengthLearning;
import org.sat4j.minisat.learning.PercentLengthLearning;
import org.sat4j.minisat.orders.PhaseInLastLearnedClauseSelectionStrategy;
import org.sat4j.minisat.orders.PureOrder;
import org.sat4j.minisat.orders.VarOrderHeap;
import org.sat4j.minisat.restarts.EMARestarts;
import org.sat4j.minisat.restarts.LubyRestarts;
import org.sat4j.minisat.restarts.MiniSATRestarts;
import org.sat4j.opt.MaxSatDecorator;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.AbstractMinimalModel;
import org.sat4j.tools.CheckMUSSolutionListener;
import org.sat4j.tools.DimacsOutputSolver;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.FullClauseSelectorSolver;
import org.sat4j.tools.Minimal4CardinalityModel;
import org.sat4j.tools.Minimal4InclusionModel;
import org.sat4j.tools.SingleSolutionDetector;
import org.sat4j.tools.StatisticsSolver;
import org.sat4j.tools.encoding.Sequential;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Sequential_ESTest extends Sequential_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      PercentLengthLearning<MixedDataStructureSingleWL> percentLengthLearning0 = new PercentLengthLearning<MixedDataStructureSingleWL>();
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      SearchParams searchParams0 = new SearchParams();
      PhaseInLastLearnedClauseSelectionStrategy phaseInLastLearnedClauseSelectionStrategy0 = new PhaseInLastLearnedClauseSelectionStrategy();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap(phaseInLastLearnedClauseSelectionStrategy0);
      LubyRestarts lubyRestarts0 = new LubyRestarts(3587);
      Solver<MixedDataStructureSingleWL> solver0 = new Solver<MixedDataStructureSingleWL>(percentLengthLearning0, mixedDataStructureSingleWL0, searchParams0, varOrderHeap0, lubyRestarts0);
      int[] intArray0 = new int[5];
      intArray0[0] = 3587;
      intArray0[1] = 18;
      intArray0[2] = 3587;
      intArray0[3] = 32;
      intArray0[4] = 692;
      VecInt vecInt0 = new VecInt(intArray0);
      sequential0.addExactlyOne(solver0, vecInt0);
      assertEquals(3591, solver0.realNumberOfVariables());
      assertEquals(0, solver0.getPropagationLevel());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      FixedLengthLearning<MixedDataStructureSingleWL> fixedLengthLearning0 = new FixedLengthLearning<MixedDataStructureSingleWL>(0);
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      PureOrder pureOrder0 = new PureOrder();
      EMARestarts eMARestarts0 = new EMARestarts();
      Solver<MixedDataStructureSingleWL> solver0 = new Solver<MixedDataStructureSingleWL>(fixedLengthLearning0, mixedDataStructureSingleWL0, pureOrder0, eMARestarts0);
      VecInt vecInt0 = new VecInt(0, (-1158));
      IVecInt iVecInt0 = vecInt0.push(859);
      ASolverFactory<Minimal4CardinalityModel> aSolverFactory0 = (ASolverFactory<Minimal4CardinalityModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory0);
      AbstractMinimalModel abstractMinimalModel0 = new AbstractMinimalModel(solver0, iVecInt0, checkMUSSolutionListener0);
      IConstr iConstr0 = sequential0.addExactly(abstractMinimalModel0, vecInt0, (-1158));
      assertEquals(2, iConstr0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      VecInt vecInt0 = new VecInt(4964, 4964);
      // Undeclared exception!
      sequential0.addExactlyOne(iSolver0, vecInt0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      VecInt vecInt0 = new VecInt();
      AbstractMinimalModel abstractMinimalModel0 = new AbstractMinimalModel(statisticsSolver0, vecInt0);
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(abstractMinimalModel0, false);
      // Undeclared exception!
      try { 
        sequential0.addExactlyOne(maxSatDecorator0, vecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.tools.StatisticsSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      // Undeclared exception!
      try { 
        sequential0.addExactlyOne((ISolver) null, (IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.EncodingStrategyAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      ASolverFactory<Solver<MixedDataStructureSingleWL>> aSolverFactory0 = (ASolverFactory<Solver<MixedDataStructureSingleWL>>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      BasicLauncher<Solver<MixedDataStructureSingleWL>> basicLauncher0 = new BasicLauncher<Solver<MixedDataStructureSingleWL>>(aSolverFactory0);
      PrintWriter printWriter0 = basicLauncher0.getLogWriter();
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver(printWriter0);
      VecInt vecInt0 = new VecInt();
      // Undeclared exception!
      try { 
        sequential0.addExactlyOne(dimacsOutputSolver0, vecInt0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.Sequential", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver(222);
      ASolverFactory<Minimal4CardinalityModel> aSolverFactory0 = (ASolverFactory<Minimal4CardinalityModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory0);
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(dimacsStringSolver0, checkMUSSolutionListener0);
      FullClauseSelectorSolver<Minimal4CardinalityModel> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<Minimal4CardinalityModel>(minimal4CardinalityModel0, false);
      int[] intArray0 = new int[8];
      intArray0[0] = 222;
      VecInt vecInt0 = new VecInt(intArray0);
      // Undeclared exception!
      try { 
        sequential0.addExactlyOne(fullClauseSelectorSolver0, vecInt0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Please call newVar(int) before adding constraints!!!
         //
         verifyException("org.sat4j.tools.AbstractClauseSelectorSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      PercentLengthLearning<MixedDataStructureSingleWL> percentLengthLearning0 = new PercentLengthLearning<MixedDataStructureSingleWL>();
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      SearchParams searchParams0 = new SearchParams();
      PhaseInLastLearnedClauseSelectionStrategy phaseInLastLearnedClauseSelectionStrategy0 = new PhaseInLastLearnedClauseSelectionStrategy();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap(phaseInLastLearnedClauseSelectionStrategy0);
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      Solver<MixedDataStructureSingleWL> solver0 = new Solver<MixedDataStructureSingleWL>(percentLengthLearning0, mixedDataStructureSingleWL0, searchParams0, varOrderHeap0, lubyRestarts0);
      int[] intArray0 = new int[7];
      VecInt vecInt0 = new VecInt(intArray0);
      // Undeclared exception!
      try { 
        sequential0.addExactlyOne(solver0, vecInt0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is not a valid variable identifier
         //
         verifyException("org.sat4j.minisat.core.Solver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      VecInt vecInt0 = new VecInt(47, Integer.MIN_VALUE);
      // Undeclared exception!
      try { 
        sequential0.addExactlyOne(iSolver0, vecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      VecInt vecInt0 = new VecInt(47, 47);
      Sequential sequential0 = new Sequential();
      sequential0.addAtMostOne(iSolver0, vecInt0);
      // Undeclared exception!
      sequential0.addExactly(iSolver0, vecInt0, 45);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      VecInt vecInt0 = new VecInt(1, 34);
      IVecInt iVecInt0 = vecInt0.push(41);
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      Minimal4InclusionModel minimal4InclusionModel0 = new Minimal4InclusionModel(statisticsSolver0, iVecInt0);
      // Undeclared exception!
      try { 
        sequential0.addExactly(minimal4InclusionModel0, vecInt0, 0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.tools.StatisticsSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      // Undeclared exception!
      try { 
        sequential0.addExactly(dimacsStringSolver0, (IVecInt) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.EncodingStrategyAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      VecInt vecInt0 = new VecInt(103);
      // Undeclared exception!
      try { 
        sequential0.addExactly((ISolver) null, vecInt0, 103);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.Sequential", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      VecInt vecInt0 = new VecInt(49, 49);
      Sequential sequential0 = new Sequential();
      vecInt0.shrinkTo(825);
      // Undeclared exception!
      try { 
        sequential0.addExactly(iSolver0, vecInt0, 825);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      EMARestarts eMARestarts0 = new EMARestarts();
      ClauseOnlyLearning<MixedDataStructureSingleWL> clauseOnlyLearning0 = new ClauseOnlyLearning<MixedDataStructureSingleWL>();
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      Solver<MixedDataStructureSingleWL> solver0 = new Solver<MixedDataStructureSingleWL>(clauseOnlyLearning0, mixedDataStructureSingleWL0, pureOrder0, eMARestarts0);
      VecInt vecInt0 = new VecInt(1000, 1538);
      Sequential sequential0 = new Sequential();
      // Undeclared exception!
      sequential0.addAtMostOne(solver0, vecInt0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      VecInt vecInt0 = new VecInt(34, 34);
      ASolverFactory<Minimal4CardinalityModel> aSolverFactory0 = (ASolverFactory<Minimal4CardinalityModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory0);
      Sequential sequential0 = new Sequential();
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      AbstractMinimalModel abstractMinimalModel0 = new AbstractMinimalModel(statisticsSolver0, checkMUSSolutionListener0);
      // Undeclared exception!
      try { 
        sequential0.addAtMostOne(abstractMinimalModel0, vecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.tools.StatisticsSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver(58);
      // Undeclared exception!
      try { 
        sequential0.addAtMostOne(dimacsStringSolver0, (IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      IVecInt iVecInt0 = AbstractMinimalModel.positiveLiterals(statisticsSolver0);
      // Undeclared exception!
      try { 
        sequential0.addAtMostOne(statisticsSolver0, iVecInt0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.Sequential", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      PercentLengthLearning<MixedDataStructureSingleWL> percentLengthLearning0 = new PercentLengthLearning<MixedDataStructureSingleWL>();
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      SearchParams searchParams0 = new SearchParams();
      PhaseInLastLearnedClauseSelectionStrategy phaseInLastLearnedClauseSelectionStrategy0 = new PhaseInLastLearnedClauseSelectionStrategy();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap(phaseInLastLearnedClauseSelectionStrategy0);
      LubyRestarts lubyRestarts0 = new LubyRestarts(3587);
      Solver<MixedDataStructureSingleWL> solver0 = new Solver<MixedDataStructureSingleWL>(percentLengthLearning0, mixedDataStructureSingleWL0, searchParams0, varOrderHeap0, lubyRestarts0);
      int[] intArray0 = new int[8];
      VecInt vecInt0 = new VecInt(intArray0);
      // Undeclared exception!
      try { 
        sequential0.addAtMostOne(solver0, vecInt0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is not a valid variable identifier
         //
         verifyException("org.sat4j.minisat.core.Solver", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ActiveLearning<MixedDataStructureSingleWL> activeLearning0 = new ActiveLearning<MixedDataStructureSingleWL>(100.0);
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      MiniSATRestarts miniSATRestarts0 = new MiniSATRestarts();
      Solver<MixedDataStructureSingleWL> solver0 = new Solver<MixedDataStructureSingleWL>(activeLearning0, mixedDataStructureSingleWL0, varOrderHeap0, miniSATRestarts0);
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(solver0);
      int[] intArray0 = new int[3];
      intArray0[0] = Integer.MIN_VALUE;
      VecInt vecInt0 = new VecInt(intArray0);
      Sequential sequential0 = new Sequential();
      // Undeclared exception!
      try { 
        sequential0.addAtMostOne(singleSolutionDetector0, vecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      VecInt vecInt0 = new VecInt(47, 47);
      // Undeclared exception!
      sequential0.addAtMost(iSolver0, vecInt0, 47);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      // Undeclared exception!
      try { 
        sequential0.addAtMost((ISolver) null, (IVecInt) null, 47);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      IVecInt iVecInt0 = VecInt.EMPTY;
      // Undeclared exception!
      try { 
        sequential0.addAtMost((ISolver) null, iVecInt0, 0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.Sequential", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FixedLengthLearning<MixedDataStructureSingleWL> fixedLengthLearning0 = new FixedLengthLearning<MixedDataStructureSingleWL>(0);
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      PureOrder pureOrder0 = new PureOrder();
      EMARestarts eMARestarts0 = new EMARestarts();
      Solver<MixedDataStructureSingleWL> solver0 = new Solver<MixedDataStructureSingleWL>(fixedLengthLearning0, mixedDataStructureSingleWL0, pureOrder0, eMARestarts0);
      VecInt vecInt0 = new VecInt(34, (-1158));
      Sequential sequential0 = new Sequential();
      // Undeclared exception!
      try { 
        sequential0.addAtMost(solver0, vecInt0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      PercentLengthLearning<MixedDataStructureSingleWL> percentLengthLearning0 = new PercentLengthLearning<MixedDataStructureSingleWL>();
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      SearchParams searchParams0 = new SearchParams();
      PhaseInLastLearnedClauseSelectionStrategy phaseInLastLearnedClauseSelectionStrategy0 = new PhaseInLastLearnedClauseSelectionStrategy();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap(phaseInLastLearnedClauseSelectionStrategy0);
      LubyRestarts lubyRestarts0 = new LubyRestarts(3587);
      Solver<MixedDataStructureSingleWL> solver0 = new Solver<MixedDataStructureSingleWL>(percentLengthLearning0, mixedDataStructureSingleWL0, searchParams0, varOrderHeap0, lubyRestarts0);
      int[] intArray0 = new int[5];
      intArray0[0] = 3587;
      intArray0[1] = 18;
      intArray0[2] = 3587;
      intArray0[3] = 32;
      intArray0[4] = 692;
      VecInt vecInt0 = new VecInt(intArray0);
      sequential0.addAtMost(solver0, vecInt0, 32);
      assertEquals(165, solver0.nConstraints());
      assertEquals(31, solver0.getPropagationLevel());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      PercentLengthLearning<MixedDataStructureSingleWL> percentLengthLearning0 = new PercentLengthLearning<MixedDataStructureSingleWL>();
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      SearchParams searchParams0 = new SearchParams();
      PhaseInLastLearnedClauseSelectionStrategy phaseInLastLearnedClauseSelectionStrategy0 = new PhaseInLastLearnedClauseSelectionStrategy();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap(phaseInLastLearnedClauseSelectionStrategy0);
      LubyRestarts lubyRestarts0 = new LubyRestarts(3587);
      Solver<MixedDataStructureSingleWL> solver0 = new Solver<MixedDataStructureSingleWL>(percentLengthLearning0, mixedDataStructureSingleWL0, searchParams0, varOrderHeap0, lubyRestarts0);
      int[] intArray0 = new int[5];
      intArray0[0] = 3587;
      intArray0[4] = 692;
      VecInt vecInt0 = new VecInt(intArray0);
      // Undeclared exception!
      try { 
        sequential0.addAtMost(solver0, vecInt0, 32);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is not a valid variable identifier
         //
         verifyException("org.sat4j.minisat.core.Solver", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      VecInt vecInt0 = new VecInt(1, 0);
      IConstr iConstr0 = sequential0.addAtMost((ISolver) null, vecInt0, 1);
      assertEquals(0, iConstr0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FixedLengthLearning<MixedDataStructureSingleWL> fixedLengthLearning0 = new FixedLengthLearning<MixedDataStructureSingleWL>();
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      PureOrder pureOrder0 = new PureOrder();
      EMARestarts eMARestarts0 = new EMARestarts();
      Solver<MixedDataStructureSingleWL> solver0 = new Solver<MixedDataStructureSingleWL>(fixedLengthLearning0, mixedDataStructureSingleWL0, pureOrder0, eMARestarts0);
      VecInt vecInt0 = new VecInt(2, 2);
      vecInt0.push(2);
      Sequential sequential0 = new Sequential();
      try { 
        sequential0.addExactly(solver0, vecInt0, 2);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Creating Empty clause ?
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Clauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      VecInt vecInt0 = new VecInt(47, 47);
      try { 
        sequential0.addExactlyOne(iSolver0, vecInt0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Creating Empty clause ?
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Clauses", e);
      }
  }
}
