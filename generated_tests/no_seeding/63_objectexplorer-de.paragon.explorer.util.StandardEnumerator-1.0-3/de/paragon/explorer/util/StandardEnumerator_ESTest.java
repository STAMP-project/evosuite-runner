/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 16:01:32 GMT 2019
 */

package de.paragon.explorer.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.paragon.explorer.figure.Figure;
import de.paragon.explorer.figure.InformationFigure;
import de.paragon.explorer.figure.StandardCompositeFigure;
import de.paragon.explorer.util.StandardEnumerator;
import java.util.Stack;
import java.util.Vector;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StandardEnumerator_ESTest extends StandardEnumerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StandardEnumerator standardEnumerator0 = new StandardEnumerator();
      standardEnumerator0.setCount((-274));
      standardEnumerator0.removeElement("Khj");
      assertEquals((-274), standardEnumerator0.getCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>();
      vector0.add((Integer) null);
      StandardEnumerator standardEnumerator0 = new StandardEnumerator(vector0);
      Vector<StandardCompositeFigure> vector1 = new Vector<StandardCompositeFigure>();
      standardEnumerator0.nextFigure();
      standardEnumerator0.setVector(vector1);
      // Undeclared exception!
      try { 
        standardEnumerator0.nextFigure();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class de.paragon.explorer.util.ResourceBundlePurchaser
         //
         verifyException("de.paragon.explorer.util.StandardEnumerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StandardEnumerator standardEnumerator0 = new StandardEnumerator();
      standardEnumerator0.setCount(600);
      // Undeclared exception!
      try { 
        standardEnumerator0.nextElement();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class de.paragon.explorer.util.ResourceBundlePurchaser
         //
         verifyException("de.paragon.explorer.util.StandardEnumerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StandardEnumerator standardEnumerator0 = new StandardEnumerator();
      standardEnumerator0.setCount(120);
      boolean boolean0 = standardEnumerator0.hasMoreElements();
      assertEquals(0, standardEnumerator0.getCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StandardEnumerator standardEnumerator0 = new StandardEnumerator();
      Integer integer0 = JLayeredPane.DRAG_LAYER;
      standardEnumerator0.setCount(1200);
      standardEnumerator0.addElement(integer0);
      assertEquals(1200, standardEnumerator0.getCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>();
      StandardEnumerator standardEnumerator0 = new StandardEnumerator(vector0);
      standardEnumerator0.insertElementAt(vector0, 0);
      assertEquals("[]", vector0.toString());
      assertTrue(vector0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Stack<InformationFigure> stack0 = new Stack<InformationFigure>();
      InformationFigure informationFigure0 = mock(InformationFigure.class, new ViolatedAssumptionAnswer());
      doReturn("ResourceBundle wurde erfolgreich geladen.", "ResourceBundle wurde erfolgreich geladen.", (String) null, (String) null).when(informationFigure0).toString();
      stack0.add(informationFigure0);
      StandardEnumerator standardEnumerator0 = new StandardEnumerator(stack0);
      Figure figure0 = standardEnumerator0.nextFigure();
      assertNotNull(figure0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>();
      vector0.add((Integer) null);
      StandardEnumerator standardEnumerator0 = new StandardEnumerator(vector0);
      Object object0 = standardEnumerator0.nextElement();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Stack<String> stack0 = new Stack<String>();
      stack0.addElement((String) null);
      StandardEnumerator standardEnumerator0 = new StandardEnumerator(stack0);
      boolean boolean0 = standardEnumerator0.isInEnumeration((Object) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      StandardEnumerator standardEnumerator0 = new StandardEnumerator(vector0);
      standardEnumerator0.setCount((-274));
      int int0 = standardEnumerator0.getCount();
      assertEquals((-274), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StandardEnumerator standardEnumerator0 = new StandardEnumerator();
      // Undeclared exception!
      try { 
        standardEnumerator0.setVector((Vector<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.paragon.explorer.util.StandardEnumerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StandardEnumerator standardEnumerator0 = null;
      try {
        standardEnumerator0 = new StandardEnumerator((Vector<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.paragon.explorer.util.StandardEnumerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      vector0.add("(c) PARAGON Systemhaus GmbH 2003 - ");
      StandardEnumerator standardEnumerator0 = new StandardEnumerator();
      standardEnumerator0.setVector(vector0);
      Vector<Object> vector1 = standardEnumerator0.getVector();
      assertEquals(1, vector1.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StandardEnumerator standardEnumerator0 = new StandardEnumerator();
      int int0 = standardEnumerator0.getCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Stack<InformationFigure> stack0 = new Stack<InformationFigure>();
      StandardEnumerator standardEnumerator0 = new StandardEnumerator(stack0);
      Vector<Object> vector0 = standardEnumerator0.getVector();
      assertTrue(vector0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      vector0.add("(c) PARAGON Systemhaus GmbH 2003 - ");
      StandardEnumerator standardEnumerator0 = new StandardEnumerator(vector0);
      Object object0 = standardEnumerator0.nextElement();
      assertEquals("(c) PARAGON Systemhaus GmbH 2003 - ", object0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StandardEnumerator standardEnumerator0 = new StandardEnumerator();
      standardEnumerator0.removeElement("");
      assertEquals(0, standardEnumerator0.getCount());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StandardEnumerator standardEnumerator0 = new StandardEnumerator();
      standardEnumerator0.setCount(600);
      standardEnumerator0.removeElement("");
      assertEquals(600, standardEnumerator0.getCount());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StandardEnumerator standardEnumerator0 = new StandardEnumerator();
      standardEnumerator0.addElement((Object) null);
      standardEnumerator0.nextFigure();
      int int0 = standardEnumerator0.getCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StandardEnumerator standardEnumerator0 = new StandardEnumerator();
      standardEnumerator0.setCount((-274));
      // Undeclared exception!
      try { 
        standardEnumerator0.nextElement();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StandardEnumerator standardEnumerator0 = new StandardEnumerator();
      // Undeclared exception!
      try { 
        standardEnumerator0.nextElement();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class de.paragon.explorer.util.ResourceBundlePurchaser
         //
         verifyException("de.paragon.explorer.util.StandardEnumerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StandardEnumerator standardEnumerator0 = new StandardEnumerator();
      standardEnumerator0.addElement((Object) null);
      boolean boolean0 = standardEnumerator0.hasMoreElements();
      assertEquals(0, standardEnumerator0.getCount());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StandardEnumerator standardEnumerator0 = new StandardEnumerator();
      boolean boolean0 = standardEnumerator0.hasMoreElements();
      assertFalse(boolean0);
      assertEquals(0, standardEnumerator0.getCount());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StandardEnumerator standardEnumerator0 = new StandardEnumerator();
      Object object0 = new Object();
      standardEnumerator0.addElement(object0);
      // Undeclared exception!
      try { 
        standardEnumerator0.nextFigure();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to de.paragon.explorer.figure.Figure
         //
         verifyException("de.paragon.explorer.util.StandardEnumerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StandardEnumerator standardEnumerator0 = new StandardEnumerator();
      standardEnumerator0.setCount((-274));
      standardEnumerator0.addElement((Object) null);
      assertEquals((-274), standardEnumerator0.getCount());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Stack<String> stack0 = new Stack<String>();
      StandardEnumerator standardEnumerator0 = new StandardEnumerator(stack0);
      standardEnumerator0.isInEnumeration((Object) null);
      assertEquals(0, standardEnumerator0.getCount());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StandardEnumerator standardEnumerator0 = new StandardEnumerator();
      // Undeclared exception!
      try { 
        standardEnumerator0.insertElementAt((Object) null, (-1757));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StandardEnumerator standardEnumerator0 = new StandardEnumerator();
      standardEnumerator0.setCount((-1));
      // Undeclared exception!
      try { 
        standardEnumerator0.nextFigure();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StandardEnumerator standardEnumerator0 = new StandardEnumerator();
      // Undeclared exception!
      try { 
        standardEnumerator0.nextFigure();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class de.paragon.explorer.util.ResourceBundlePurchaser
         //
         verifyException("de.paragon.explorer.util.StandardEnumerator", e);
      }
  }
}
