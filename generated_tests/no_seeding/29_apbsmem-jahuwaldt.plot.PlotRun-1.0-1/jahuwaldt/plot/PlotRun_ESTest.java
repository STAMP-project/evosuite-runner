/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 13:18:44 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.BoxULSymbol;
import jahuwaldt.plot.BoxURSymbol;
import jahuwaldt.plot.PlotDatum;
import jahuwaldt.plot.PlotRun;
import jahuwaldt.plot.TabLSymbol;
import jahuwaldt.plot.TabRSymbol;
import jahuwaldt.plot.ThinRect2Symbol;
import jahuwaldt.plot.Triangle2Symbol;
import jahuwaldt.plot.Triangle3Symbol;
import jahuwaldt.plot.XSymbol;
import java.awt.Color;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;
import javax.swing.JLayeredPane;
import javax.swing.JToolBar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PlotRun_ESTest extends PlotRun_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      BoxURSymbol boxURSymbol0 = new BoxURSymbol();
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, false, boxURSymbol0);
      PlotRun plotRun1 = (PlotRun)plotRun0.clone();
      assertEquals(3, plotRun1.size());
      assertEquals(3, plotRun0.size());
      assertNotSame(plotRun1, plotRun0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PlotDatum[] plotDatumArray0 = new PlotDatum[3];
      XSymbol xSymbol0 = new XSymbol();
      PlotDatum plotDatum0 = new PlotDatum((-4118.3213), 0.0, true, xSymbol0);
      PlotRun plotRun0 = new PlotRun(plotDatumArray0);
      plotRun0.add(0, (Object) plotDatum0);
      assertEquals(4, plotRun0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      int int0 = plotRun0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PlotDatum[] plotDatumArray0 = new PlotDatum[1];
      PlotRun plotRun0 = new PlotRun(plotDatumArray0);
      int int0 = plotRun0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PlotDatum[] plotDatumArray0 = new PlotDatum[2];
      PlotRun plotRun0 = new PlotRun(plotDatumArray0);
      plotRun0.remove(0);
      assertEquals(1, plotRun0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = (-2980.86751);
      BoxURSymbol boxURSymbol0 = new BoxURSymbol();
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, false, boxURSymbol0);
      double double0 = plotRun0.getMinY();
      assertEquals((-2980.86751), double0, 0.01);
      assertEquals(3, plotRun0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = (-2980.86751);
      BoxURSymbol boxURSymbol0 = new BoxURSymbol();
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, false, boxURSymbol0);
      double double0 = plotRun0.getMinX();
      assertEquals((-2980.86751), double0, 0.01);
      assertEquals(3, plotRun0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PlotDatum[] plotDatumArray0 = new PlotDatum[9];
      PlotDatum plotDatum0 = new PlotDatum(0.0, 0.0, true);
      plotDatumArray0[0] = plotDatum0;
      PlotRun plotRun0 = new PlotRun(plotDatumArray0);
      Object object0 = plotRun0.get(0);
      assertEquals(9, plotRun0.size());
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      // Undeclared exception!
      try { 
        plotRun0.set(7, (Object) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 7, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      Integer integer0 = JLayeredPane.DEFAULT_LAYER;
      // Undeclared exception!
      try { 
        plotRun0.set(27, integer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to jahuwaldt.plot.PlotDatum
         //
         verifyException("jahuwaldt.plot.PlotRun", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      // Undeclared exception!
      try { 
        plotRun0.remove(43);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 43, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      // Undeclared exception!
      try { 
        plotRun0.remove((-2727));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PlotDatum[] plotDatumArray0 = new PlotDatum[1];
      PlotRun plotRun0 = new PlotRun(plotDatumArray0);
      // Undeclared exception!
      try { 
        plotRun0.getMinY();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PlotRun", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PlotDatum[] plotDatumArray0 = new PlotDatum[2];
      PlotRun plotRun0 = new PlotRun(plotDatumArray0);
      // Undeclared exception!
      try { 
        plotRun0.getMinX();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PlotRun", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PlotDatum[] plotDatumArray0 = new PlotDatum[1];
      PlotRun plotRun0 = new PlotRun(plotDatumArray0);
      // Undeclared exception!
      try { 
        plotRun0.getMaxY();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PlotRun", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PlotDatum[] plotDatumArray0 = new PlotDatum[2];
      PlotRun plotRun0 = new PlotRun(plotDatumArray0);
      // Undeclared exception!
      try { 
        plotRun0.getMaxX();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PlotRun", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      // Undeclared exception!
      try { 
        plotRun0.get(4433);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 4433, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      JToolBar.Separator jToolBar_Separator0 = new JToolBar.Separator();
      // Undeclared exception!
      try { 
        plotRun0.add(577, (Object) jToolBar_Separator0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // javax.swing.JToolBar$Separator cannot be cast to jahuwaldt.plot.PlotDatum
         //
         verifyException("jahuwaldt.plot.PlotRun", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PlotRun plotRun0 = null;
      try {
        plotRun0 = new PlotRun((PlotDatum[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      Iterator iterator0 = plotRun0.iterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      XSymbol xSymbol0 = new XSymbol();
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, false, xSymbol0);
      plotRun0.setLineColor((Color) null);
      assertEquals(1, plotRun0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      XSymbol xSymbol0 = new XSymbol();
      ThinRect2Symbol thinRect2Symbol0 = new ThinRect2Symbol();
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, false, thinRect2Symbol0);
      plotRun0.setPlotSymbol(xSymbol0);
      assertEquals(1, plotRun0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Stack<PlotDatum> stack0 = new Stack<PlotDatum>();
      PlotRun plotRun0 = new PlotRun(stack0);
      double double0 = plotRun0.getMaxY();
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      BoxULSymbol boxULSymbol0 = new BoxULSymbol();
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, false, boxULSymbol0);
      double double0 = plotRun0.getMinY();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PlotDatum[] plotDatumArray0 = new PlotDatum[0];
      PlotRun plotRun0 = new PlotRun(plotDatumArray0);
      double double0 = plotRun0.getMinY();
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      BoxURSymbol boxURSymbol0 = new BoxURSymbol();
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, false, boxURSymbol0);
      double double0 = plotRun0.getMaxX();
      assertEquals(4.9E-324, double0, 0.01);
      assertEquals(3, plotRun0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      BoxURSymbol boxURSymbol0 = new BoxURSymbol();
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, false, boxURSymbol0);
      double double0 = plotRun0.getMinX();
      assertEquals(3, plotRun0.size());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      double double0 = plotRun0.getMinX();
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Stack<PlotDatum> stack0 = new Stack<PlotDatum>();
      PlotDatum plotDatum0 = new PlotDatum((-1555.52517), (-1555.52517), true);
      stack0.add(plotDatum0);
      PlotRun plotRun0 = new PlotRun(stack0);
      double double0 = plotRun0.getMaxY();
      assertEquals(4.9E-324, double0, 0.01);
      assertEquals(1, plotRun0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Set<String> set0 = Calendar.getAvailableCalendarTypes();
      PlotRun plotRun0 = new PlotRun(set0);
      assertEquals(0, plotRun0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PlotRun plotRun0 = null;
      try {
        plotRun0 = new PlotRun((Collection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PlotRun", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[2];
      TabRSymbol tabRSymbol0 = new TabRSymbol();
      PlotRun plotRun0 = null;
      try {
        plotRun0 = new PlotRun(doubleArray0, doubleArray1, false, tabRSymbol0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PlotRun", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      Triangle3Symbol triangle3Symbol0 = new Triangle3Symbol();
      PlotRun plotRun0 = null;
      try {
        plotRun0 = new PlotRun(doubleArray0, (double[]) null, true, triangle3Symbol0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PlotRun", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TabLSymbol tabLSymbol0 = new TabLSymbol();
      PlotRun plotRun0 = null;
      try {
        plotRun0 = new PlotRun((double[]) null, (double[]) null, true, tabLSymbol0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PlotRun", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PlotDatum[] plotDatumArray0 = new PlotDatum[1];
      PlotRun plotRun0 = new PlotRun(plotDatumArray0);
      // Undeclared exception!
      try { 
        plotRun0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PlotRun", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      plotRun0.clear();
      assertEquals(0, plotRun0.size());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      Triangle2Symbol triangle2Symbol0 = new Triangle2Symbol();
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, true, triangle2Symbol0);
      PlotRun plotRun1 = new PlotRun(plotRun0);
      assertEquals(9, plotRun1.size());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      Triangle2Symbol triangle2Symbol0 = new Triangle2Symbol();
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, true, triangle2Symbol0);
      Object object0 = plotRun0.remove(0);
      plotRun0.set(0, object0);
      assertEquals(8, plotRun0.size());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      // Undeclared exception!
      try { 
        plotRun0.add(670, (Object) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 670, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      // Undeclared exception!
      try { 
        plotRun0.get((-1127));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      // Undeclared exception!
      try { 
        plotRun0.set((-607), (Object) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
