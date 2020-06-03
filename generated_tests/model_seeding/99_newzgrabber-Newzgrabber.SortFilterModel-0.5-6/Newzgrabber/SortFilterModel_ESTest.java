/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 19:49:31 GMT 2019
 */

package Newzgrabber;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Newzgrabber.SortFilterModel;
import java.awt.TextComponent;
import java.awt.event.MouseEvent;
import java.util.Stack;
import javax.swing.JTable;
import javax.swing.plaf.synth.SynthRadioButtonUI;
import javax.swing.plaf.synth.SynthToggleButtonUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SortFilterModel_ESTest extends SortFilterModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      Object object0 = new Object();
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) defaultTableModel0;
      defaultTableModel0.addColumn(object0, objectArray0);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.sort(0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Stack<TextComponent> stack0 = new Stack<TextComponent>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(stack0, 20);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      SynthToggleButtonUI synthToggleButtonUI0 = new SynthToggleButtonUI();
      // Undeclared exception!
      try { 
        sortFilterModel0.setValueAt(synthToggleButtonUI0, 0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Stack<TextComponent> stack0 = new Stack<TextComponent>();
      stack0.add((TextComponent) null);
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(stack0, 20);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      SynthRadioButtonUI synthRadioButtonUI0 = new SynthRadioButtonUI();
      sortFilterModel0.setValueAt(synthRadioButtonUI0, 0, 0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Stack<TextComponent> stack0 = new Stack<TextComponent>();
      stack0.add((TextComponent) null);
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(stack0, 20);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      Object object0 = sortFilterModel0.getValueAt(0, 0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Stack<TextComponent> stack0 = new Stack<TextComponent>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(stack0, 20);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      int int0 = sortFilterModel0.getRowCount();
      assertEquals(20, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      String string0 = sortFilterModel0.getColumnName((-1538));
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      int int0 = sortFilterModel0.getColumnCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(752, 752);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      int int0 = sortFilterModel0.getColumnCount();
      assertEquals(752, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Stack<TextComponent> stack0 = new Stack<TextComponent>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(stack0, stack0);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      // Undeclared exception!
      try { 
        sortFilterModel0.isCellEditable(26, 26);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 26
         //
         verifyException("Newzgrabber.SortFilterModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SortFilterModel sortFilterModel0 = null;
      try {
        sortFilterModel0 = new SortFilterModel((TableModel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Newzgrabber.SortFilterModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Stack<TextComponent> stack0 = new Stack<TextComponent>();
      stack0.add((TextComponent) null);
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(stack0, 20);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.setSort(false);
      sortFilterModel0.sort(0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Stack<TextComponent> stack0 = new Stack<TextComponent>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(stack0, 20);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.mouseClicked((MouseEvent) null);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Stack<TextComponent> stack0 = new Stack<TextComponent>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(stack0, 20);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.sortTable(0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      JTable jTable0 = new JTable(sortFilterModel0);
      sortFilterModel0.setTable(jTable0);
      // Undeclared exception!
      try { 
        sortFilterModel0.sortTable(1838);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.awt.event.MouseEvent
         //
         verifyException("Newzgrabber.SortFilterModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Stack<TextComponent> stack0 = new Stack<TextComponent>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(stack0, 20);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      // Undeclared exception!
      try { 
        sortFilterModel0.sort(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      Class class0 = sortFilterModel0.getColumnClass((-1275));
      assertFalse(class0.isAnnotation());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.mousePressed((MouseEvent) null);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Stack<TextComponent> stack0 = new Stack<TextComponent>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(stack0, 20);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      String string0 = sortFilterModel0.getColumnName(0);
      assertEquals("A", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Stack<TextComponent> stack0 = new Stack<TextComponent>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(stack0, 85);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.mouseReleased((MouseEvent) null);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Stack<TextComponent> stack0 = new Stack<TextComponent>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(stack0, 20);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      JTable jTable0 = new JTable(sortFilterModel0, (TableColumnModel) null);
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
  public void test20()  throws Throwable  {
      Stack<TextComponent> stack0 = new Stack<TextComponent>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(stack0, 20);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.mouseEntered((MouseEvent) null);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Stack<TextComponent> stack0 = new Stack<TextComponent>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(stack0, 20);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      Object object0 = sortFilterModel0.getValueAt(0, 30);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Stack<TextComponent> stack0 = new Stack<TextComponent>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(stack0, 20);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      boolean boolean0 = sortFilterModel0.isCellEditable(0, (-3960));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Stack<TextComponent> stack0 = new Stack<TextComponent>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(stack0, 20);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.mouseExited((MouseEvent) null);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Stack<Object> stack0 = new Stack<Object>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(stack0, stack0);
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
  public void test25()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.updateTable();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      int int0 = sortFilterModel0.getRowCount();
      assertEquals(0, int0);
  }
}
