/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 05 00:23:25 GMT 2019
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.nio.CharBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import umd.cs.shop.JSJshopVars;
import umd.cs.shop.JSSubstitution;
import umd.cs.shop.JSTerm;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSTerm_ESTest extends JSTerm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(/(g7OA9bn2");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = null;
      try {
        jSTerm0 = new JSTerm(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object object0 = new Object();
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.addElement(object0);
      jSTerm0.addElement(object0);
      // Undeclared exception!
      try { 
        jSTerm0.standardizerTerm();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object object0 = new Object();
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.addElement(object0);
      jSTerm0.addElement(object0);
      // Undeclared exception!
      try { 
        jSTerm0.toStr();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Expecting ')' for term.");
      stringReader0.markSupported();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.lowerCaseMode(true);
      streamTokenizer0.ordinaryChars((-4), (-4));
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      stringReader0.ready();
      jSTerm0.makeFunction();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.addElement(jSSubstitution0);
      // Undeclared exception!
      try { 
        jSTerm0.matches(jSTerm0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // umd.cs.shop.JSSubstitution cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Expecting ')' for term.");
      stringReader0.markSupported();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.lowerCaseMode(true);
      streamTokenizer0.ordinaryChars(0, (-4));
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeEval(true);
      stringReader0.ready();
      jSTerm0.makeFunction();
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      jSTerm0.addElement((Object) null);
      jSTerm1.isGround();
      // Undeclared exception!
      try { 
        jSTerm0.toStr();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Expecting ')' for term.");
      stringReader0.markSupported();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      int int0 = 0;
      streamTokenizer0.lowerCaseMode(true);
      streamTokenizer0.ordinaryChars(0, 0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeEval(true);
      jSTerm0.makeFunction();
      JSTerm jSTerm1 = new JSTerm();
      jSTerm1.equals(jSTerm0);
      JSTerm jSTerm2 = jSTerm0.cloneT();
      jSTerm1.stream();
      jSTerm1.retainAll(jSTerm0);
      jSTerm2.isEval();
      jSTerm0.cloneT();
      // Undeclared exception!
      try { 
        jSTerm1.print();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.addElement(jSTerm0);
      jSTerm0.addElement((Object) null);
      // Undeclared exception!
      try { 
        jSTerm0.isGround();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeFunction();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm1 = new JSTerm();
      // Undeclared exception!
      try { 
        jSTerm1.matches(jSTerm0, jSSubstitution0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      // Undeclared exception!
      try { 
        jSTerm0.toStr();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("?MtrM>P#7woja4u");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm1.matches(jSTerm0, jSSubstitution0);
      JSTerm jSTerm2 = new JSTerm();
      JSTerm jSTerm3 = jSTerm1.applySubstitutionT(jSSubstitution0);
      jSTerm3.call();
      jSTerm2.isGround();
      jSTerm3.matches(jSTerm0, jSSubstitution1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Expecting ')' for term.");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeFunction();
      jSTerm0.equals(jSTerm0);
      jSTerm0.equals(jSTerm0);
      jSTerm0.makeFunction();
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      jSTerm1.addElement(streamTokenizer0);
      jSTerm0.isGround();
      jSTerm0.toStr();
      jSTerm0.toStr();
      jSTerm0.applySubstitutionT((JSSubstitution) null);
      jSTerm1.matches(jSTerm0, (JSSubstitution) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Reading Predicate");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      char[] charArray0 = new char[5];
      charArray0[0] = 'J';
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeFunction();
      JSTerm jSTerm1 = new JSTerm();
      JSTerm jSTerm2 = new JSTerm(streamTokenizer0);
      jSTerm0.equals(jSTerm2);
      jSTerm2.equals(jSTerm0);
      JSTerm jSTerm3 = jSTerm0.cloneT();
      jSTerm3.stream();
      jSTerm0.call();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm2.matches(jSTerm1, jSSubstitution0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader(" Term expected");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("%%%");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      // Undeclared exception!
      try { 
        jSTerm0.parseList(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("KDY:V^iVz");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      char[] charArray0 = new char[8];
      charArray0[0] = 's';
      charArray0[1] = '|';
      charArray0[2] = 'Z';
      charArray0[3] = 'u';
      charArray0[4] = '%';
      charArray0[5] = '~';
      charArray0[6] = '$';
      charArray0[7] = 'f';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      stringReader0.read(charBuffer0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.applySubstitutionT(jSSubstitution0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("(/(g7OA9bn2");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = null;
      try {
        jSTerm1 = new JSTerm(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSJshopVars.leftPar = (-31);
      StringReader stringReader0 = new StringReader("GqD)A@T-Cq");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.isConstant();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      // Undeclared exception!
      try { 
        jSTerm0.standardizerTerm();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeVariable();
      jSTerm0.addElement(jSTerm0);
      jSTerm0.clone();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.applySubstitutionT(jSSubstitution0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Ex^ecting ')' f&r term.");
      Object object0 = new Object();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.addElement(object0);
      jSTerm0.add((Object) null);
      // Undeclared exception!
      try { 
        jSTerm0.cloneT();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Ex^ecting ')' f&r term.");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeFunction();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.addElement((Object) null);
      // Undeclared exception!
      try { 
        jSTerm0.isGround();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("%%%");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm();
      JSJshopVars.apostrophe = (-4);
      jSTerm1.addElement(streamTokenizer0);
      jSTerm1.print();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Ex^ecting ')' f&r term.");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeFunction();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm1 = new JSTerm();
      jSTerm0.addElement(jSTerm1);
      jSTerm0.isGround();
      // Undeclared exception!
      try { 
        jSTerm0.print();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("?MtrM>P#7woja4u");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm1, jSSubstitution0);
      JSTerm jSTerm2 = new JSTerm();
      JSTerm jSTerm3 = jSTerm1.applySubstitutionT(jSSubstitution0);
      JSTerm jSTerm4 = jSTerm3.call();
      JSTerm jSTerm5 = new JSTerm();
      jSTerm5.isGround();
      jSTerm4.matches(jSTerm5, jSSubstitution1);
      jSTerm3.matches(jSTerm2, jSSubstitution1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSTerm jSTerm1 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm1.matches(jSTerm0, jSSubstitution0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Ex^ecting ')' f&r term.");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeFunction();
      JSTerm jSTerm1 = new JSTerm();
      streamTokenizer0.nextToken();
      stringReader0.ready();
      jSTerm1.addElement("Ex^ecting ')' f&r term.");
      jSTerm0.print();
      jSTerm1.matches(jSTerm0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Expecting ')' for term.");
      stringReader0.markSupported();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.lowerCaseMode(true);
      streamTokenizer0.ordinaryChars(0, 0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeEval(true);
      jSTerm0.makeFunction();
      JSTerm jSTerm1 = new JSTerm();
      jSTerm1.equals(jSTerm0);
      jSTerm1.equals(jSTerm0);
      jSTerm0.cloneT();
      jSTerm1.stream();
      jSTerm0.isFunction();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.add((Object) null);
      JSTerm jSTerm2 = new JSTerm();
      // Undeclared exception!
      try { 
        jSTerm2.applySubstitutionT(jSSubstitution0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSJshopVars.equalT = 0;
      jSTerm0.makeVariable();
      JSJshopVars.exclamation = 0;
      jSTerm0.isConstant();
      // Undeclared exception!
      try { 
        jSTerm0.cloneT();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.addElement(jSTerm0);
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      // Undeclared exception!
      try { 
        jSTerm0.matches(jSTerm1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // umd.cs.shop.JSTerm cannot be cast to java.lang.String
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Expecting ')' for term.");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.applySubstitutionT(jSSubstitution0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Object object0 = new Object();
      StringReader stringReader0 = new StringReader("(HEU");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.lowerCaseMode(true);
      streamTokenizer0.ordinaryChars(1070, 1070);
      JSTerm jSTerm1 = null;
      try {
        jSTerm1 = new JSTerm(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      // Undeclared exception!
      try { 
        jSTerm0.call();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("?MtrM>P#7woja4u");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm2 = new JSTerm();
      jSTerm2.matches(jSTerm1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      // Undeclared exception!
      try { 
        jSTerm0.print();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Reading Predicate");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      char[] charArray0 = new char[5];
      charArray0[0] = 'J';
      charArray0[1] = '\'';
      charArray0[2] = ']';
      charArray0[3] = 'H';
      charArray0[4] = '\'';
      stringReader0.read(charArray0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.isGround();
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSJshopVars.lessT = (-1);
      JSJshopVars.equalT = (-1);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.trimToSize();
      jSTerm0.matches(jSTerm1, jSSubstitution0);
      jSTerm0.makeEval(true);
      jSTerm0.makeFunction();
      // Undeclared exception!
      try { 
        jSTerm1.parseList(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Object object0 = new Object();
      jSTerm0.addElement(object0);
      jSTerm0.addElement((Object) null);
      // Undeclared exception!
      try { 
        jSTerm0.standardizerTerm();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(/(g7*OA9bn2");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.resetSyntax();
      JSTerm jSTerm0 = null;
      try {
        jSTerm0 = new JSTerm(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StringReader stringReader0 = new StringReader("X-C>NE:WiC (");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      jSTerm0.equals(jSTerm1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.addElement("?MtrM>P#7woja4u");
      jSTerm0.print();
      StringReader stringReader0 = new StringReader("g(3L(vVphyY IU9=%");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.ordinaryChars(1, 1);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm2 = new JSTerm(streamTokenizer0);
      jSTerm2.makeFunction();
      jSTerm0.standardizerTerm();
      jSTerm0.matches(jSTerm2);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("?MtrM>P#7woja4u");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm1.matches(jSTerm0, jSSubstitution0);
      JSTerm jSTerm2 = null;
      try {
        jSTerm2 = new JSTerm(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.addElement(jSTerm0);
      Object object0 = new Object();
      jSTerm0.addElement(object0);
      // Undeclared exception!
      try { 
        jSTerm0.isGround();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("?mtrm>p#7woja4u");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.lowerCaseMode(true);
      streamTokenizer0.ordinaryChars((-1494), (-1014));
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      stringReader0.ready();
      jSTerm0.makeFunction();
      JSTerm jSTerm2 = jSTerm1.standardizerTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      Object object0 = jSTerm2.clone();
      jSTerm1.addElement(object0);
      JSSubstitution jSSubstitution1 = jSTerm2.matches(jSTerm0);
      jSTerm1.matches(jSTerm0, jSSubstitution1);
      jSTerm1.equals(jSTerm2);
      jSTerm2.call();
      JSSubstitution jSSubstitution2 = new JSSubstitution();
      jSTerm1.applySubstitutionT(jSSubstitution2);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.addElement("(HGEU");
      StringReader stringReader0 = new StringReader("hju");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSTerm0.addElement(jSTerm1);
      jSTerm0.standardizerTerm();
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = null;
      try {
        jSTerm0 = new JSTerm(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.isGround();
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.addElement(jSTerm0);
      jSTerm0.addElement(jSTerm0);
      jSTerm0.print();
  }
}
