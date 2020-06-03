/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 18:08:44 GMT 2019
 */

package de.progra.charting.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.progra.charting.event.ChartDataModelListener;
import de.progra.charting.model.DefaultChartDataModel;
import de.progra.charting.model.EditableChartDataModel;
import de.progra.charting.model.EditableDataSet;
import de.progra.charting.model.ObjectChartDataModel;
import java.math.BigInteger;
import javax.swing.JLayeredPane;
import javax.swing.table.DefaultTableModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractChartDataModel_ESTest extends AbstractChartDataModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel((Object[]) null, 2682);
      boolean boolean0 = editableChartDataModel0.equals(defaultTableModel0);
      assertFalse(boolean0);
      assertFalse(editableChartDataModel0.isManualScale());
      assertFalse(editableChartDataModel0.isAutoScale());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      EditableDataSet[] editableDataSetArray0 = new EditableDataSet[4];
      EditableDataSet editableDataSet0 = new EditableDataSet(1799);
      editableDataSetArray0[0] = editableDataSet0;
      editableDataSetArray0[1] = editableDataSet0;
      editableDataSetArray0[2] = editableDataSet0;
      editableDataSetArray0[3] = editableDataSet0;
      EditableChartDataModel editableChartDataModel1 = new EditableChartDataModel(editableDataSetArray0);
      boolean boolean0 = editableChartDataModel0.equals(editableChartDataModel1);
      assertFalse(editableChartDataModel1.isManualScale());
      assertFalse(boolean0);
      assertFalse(editableChartDataModel1.isAutoScale());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      assertFalse(editableChartDataModel0.isManualScale());
      
      editableChartDataModel0.manualscale = true;
      boolean boolean0 = editableChartDataModel0.isAutoScale();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      assertFalse(objectChartDataModel0.isManualScale());
      
      objectChartDataModel0.setManualScale(true);
      boolean boolean0 = objectChartDataModel0.isManualScale();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      boolean boolean0 = editableChartDataModel0.isManualScale();
      assertFalse(boolean0);
      assertFalse(editableChartDataModel0.isAutoScale());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      editableChartDataModel0.isColumnNumeric();
      assertFalse(editableChartDataModel0.isAutoScale());
      assertFalse(editableChartDataModel0.isManualScale());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      BigInteger bigInteger0 = BigInteger.ZERO;
      editableChartDataModel0.minvalue = (Number) bigInteger0;
      Number number0 = editableChartDataModel0.getManualMinimumValue();
      assertFalse(editableChartDataModel0.isAutoScale());
      assertNotNull(number0);
      assertFalse(editableChartDataModel0.isManualScale());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      editableChartDataModel0.mincolumn = (-0.35240052782976244);
      double double0 = editableChartDataModel0.getManualMinimumColumnValue();
      assertEquals((-0.35240052782976244), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      BigInteger bigInteger0 = BigInteger.valueOf(0L);
      editableChartDataModel0.maxvalue = (Number) bigInteger0;
      Number number0 = editableChartDataModel0.getManualMaximumValue();
      assertFalse(editableChartDataModel0.isAutoScale());
      assertNotNull(number0);
      assertFalse(editableChartDataModel0.isManualScale());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      byte[] byteArray0 = new byte[7];
      byteArray0[6] = (byte)1;
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      editableChartDataModel0.setMaximumValue(bigInteger0);
      Number number0 = editableChartDataModel0.getManualMaximumValue();
      assertFalse(editableChartDataModel0.isManualScale());
      assertFalse(editableChartDataModel0.isAutoScale());
      assertNotNull(number0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      editableChartDataModel0.maxcolumn = 2.22849956975;
      double double0 = editableChartDataModel0.getManualMaximumColumnValue();
      assertEquals(2.22849956975, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[][] doubleArray0 = new double[6][3];
      String[] stringArray0 = new String[6];
      stringArray0[3] = "";
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel(doubleArray0, doubleArray0, stringArray0);
      objectChartDataModel0.getDataSetName(3);
      assertFalse(objectChartDataModel0.isManualScale());
      assertFalse(objectChartDataModel0.isAutoScale());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      // Undeclared exception!
      try { 
        editableChartDataModel0.getDataSetName(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      // Undeclared exception!
      try { 
        objectChartDataModel0.getDataSetName(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("de.progra.charting.model.ObjectChartDataModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      // Undeclared exception!
      try { 
        editableChartDataModel0.getAxisBinding(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      // Undeclared exception!
      try { 
        objectChartDataModel0.getAxisBinding(2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("de.progra.charting.model.ObjectChartDataModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      editableChartDataModel0.listener = null;
      // Undeclared exception!
      try { 
        editableChartDataModel0.fireChartDataModelChangedEvent(editableChartDataModel0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.model.AbstractChartDataModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      // Undeclared exception!
      try { 
        editableChartDataModel0.fireChartDataModelChangedEvent((Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null source
         //
         verifyException("java.util.EventObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EditableDataSet[] editableDataSetArray0 = new EditableDataSet[2];
      EditableDataSet editableDataSet0 = new EditableDataSet();
      editableDataSetArray0[0] = editableDataSet0;
      editableDataSetArray0[1] = editableDataSetArray0[0];
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel(editableDataSetArray0);
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      boolean boolean0 = editableChartDataModel0.equals(objectChartDataModel0);
      assertFalse(objectChartDataModel0.isAutoScale());
      assertFalse(boolean0);
      assertFalse(objectChartDataModel0.isManualScale());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      boolean boolean0 = editableChartDataModel0.equals((Object) null);
      assertFalse(editableChartDataModel0.isAutoScale());
      assertFalse(boolean0);
      assertFalse(editableChartDataModel0.isManualScale());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      boolean boolean0 = editableChartDataModel0.equals(editableChartDataModel0);
      assertFalse(editableChartDataModel0.isAutoScale());
      assertFalse(editableChartDataModel0.isManualScale());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      editableChartDataModel0.fireChartDataModelChangedEvent(editableChartDataModel0);
      assertFalse(editableChartDataModel0.isManualScale());
      assertFalse(editableChartDataModel0.isAutoScale());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      double double0 = editableChartDataModel0.getManualMinimumColumnValue();
      assertFalse(editableChartDataModel0.isManualScale());
      assertFalse(editableChartDataModel0.isAutoScale());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      editableChartDataModel0.setMaximumColumnValue((-1808.8115123));
      double double0 = editableChartDataModel0.getManualMaximumColumnValue();
      assertEquals((-1808.8115123), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      editableChartDataModel0.setMinimumColumnValue(40.0);
      double double0 = editableChartDataModel0.getManualMinimumColumnValue();
      assertEquals(40.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      boolean boolean0 = objectChartDataModel0.isColumnNumeric();
      assertFalse(objectChartDataModel0.isAutoScale());
      assertFalse(boolean0);
      assertFalse(objectChartDataModel0.isManualScale());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      objectChartDataModel0.getColumnClass();
      assertFalse(objectChartDataModel0.isManualScale());
      assertFalse(objectChartDataModel0.isAutoScale());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      assertFalse(editableChartDataModel0.isAutoScale());
      
      editableChartDataModel0.setAutoScale(true);
      assertTrue(editableChartDataModel0.isAutoScale());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel();
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      defaultChartDataModel0.setValueAt(4, 4, integer0);
      assertFalse(defaultChartDataModel0.isManualScale());
      assertFalse(defaultChartDataModel0.isAutoScale());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      editableChartDataModel0.getManualMinimumValue();
      assertFalse(editableChartDataModel0.isAutoScale());
      assertFalse(editableChartDataModel0.isManualScale());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int[][] intArray0 = new int[3][2];
      double[] doubleArray0 = new double[4];
      String[] stringArray0 = new String[6];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(intArray0, doubleArray0, stringArray0);
      defaultChartDataModel0.setAxisBinding((-4989), 0);
      assertFalse(defaultChartDataModel0.isManualScale());
      assertFalse(defaultChartDataModel0.isAutoScale());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      double double0 = editableChartDataModel0.getManualMaximumColumnValue();
      assertEquals(0.0, double0, 0.01);
      assertFalse(editableChartDataModel0.isManualScale());
      assertFalse(editableChartDataModel0.isAutoScale());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      BigInteger bigInteger0 = BigInteger.TEN;
      editableChartDataModel0.setMinimumValue(bigInteger0);
      assertFalse(editableChartDataModel0.isAutoScale());
      assertFalse(editableChartDataModel0.isManualScale());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      editableChartDataModel0.getManualMaximumValue();
      assertFalse(editableChartDataModel0.isManualScale());
      assertFalse(editableChartDataModel0.isAutoScale());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      editableChartDataModel0.addChartDataModelListener((ChartDataModelListener) null);
      assertFalse(editableChartDataModel0.isManualScale());
      assertFalse(editableChartDataModel0.isAutoScale());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      editableChartDataModel0.removeChartDataModelListener((ChartDataModelListener) null);
      assertFalse(editableChartDataModel0.isManualScale());
      assertFalse(editableChartDataModel0.isAutoScale());
  }
}
