/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 17:34:12 GMT 2019
 */

package de.progra.charting;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.progra.charting.Axis;
import de.progra.charting.model.AbstractChartDataModel;
import de.progra.charting.model.ChartDataModelConstraints;
import de.progra.charting.model.DefaultChartDataModel;
import de.progra.charting.model.DefaultChartDataModelConstraints;
import de.progra.charting.model.EditableChartDataModel;
import de.progra.charting.model.ObjectChartDataModel;
import de.progra.charting.model.StackedChartDataModelConstraints;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Axis_ESTest extends Axis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[][] intArray0 = new int[4][2];
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) Integer.MIN_VALUE;
      String[] stringArray0 = new String[6];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(intArray0, doubleArray0, stringArray0);
      ChartDataModelConstraints chartDataModelConstraints0 = defaultChartDataModel0.getChartDataModelConstraints((-751));
      Axis axis0 = new Axis(4, chartDataModelConstraints0);
      double double0 = axis0.getPixelForValue((-2.147483648E9));
      assertEquals(Integer.MAX_VALUE, axis0.getLength());
      assertEquals(0.0, double0, 0.01);
      assertEquals(1, axis0.getAlignment());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[][] intArray0 = new int[3][9];
      int[] intArray1 = new int[2];
      intArray0[0] = intArray1;
      int[] intArray2 = new int[6];
      intArray2[1] = Integer.MIN_VALUE;
      intArray0[2] = intArray2;
      String[] stringArray0 = new String[3];
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel(intArray0, intArray0, stringArray0);
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(objectChartDataModel0, 2);
      Axis axis0 = new Axis(2, stackedChartDataModelConstraints0);
      double double0 = axis0.getPixelForValue(0.0);
      assertEquals(2.147483647E9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      DefaultChartDataModelConstraints defaultChartDataModelConstraints0 = new DefaultChartDataModelConstraints(objectChartDataModel0, 4);
      Axis axis0 = new Axis(1000, defaultChartDataModelConstraints0);
      double double0 = axis0.getPointToPixelRatio();
      assertEquals(4.656612875245797E-10, double0, 0.01);
      assertEquals(1, axis0.getAlignment());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      DefaultChartDataModelConstraints defaultChartDataModelConstraints0 = new DefaultChartDataModelConstraints(objectChartDataModel0, 4);
      Axis axis0 = new Axis(1000, defaultChartDataModelConstraints0);
      axis0.setLength((-630));
      double double0 = axis0.getPointToPixelRatio();
      assertEquals((-630), axis0.getLength());
      assertEquals((-0.0015873015873015873), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      DefaultChartDataModelConstraints defaultChartDataModelConstraints0 = new DefaultChartDataModelConstraints(objectChartDataModel0, 4);
      Axis axis0 = new Axis(1000, defaultChartDataModelConstraints0);
      double double0 = axis0.getPixelForValue(0.0);
      assertEquals(1, axis0.getAlignment());
      assertEquals(0.0, double0, 0.01);
      assertEquals(Integer.MAX_VALUE, axis0.getLength());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      DefaultChartDataModelConstraints defaultChartDataModelConstraints0 = new DefaultChartDataModelConstraints(objectChartDataModel0, 4);
      Axis axis0 = new Axis(1000, defaultChartDataModelConstraints0);
      double double0 = axis0.getPixelForValue(5179.269);
      assertEquals(1.1122395480914043E13, double0, 0.01);
      assertEquals(1, axis0.getAlignment());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints((AbstractChartDataModel) null, 0, false);
      Axis axis0 = new Axis(0, stackedChartDataModelConstraints0);
      assertEquals(Integer.MAX_VALUE, axis0.getLength());
      
      axis0.setLength(0);
      int int0 = axis0.getLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      DefaultChartDataModelConstraints defaultChartDataModelConstraints0 = new DefaultChartDataModelConstraints(objectChartDataModel0, 4);
      Axis axis0 = new Axis(1000, defaultChartDataModelConstraints0);
      axis0.setLength((-630));
      int int0 = axis0.getLength();
      assertEquals((-630), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel();
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(defaultChartDataModel0, 103);
      Axis axis0 = new Axis(2, stackedChartDataModelConstraints0);
      // Undeclared exception!
      axis0.getPointToPixelRatio();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(editableChartDataModel0, (-4303));
      Axis axis0 = new Axis((-4303), stackedChartDataModelConstraints0);
      // Undeclared exception!
      try { 
        axis0.getPointToPixelRatio();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Axis axis0 = new Axis((-815), (ChartDataModelConstraints) null);
      // Undeclared exception!
      try { 
        axis0.getPointToPixelRatio();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(editableChartDataModel0, 2, true);
      Axis axis0 = new Axis(2, stackedChartDataModelConstraints0);
      // Undeclared exception!
      axis0.getPixelForValue(2);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel();
      ChartDataModelConstraints chartDataModelConstraints0 = defaultChartDataModel0.getChartDataModelConstraints((-1981));
      Axis axis0 = new Axis((-1981), chartDataModelConstraints0);
      // Undeclared exception!
      try { 
        axis0.getPixelForValue((-1981));
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
      Axis axis0 = new Axis((-815), (ChartDataModelConstraints) null);
      // Undeclared exception!
      try { 
        axis0.getPixelForValue((-815));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int[][] intArray0 = new int[4][2];
      double[] doubleArray0 = new double[3];
      String[] stringArray0 = new String[6];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(intArray0, doubleArray0, stringArray0);
      ChartDataModelConstraints chartDataModelConstraints0 = defaultChartDataModel0.getChartDataModelConstraints((-751));
      Axis axis0 = new Axis(4, chartDataModelConstraints0);
      double double0 = axis0.getPointToPixelRatio();
      assertEquals(1, axis0.getAlignment());
      assertEquals(0.0, double0, 0.01);
      assertEquals(Integer.MAX_VALUE, axis0.getLength());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int[][] intArray0 = new int[4][2];
      double[] doubleArray0 = new double[3];
      String[] stringArray0 = new String[6];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(intArray0, doubleArray0, stringArray0);
      ChartDataModelConstraints chartDataModelConstraints0 = defaultChartDataModel0.getChartDataModelConstraints((-751));
      Axis axis0 = new Axis(4, chartDataModelConstraints0);
      int int0 = axis0.getAlignment();
      assertEquals(1, int0);
      assertEquals(Integer.MAX_VALUE, axis0.getLength());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int[][] intArray0 = new int[3][9];
      String[] stringArray0 = new String[3];
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel(intArray0, intArray0, stringArray0);
      StackedChartDataModelConstraints stackedChartDataModelConstraints0 = new StackedChartDataModelConstraints(objectChartDataModel0, 2);
      Axis axis0 = new Axis(2, stackedChartDataModelConstraints0);
      double double0 = axis0.getPixelForValue(0.0);
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(Integer.MAX_VALUE, axis0.getLength());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int[][] intArray0 = new int[4][2];
      double[] doubleArray0 = new double[3];
      String[] stringArray0 = new String[6];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(intArray0, doubleArray0, stringArray0);
      ChartDataModelConstraints chartDataModelConstraints0 = defaultChartDataModel0.getChartDataModelConstraints((-751));
      Axis axis0 = new Axis(4, chartDataModelConstraints0);
      double double0 = axis0.getPixelForValue((-2.147483648E9));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
      assertEquals(Integer.MAX_VALUE, axis0.getLength());
      assertEquals(1, axis0.getAlignment());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Axis axis0 = new Axis(1, (ChartDataModelConstraints) null);
      assertEquals(Integer.MAX_VALUE, axis0.getLength());
      assertEquals(1, axis0.getAlignment());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      DefaultChartDataModelConstraints defaultChartDataModelConstraints0 = new DefaultChartDataModelConstraints(objectChartDataModel0, 4);
      Axis axis0 = new Axis(1000, defaultChartDataModelConstraints0);
      int int0 = axis0.getLength();
      assertEquals(Integer.MAX_VALUE, int0);
      assertEquals(1, axis0.getAlignment());
  }
}
