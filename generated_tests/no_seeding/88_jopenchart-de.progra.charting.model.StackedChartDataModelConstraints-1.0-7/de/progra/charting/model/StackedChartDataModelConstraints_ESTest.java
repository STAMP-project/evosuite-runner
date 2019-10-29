/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 21:21:12 GMT 2019
 */

package de.progra.charting.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.progra.charting.model.AbstractChartDataModel;
import de.progra.charting.model.DataSet;
import de.progra.charting.model.DefaultChartDataModel;
import de.progra.charting.model.DefaultDataSet;
import de.progra.charting.model.EditableChartDataModel;
import de.progra.charting.model.EditableDataSet;
import de.progra.charting.model.ObjectChartDataModel;
import de.progra.charting.model.StackedChartDataModelConstraints;
import java.util.NoSuchElementException;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StackedChartDataModelConstraints_ESTest extends StackedChartDataModelConstraints_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[][] doubleArray0 = new double[2][1];
      double[] doubleArray1 = new double[7];
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[9];
      doubleArray2[0] = 509.3635669682261;
      doubleArray0[1] = doubleArray2;
      String[] stringArray0 = new String[8];
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel(doubleArray0, doubleArray0, stringArray0);
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(objectChartDataModel0, 2, false);
      stackedChartDataModelConstraints0.getMinimumValue();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[][] doubleArray0 = new double[2][1];
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = (-806.524450348578);
      doubleArray0[0] = doubleArray1;
      doubleArray0[1] = doubleArray1;
      String[] stringArray0 = new String[8];
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel(doubleArray0, doubleArray0, stringArray0);
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(objectChartDataModel0, 2, false);
      stackedChartDataModelConstraints0.getMinimumValue();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[][] doubleArray0 = new double[2][6];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = (-4189.287);
      doubleArray0[0] = doubleArray1;
      doubleArray0[1] = doubleArray0[0];
      String[] stringArray0 = new String[5];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray1, stringArray0);
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(defaultChartDataModel0, 9967, false);
      stackedChartDataModelConstraints0.getMinimumValue();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int[][] intArray0 = new int[2][0];
      int[] intArray1 = new int[1];
      intArray1[0] = 2850;
      intArray0[0] = intArray1;
      intArray0[1] = intArray1;
      double[] doubleArray0 = new double[9];
      String[] stringArray0 = new String[2];
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel(intArray0, doubleArray0, stringArray0);
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(editableChartDataModel0, 2850);
      stackedChartDataModelConstraints0.getMaximumValue();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[][] intArray0 = new int[2][0];
      int[] intArray1 = new int[1];
      intArray0[0] = intArray1;
      intArray0[1] = intArray0[0];
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 2850;
      doubleArray0[1] = (double) 2850;
      doubleArray0[2] = (double) 2850;
      doubleArray0[3] = (double) 2850;
      doubleArray0[4] = 1.0;
      doubleArray0[5] = (double) 2850;
      doubleArray0[6] = (double) 2850;
      doubleArray0[7] = (double) 2850;
      doubleArray0[8] = (double) 2850;
      String[] stringArray0 = new String[2];
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel(intArray0, doubleArray0, stringArray0);
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(editableChartDataModel0, 2850);
      stackedChartDataModelConstraints0.getMinimumColumnValue();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[][] intArray0 = new int[1][8];
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) (-1);
      String[] stringArray0 = new String[1];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(intArray0, doubleArray0, stringArray0);
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(defaultChartDataModel0, (-730), false);
      stackedChartDataModelConstraints0.getMinimumColumnValue();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel();
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(defaultChartDataModel0, 0);
      // Undeclared exception!
      stackedChartDataModelConstraints0.getMinimumValue();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints((AbstractChartDataModel) null, 46);
      // Undeclared exception!
      try { 
        stackedChartDataModelConstraints0.getMinimumValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.model.StackedChartDataModelConstraints", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(editableChartDataModel0, 2, true);
      // Undeclared exception!
      try { 
        stackedChartDataModelConstraints0.getMinimumColumnValue();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints((AbstractChartDataModel) null, 9971, true);
      // Undeclared exception!
      try { 
        stackedChartDataModelConstraints0.getMinimumColumnValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.model.StackedChartDataModelConstraints", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel();
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(defaultChartDataModel0, 0);
      // Undeclared exception!
      stackedChartDataModelConstraints0.getMaximumValue();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints((AbstractChartDataModel) null, 661, false);
      // Undeclared exception!
      try { 
        stackedChartDataModelConstraints0.getMaximumValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel();
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(defaultChartDataModel0, 0);
      // Undeclared exception!
      try { 
        stackedChartDataModelConstraints0.getMaximumColumnValue();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints((AbstractChartDataModel) null, (-3380), true);
      // Undeclared exception!
      try { 
        stackedChartDataModelConstraints0.getMaximumColumnValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.model.StackedChartDataModelConstraints", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      objectChartDataModel0.autoscale = true;
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(objectChartDataModel0, Integer.MAX_VALUE, true);
      double double0 = stackedChartDataModelConstraints0.getMaximumColumnValue();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(objectChartDataModel0, Integer.MAX_VALUE, true);
      stackedChartDataModelConstraints0.allowManualColScale = true;
      objectChartDataModel0.manualscale = true;
      stackedChartDataModelConstraints0.allowManualColScale = false;
      double double0 = stackedChartDataModelConstraints0.getMaximumColumnValue();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(objectChartDataModel0, Integer.MAX_VALUE, true);
      objectChartDataModel0.manualscale = true;
      double double0 = stackedChartDataModelConstraints0.getMaximumColumnValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      objectChartDataModel0.autoscale = true;
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(objectChartDataModel0, Integer.MAX_VALUE, true);
      double double0 = stackedChartDataModelConstraints0.getMinimumColumnValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(objectChartDataModel0, Integer.MAX_VALUE, true);
      stackedChartDataModelConstraints0.allowManualColScale = true;
      objectChartDataModel0.manualscale = true;
      stackedChartDataModelConstraints0.allowManualColScale = false;
      double double0 = stackedChartDataModelConstraints0.getMinimumColumnValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int[][] intArray0 = new int[2][0];
      int[] intArray1 = new int[1];
      intArray1[0] = 2850;
      intArray0[0] = intArray1;
      intArray0[1] = intArray1;
      double[] doubleArray0 = new double[9];
      String[] stringArray0 = new String[2];
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel(intArray0, doubleArray0, stringArray0);
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(editableChartDataModel0, 2850);
      Number number0 = stackedChartDataModelConstraints0.getMinimumValue();
      assertEquals(0.0, number0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      DataSet[] dataSetArray0 = new DataSet[3];
      DefaultDataSet defaultDataSet0 = new DefaultDataSet(dataSetArray0, dataSetArray0, 1431);
      dataSetArray0[0] = (DataSet) defaultDataSet0;
      EditableDataSet editableDataSet0 = new EditableDataSet(9978);
      dataSetArray0[1] = (DataSet) editableDataSet0;
      dataSetArray0[2] = (DataSet) editableDataSet0;
      objectChartDataModel0.data = dataSetArray0;
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(objectChartDataModel0, Integer.MAX_VALUE, true);
      Number number0 = stackedChartDataModelConstraints0.getMinimumValue();
      assertEquals(0, number0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int[][] intArray0 = new int[2][0];
      int[] intArray1 = new int[1];
      intArray0[0] = intArray1;
      intArray0[1] = intArray0[0];
      double[] doubleArray0 = new double[9];
      String[] stringArray0 = new String[6];
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel(intArray0, doubleArray0, stringArray0);
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(editableChartDataModel0, 1000);
      Number number0 = stackedChartDataModelConstraints0.getMinimumValue();
      assertEquals(0, number0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Number[][] numberArray0 = new Number[3][5];
      Number[] numberArray1 = new Number[1];
      Integer integer0 = JLayeredPane.DRAG_LAYER;
      numberArray1[0] = (Number) integer0;
      numberArray0[0] = numberArray1;
      numberArray0[1] = numberArray0[0];
      Number[] numberArray2 = new Number[0];
      numberArray0[2] = numberArray2;
      double[] doubleArray0 = new double[8];
      String[] stringArray0 = new String[4];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(numberArray0, doubleArray0, stringArray0);
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(defaultChartDataModel0, (-390), false);
      Number number0 = stackedChartDataModelConstraints0.getMaximumValue();
      assertEquals(1, number0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      DataSet[] dataSetArray0 = new DataSet[3];
      DefaultDataSet defaultDataSet0 = new DefaultDataSet(dataSetArray0, dataSetArray0, 1431);
      dataSetArray0[0] = (DataSet) defaultDataSet0;
      EditableDataSet editableDataSet0 = new EditableDataSet(9978);
      dataSetArray0[1] = (DataSet) editableDataSet0;
      dataSetArray0[2] = (DataSet) editableDataSet0;
      objectChartDataModel0.data = dataSetArray0;
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(objectChartDataModel0, Integer.MAX_VALUE, true);
      Number number0 = stackedChartDataModelConstraints0.getMaximumValue();
      assertEquals(1, number0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int[][] intArray0 = new int[2][0];
      int[] intArray1 = new int[1];
      intArray0[0] = intArray1;
      intArray0[1] = intArray1;
      double[] doubleArray0 = new double[9];
      String[] stringArray0 = new String[6];
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel(intArray0, doubleArray0, stringArray0);
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(editableChartDataModel0, 1000);
      Number number0 = stackedChartDataModelConstraints0.getMaximumValue();
      assertEquals(4.9E-324, number0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(objectChartDataModel0, Integer.MAX_VALUE, true);
      objectChartDataModel0.manualscale = true;
      double double0 = stackedChartDataModelConstraints0.getMinimumColumnValue();
      assertEquals(0.0, double0, 0.01);
  }
}
