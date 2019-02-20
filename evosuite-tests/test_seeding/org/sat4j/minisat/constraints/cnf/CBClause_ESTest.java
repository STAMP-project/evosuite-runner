/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 17 08:07:39 GMT 2019
 */

package org.sat4j.minisat.constraints.cnf;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.sat4j.core.ReadOnlyVecInt;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.CardinalityDataStructure;
import org.sat4j.minisat.constraints.CardinalityDataStructureYanMin;
import org.sat4j.minisat.constraints.cnf.CBClause;
import org.sat4j.minisat.constraints.cnf.Lits;
import org.sat4j.minisat.core.ILits;
import org.sat4j.minisat.core.SearchParams;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.NoLearningNoHeuristics;
import org.sat4j.minisat.orders.LevelBasedVarOrderHeap;
import org.sat4j.minisat.restarts.FixedPeriodRestarts;
import org.sat4j.specs.Constr;
import org.sat4j.specs.ILogAble;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.MandatoryLiteralListener;
import org.sat4j.specs.UnitPropagationListener;
import org.sat4j.specs.VarMapper;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CBClause_ESTest extends CBClause_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, lits0);
      cBClause0.rescaleBy((-2523.41719));
      assertEquals(-0.0, cBClause0.getActivity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, lits0, true);
      cBClause0.undo((-2818));
      cBClause0.undo((-2818));
      // Undeclared exception!
      try { 
        cBClause0.register();
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      VecInt vecInt0 = new VecInt(267);
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      ILits iLits0 = cardinalityDataStructure0.getVocabulary();
      CBClause cBClause0 = new CBClause(vecInt0, iLits0, true);
      // Undeclared exception!
      try { 
        cBClause0.calcReason((-2589), vecInt0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt(22, 22);
      CBClause cBClause0 = new CBClause(vecInt0, lits0);
      // Undeclared exception!
      try { 
        cBClause0.calcReason(1817, vecInt0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt(55, 1);
      CBClause cBClause0 = new CBClause(vecInt0, lits0);
      IVecInt iVecInt0 = vecInt0.pop();
      // Undeclared exception!
      try { 
        cBClause0.calcReason((-41), iVecInt0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      VecInt vecInt0 = new VecInt(22, 22);
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null, false);
      cBClause0.undo(591);
      // Undeclared exception!
      try { 
        cBClause0.remove();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      ILits iLits0 = cardinalityDataStructure0.getVocabulary();
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, iLits0, false);
      cBClause0.undo((-1));
      cBClause0.remove();
      assertEquals(0.0, cBClause0.getActivity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt(36, 36);
      lits0.satisfies(36);
      CBClause cBClause0 = new CBClause(vecInt0, lits0);
      Constr constr0 = cBClause0.toConstraint();
      assertFalse(constr0.learnt());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      VecInt vecInt0 = new VecInt(267);
      vecInt0.growTo(328, 267);
      Lits lits0 = new Lits();
      CBClause cBClause0 = new CBClause(vecInt0, lits0);
      int int0 = cBClause0.size();
      assertEquals(328, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      ILits iLits0 = cardinalityDataStructure0.getVocabulary();
      VecInt vecInt0 = new VecInt(267);
      CBClause cBClause0 = new CBClause(vecInt0, iLits0);
      boolean boolean0 = cBClause0.learnt();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      VecInt vecInt0 = new VecInt(66, 66);
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      // Undeclared exception!
      try { 
        cBClause0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt();
      vecInt0.push((-3116));
      CBClause cBClause0 = new CBClause(vecInt0, lits0);
      // Undeclared exception!
      try { 
        cBClause0.toString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3116
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      VecInt vecInt0 = new VecInt(46, 46);
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      // Undeclared exception!
      try { 
        cBClause0.simplify();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt(47, 301);
      CBClause cBClause0 = new CBClause(vecInt0, lits0);
      // Undeclared exception!
      try { 
        cBClause0.simplify();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 300
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt(62, 62);
      CBClause cBClause0 = new CBClause(vecInt0, lits0);
      // Undeclared exception!
      try { 
        cBClause0.register();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt(22, 22);
      CBClause cBClause0 = new CBClause(vecInt0, lits0);
      // Undeclared exception!
      try { 
        cBClause0.propagate((UnitPropagationListener) null, 22);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, lits0);
      // Undeclared exception!
      try { 
        cBClause0.propagate((UnitPropagationListener) null, 591);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 295
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      VecInt vecInt0 = new VecInt(46, 46);
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      // Undeclared exception!
      try { 
        cBClause0.locked();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, lits0);
      // Undeclared exception!
      try { 
        cBClause0.locked();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt(29, 29);
      CBClause cBClause0 = new CBClause(vecInt0, lits0);
      // Undeclared exception!
      try { 
        cBClause0.get(29);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 29
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      VecInt vecInt0 = new VecInt(22, 22);
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      // Undeclared exception!
      try { 
        cBClause0.calcReason(22, vecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt(1528, 1528);
      CBClause cBClause0 = new CBClause(vecInt0, lits0);
      // Undeclared exception!
      try { 
        cBClause0.calcReason(1528, vecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1528
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt(36, 36);
      // Undeclared exception!
      try { 
        CBClause.brandNewClause((UnitPropagationListener) null, lits0, vecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt();
      vecInt0.shrink(220);
      // Undeclared exception!
      try { 
        CBClause.brandNewClause((UnitPropagationListener) null, lits0, vecInt0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt(40, 40);
      CBClause cBClause0 = new CBClause(vecInt0, lits0);
      // Undeclared exception!
      try { 
        cBClause0.assertConstraint((UnitPropagationListener) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = CBClause.brandNewClause((UnitPropagationListener) null, lits0, vecInt0);
      // Undeclared exception!
      try { 
        cBClause0.assertConstraint((UnitPropagationListener) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt();
      ReadOnlyVecInt readOnlyVecInt0 = new ReadOnlyVecInt(vecInt0);
      CBClause cBClause0 = null;
      try {
        cBClause0 = new CBClause(readOnlyVecInt0, lits0, false);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.ReadOnlyVecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Lits lits0 = new Lits();
      CBClause cBClause0 = null;
      try {
        cBClause0 = new CBClause((IVecInt) null, lits0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt();
      vecInt0.pop();
      CBClause cBClause0 = null;
      try {
        cBClause0 = new CBClause(vecInt0, lits0, true);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt();
      vecInt0.shrinkTo(1614);
      CBClause cBClause0 = null;
      try {
        cBClause0 = new CBClause(vecInt0, lits0, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Lits lits0 = new Lits();
      CBClause cBClause0 = null;
      try {
        cBClause0 = new CBClause((IVecInt) null, lits0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt();
      vecInt0.pop();
      CBClause cBClause0 = null;
      try {
        cBClause0 = new CBClause(vecInt0, lits0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt();
      vecInt0.shrinkTo(52);
      CBClause cBClause0 = null;
      try {
        cBClause0 = new CBClause(vecInt0, lits0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, lits0);
      cBClause0.register();
      assertFalse(cBClause0.learnt());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt(313, 313);
      CBClause cBClause0 = new CBClause(vecInt0, lits0, true);
      // Undeclared exception!
      try { 
        cBClause0.register();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 312
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      VecInt vecInt0 = new VecInt(267);
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      ILits iLits0 = cardinalityDataStructure0.getVocabulary();
      CBClause cBClause0 = new CBClause(vecInt0, iLits0, true);
      boolean boolean0 = cBClause0.learnt();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt(22, 22);
      CBClause cBClause0 = new CBClause(vecInt0, lits0);
      String string0 = cBClause0.toString();
      assertEquals("22[?] 22[?] 22[?] 22[?] 22[?] 22[?] 22[?] 22[?] 22[?] 22[?] 22[?] 22[?] 22[?] 22[?] 22[?] 22[?] 22[?] 22[?] 22[?] 22[?] 22[?] 22[?] ", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      ILits iLits0 = cardinalityDataStructure0.getVocabulary();
      VecInt vecInt0 = new VecInt(0);
      CBClause cBClause0 = CBClause.brandNewClause((UnitPropagationListener) null, iLits0, vecInt0);
      String string0 = cBClause0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt(102, 102);
      lits0.satisfies(102);
      CBClause cBClause0 = new CBClause(vecInt0, lits0);
      // Undeclared exception!
      try { 
        cBClause0.assertConstraint((UnitPropagationListener) null);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, lits0, true);
      // Undeclared exception!
      try { 
        cBClause0.register();
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt();
      vecInt0.unsafePush(2022);
      // Undeclared exception!
      try { 
        CBClause.brandNewClause((UnitPropagationListener) null, lits0, vecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2023
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt(0);
      vecInt0.growTo(36, 36);
      CBClause cBClause0 = new CBClause(vecInt0, lits0, false);
      boolean boolean0 = cBClause0.locked();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt(1, 1);
      CBClause cBClause0 = new CBClause(vecInt0, lits0);
      cBClause0.calcReason(1, vecInt0);
      assertEquals(0.0, cBClause0.getActivity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, lits0);
      cBClause0.calcReason((-1), vecInt0);
      assertEquals(0, cBClause0.size());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt(22, 22);
      CBClause cBClause0 = new CBClause(vecInt0, lits0);
      // Undeclared exception!
      try { 
        cBClause0.calcReason((-705), vecInt0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      ILits iLits0 = cardinalityDataStructure0.getVocabulary();
      VecInt vecInt0 = new VecInt(0);
      vecInt0.growTo(4, 4);
      CBClause cBClause0 = new CBClause(vecInt0, iLits0);
      // Undeclared exception!
      try { 
        cBClause0.calcReason(4, vecInt0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt();
      VecInt vecInt1 = new VecInt(796, 796);
      CBClause cBClause0 = new CBClause(vecInt0, lits0);
      // Undeclared exception!
      try { 
        cBClause0.calcReason(796, vecInt1);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt(36, 36);
      lits0.satisfies(36);
      CBClause cBClause0 = new CBClause(vecInt0, lits0);
      boolean boolean0 = cBClause0.simplify();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt(36, 36);
      CBClause cBClause0 = new CBClause(vecInt0, lits0);
      boolean boolean0 = cBClause0.simplify();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt(1585, 1585);
      CBClause cBClause0 = new CBClause(vecInt0, lits0);
      // Undeclared exception!
      try { 
        cBClause0.remove();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1584
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      ILits iLits0 = cardinalityDataStructure0.getVocabulary();
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = CBClause.brandNewClause((UnitPropagationListener) null, iLits0, vecInt0);
      // Undeclared exception!
      try { 
        cBClause0.assertConstraintIfNeeded((UnitPropagationListener) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, lits0);
      // Undeclared exception!
      try { 
        cBClause0.forwardActivity(999.32);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, lits0, true);
      // Undeclared exception!
      try { 
        cBClause0.canBeSatisfiedByCountingLiterals();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, lits0);
      int int0 = cBClause0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, lits0);
      // Undeclared exception!
      try { 
        cBClause0.toString((VarMapper) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, lits0, true);
      cBClause0.undo((-4084));
      cBClause0.register();
      assertEquals(0, cBClause0.size());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt(22, 22);
      CBClause cBClause0 = new CBClause(vecInt0, lits0);
      int int0 = cBClause0.get(1);
      assertEquals(22, int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      ILits iLits0 = cardinalityDataStructure0.getVocabulary();
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, iLits0);
      // Undeclared exception!
      try { 
        cBClause0.setActivity(0.0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, lits0);
      // Undeclared exception!
      try { 
        cBClause0.getAssertionLevel(vecInt0, 1289);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt(46, 46);
      CBClause cBClause0 = new CBClause(vecInt0, lits0);
      // Undeclared exception!
      try { 
        cBClause0.calcReasonOnTheFly(46, vecInt0, vecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, lits0);
      // Undeclared exception!
      try { 
        cBClause0.propagatePI((MandatoryLiteralListener) null, 0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, lits0);
      // Undeclared exception!
      try { 
        cBClause0.requiredNumberOfSatisfiedLiterals();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt(60, 60);
      CBClause cBClause0 = new CBClause(vecInt0, lits0);
      NoLearningNoHeuristics<CardinalityDataStructureYanMin> noLearningNoHeuristics0 = new NoLearningNoHeuristics<CardinalityDataStructureYanMin>();
      CardinalityDataStructureYanMin cardinalityDataStructureYanMin0 = new CardinalityDataStructureYanMin();
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      FixedPeriodRestarts fixedPeriodRestarts0 = new FixedPeriodRestarts();
      Solver<CardinalityDataStructureYanMin> solver0 = new Solver<CardinalityDataStructureYanMin>(noLearningNoHeuristics0, cardinalityDataStructureYanMin0, (SearchParams) null, levelBasedVarOrderHeap0, fixedPeriodRestarts0, (ILogAble) null);
      cBClause0.assertConstraint(solver0);
      assertEquals(0, solver0.nVars());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt(36, 36);
      CBClause cBClause0 = new CBClause(vecInt0, lits0);
      cBClause0.incActivity(1.0E-20);
      double double0 = cBClause0.getActivity();
      assertEquals(1.0E-20, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, lits0);
      // Undeclared exception!
      try { 
        cBClause0.isSatisfied();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, lits0);
      cBClause0.setLearnt();
      assertTrue(cBClause0.learnt());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, lits0);
      double double0 = cBClause0.getActivity();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = CBClause.brandNewClause((UnitPropagationListener) null, lits0, vecInt0);
      // Undeclared exception!
      try { 
        cBClause0.remove((UnitPropagationListener) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, lits0);
      // Undeclared exception!
      try { 
        cBClause0.canBePropagatedMultipleTimes();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      ILits iLits0 = cardinalityDataStructure0.getVocabulary();
      VecInt vecInt0 = new VecInt(0);
      CBClause cBClause0 = CBClause.brandNewClause((UnitPropagationListener) null, iLits0, vecInt0);
      cBClause0.rescaleBy(0.0);
      assertEquals(0.0, cBClause0.getActivity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, lits0);
      Constr constr0 = cBClause0.toConstraint();
      assertFalse(constr0.learnt());
  }
}
