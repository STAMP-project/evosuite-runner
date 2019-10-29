/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 15:06:31 GMT 2019
 */

package de.progra.charting.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.progra.charting.model.ChartDataModelConstraints;
import de.progra.charting.model.DataSet;
import de.progra.charting.model.DefaultChartDataModel;
import de.progra.charting.model.DefaultDataSet;
import de.progra.charting.model.EditableChartDataModel;
import de.progra.charting.model.EditableDataSet;
import de.progra.charting.model.StackedChartDataModelConstraints;
import java.util.NoSuchElementException;
import java.util.TreeSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultChartDataModel_ESTest extends DefaultChartDataModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DataSet[] dataSetArray0 = new DataSet[2];
      EditableDataSet editableDataSet0 = new EditableDataSet(44);
      dataSetArray0[0] = (DataSet) editableDataSet0;
      dataSetArray0[1] = (DataSet) editableDataSet0;
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(dataSetArray0);
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(defaultChartDataModel0, (-1));
      defaultChartDataModel0.setChartDataModelConstraints(0, stackedChartDataModelConstraints0);
      assertFalse(defaultChartDataModel0.isAutoScale());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      ChartDataModelConstraints chartDataModelConstraints0 = editableChartDataModel0.getChartDataModelConstraints(3);
      editableChartDataModel0.setChartDataModelConstraints(3, chartDataModelConstraints0);
      assertEquals(0, editableChartDataModel0.getDataSetNumber());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel();
      ChartDataModelConstraints chartDataModelConstraints0 = defaultChartDataModel0.getChartDataModelConstraints((-1246));
      assertNotNull(chartDataModelConstraints0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int[][] intArray0 = new int[1][3];
      String[] stringArray0 = new String[9];
      double[] doubleArray0 = new double[6];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(intArray0, doubleArray0, stringArray0);
      // Undeclared exception!
      try { 
        defaultChartDataModel0.getColumnValueAt(0, (-413));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -413
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DataSet[] dataSetArray0 = new DataSet[2];
      EditableDataSet editableDataSet0 = new EditableDataSet((-1654));
      dataSetArray0[0] = (DataSet) editableDataSet0;
      dataSetArray0[1] = (DataSet) editableDataSet0;
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(dataSetArray0);
      Object object0 = defaultChartDataModel0.getColumnValueAt(0, 0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultDataSet defaultDataSet0 = new DefaultDataSet(6);
      DataSet[] dataSetArray0 = new DataSet[9];
      dataSetArray0[0] = (DataSet) defaultDataSet0;
      dataSetArray0[1] = (DataSet) defaultDataSet0;
      dataSetArray0[2] = (DataSet) defaultDataSet0;
      dataSetArray0[3] = (DataSet) defaultDataSet0;
      dataSetArray0[4] = (DataSet) defaultDataSet0;
      dataSetArray0[5] = (DataSet) defaultDataSet0;
      dataSetArray0[6] = (DataSet) defaultDataSet0;
      dataSetArray0[7] = (DataSet) defaultDataSet0;
      dataSetArray0[8] = (DataSet) defaultDataSet0;
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(dataSetArray0);
      // Undeclared exception!
      try { 
        defaultChartDataModel0.getValueAt(7, 6);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 6, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel();
      TreeSet<Integer> treeSet0 = new TreeSet<Integer>();
      Integer integer0 = new Integer(1536);
      treeSet0.add(integer0);
      defaultChartDataModel0.trimSet(treeSet0);
      assertTrue(treeSet0.contains(integer0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int[][] intArray0 = new int[1][3];
      double[] doubleArray0 = new double[5];
      String[] stringArray0 = new String[9];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(intArray0, doubleArray0, stringArray0);
      TreeSet treeSet0 = defaultChartDataModel0.getOrderedValues(0);
      assertNotNull(treeSet0);
      assertEquals(1, defaultChartDataModel0.getDataSetNumber());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[][] intArray0 = new int[1][3];
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) Integer.MAX_VALUE;
      String[] stringArray0 = new String[9];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(intArray0, doubleArray0, stringArray0);
      defaultChartDataModel0.getLastColumnValue();
      assertEquals(1, defaultChartDataModel0.getDataSetNumber());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[][] doubleArray0 = new double[3][6];
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = Double.NEGATIVE_INFINITY;
      doubleArray1[1] = Double.NEGATIVE_INFINITY;
      doubleArray1[2] = Double.NEGATIVE_INFINITY;
      doubleArray1[3] = Double.NEGATIVE_INFINITY;
      String[] stringArray0 = new String[9];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray1, stringArray0);
      defaultChartDataModel0.getLastColumnValue();
      assertEquals(3, defaultChartDataModel0.getDataSetNumber());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[][] doubleArray0 = new double[5][4];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = 291.7165477;
      doubleArray0[0] = doubleArray1;
      String[] stringArray0 = new String[6];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray0[0], stringArray0);
      defaultChartDataModel0.getFirstColumnValue();
      assertEquals(5, defaultChartDataModel0.getDataSetNumber());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[][] doubleArray0 = new double[3][4];
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = (double) (-194);
      String[] stringArray0 = new String[8];
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel(doubleArray0, doubleArray1, stringArray0);
      double double0 = editableChartDataModel0.getFirstColumnValue();
      assertEquals((-194.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      int int0 = editableChartDataModel0.getDataSetNumber();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[][] intArray0 = new int[8][7];
      double[] doubleArray0 = new double[8];
      String[] stringArray0 = new String[9];
      stringArray0[1] = "7H_Q]lN`kQYD:";
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(intArray0, doubleArray0, stringArray0);
      String string0 = defaultChartDataModel0.getDataSetName(1);
      assertNotNull(string0);
      assertEquals(8, defaultChartDataModel0.getDataSetNumber());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EditableDataSet editableDataSet0 = new EditableDataSet(1);
      EditableDataSet[] editableDataSetArray0 = new EditableDataSet[8];
      editableDataSetArray0[0] = editableDataSet0;
      editableDataSetArray0[1] = editableDataSet0;
      editableDataSetArray0[2] = editableDataSet0;
      editableDataSetArray0[3] = editableDataSet0;
      editableDataSetArray0[4] = editableDataSet0;
      editableDataSetArray0[5] = editableDataSet0;
      editableDataSetArray0[6] = editableDataSet0;
      editableDataSetArray0[7] = editableDataSet0;
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel(editableDataSetArray0);
      String string0 = editableChartDataModel0.getDataSetName(1);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DataSet[] dataSetArray0 = new DataSet[2];
      EditableDataSet editableDataSet0 = new EditableDataSet(1);
      dataSetArray0[0] = (DataSet) editableDataSet0;
      dataSetArray0[1] = (DataSet) editableDataSet0;
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(dataSetArray0);
      int int0 = defaultChartDataModel0.getDataSetLength(1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EditableDataSet[] editableDataSetArray0 = new EditableDataSet[3];
      EditableDataSet editableDataSet0 = new EditableDataSet((-539));
      editableDataSetArray0[0] = editableDataSet0;
      editableDataSetArray0[1] = editableDataSet0;
      editableDataSetArray0[2] = editableDataSetArray0[0];
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel(editableDataSetArray0);
      int int0 = editableChartDataModel0.getAxisBinding(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DataSet[] dataSetArray0 = new DataSet[2];
      DefaultDataSet defaultDataSet0 = new DefaultDataSet();
      dataSetArray0[0] = (DataSet) defaultDataSet0;
      EditableDataSet editableDataSet0 = new EditableDataSet(1);
      dataSetArray0[1] = (DataSet) editableDataSet0;
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(dataSetArray0);
      assertEquals(2, defaultChartDataModel0.getDataSetNumber());
      
      int int0 = defaultChartDataModel0.getAxisBinding(1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DataSet[] dataSetArray0 = new DataSet[0];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(dataSetArray0);
      // Undeclared exception!
      try { 
        defaultChartDataModel0.trimSet((TreeSet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.model.DefaultChartDataModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DataSet[] dataSetArray0 = new DataSet[0];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(dataSetArray0);
      TreeSet<String> treeSet0 = new TreeSet<String>();
      treeSet0.add("");
      // Undeclared exception!
      try { 
        defaultChartDataModel0.trimSet(treeSet0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.lang.Number
         //
         verifyException("de.progra.charting.model.DefaultChartDataModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel();
      // Undeclared exception!
      try { 
        defaultChartDataModel0.getValueAt((-194), (-194));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DataSet[] dataSetArray0 = new DataSet[0];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(dataSetArray0);
      // Undeclared exception!
      try { 
        defaultChartDataModel0.getLastColumnValue();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      // Undeclared exception!
      try { 
        editableChartDataModel0.getFirstColumnValue();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      // Undeclared exception!
      try { 
        editableChartDataModel0.getDataSetName(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      // Undeclared exception!
      try { 
        editableChartDataModel0.getDataSetName(Integer.MIN_VALUE);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel();
      // Undeclared exception!
      try { 
        defaultChartDataModel0.getDataSetLength(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      // Undeclared exception!
      try { 
        editableChartDataModel0.getDataSetLength((-823));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int[][] intArray0 = new int[5][3];
      String[] stringArray0 = new String[5];
      double[] doubleArray0 = new double[1];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(intArray0, doubleArray0, stringArray0);
      // Undeclared exception!
      try { 
        defaultChartDataModel0.getColumnValueAt(1000, 1000);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1000, Size: 5
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      // Undeclared exception!
      try { 
        editableChartDataModel0.getAxisBinding((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[13];
      String[] stringArray0 = new String[1];
      Number[][] numberArray0 = new Number[0][2];
      DefaultChartDataModel defaultChartDataModel0 = null;
      try {
        defaultChartDataModel0 = new DefaultChartDataModel(numberArray0, doubleArray0, stringArray0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String[] stringArray0 = new String[5];
      double[] doubleArray0 = new double[2];
      DefaultChartDataModel defaultChartDataModel0 = null;
      try {
        defaultChartDataModel0 = new DefaultChartDataModel((Number[][]) null, doubleArray0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.ChartUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String[] stringArray0 = new String[12];
      double[] doubleArray0 = new double[8];
      Number[][] numberArray0 = new Number[2][3];
      Number[] numberArray1 = new Number[2];
      Float float0 = new Float((-2329.0F));
      numberArray1[0] = (Number) float0;
      Byte byte0 = new Byte((byte)0);
      numberArray1[1] = (Number) byte0;
      numberArray0[0] = numberArray1;
      DefaultChartDataModel defaultChartDataModel0 = null;
      try {
        defaultChartDataModel0 = new DefaultChartDataModel(numberArray0, doubleArray0, stringArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Float cannot be cast to java.lang.Byte
         //
         verifyException("java.lang.Byte", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      Float float0 = new Float((-1.0));
      Number[][] numberArray0 = new Number[1][4];
      Number[] numberArray1 = new Number[9];
      numberArray1[0] = (Number) float0;
      numberArray1[1] = (Number) float0;
      numberArray1[2] = (Number) float0;
      numberArray1[3] = (Number) float0;
      numberArray1[4] = (Number) float0;
      numberArray1[5] = (Number) float0;
      numberArray1[6] = (Number) float0;
      numberArray1[7] = (Number) float0;
      numberArray1[8] = (Number) float0;
      numberArray0[0] = numberArray1;
      String[] stringArray0 = new String[0];
      DefaultChartDataModel defaultChartDataModel0 = null;
      try {
        defaultChartDataModel0 = new DefaultChartDataModel(numberArray0, doubleArray0, stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("de.progra.charting.model.DefaultChartDataModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String[] stringArray0 = new String[14];
      double[] doubleArray0 = new double[5];
      int[][] intArray0 = new int[7][6];
      int[] intArray1 = new int[0];
      intArray0[0] = intArray1;
      DefaultChartDataModel defaultChartDataModel0 = null;
      try {
        defaultChartDataModel0 = new DefaultChartDataModel(intArray0, doubleArray0, stringArray0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String[] stringArray0 = new String[7];
      double[] doubleArray0 = new double[0];
      DefaultChartDataModel defaultChartDataModel0 = null;
      try {
        defaultChartDataModel0 = new DefaultChartDataModel((int[][]) null, doubleArray0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.ChartUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      int[][] intArray0 = new int[7][3];
      String[] stringArray0 = new String[1];
      double[] doubleArray0 = new double[6];
      DefaultChartDataModel defaultChartDataModel0 = null;
      try {
        defaultChartDataModel0 = new DefaultChartDataModel(intArray0, doubleArray0, stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("de.progra.charting.model.DefaultChartDataModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[][] doubleArray0 = new double[2][3];
      double[] doubleArray1 = new double[0];
      doubleArray0[0] = doubleArray1;
      DefaultChartDataModel defaultChartDataModel0 = null;
      try {
        defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray1, (String[]) null);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[][] doubleArray0 = new double[1][6];
      double[] doubleArray1 = new double[3];
      DefaultChartDataModel defaultChartDataModel0 = null;
      try {
        defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray1, (String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.model.DefaultChartDataModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[][] doubleArray0 = new double[5][9];
      String[] stringArray0 = new String[2];
      DefaultChartDataModel defaultChartDataModel0 = null;
      try {
        defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray0[0], stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("de.progra.charting.model.DefaultChartDataModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DataSet[] dataSetArray0 = new DataSet[1];
      EditableDataSet editableDataSet0 = new EditableDataSet();
      Float float0 = new Float(Float.NEGATIVE_INFINITY);
      editableDataSet0.insertValue(float0, float0);
      dataSetArray0[0] = (DataSet) editableDataSet0;
      DefaultChartDataModel defaultChartDataModel0 = null;
      try {
        defaultChartDataModel0 = new DefaultChartDataModel(dataSetArray0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DataSet[] dataSetArray0 = new DataSet[3];
      DefaultChartDataModel defaultChartDataModel0 = null;
      try {
        defaultChartDataModel0 = new DefaultChartDataModel(dataSetArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.model.DefaultChartDataModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DataSet[] dataSetArray0 = new DataSet[12];
      EditableDataSet editableDataSet0 = new EditableDataSet();
      TreeSet<Double> treeSet0 = new TreeSet<Double>();
      editableDataSet0.insertValue(treeSet0, treeSet0);
      dataSetArray0[0] = (DataSet) editableDataSet0;
      DefaultChartDataModel defaultChartDataModel0 = null;
      try {
        defaultChartDataModel0 = new DefaultChartDataModel(dataSetArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.TreeSet cannot be cast to java.lang.Comparable
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      int[][] intArray0 = new int[5][3];
      String[] stringArray0 = new String[5];
      double[] doubleArray0 = new double[1];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(intArray0, doubleArray0, stringArray0);
      defaultChartDataModel0.getDataSetLength(0);
      assertEquals(5, defaultChartDataModel0.getDataSetNumber());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel();
      TreeSet<Object> treeSet0 = new TreeSet<Object>();
      Double double0 = new Double(Double.NaN);
      treeSet0.add(double0);
      // Undeclared exception!
      try { 
        defaultChartDataModel0.trimSet(treeSet0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      double[][] doubleArray0 = new double[1][9];
      double[] doubleArray1 = new double[9];
      doubleArray1[4] = Double.POSITIVE_INFINITY;
      doubleArray0[0] = doubleArray1;
      String[] stringArray0 = new String[1];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray1, stringArray0);
      assertEquals(1, defaultChartDataModel0.getDataSetNumber());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      int[][] intArray0 = new int[6][3];
      String[] stringArray0 = new String[9];
      double[] doubleArray0 = new double[6];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(intArray0, doubleArray0, stringArray0);
      defaultChartDataModel0.setChartDataModelConstraints((-2795), (ChartDataModelConstraints) null);
      ChartDataModelConstraints chartDataModelConstraints0 = defaultChartDataModel0.getChartDataModelConstraints(367);
      assertNull(chartDataModelConstraints0);
      assertEquals(6, defaultChartDataModel0.getDataSetNumber());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DataSet[] dataSetArray0 = new DataSet[0];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(dataSetArray0);
      ChartDataModelConstraints chartDataModelConstraints0 = defaultChartDataModel0.getChartDataModelConstraints(0);
      assertNotNull(chartDataModelConstraints0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      String[] stringArray0 = new String[9];
      double[] doubleArray0 = new double[6];
      Number[][] numberArray0 = new Number[1][8];
      Number[] numberArray1 = new Number[1];
      Float float0 = new Float(1.0);
      numberArray1[0] = (Number) float0;
      numberArray0[0] = numberArray1;
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(numberArray0, doubleArray0, stringArray0);
      assertEquals(1, defaultChartDataModel0.getDataSetNumber());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      double[][] doubleArray0 = new double[1][9];
      double[] doubleArray1 = new double[9];
      String[] stringArray0 = new String[1];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray1, stringArray0);
      // Undeclared exception!
      try { 
        defaultChartDataModel0.getAxisBinding(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      double[][] doubleArray0 = new double[12][9];
      String[] stringArray0 = new String[18];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray0[0], stringArray0);
      defaultChartDataModel0.getColumnValueAt(1, 341);
      assertEquals(12, defaultChartDataModel0.getDataSetNumber());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      double[][] doubleArray0 = new double[5][4];
      double[] doubleArray1 = new double[1];
      String[] stringArray0 = new String[6];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray1, stringArray0);
      defaultChartDataModel0.getFirstColumnValue();
      assertEquals(5, defaultChartDataModel0.getDataSetNumber());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      int[][] intArray0 = new int[3][3];
      String[] stringArray0 = new String[5];
      double[] doubleArray0 = new double[3];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(intArray0, doubleArray0, stringArray0);
      defaultChartDataModel0.getDataSetName(1);
      assertEquals(3, defaultChartDataModel0.getDataSetNumber());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      int[][] intArray0 = new int[6][3];
      String[] stringArray0 = new String[9];
      double[] doubleArray0 = new double[6];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(intArray0, doubleArray0, stringArray0);
      boolean boolean0 = defaultChartDataModel0.isColumnNumeric();
      assertTrue(boolean0);
      assertEquals(6, defaultChartDataModel0.getDataSetNumber());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) 3.0;
      EditableDataSet editableDataSet0 = new EditableDataSet(objectArray0, objectArray0, Integer.MAX_VALUE);
      EditableDataSet[] editableDataSetArray0 = new EditableDataSet[8];
      editableDataSetArray0[0] = editableDataSet0;
      editableDataSetArray0[1] = editableDataSet0;
      editableDataSetArray0[2] = editableDataSet0;
      editableDataSetArray0[3] = editableDataSet0;
      editableDataSetArray0[4] = editableDataSet0;
      editableDataSetArray0[5] = editableDataSet0;
      editableDataSetArray0[6] = editableDataSet0;
      editableDataSetArray0[7] = editableDataSet0;
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel(editableDataSetArray0);
      int int0 = editableChartDataModel0.getDataSetNumber();
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      double[][] doubleArray0 = new double[3][6];
      double[] doubleArray1 = new double[4];
      String[] stringArray0 = new String[9];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray1, stringArray0);
      defaultChartDataModel0.getLastColumnValue();
      assertEquals(3, defaultChartDataModel0.getDataSetNumber());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      String[] stringArray0 = new String[9];
      double[] doubleArray0 = new double[6];
      double[][] doubleArray1 = new double[5][6];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray1, doubleArray0, stringArray0);
      defaultChartDataModel0.getValueAt(1, 1);
      assertEquals(5, defaultChartDataModel0.getDataSetNumber());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      Class class0 = editableChartDataModel0.getColumnClass();
      assertEquals("class java.lang.Double", class0.toString());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel();
      TreeSet treeSet0 = defaultChartDataModel0.getOrderedValues(2891);
      assertNull(treeSet0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      Object object0 = editableChartDataModel0.getColumnValueAt(0);
      assertNull(object0);
  }
}
