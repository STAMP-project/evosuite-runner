/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 16:01:27 GMT 2019
 */

package org.sat4j.minisat.constraints.cnf;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.MixedDataStructureDanielHT;
import org.sat4j.minisat.constraints.cnf.BinaryClauses;
import org.sat4j.minisat.constraints.cnf.Lits;
import org.sat4j.minisat.constraints.cnf.OriginalBinaryClause;
import org.sat4j.specs.Constr;
import org.sat4j.specs.Propagatable;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Lits_ESTest extends Lits_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Lits lits0 = new Lits();
      // Undeclared exception!
      try { 
        lits0.undos((-701));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -351
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Lits lits0 = new Lits();
      // Undeclared exception!
      try { 
        lits0.getLevel((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Lits lits0 = new Lits();
      lits0.getFromPool((-3497));
      lits0.reset(6995);
      assertEquals(1, lits0.realnVars());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = Lits.toString((-662));
      assertEquals("-331", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Lits lits0 = new Lits();
      lits0.forgets(1);
      assertEquals(0, lits0.nVars());
      assertEquals(0, lits0.realnVars());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Lits lits0 = new Lits();
      lits0.ensurePool(0);
      assertEquals(0, lits0.realnVars());
      assertEquals(0, lits0.nVars());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Lits lits0 = new Lits();
      lits0.getFromPool(3634);
      int int0 = lits0.nextFreeVarId(true);
      assertEquals(1, lits0.realnVars());
      assertEquals(3635, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Lits lits0 = new Lits();
      lits0.ensurePool(1156);
      boolean boolean0 = lits0.belongsToPool(1157);
      assertEquals(1156, lits0.nVars());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Lits lits0 = new Lits();
      // Undeclared exception!
      try { 
        lits0.belongsToPool(0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Lits lits0 = new Lits();
      int int0 = lits0.getFromPool(129);
      assertEquals(1, lits0.realnVars());
      assertEquals(258, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Lits lits0 = new Lits();
      lits0.init(129);
      assertEquals(0, lits0.realnVars());
      assertEquals(0, lits0.nVars());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Lits lits0 = new Lits();
      lits0.getFromPool(1509);
      VecInt vecInt0 = new VecInt();
      OriginalBinaryClause originalBinaryClause0 = new OriginalBinaryClause(vecInt0, lits0);
      lits0.watch(3018, originalBinaryClause0);
      assertEquals(1, lits0.realnVars());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Lits lits0 = new Lits();
      lits0.setLevel(27, 4);
      assertEquals(0, lits0.realnVars());
      assertEquals(0, lits0.nVars());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Lits lits0 = new Lits();
      lits0.getFromPool(1);
      lits0.watches(2);
      assertEquals(1, lits0.realnVars());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Lits lits0 = new Lits();
      lits0.undos(129);
      assertEquals(0, lits0.nVars());
      assertEquals(0, lits0.realnVars());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Lits lits0 = new Lits();
      lits0.getFromPool(87);
      lits0.undos(174);
      assertEquals(87, lits0.nVars());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Lits lits0 = new Lits();
      lits0.getFromPool((-1397));
      int int0 = lits0.realnVars();
      assertEquals(1397, lits0.nVars());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Lits lits0 = new Lits();
      int int0 = lits0.not(1);
      assertEquals(0, int0);
      assertEquals(0, lits0.nVars());
      assertEquals(0, lits0.realnVars());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Lits lits0 = new Lits();
      int int0 = lits0.not(296);
      assertEquals(0, lits0.realnVars());
      assertEquals(297, int0);
      assertEquals(0, lits0.nVars());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Lits lits0 = new Lits();
      lits0.satisfies(46);
      boolean boolean0 = lits0.isSatisfied(46);
      assertTrue(boolean0);
      assertEquals(0, lits0.nVars());
      assertEquals(0, lits0.realnVars());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Lits lits0 = new Lits();
      lits0.satisfies(5);
      boolean boolean0 = lits0.isFalsified(4);
      assertTrue(boolean0);
      assertEquals(0, lits0.realnVars());
      assertEquals(0, lits0.nVars());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Lits lits0 = new Lits();
      lits0.getReason(107);
      assertEquals(0, lits0.realnVars());
      assertEquals(0, lits0.nVars());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Lits lits0 = new Lits();
      lits0.getFromPool(3634);
      int int0 = lits0.getLevel(7268);
      assertEquals(3634, lits0.nVars());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Lits lits0 = new Lits();
      lits0.getFromPool(6);
      boolean boolean0 = lits0.belongsToPool(6);
      assertEquals(1, lits0.realnVars());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Lits lits0 = new Lits();
      // Undeclared exception!
      try { 
        lits0.watches(3971);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3971
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Lits lits0 = new Lits();
      BinaryClauses binaryClauses0 = new BinaryClauses(lits0, 47);
      // Undeclared exception!
      try { 
        lits0.watch(72, binaryClauses0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Lits lits0 = new Lits();
      // Undeclared exception!
      try { 
        lits0.valueToString(1985);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1985
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Lits lits0 = new Lits();
      // Undeclared exception!
      try { 
        lits0.unassign((-145));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -145
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt();
      OriginalBinaryClause originalBinaryClause0 = new OriginalBinaryClause(vecInt0, lits0);
      // Undeclared exception!
      try { 
        lits0.setReason((-1920), originalBinaryClause0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -960
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Lits lits0 = new Lits();
      // Undeclared exception!
      try { 
        lits0.satisfies((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Lits lits0 = new Lits();
      lits0.getFromPool(65535);
      // Undeclared exception!
      lits0.resetPool();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Lits lits0 = new Lits();
      // Undeclared exception!
      try { 
        lits0.reset(116);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Lits lits0 = new Lits();
      // Undeclared exception!
      try { 
        lits0.isUnassigned(485);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 485
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Lits lits0 = new Lits();
      // Undeclared exception!
      try { 
        lits0.isSatisfied((-1913));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1914
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Lits lits0 = new Lits();
      // Undeclared exception!
      try { 
        lits0.isImplied((-9));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -5
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Lits lits0 = new Lits();
      // Undeclared exception!
      try { 
        lits0.isFalsified((-1074));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1074
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Lits lits0 = new Lits();
      // Undeclared exception!
      try { 
        lits0.getFromPool(Integer.MAX_VALUE);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Lits lits0 = new Lits();
      // Undeclared exception!
      try { 
        lits0.forgets((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Lits lits0 = new Lits();
      // Undeclared exception!
      try { 
        lits0.init(Integer.MAX_VALUE);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Lits lits0 = new Lits();
      // Undeclared exception!
      try { 
        lits0.reset((-785));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -785
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Lits lits0 = new Lits();
      int int0 = lits0.nextFreeVarId(false);
      assertEquals(0, lits0.realnVars());
      assertEquals(1, int0);
      assertEquals(0, lits0.nVars());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Lits lits0 = new Lits();
      lits0.getFromPool((-1));
      boolean boolean0 = lits0.isImplied(3);
      assertEquals(1, lits0.realnVars());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Lits lits0 = new Lits();
      boolean boolean0 = lits0.isImplied(113);
      assertFalse(boolean0);
      assertEquals(0, lits0.nVars());
      assertEquals(0, lits0.realnVars());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      String string0 = Lits.toStringX((-14));
      assertEquals("+x-7", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String string0 = Lits.toStringX(111);
      assertEquals("-x55", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String string0 = Lits.toString(1689);
      assertEquals("-844", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Lits lits0 = new Lits();
      lits0.satisfies(1);
      String string0 = lits0.valueToString(0);
      assertEquals(0, lits0.nVars());
      assertEquals("F", string0);
      assertEquals(0, lits0.realnVars());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Lits lits0 = new Lits();
      String string0 = lits0.valueToString(72);
      assertEquals("?", string0);
      assertEquals(0, lits0.realnVars());
      assertEquals(0, lits0.nVars());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Lits lits0 = new Lits();
      lits0.satisfies(72);
      String string0 = lits0.valueToString(72);
      assertEquals(0, lits0.realnVars());
      assertEquals(0, lits0.nVars());
      assertEquals("T", string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Lits lits0 = new Lits();
      lits0.satisfies(5);
      boolean boolean0 = lits0.isUnassigned(5);
      assertFalse(boolean0);
      assertEquals(0, lits0.realnVars());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Lits lits0 = new Lits();
      boolean boolean0 = lits0.isUnassigned(4);
      assertEquals(0, lits0.realnVars());
      assertTrue(boolean0);
      assertEquals(0, lits0.nVars());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Lits lits0 = new Lits();
      lits0.satisfies(5);
      boolean boolean0 = lits0.isUnassigned(4);
      assertFalse(boolean0);
      assertEquals(0, lits0.realnVars());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Lits lits0 = new Lits();
      lits0.satisfies(88);
      // Undeclared exception!
      try { 
        lits0.satisfies(88);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Lits lits0 = new Lits();
      lits0.satisfies(0);
      // Undeclared exception!
      try { 
        lits0.satisfies(1);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Lits lits0 = new Lits();
      lits0.satisfies(5);
      lits0.unassign(5);
      assertEquals(0, lits0.realnVars());
      assertEquals(0, lits0.nVars());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Lits lits0 = new Lits();
      // Undeclared exception!
      try { 
        lits0.unassign(5);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Lits lits0 = new Lits();
      lits0.ensurePool((-2273));
      assertEquals(0, lits0.nVars());
      assertEquals(0, lits0.realnVars());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Lits lits0 = new Lits();
      lits0.ensurePool(1223);
      int int0 = lits0.nVars();
      assertEquals(1223, int0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Lits lits0 = new Lits();
      boolean boolean0 = lits0.belongsToPool(1703);
      assertEquals(0, lits0.nVars());
      assertEquals(0, lits0.realnVars());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Lits lits0 = new Lits();
      // Undeclared exception!
      try { 
        lits0.belongsToPool((-14));
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Lits lits0 = new Lits();
      lits0.getFromPool(14);
      int int0 = lits0.getFromPool(14);
      assertEquals(14, lits0.nVars());
      assertEquals(28, int0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Lits lits0 = new Lits();
      // Undeclared exception!
      try { 
        lits0.getFromPool(0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Lits lits0 = new Lits();
      lits0.ensurePool(3);
      int int0 = lits0.getFromPool((-2));
      assertEquals(1, lits0.realnVars());
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Lits lits0 = new Lits();
      lits0.init(119);
      assertEquals(0, lits0.nVars());
      assertEquals(0, lits0.realnVars());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Lits lits0 = new Lits();
      lits0.isSatisfied(5);
      assertEquals(0, lits0.nVars());
      assertEquals(0, lits0.realnVars());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Lits lits0 = new Lits();
      lits0.watches(106);
      assertEquals(0, lits0.nVars());
      assertEquals(0, lits0.realnVars());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Lits lits0 = new Lits();
      int[] intArray0 = new int[3];
      VecInt vecInt0 = new VecInt(intArray0);
      MixedDataStructureDanielHT mixedDataStructureDanielHT0 = new MixedDataStructureDanielHT();
      Constr constr0 = mixedDataStructureDanielHT0.createUnregisteredClause(vecInt0);
      lits0.setReason(2, constr0);
      assertEquals(0, lits0.nVars());
      assertEquals(0, lits0.realnVars());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Lits lits0 = new Lits();
      int int0 = lits0.realnVars();
      assertEquals(0, int0);
      assertEquals(0, lits0.nVars());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Lits lits0 = new Lits();
      // Undeclared exception!
      try { 
        lits0.watch(513, (Propagatable) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 513
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Lits lits0 = new Lits();
      int int0 = lits0.not((-1350));
      assertEquals(0, lits0.realnVars());
      assertEquals((-1349), int0);
      assertEquals(0, lits0.nVars());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Lits lits0 = new Lits();
      lits0.getFromPool((-2));
      assertEquals(2, lits0.nVars());
      
      lits0.resetPool();
      assertEquals(0, lits0.realnVars());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Lits lits0 = new Lits();
      lits0.isFalsified(5);
      assertEquals(0, lits0.nVars());
      assertEquals(0, lits0.realnVars());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Lits lits0 = new Lits();
      int int0 = lits0.nVars();
      assertEquals(0, int0);
      assertEquals(0, lits0.realnVars());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Lits lits0 = new Lits();
      // Undeclared exception!
      try { 
        lits0.setLevel((-251), 3936);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -126
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Lits lits0 = new Lits();
      int int0 = lits0.capacity();
      assertEquals(0, lits0.nVars());
      assertEquals(0, lits0.realnVars());
      assertEquals(128, int0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Lits lits0 = new Lits();
      // Undeclared exception!
      try { 
        lits0.getReason((-1569));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -785
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Lits lits0 = new Lits();
      lits0.getLevel(1);
      assertEquals(0, lits0.realnVars());
      assertEquals(0, lits0.nVars());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Lits lits0 = new Lits();
      lits0.forgets(0);
      lits0.unassign(0);
      assertEquals(0, lits0.realnVars());
      assertEquals(0, lits0.nVars());
  }
}
