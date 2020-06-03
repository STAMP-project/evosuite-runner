/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 05 17:13:35 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.ContourPlot;
import jahuwaldt.plot.PlotRunList;
import java.awt.Color;
import java.text.NumberFormat;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ContourPlot_ESTest extends ContourPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[][] doubleArray0 = new double[9][3];
      double[] doubleArray1 = new double[3];
      doubleArray1[2] = 100.0;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[23];
      doubleArray2[2] = 1076.860688;
      doubleArray0[1] = doubleArray2;
      NumberFormat numberFormat0 = NumberFormat.getNumberInstance();
      ContourPlot contourPlot0 = new ContourPlot(doubleArray0, doubleArray0, doubleArray0, 221, false, ",", ",", "wMg\"p", numberFormat0, numberFormat0);
      Color color0 = new Color((-1104));
      Color color1 = new Color((-471));
      contourPlot0.colorizeContours(color0, color1);
      assertEquals(",", contourPlot0.getTitle());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[][] doubleArray0 = new double[5][2];
      double[][] doubleArray1 = new double[5][9];
      Locale locale0 = Locale.FRANCE;
      NumberFormat numberFormat0 = NumberFormat.getCurrencyInstance(locale0);
      ContourPlot contourPlot0 = null;
      try {
        contourPlot0 = new ContourPlot(doubleArray0, doubleArray0, doubleArray1, (-1), false, "G5i6|", "G5i6|", "k[iCljKH.x!M.H<;l", numberFormat0, numberFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Inconsistant array sizes.
         //
         verifyException("jahuwaldt.plot.ContourGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[][] doubleArray0 = new double[3][8];
      double[][] doubleArray1 = new double[0][0];
      NumberFormat numberFormat0 = NumberFormat.getCurrencyInstance();
      ContourPlot contourPlot0 = null;
      try {
        contourPlot0 = new ContourPlot(doubleArray0, doubleArray1, doubleArray0, 0, true, (String) null, "", (String) null, numberFormat0, numberFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Inconsistant array sizes.
         //
         verifyException("jahuwaldt.plot.ContourGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[][] doubleArray0 = new double[9][3];
      double[] doubleArray1 = new double[3];
      doubleArray1[2] = 100.0;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[8];
      doubleArray2[2] = 1076.860688;
      doubleArray0[1] = doubleArray2;
      NumberFormat numberFormat0 = NumberFormat.getInstance();
      ContourPlot contourPlot0 = new ContourPlot(doubleArray0, doubleArray0, doubleArray0, 128, false, "voILWD", "APBS exitValue: ", "APBS exitValue: ", numberFormat0, numberFormat0);
      // Undeclared exception!
      try { 
        contourPlot0.colorizeContours((Color) null, (Color) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.ContourPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[][] doubleArray0 = new double[9][3];
      double[] doubleArray1 = new double[3];
      doubleArray1[2] = 100.0;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[21];
      doubleArray2[2] = 1076.860688;
      doubleArray0[1] = doubleArray2;
      Color color0 = Color.getHSBColor((-988.0F), (-2287.0F), 1274.5015F);
      NumberFormat numberFormat0 = NumberFormat.getInstance();
      ContourPlot contourPlot0 = new ContourPlot(doubleArray0, doubleArray0, doubleArray0, 128, false, "xe*z", "APBS exitValue: ", "APBS exitValue: ", numberFormat0, numberFormat0);
      ContourPlot contourPlot1 = new ContourPlot();
      PlotRunList plotRunList0 = contourPlot1.getRuns();
      contourPlot0.setRuns(plotRunList0);
      // Undeclared exception!
      try { 
        contourPlot0.colorizeContours(color0, color0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 32, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[][] doubleArray0 = new double[4][3];
      ContourPlot contourPlot0 = new ContourPlot(doubleArray0, doubleArray0, doubleArray0, 2891, false, "4EIt8`a", "4EIt8`a", "4EIt8`a", (NumberFormat) null, (NumberFormat) null);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NumberFormat numberFormat0 = NumberFormat.getInstance();
      ContourPlot contourPlot0 = null;
      try {
        contourPlot0 = new ContourPlot((double[][]) null, (double[][]) null, (double[][]) null, (-2298), true, "Function data must be > 0 for logarithmic intervals.", "Function data must be > 0 for logarithmic intervals.", "Function data must be > 0 for logarithmic intervals.", numberFormat0, numberFormat0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.ContourGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[][] doubleArray0 = new double[4][3];
      ContourPlot contourPlot0 = null;
      try {
        contourPlot0 = new ContourPlot(doubleArray0, doubleArray0, doubleArray0, (-1410), false, "4EIt8`a", "4EIt8`a", "4EIt8`a", (NumberFormat) null, (NumberFormat) null);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.ContourGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[][] doubleArray0 = new double[0][7];
      ContourPlot contourPlot0 = null;
      try {
        contourPlot0 = new ContourPlot(doubleArray0, doubleArray0, doubleArray0, 0, true, "", (String) null, "", (NumberFormat) null, (NumberFormat) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jahuwaldt.plot.ContourGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[][] doubleArray0 = new double[9][3];
      double[] doubleArray1 = new double[3];
      doubleArray1[2] = 100.0;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[21];
      doubleArray2[2] = 1076.860688;
      doubleArray0[1] = doubleArray2;
      NumberFormat numberFormat0 = NumberFormat.getInstance();
      ContourPlot contourPlot0 = new ContourPlot(doubleArray0, doubleArray0, doubleArray0, 128, false, "xe*z", "APBS exitValue: ", "APBS exitValue: ", numberFormat0, numberFormat0);
      ContourPlot contourPlot1 = (ContourPlot)contourPlot0.clone();
      assertNotSame(contourPlot1, contourPlot0);
      assertEquals("xe*z", contourPlot1.getTitle());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ContourPlot contourPlot0 = new ContourPlot();
      // Undeclared exception!
      try { 
        contourPlot0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.SimplePlotXY", e);
      }
  }
}
