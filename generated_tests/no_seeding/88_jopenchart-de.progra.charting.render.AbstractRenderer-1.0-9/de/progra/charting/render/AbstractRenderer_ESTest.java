/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 23:19:22 GMT 2019
 */

package de.progra.charting.render;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.progra.charting.DefaultChart;
import de.progra.charting.Legend;
import de.progra.charting.model.ObjectChartDataModel;
import de.progra.charting.render.RowColorModel;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.table.JTableHeader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractRenderer_ESTest extends AbstractRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[][] doubleArray0 = new double[7][6];
      String[] stringArray0 = new String[8];
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel(doubleArray0, doubleArray0, stringArray0);
      DefaultChart defaultChart0 = new DefaultChart(objectChartDataModel0, "** Calculating values ", Integer.MAX_VALUE);
      defaultChart0.getBounds();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[][] doubleArray0 = new double[1][3];
      String[] stringArray0 = new String[1];
      stringArray0[0] = "WU4zCbs9_ #OT!Aeb";
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel(doubleArray0, doubleArray0, stringArray0);
      RowColorModel rowColorModel0 = RowColorModel.getInstance(objectChartDataModel0);
      rowColorModel0.predefinedColorsIdx = (-473);
      Legend legend0 = new Legend(rowColorModel0);
      // Undeclared exception!
      try { 
        legend0.render((Graphics2D) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -473
         //
         verifyException("de.progra.charting.render.RowColorModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Legend legend0 = new Legend();
      // Undeclared exception!
      try { 
        legend0.paintDefault((Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.Legend", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Legend legend0 = new Legend();
      legend0.getBounds();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double[][] doubleArray0 = new double[1][3];
      String[] stringArray0 = new String[7];
      stringArray0[0] = "WU4zCs9_ #OT!Ab";
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel(doubleArray0, doubleArray0, stringArray0);
      RowColorModel rowColorModel0 = RowColorModel.getInstance(objectChartDataModel0);
      Legend legend0 = new Legend(rowColorModel0);
      JTableHeader jTableHeader0 = new JTableHeader();
      Rectangle rectangle0 = jTableHeader0.getHeaderRect(1379);
      rectangle0.x = 2135748764;
      rectangle0.add(rowColorModel0.SQUARE_SHAPE);
      legend0.setBounds(rectangle0);
      // Undeclared exception!
      try { 
        legend0.render((Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.render.AbstractRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double[][] doubleArray0 = new double[1][3];
      String[] stringArray0 = new String[7];
      stringArray0[0] = "WU4zCs9_ #OT!Ab";
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel(doubleArray0, doubleArray0, stringArray0);
      RowColorModel rowColorModel0 = RowColorModel.getInstance(objectChartDataModel0);
      Legend legend0 = new Legend(rowColorModel0);
      JTableHeader jTableHeader0 = new JTableHeader();
      Rectangle rectangle0 = jTableHeader0.getHeaderRect(1379);
      legend0.setBounds(rectangle0);
      // Undeclared exception!
      try { 
        legend0.render((Graphics2D) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Width (0) and height (0) must be non-zero
         //
         verifyException("java.awt.image.ReplicateScaleFilter", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      double[][] doubleArray0 = new double[1][3];
      String[] stringArray0 = new String[7];
      stringArray0[0] = "WU4zCs9_ #OT!Ab";
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel(doubleArray0, doubleArray0, stringArray0);
      RowColorModel rowColorModel0 = RowColorModel.getInstance(objectChartDataModel0);
      Legend legend0 = new Legend(rowColorModel0);
      // Undeclared exception!
      try { 
        legend0.render((Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.render.AbstractRenderer", e);
      }
  }
}
