/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 17 08:00:03 GMT 2019
 */

package org.sat4j.tools.xplain;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.ClausalDataStructureWL;
import org.sat4j.minisat.core.Solver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.DimacsOutputSolver;
import org.sat4j.tools.GroupClauseSelectorSolver;
import org.sat4j.tools.xplain.QuickXplainStrategy;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class QuickXplainStrategy_ESTest extends QuickXplainStrategy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      QuickXplainStrategy quickXplainStrategy0 = new QuickXplainStrategy();
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      VecInt vecInt0 = new VecInt(1881, 1881);
      // Undeclared exception!
      try { 
        quickXplainStrategy0.explain(dimacsOutputSolver0, hashMap0, vecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AbstractOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      QuickXplainStrategy quickXplainStrategy0 = new QuickXplainStrategy();
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      // Undeclared exception!
      try { 
        quickXplainStrategy0.explain(dimacsOutputSolver0, (Map<Integer, ?>) null, (IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.xplain.QuickXplainStrategy", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      QuickXplainStrategy quickXplainStrategy0 = new QuickXplainStrategy();
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      VecInt vecInt0 = new VecInt();
      IVecInt iVecInt0 = vecInt0.pop();
      // Undeclared exception!
      try { 
        quickXplainStrategy0.explain(dimacsOutputSolver0, hashMap0, iVecInt0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.VecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      QuickXplainStrategy quickXplainStrategy0 = new QuickXplainStrategy();
      VecInt vecInt0 = new VecInt(0);
      vecInt0.insertFirst(0);
      Solver<ClausalDataStructureWL> solver0 = (Solver<ClausalDataStructureWL>) mock(Solver.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(solver0).getLogPrefix();
      doReturn(false, true).when(solver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(false, false, true, false).when(solver0).isVerbose();
      doReturn(vecInt0, vecInt0).when(solver0).unsatExplanation();
      GroupClauseSelectorSolver<Solver<ClausalDataStructureWL>> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<Solver<ClausalDataStructureWL>>(solver0);
      HashMap<Integer, ClausalDataStructureWL> hashMap0 = new HashMap<Integer, ClausalDataStructureWL>();
      IVecInt iVecInt0 = quickXplainStrategy0.explain(groupClauseSelectorSolver0, hashMap0, vecInt0);
      quickXplainStrategy0.explain(groupClauseSelectorSolver0, hashMap0, vecInt0);
      assertEquals(1, vecInt0.size());
      assertFalse(vecInt0.equals((Object)iVecInt0));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      QuickXplainStrategy quickXplainStrategy0 = new QuickXplainStrategy();
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      VecInt vecInt0 = new VecInt(0);
      Solver<ClausalDataStructureWL> solver0 = (Solver<ClausalDataStructureWL>) mock(Solver.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(solver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(false, false).when(solver0).isVerbose();
      doReturn(vecInt0, (IVecInt) null).when(solver0).unsatExplanation();
      GroupClauseSelectorSolver<Solver<ClausalDataStructureWL>> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<Solver<ClausalDataStructureWL>>(solver0);
      HashMap<Integer, ClausalDataStructureWL> hashMap1 = new HashMap<Integer, ClausalDataStructureWL>();
      quickXplainStrategy0.explain(groupClauseSelectorSolver0, hashMap1, vecInt0);
      // Undeclared exception!
      try { 
        quickXplainStrategy0.explain(groupClauseSelectorSolver0, hashMap0, vecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.GroupClauseSelectorSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      QuickXplainStrategy quickXplainStrategy0 = new QuickXplainStrategy();
      VecInt vecInt0 = new VecInt(0);
      Solver<ClausalDataStructureWL> solver0 = (Solver<ClausalDataStructureWL>) mock(Solver.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(solver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(false, false).when(solver0).isVerbose();
      doReturn(vecInt0).when(solver0).unsatExplanation();
      GroupClauseSelectorSolver<Solver<ClausalDataStructureWL>> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<Solver<ClausalDataStructureWL>>(solver0);
      HashMap<Integer, ClausalDataStructureWL> hashMap0 = new HashMap<Integer, ClausalDataStructureWL>();
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      hashMap0.put((Integer) 2521, clausalDataStructureWL0);
      IVecInt iVecInt0 = quickXplainStrategy0.explain(groupClauseSelectorSolver0, hashMap0, vecInt0);
      assertTrue(iVecInt0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      QuickXplainStrategy quickXplainStrategy0 = new QuickXplainStrategy();
      String string0 = quickXplainStrategy0.toString();
      assertEquals("QuickXplain (AAAI 2004 version) minimization strategy", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      QuickXplainStrategy quickXplainStrategy0 = new QuickXplainStrategy();
      quickXplainStrategy0.cancelExplanationComputation();
      assertEquals("QuickXplain (AAAI 2004 version) minimization strategy", quickXplainStrategy0.toString());
  }
}
