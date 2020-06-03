/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 04 13:37:02 GMT 2019
 */

package de.progra.charting;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.progra.charting.DefaultChart;
import de.progra.charting.model.ChartDataModel;
import de.progra.charting.model.DefaultChartDataModel;
import de.progra.charting.model.ObjectChartDataModel;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultChart_ESTest extends DefaultChart_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Number[][] numberArray0 = new Number[0][5];
      Object[] objectArray0 = new Object[4];
      String[] stringArray0 = new String[1];
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel(numberArray0, objectArray0, stringArray0);
      DefaultChart defaultChart0 = null;
      try {
        defaultChart0 = new DefaultChart(objectChartDataModel0, "Mj%<hngC", (-1380), "", "Mj%<hngC");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.DefaultChart", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel();
      DefaultChart defaultChart0 = new DefaultChart(defaultChartDataModel0, "de.progra.charting.test.ImageFilter");
      assertEquals(1, DefaultChart.NO_COORDINATE_SYSTEM);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart();
      Border border0 = LineBorder.createGrayLineBorder();
      Rectangle rectangle0 = AbstractBorder.getInteriorRectangle((Component) null, border0, (-379), (-1), 0, 1);
      defaultChart0.setBounds(rectangle0);
      // Undeclared exception!
      try { 
        defaultChart0.render((Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.DefaultChart", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DefaultChart defaultChart0 = null;
      try {
        defaultChart0 = new DefaultChart((ChartDataModel) null, " %{##C{I", 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.CoordSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DefaultChart defaultChart0 = null;
      try {
        defaultChart0 = new DefaultChart((ChartDataModel) null, "B2*Mf=", 15, "B2*Mf=", "B2*Mf=");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.DefaultChart", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel();
      DefaultChart defaultChart0 = new DefaultChart(defaultChartDataModel0, "", 0);
      Dimension dimension0 = defaultChart0.getPreferredSize();
      assertNull(dimension0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel();
      DefaultChart defaultChart0 = new DefaultChart(defaultChartDataModel0, "", 0, "b8$B'!M.", "jhYXSC#t)mJz?TFX!");
      assertEquals(0, DefaultChart.LINEAR_X_LINEAR_Y);
  }
}
