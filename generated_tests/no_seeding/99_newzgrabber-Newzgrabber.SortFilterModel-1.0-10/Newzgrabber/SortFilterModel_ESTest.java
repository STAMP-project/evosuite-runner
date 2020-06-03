/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 04 14:50:51 GMT 2019
 */

package Newzgrabber;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Newzgrabber.SortFilterModel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.Stack;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SortFilterModel_ESTest extends SortFilterModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(254, 1172);
      JTable jTable0 = new JTable(defaultTableModel0);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.setValueAt(jTable0, 233, 253);
      assertFalse(jTable0.isFocusTraversalPolicySet());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(254, 1172);
      JTable jTable0 = new JTable(defaultTableModel0);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      SortFilterModel sortFilterModel1 = new SortFilterModel(sortFilterModel0);
      sortFilterModel1.setTable(jTable0);
      sortFilterModel1.sortTable(738);
      assertNotSame(sortFilterModel1, sortFilterModel0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(objectArray0, 1);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      boolean boolean0 = sortFilterModel0.isCellEditable(0, 1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(254, 1172);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      int int0 = sortFilterModel0.getRowCount();
      assertEquals(254, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      String string0 = sortFilterModel0.getColumnName(0);
      assertEquals("A", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      String string0 = sortFilterModel0.getColumnName((-2602));
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
      Object[] objectArray0 = new Object[1];
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(objectArray0, 1);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      int int0 = sortFilterModel0.getColumnCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(221, 221);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      JTable jTable0 = new JTable(sortFilterModel0);
      sortFilterModel0.setTable(jTable0);
      // Undeclared exception!
      try { 
        sortFilterModel0.sortTable(221);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 221 >= 221
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(254, 1172);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      // Undeclared exception!
      try { 
        sortFilterModel0.sort(1172);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1172 >= 1172
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(218, 218);
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
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      JTable jTable0 = new JTable(sortFilterModel0);
      sortFilterModel0.setTable(jTable0);
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(jTable0, 1, 1, 3, 2162, 3, 1, (-3040), 0, false, 2162, 2162, (-3040), 1141.7551141);
      sortFilterModel0.mouseClicked(mouseWheelEvent0);
      assertEquals((-3040), mouseWheelEvent0.getYOnScreen());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(254, 1172);
      JTable jTable0 = new JTable(defaultTableModel0);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.setTable(jTable0);
      sortFilterModel0.sortTable(738);
      sortFilterModel0.sort(738);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.mouseClicked((MouseEvent) null);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.sortTable((-572));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      Class class0 = sortFilterModel0.getColumnClass(1);
      assertFalse(class0.isEnum());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(vector0, vector0);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      byte[] byteArray0 = new byte[6];
      ImageIcon imageIcon0 = new ImageIcon(byteArray0);
      JRadioButtonMenuItem jRadioButtonMenuItem0 = new JRadioButtonMenuItem(imageIcon0);
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(jRadioButtonMenuItem0, 30, 336L, 1528, (-2843), 2368, 30, 2368, (byte) (-72), false, 0, 0, (-5064), 598.099);
      sortFilterModel0.mousePressed(mouseWheelEvent0);
      assertEquals(30, mouseWheelEvent0.getXOnScreen());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(objectArray0, 30);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      JTextPane jTextPane0 = new JTextPane();
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(jTextPane0, 30, 30, 30, 1, 30, 1, true, 30, 30, 30);
      sortFilterModel0.mouseReleased(mouseWheelEvent0);
      assertFalse(mouseWheelEvent0.isShiftDown());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      JTable jTable0 = new JTable(sortFilterModel0);
      sortFilterModel0.setTable(jTable0);
      sortFilterModel0.sortTable((-3040));
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(jTable0, (-1), (-3040), 853, 1, 1708, 1708, 36, 2343, false, 232, 36, 232, 0.0);
      sortFilterModel0.mouseClicked(mouseWheelEvent0);
      assertTrue(mouseWheelEvent0.isShiftDown());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(1, 1);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.mouseEntered((MouseEvent) null);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      Object object0 = sortFilterModel0.getValueAt((-2751), 0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Stack<String> stack0 = new Stack<String>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(stack0, stack0);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.setSort(true);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel((Object[][]) null, (Object[]) null);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      // Undeclared exception!
      try { 
        sortFilterModel0.isCellEditable((-1), (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("Newzgrabber.SortFilterModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(vector0, vector0);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.mouseExited((MouseEvent) null);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(221, 221);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      JTable jTable0 = new JTable(defaultTableModel0);
      sortFilterModel0.setTable(jTable0);
      MouseEvent mouseEvent0 = new MouseEvent(jTable0, 2, 2, (-3313), (-2315), (-2315), (-2315), true);
      // Undeclared exception!
      try { 
        sortFilterModel0.mouseClicked(mouseEvent0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(1, 213);
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      sortFilterModel0.updateTable();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      // Undeclared exception!
      try { 
        sortFilterModel0.setValueAt((Object) null, (-96), 2397);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -96
         //
         verifyException("Newzgrabber.SortFilterModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      SortFilterModel sortFilterModel0 = new SortFilterModel(defaultTableModel0);
      int int0 = sortFilterModel0.getRowCount();
      assertEquals(0, int0);
  }
}
