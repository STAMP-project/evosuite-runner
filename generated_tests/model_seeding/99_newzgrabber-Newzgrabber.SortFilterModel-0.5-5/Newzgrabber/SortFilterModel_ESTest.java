/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 18:57:20 GMT 2019
 */

package Newzgrabber;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Newzgrabber.SortFilterModel;
import java.awt.event.MouseEvent;
import java.util.Stack;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SortFilterModel_ESTest extends SortFilterModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(354, 354);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.setValueAt(defaultTableModel0, 0, 3);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(354, 354);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      Object object0 = sortFilterModel0.getValueAt(338, 344);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      Object[][] objectArray0 = new Object[1][6];
      Object[] objectArray1 = new Object[9];
      defaultTableModel0.setDataVector(objectArray0, objectArray1);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      int int0 = sortFilterModel0.getRowCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      String string0 = sortFilterModel0.getColumnName((-299));
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      int int0 = sortFilterModel0.getColumnCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      // Undeclared exception!
      try { 
        sortFilterModel0.setTable((JTable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Newzgrabber.SortFilterModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      // Undeclared exception!
      try { 
        sortFilterModel0.isCellEditable(4419, 4419);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4419
         //
         verifyException("Newzgrabber.SortFilterModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SortFilterModel sortFilterModel0 = null;
      try {
        sortFilterModel0 = new SortFilterModel((TableModel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      JTable jTable0 = new JTable();
      sortFilterModel0.setTable(jTable0);
      // Undeclared exception!
      try { 
        sortFilterModel0.mouseClicked((MouseEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Newzgrabber.SortFilterModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(354, 354);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.mouseClicked((MouseEvent) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.sortTable(0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      JTable jTable0 = new JTable();
      sortFilterModel0.setTable(jTable0);
      // Undeclared exception!
      try { 
        sortFilterModel0.sortTable(845);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.awt.event.MouseEvent
         //
         verifyException("Newzgrabber.SortFilterModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.sort(312);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(354, 354);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      Class class0 = sortFilterModel0.getColumnClass(1992);
      assertFalse(class0.isAnnotation());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(354, 354);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.mousePressed((MouseEvent) null);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      String string0 = sortFilterModel0.getColumnName(20);
      assertEquals("U", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(354, 354);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.mouseReleased((MouseEvent) null);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(354, 354);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      int int0 = sortFilterModel0.getColumnCount();
      assertEquals(354, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(354, 354);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.mouseEntered((MouseEvent) null);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      Object object0 = sortFilterModel0.getValueAt((-1731), (-1731));
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(354, 354);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.setSort(false);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(354, 354);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      boolean boolean0 = sortFilterModel0.isCellEditable(30, 2);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Stack<JToolBar.Separator> stack0 = new Stack<JToolBar.Separator>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(stack0, stack0);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.mouseExited((MouseEvent) null);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Stack<Integer> stack0 = new Stack<Integer>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(stack0, stack0);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.updateTable();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      // Undeclared exception!
      try { 
        sortFilterModel0.setValueAt("NJ18f;T^o6S6w_JKd", 277, 277);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 277
         //
         verifyException("Newzgrabber.SortFilterModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      int int0 = sortFilterModel0.getRowCount();
      assertEquals(0, int0);
  }
}
