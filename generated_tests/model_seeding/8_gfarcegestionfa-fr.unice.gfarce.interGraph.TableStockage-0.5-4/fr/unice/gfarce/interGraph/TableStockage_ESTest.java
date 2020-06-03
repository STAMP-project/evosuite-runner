/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 07 12:20:48 GMT 2019
 */

package fr.unice.gfarce.interGraph;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import fr.unice.gfarce.interGraph.TableStockage;
import javax.swing.plaf.synth.SynthMenuBarUI;
import javax.swing.table.DefaultTableModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TableStockage_ESTest extends TableStockage_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[1];
      Object[][] objectArray0 = new Object[2][7];
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      // Undeclared exception!
      try { 
        tableStockage0.remplirMatrice("m'0.", (-1118), 2246);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1119
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[1];
      Object[][] objectArray0 = new Object[5][4];
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      Class<Boolean> class0 = Boolean.class;
      tableStockage0.setColumnClass(0, class0);
      assertEquals(1, tableStockage0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage(1598, 1598);
      Boolean boolean0 = new Boolean(false);
      tableStockage0.setValueAt(boolean0, 1114, 1114);
      assertEquals(1597, tableStockage0.getRowCount());
      assertEquals(1598, tableStockage0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[1];
      Object[][] objectArray0 = new Object[5][4];
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      tableStockage0.setColumnName(0, "");
      assertEquals(1, tableStockage0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[1];
      Object[][] objectArray0 = new Object[5][4];
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      tableStockage0.remplirMatrice(stringArray0[0], 0, 0);
      assertEquals(1, tableStockage0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "fr.unice.gfarce.interGraph.TableStockage";
      Object[][] objectArray0 = new Object[9][9];
      objectArray0[0] = (Object[]) stringArray0;
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      Object object0 = tableStockage0.getValueAt(0, 0);
      assertEquals("fr.unice.gfarce.interGraph.TableStockage", object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      int int0 = tableStockage0.getRowCount();
      assertEquals(0, int0);
      assertEquals(0, tableStockage0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[6];
      Object[][] objectArray0 = new Object[3][9];
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      String[] stringArray1 = tableStockage0.getNomColonnes();
      assertEquals(6, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage(1462, 1466);
      tableStockage0.getColumnName(1462);
      assertEquals(1461, tableStockage0.getRowCount());
      assertEquals(1466, tableStockage0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "fr.unice.gfarce.interGraph.TableStockage";
      Object[][] objectArray0 = new Object[9][9];
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      String string0 = tableStockage0.getColumnName(0);
      assertEquals("fr.unice.gfarce.interGraph.TableStockage", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[2];
      Object[][] objectArray0 = new Object[22][9];
      stringArray0[0] = "";
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      String string0 = tableStockage0.getColumnName(0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      int int0 = tableStockage0.getColumnCount();
      assertEquals(0, tableStockage0.getRowCount());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[1];
      Object[][] objectArray0 = new Object[5][5];
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      int int0 = tableStockage0.getColumnCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage(990, 586);
      tableStockage0.getColumnClass(125);
      assertEquals(586, tableStockage0.getColumnCount());
      assertEquals(989, tableStockage0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      // Undeclared exception!
      try { 
        tableStockage0.setColumnClass((-1576), (Class<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      SynthMenuBarUI synthMenuBarUI0 = new SynthMenuBarUI();
      // Undeclared exception!
      try { 
        tableStockage0.remplirMatrice(synthMenuBarUI0, 0, 0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // javax.swing.plaf.synth.SynthMenuBarUI cannot be cast to java.lang.String
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      // Undeclared exception!
      try { 
        tableStockage0.getValueAt(347, 347);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 347
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      // Undeclared exception!
      try { 
        tableStockage0.getColumnName(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TableStockage tableStockage0 = null;
      try {
        tableStockage0 = new TableStockage((String[]) null, (Object[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[2];
      Object[][] objectArray0 = new Object[3][0];
      TableStockage tableStockage0 = null;
      try {
        tableStockage0 = new TableStockage(stringArray0, objectArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TableStockage tableStockage0 = null;
      try {
        tableStockage0 = new TableStockage((-1), (-1));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      // Undeclared exception!
      try { 
        tableStockage0.setValueAt("fr.unice.gfarce.interGraph.TableStockage", (-2608), (-2608));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage(1462, 1466);
      tableStockage0.getValueAt(1148, 1462);
      assertEquals(1461, tableStockage0.getRowCount());
      assertEquals(1466, tableStockage0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage(1462, 1466);
      int int0 = tableStockage0.getRowCount();
      assertEquals(1466, tableStockage0.getColumnCount());
      assertEquals(1461, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      // Undeclared exception!
      try { 
        tableStockage0.remplirMatrice((Object) null, 0, (-3480));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3480
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage(1598, 1);
      // Undeclared exception!
      try { 
        tableStockage0.remplirMatrice((Object) null, 1, (-4));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -4
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage(1462, 1466);
      Class<DefaultTableModel> class0 = DefaultTableModel.class;
      tableStockage0.setColumnClass(1462, class0);
      assertEquals(1461, tableStockage0.getRowCount());
      assertEquals(1466, tableStockage0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage(2796, 2796);
      Class<Boolean> class0 = Boolean.class;
      // Undeclared exception!
      try { 
        tableStockage0.setColumnClass(2796, class0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage(1370, 1370);
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        tableStockage0.setColumnClass(1370, class0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String[] stringArray0 = new String[7];
      Object[][] objectArray0 = new Object[5][2];
      objectArray0[0] = (Object[]) stringArray0;
      objectArray0[1] = (Object[]) stringArray0;
      objectArray0[2] = (Object[]) stringArray0;
      objectArray0[3] = (Object[]) stringArray0;
      objectArray0[4] = (Object[]) stringArray0;
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      Class<String> class0 = String.class;
      tableStockage0.setColumnClass(0, class0);
      assertEquals(7, tableStockage0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage(1462, 1466);
      boolean boolean0 = tableStockage0.isCellEditable(471, 2663);
      assertEquals(1461, tableStockage0.getRowCount());
      assertTrue(boolean0);
      assertEquals(1466, tableStockage0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      // Undeclared exception!
      try { 
        tableStockage0.setColumnName((-1), "gb,:t} [");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      String[] stringArray0 = tableStockage0.getNomColonnes();
      assertEquals(0, tableStockage0.getRowCount());
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      // Undeclared exception!
      try { 
        tableStockage0.getColumnClass((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }
}
