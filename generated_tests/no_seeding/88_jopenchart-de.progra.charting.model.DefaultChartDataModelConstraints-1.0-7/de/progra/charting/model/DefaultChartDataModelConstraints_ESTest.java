/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 21:19:14 GMT 2019
 */

package de.progra.charting.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.progra.charting.model.AbstractChartDataModel;
import de.progra.charting.model.DefaultChartDataModel;
import de.progra.charting.model.DefaultChartDataModelConstraints;
import de.progra.charting.model.EditableChartDataModel;
import de.progra.charting.model.ObjectChartDataModel;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultChartDataModelConstraints_ESTest extends DefaultChartDataModelConstraints_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[][] doubleArray0 = new double[1][6];
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (-1317.12);
      String[] stringArray0 = new String[1];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray1, stringArray0);
      DefaultChartDataModelConstraints defaultChartDataModelConstraints0 = new DefaultChartDataModelConstraints(defaultChartDataModel0, 0);
      defaultChartDataModel0.autoscale = true;
      double double0 = defaultChartDataModelConstraints0.getMaximumColumnValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[][] doubleArray0 = new double[1][6];
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (-1317.12);
      String[] stringArray0 = new String[1];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray1, stringArray0);
      DefaultChartDataModelConstraints defaultChartDataModelConstraints0 = new DefaultChartDataModelConstraints(defaultChartDataModel0, 0);
      defaultChartDataModel0.autoscale = true;
      double double0 = defaultChartDataModelConstraints0.getMinimumColumnValue();
      assertEquals((-2000.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[][] doubleArray0 = new double[1][7];
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = (-1317.12);
      doubleArray1[1] = (-0.3230482027243427);
      doubleArray0[0] = doubleArray1;
      String[] stringArray0 = new String[2];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray1, stringArray0);
      defaultChartDataModel0.setAutoScale(true);
      DefaultChartDataModelConstraints defaultChartDataModelConstraints0 = new DefaultChartDataModelConstraints(defaultChartDataModel0, 0);
      Number number0 = defaultChartDataModelConstraints0.getMinimumValue();
      assertEquals((-700.0), number0);
      assertNotNull(number0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[][] doubleArray0 = new double[1][6];
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (-1317.12);
      doubleArray0[0] = doubleArray1;
      String[] stringArray0 = new String[1];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray1, stringArray0);
      DefaultChartDataModelConstraints defaultChartDataModelConstraints0 = new DefaultChartDataModelConstraints(defaultChartDataModel0, 0);
      defaultChartDataModel0.autoscale = true;
      Number number0 = defaultChartDataModelConstraints0.getMinimumValue();
      assertNotNull(number0);
      assertEquals((-2000.0), number0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[][] doubleArray0 = new double[1][6];
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (-1317.12);
      doubleArray0[0] = doubleArray1;
      String[] stringArray0 = new String[1];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray1, stringArray0);
      DefaultChartDataModelConstraints defaultChartDataModelConstraints0 = new DefaultChartDataModelConstraints(defaultChartDataModel0, 0);
      defaultChartDataModel0.autoscale = true;
      Number number0 = defaultChartDataModelConstraints0.getMaximumValue();
      assertEquals(0.0, number0);
      assertNotNull(number0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[][] intArray0 = new int[1][4];
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 1;
      doubleArray0[1] = (double) 1;
      String[] stringArray0 = new String[6];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(intArray0, doubleArray0, stringArray0);
      DefaultChartDataModelConstraints defaultChartDataModelConstraints0 = new DefaultChartDataModelConstraints(defaultChartDataModel0, 2223, true);
      double double0 = defaultChartDataModelConstraints0.getMinimumColumnValue();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[][] doubleArray0 = new double[1][6];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = (-1317.12);
      String[] stringArray0 = new String[1];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray1, stringArray0);
      DefaultChartDataModelConstraints defaultChartDataModelConstraints0 = new DefaultChartDataModelConstraints(defaultChartDataModel0, 0);
      double double0 = defaultChartDataModelConstraints0.getMaximumColumnValue();
      assertEquals((-1317.12), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      DefaultChartDataModelConstraints defaultChartDataModelConstraints0 = new DefaultChartDataModelConstraints(objectChartDataModel0, 253);
      // Undeclared exception!
      try { 
        defaultChartDataModelConstraints0.getMinimumValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.model.DefaultChartDataModelConstraints", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      DefaultChartDataModelConstraints defaultChartDataModelConstraints0 = new DefaultChartDataModelConstraints(editableChartDataModel0, 1);
      // Undeclared exception!
      try { 
        defaultChartDataModelConstraints0.getMinimumColumnValue();
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
      DefaultChartDataModelConstraints defaultChartDataModelConstraints0 = new DefaultChartDataModelConstraints((AbstractChartDataModel) null, 0, true);
      // Undeclared exception!
      try { 
        defaultChartDataModelConstraints0.getMinimumColumnValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.model.DefaultChartDataModelConstraints", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      DefaultChartDataModelConstraints defaultChartDataModelConstraints0 = new DefaultChartDataModelConstraints(objectChartDataModel0, 252);
      // Undeclared exception!
      try { 
        defaultChartDataModelConstraints0.getMaximumValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.model.DefaultChartDataModelConstraints", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      DefaultChartDataModelConstraints defaultChartDataModelConstraints0 = new DefaultChartDataModelConstraints(editableChartDataModel0, 3);
      // Undeclared exception!
      try { 
        defaultChartDataModelConstraints0.getMaximumColumnValue();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultChartDataModelConstraints defaultChartDataModelConstraints0 = new DefaultChartDataModelConstraints((AbstractChartDataModel) null, 1411);
      // Undeclared exception!
      try { 
        defaultChartDataModelConstraints0.getMaximumColumnValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.model.DefaultChartDataModelConstraints", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[][] doubleArray0 = new double[1][6];
      double[] doubleArray1 = new double[6];
      String[] stringArray0 = new String[1];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray1, stringArray0);
      DefaultChartDataModelConstraints defaultChartDataModelConstraints0 = new DefaultChartDataModelConstraints(defaultChartDataModel0, 0);
      defaultChartDataModel0.autoscale = true;
      // Undeclared exception!
      defaultChartDataModelConstraints0.getMaximumColumnValue();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      objectChartDataModel0.manualscale = true;
      DefaultChartDataModelConstraints defaultChartDataModelConstraints0 = new DefaultChartDataModelConstraints(objectChartDataModel0, 252);
      defaultChartDataModelConstraints0.allowManualColScale = false;
      double double0 = defaultChartDataModelConstraints0.getMaximumColumnValue();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      objectChartDataModel0.manualscale = true;
      DefaultChartDataModelConstraints defaultChartDataModelConstraints0 = new DefaultChartDataModelConstraints(objectChartDataModel0, 252);
      double double0 = defaultChartDataModelConstraints0.getMaximumColumnValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[][] doubleArray0 = new double[1][6];
      double[] doubleArray1 = new double[6];
      String[] stringArray0 = new String[1];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray1, stringArray0);
      DefaultChartDataModelConstraints defaultChartDataModelConstraints0 = new DefaultChartDataModelConstraints(defaultChartDataModel0, 0);
      defaultChartDataModel0.autoscale = true;
      // Undeclared exception!
      defaultChartDataModelConstraints0.getMinimumColumnValue();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      objectChartDataModel0.manualscale = true;
      DefaultChartDataModelConstraints defaultChartDataModelConstraints0 = new DefaultChartDataModelConstraints(objectChartDataModel0, 253);
      defaultChartDataModelConstraints0.allowManualColScale = false;
      double double0 = defaultChartDataModelConstraints0.getMinimumColumnValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      objectChartDataModel0.manualscale = true;
      DefaultChartDataModelConstraints defaultChartDataModelConstraints0 = new DefaultChartDataModelConstraints(objectChartDataModel0, 253);
      double double0 = defaultChartDataModelConstraints0.getMinimumColumnValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[][] doubleArray0 = new double[1][6];
      double[] doubleArray1 = new double[1];
      String[] stringArray0 = new String[1];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray1, stringArray0);
      DefaultChartDataModelConstraints defaultChartDataModelConstraints0 = new DefaultChartDataModelConstraints(defaultChartDataModel0, 0);
      defaultChartDataModel0.autoscale = true;
      // Undeclared exception!
      defaultChartDataModelConstraints0.getMinimumValue();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[][] doubleArray0 = new double[1][6];
      double[] doubleArray1 = new double[6];
      String[] stringArray0 = new String[1];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray1, stringArray0);
      DefaultChartDataModelConstraints defaultChartDataModelConstraints0 = new DefaultChartDataModelConstraints(defaultChartDataModel0, 0);
      defaultChartDataModel0.manualscale = true;
      Number number0 = defaultChartDataModelConstraints0.getMinimumValue();
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      DefaultChartDataModelConstraints defaultChartDataModelConstraints0 = new DefaultChartDataModelConstraints(objectChartDataModel0, 0);
      Number number0 = defaultChartDataModelConstraints0.getMinimumValue();
      assertEquals(0, number0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[][] doubleArray0 = new double[1][6];
      double[] doubleArray1 = new double[1];
      String[] stringArray0 = new String[1];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray1, stringArray0);
      DefaultChartDataModelConstraints defaultChartDataModelConstraints0 = new DefaultChartDataModelConstraints(defaultChartDataModel0, 0);
      Number number0 = defaultChartDataModelConstraints0.getMinimumValue();
      assertEquals(0.0, number0);
      assertNotNull(number0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[][] doubleArray0 = new double[1][6];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = (-1317.12);
      doubleArray0[0] = doubleArray1;
      String[] stringArray0 = new String[1];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray1, stringArray0);
      DefaultChartDataModelConstraints defaultChartDataModelConstraints0 = new DefaultChartDataModelConstraints(defaultChartDataModel0, 0);
      defaultChartDataModel0.autoscale = true;
      Number number0 = defaultChartDataModelConstraints0.getMaximumValue();
      assertNotNull(number0);
      assertEquals((-2000.0), number0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[][] doubleArray0 = new double[1][6];
      double[] doubleArray1 = new double[1];
      String[] stringArray0 = new String[1];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray1, stringArray0);
      DefaultChartDataModelConstraints defaultChartDataModelConstraints0 = new DefaultChartDataModelConstraints(defaultChartDataModel0, 0);
      defaultChartDataModel0.autoscale = true;
      // Undeclared exception!
      defaultChartDataModelConstraints0.getMaximumValue();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[][] doubleArray0 = new double[1][6];
      double[] doubleArray1 = new double[6];
      String[] stringArray0 = new String[1];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray1, stringArray0);
      DefaultChartDataModelConstraints defaultChartDataModelConstraints0 = new DefaultChartDataModelConstraints(defaultChartDataModel0, 0);
      defaultChartDataModel0.manualscale = true;
      Number number0 = defaultChartDataModelConstraints0.getMaximumValue();
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      DefaultChartDataModelConstraints defaultChartDataModelConstraints0 = new DefaultChartDataModelConstraints(objectChartDataModel0, 1);
      Number number0 = defaultChartDataModelConstraints0.getMaximumValue();
      assertEquals(1, number0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[][] doubleArray0 = new double[1][6];
      double[] doubleArray1 = new double[1];
      String[] stringArray0 = new String[1];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray1, stringArray0);
      DefaultChartDataModelConstraints defaultChartDataModelConstraints0 = new DefaultChartDataModelConstraints(defaultChartDataModel0, 0);
      Number number0 = defaultChartDataModelConstraints0.getMaximumValue();
      assertEquals(0.0, number0);
      assertNotNull(number0);
  }
}
