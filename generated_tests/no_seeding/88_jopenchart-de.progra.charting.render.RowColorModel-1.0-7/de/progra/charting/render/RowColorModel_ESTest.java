/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 21:18:32 GMT 2019
 */

package de.progra.charting.render;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.progra.charting.model.ChartDataModel;
import de.progra.charting.model.DataSet;
import de.progra.charting.model.DefaultChartDataModel;
import de.progra.charting.model.DefaultDataSet;
import de.progra.charting.model.EditableChartDataModel;
import de.progra.charting.model.ObjectChartDataModel;
import de.progra.charting.render.RowColorModel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RowColorModel_ESTest extends RowColorModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      RowColorModel rowColorModel0 = RowColorModel.getInstance(editableChartDataModel0);
      rowColorModel0.predefinedColorsIdx = 1816;
      Color color0 = rowColorModel0.getColor(585);
      assertEquals(1, color0.getTransparency());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RowColorModel rowColorModel0 = RowColorModel.getInstance((ChartDataModel) null);
      RectangularShape rectangularShape0 = rowColorModel0.getShape(1549);
      assertEquals(0.0, rectangularShape0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RowColorModel rowColorModel0 = RowColorModel.getInstance((ChartDataModel) null);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(4, 4, 4, 4);
      rectangle2D_Double0.add((double) 4, (-1311.0));
      rectangle2D_Double0.height = 0.0;
      rowColorModel0.setShape(4, rectangle2D_Double0);
      RectangularShape rectangularShape0 = rowColorModel0.getShape(4);
      assertEquals((-1311.0), rectangularShape0.getMaxY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      RowColorModel rowColorModel0 = RowColorModel.getInstance(objectChartDataModel0);
      int int0 = rowColorModel0.getRowCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[][] doubleArray0 = new double[1][7];
      double[] doubleArray1 = new double[3];
      String[] stringArray0 = new String[4];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray1, stringArray0);
      RowColorModel rowColorModel0 = RowColorModel.getInstance(defaultChartDataModel0);
      int int0 = rowColorModel0.getRowCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[][] doubleArray0 = new double[6][7];
      String[] stringArray0 = new String[7];
      stringArray0[4] = "de.progra.charting.render.RowColorModel";
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel(doubleArray0, doubleArray0[0], stringArray0);
      RowColorModel rowColorModel0 = new RowColorModel(editableChartDataModel0);
      String string0 = rowColorModel0.getRow(4);
      assertEquals("de.progra.charting.render.RowColorModel", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DataSet[] dataSetArray0 = new DataSet[1];
      DefaultDataSet defaultDataSet0 = new DefaultDataSet();
      dataSetArray0[0] = (DataSet) defaultDataSet0;
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel(dataSetArray0, dataSetArray0);
      RowColorModel rowColorModel0 = new RowColorModel(objectChartDataModel0);
      String string0 = rowColorModel0.getRow(0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      RowColorModel rowColorModel0 = RowColorModel.getInstance(editableChartDataModel0);
      rowColorModel0.customShapes = null;
      // Undeclared exception!
      try { 
        rowColorModel0.getShape(2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.render.RowColorModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      RowColorModel rowColorModel0 = new RowColorModel(objectChartDataModel0);
      // Undeclared exception!
      try { 
        rowColorModel0.getShape((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("de.progra.charting.render.RowColorModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RowColorModel rowColorModel0 = RowColorModel.getInstance((ChartDataModel) null);
      // Undeclared exception!
      try { 
        rowColorModel0.getRow(4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.render.RowColorModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      RowColorModel rowColorModel0 = new RowColorModel(editableChartDataModel0);
      // Undeclared exception!
      try { 
        rowColorModel0.getRow(1230);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1230, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      RowColorModel rowColorModel0 = new RowColorModel(objectChartDataModel0);
      // Undeclared exception!
      try { 
        rowColorModel0.getRow(2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("de.progra.charting.model.ObjectChartDataModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      RowColorModel rowColorModel0 = RowColorModel.getInstance(editableChartDataModel0);
      rowColorModel0.customColors = null;
      // Undeclared exception!
      try { 
        rowColorModel0.getColor(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.render.RowColorModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      RowColorModel rowColorModel0 = RowColorModel.getInstance(editableChartDataModel0);
      rowColorModel0.predefinedColorsIdx = (-34);
      // Undeclared exception!
      try { 
        rowColorModel0.getColor(640);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -34
         //
         verifyException("de.progra.charting.render.RowColorModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RowColorModel rowColorModel0 = RowColorModel.getInstance((ChartDataModel) null);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(4, 4, 4, 4);
      rowColorModel0.setShape(4, rectangle2D_Double0);
      RectangularShape rectangularShape0 = rowColorModel0.getShape(4);
      assertEquals(8.0, rectangularShape0.getMaxX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      RowColorModel rowColorModel0 = RowColorModel.getInstance(editableChartDataModel0);
      rowColorModel0.predefinedColorsIdx = 7;
      rowColorModel0.getColor(386);
      rowColorModel0.getColor(0);
      rowColorModel0.getColor(7);
      rowColorModel0.getColor(2);
      Color color0 = rowColorModel0.getColor(9);
      assertNotNull(color0);
      assertEquals(51, color0.getBlue());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      RowColorModel rowColorModel0 = RowColorModel.getInstance(editableChartDataModel0);
      Color color0 = rowColorModel0.getColor(0);
      assertNotNull(color0);
      assertEquals(0, color0.getGreen());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      RowColorModel rowColorModel0 = RowColorModel.getInstance((ChartDataModel) null);
      RowColorModel rowColorModel1 = RowColorModel.getInstance(editableChartDataModel0);
      assertNotSame(rowColorModel1, rowColorModel0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      RowColorModel rowColorModel0 = RowColorModel.getInstance(editableChartDataModel0);
      RowColorModel rowColorModel1 = RowColorModel.getInstance(editableChartDataModel0);
      rowColorModel1.customShapes = null;
      // Undeclared exception!
      try { 
        rowColorModel1.setShape(386, rowColorModel0.SQUARE_SHAPE);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.render.RowColorModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RowColorModel.getInstance((ChartDataModel) null);
      // Undeclared exception!
      try { 
        RowColorModel.getInstance((ChartDataModel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.render.RowColorModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      RowColorModel rowColorModel0 = RowColorModel.getInstance(editableChartDataModel0);
      Color color0 = Color.DARK_GRAY;
      rowColorModel0.setColor(7, color0);
      Color color1 = rowColorModel0.getColor(7);
      assertEquals(64, color1.getRed());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RowColorModel rowColorModel0 = RowColorModel.getInstance((ChartDataModel) null);
      BevelBorder bevelBorder0 = new BevelBorder(763);
      JMenuItem jMenuItem0 = new JMenuItem(">:0m");
      JScrollPane jScrollPane0 = new JScrollPane(jMenuItem0);
      Rectangle rectangle0 = bevelBorder0.getInteriorRectangle((Component) jScrollPane0, (-2386), 2211, (-1765), 2043);
      rowColorModel0.setShape(763, rectangle0);
      RectangularShape rectangularShape0 = rowColorModel0.getShape(763);
      assertEquals((-3268.5), rectangularShape0.getCenterX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RowColorModel rowColorModel0 = new RowColorModel((ChartDataModel) null);
      // Undeclared exception!
      try { 
        rowColorModel0.getRowCount();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.render.RowColorModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[][] doubleArray0 = new double[6][7];
      String[] stringArray0 = new String[7];
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel(doubleArray0, doubleArray0[0], stringArray0);
      RowColorModel rowColorModel0 = new RowColorModel(editableChartDataModel0);
      String string0 = rowColorModel0.getRow(4);
      assertNull(string0);
  }
}
