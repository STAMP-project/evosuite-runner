/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 07 12:20:59 GMT 2019
 */

package fr.unice.gfarce.interGraph;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import fr.unice.gfarce.interGraph.Zmodel;
import java.io.File;
import javax.swing.JLayeredPane;
import javax.swing.filechooser.FileSystemView;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.javax.swing.MockJFileChooser;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Zmodel_ESTest extends Zmodel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object[][] objectArray0 = new Object[6][3];
      String[] stringArray0 = new String[3];
      Zmodel zmodel0 = new Zmodel(objectArray0, stringArray0);
      zmodel0.removeRow(1);
      assertEquals(5, zmodel0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object[][] objectArray0 = new Object[2][3];
      String[] stringArray0 = new String[3];
      Zmodel zmodel0 = new Zmodel(objectArray0, stringArray0);
      MockJFileChooser mockJFileChooser0 = new MockJFileChooser((FileSystemView) null);
      // Undeclared exception!
      try { 
        zmodel0.setValueAt(mockJFileChooser0, 0, 1539);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1539
         //
         verifyException("fr.unice.gfarce.interGraph.Zmodel", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object[][] objectArray0 = new Object[3][5];
      String[] stringArray0 = new String[1];
      Zmodel zmodel0 = new Zmodel(objectArray0, stringArray0);
      Object object0 = zmodel0.getValueAt(0, 1);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object[][] objectArray0 = new Object[3][0];
      Object[] objectArray1 = new Object[1];
      Integer integer0 = JLayeredPane.DRAG_LAYER;
      objectArray0[0] = objectArray1;
      String[] stringArray0 = new String[1];
      Zmodel zmodel0 = new Zmodel(objectArray0, stringArray0);
      zmodel0.setValueAt(integer0, 0, 0);
      assertEquals(3, zmodel0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object[][] objectArray0 = new Object[7][5];
      Object[] objectArray1 = new Object[7];
      File file0 = MockFile.createTempFile("VpL+2&u*$", "VpL+2&u*$");
      MockJFileChooser mockJFileChooser0 = new MockJFileChooser(file0);
      objectArray1[0] = (Object) mockJFileChooser0;
      String[] stringArray0 = new String[8];
      Zmodel zmodel0 = new Zmodel(objectArray0, stringArray0);
      objectArray0[0] = objectArray1;
      MockJFileChooser mockJFileChooser1 = (MockJFileChooser)zmodel0.getValueAt(0, 0);
      assertFalse(mockJFileChooser1.isFocusTraversalPolicySet());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object[][] objectArray0 = new Object[8][0];
      String[] stringArray0 = new String[12];
      Zmodel zmodel0 = new Zmodel(objectArray0, stringArray0);
      int int0 = zmodel0.getRowCount();
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object[][] objectArray0 = new Object[5][0];
      String[] stringArray0 = new String[9];
      Zmodel zmodel0 = new Zmodel(objectArray0, stringArray0);
      String string0 = zmodel0.getColumnName(8);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object[][] objectArray0 = new Object[3][6];
      String[] stringArray0 = new String[6];
      stringArray0[2] = ",],I)|TcW$*I";
      Zmodel zmodel0 = new Zmodel(objectArray0, stringArray0);
      String string0 = zmodel0.getColumnName(2);
      assertEquals(",],I)|TcW$*I", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object[][] objectArray0 = new Object[5][3];
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      Zmodel zmodel0 = new Zmodel(objectArray0, stringArray0);
      String string0 = zmodel0.getColumnName(0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object[][] objectArray0 = new Object[0][7];
      String[] stringArray0 = new String[0];
      Zmodel zmodel0 = new Zmodel(objectArray0, stringArray0);
      int int0 = zmodel0.getColumnCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object[][] objectArray0 = new Object[5][0];
      String[] stringArray0 = new String[9];
      Zmodel zmodel0 = new Zmodel(objectArray0, stringArray0);
      int int0 = zmodel0.getColumnCount();
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[1];
      Zmodel zmodel0 = new Zmodel((Object[][]) null, stringArray0);
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      // Undeclared exception!
      try { 
        zmodel0.setValueAt(integer0, 4700, 942);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.Zmodel", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object[][] objectArray0 = new Object[0][5];
      Zmodel zmodel0 = new Zmodel(objectArray0, (String[]) null);
      // Undeclared exception!
      try { 
        zmodel0.removeRow(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.Zmodel", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object[][] objectArray0 = new Object[0][9];
      String[] stringArray0 = new String[4];
      Zmodel zmodel0 = new Zmodel(objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        zmodel0.removeRow((-1));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.Zmodel", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object[][] objectArray0 = new Object[3][0];
      String[] stringArray0 = new String[2];
      Zmodel zmodel0 = new Zmodel(objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        zmodel0.removeRow((-3781));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("fr.unice.gfarce.interGraph.Zmodel", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[2];
      Zmodel zmodel0 = new Zmodel((Object[][]) null, stringArray0);
      // Undeclared exception!
      try { 
        zmodel0.getValueAt(11, 1908);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.Zmodel", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Zmodel zmodel0 = new Zmodel((Object[][]) null, (String[]) null);
      // Undeclared exception!
      try { 
        zmodel0.getRowCount();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.Zmodel", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Zmodel zmodel0 = new Zmodel((Object[][]) null, (String[]) null);
      // Undeclared exception!
      try { 
        zmodel0.getColumnName(8);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.Zmodel", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Object[][] objectArray0 = new Object[5][0];
      String[] stringArray0 = new String[2];
      Zmodel zmodel0 = new Zmodel(objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        zmodel0.getColumnName(8);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("fr.unice.gfarce.interGraph.Zmodel", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Object[][] objectArray0 = new Object[9][0];
      Zmodel zmodel0 = new Zmodel(objectArray0, (String[]) null);
      // Undeclared exception!
      try { 
        zmodel0.getColumnCount();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.Zmodel", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[1];
      Zmodel zmodel0 = new Zmodel((Object[][]) null, stringArray0);
      // Undeclared exception!
      try { 
        zmodel0.afficheData((Object[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.Zmodel", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[8];
      Object[][] objectArray0 = new Object[19][2];
      objectArray0[0] = (Object[]) stringArray0;
      Zmodel zmodel0 = new Zmodel(objectArray0, stringArray0);
      // Undeclared exception!
      try { 
        zmodel0.afficheData(objectArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("fr.unice.gfarce.interGraph.Zmodel", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Zmodel zmodel0 = new Zmodel((Object[][]) null, stringArray0);
      // Undeclared exception!
      try { 
        zmodel0.addRow((Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.Zmodel", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object[][] objectArray0 = new Object[0][9];
      String[] stringArray0 = new String[4];
      Zmodel zmodel0 = new Zmodel(objectArray0, stringArray0);
      int int0 = zmodel0.getRowCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Object[][] objectArray0 = new Object[7][4];
      String[] stringArray0 = new String[1];
      Zmodel zmodel0 = new Zmodel(objectArray0, stringArray0);
      zmodel0.afficheData(objectArray0);
      assertEquals(1, zmodel0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Object[][] objectArray0 = new Object[8][0];
      String[] stringArray0 = new String[2];
      Zmodel zmodel0 = new Zmodel(objectArray0, stringArray0);
      zmodel0.addRow(stringArray0);
      assertEquals(9, zmodel0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Object[][] objectArray0 = new Object[8][0];
      String[] stringArray0 = new String[12];
      Zmodel zmodel0 = new Zmodel(objectArray0, stringArray0);
      boolean boolean0 = zmodel0.isCellEditable(8, 8);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Object[][] objectArray0 = new Object[8][0];
      Zmodel zmodel0 = new Zmodel(objectArray0, (String[]) null);
      // Undeclared exception!
      try { 
        zmodel0.getValueAt(0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("fr.unice.gfarce.interGraph.Zmodel", e);
      }
  }
}
