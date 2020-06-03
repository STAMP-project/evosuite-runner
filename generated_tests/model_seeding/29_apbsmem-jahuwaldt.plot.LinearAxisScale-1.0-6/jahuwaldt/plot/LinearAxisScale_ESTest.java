/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 05 15:34:37 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.AxisLimitData;
import jahuwaldt.plot.LinearAxisScale;
import jahuwaldt.plot.PlotDatum;
import jahuwaldt.plot.PlotSymbol;
import jahuwaldt.plot.TabDSymbol;
import java.awt.HeadlessException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LinearAxisScale_ESTest extends LinearAxisScale_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      // Undeclared exception!
      try { 
        linearAxisScale0.calcTickMarks(971.1, 971.1, 0.0, 0.0, 2.0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.LinearAxisScale", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      // Undeclared exception!
      linearAxisScale0.findGoodLimits(1900.968, (-1229.14044026));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      linearAxisScale0.calcTickMarks(4254.364196049, (-2317.0), 10.0, (-2317.0), 0.0);
      linearAxisScale0.func(0.0);
      double double0 = (-541.864173);
      TabDSymbol tabDSymbol0 = new TabDSymbol();
      PlotDatum plotDatum0 = new PlotDatum((-541.864173), (-1689.2257849513), true, tabDSymbol0);
      plotDatum0.connected();
      JFrame jFrame0 = null;
      try {
        jFrame0 = new JFrame("%");
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      TabDSymbol tabDSymbol0 = new TabDSymbol();
      PlotDatum plotDatum0 = new PlotDatum((-541.864173), (-1689.2257849513), true, tabDSymbol0);
      plotDatum0.connected();
      plotDatum0.hasErrorBar();
      plotDatum0.getYError();
      tabDSymbol0.generatePoints((-1512), (-1205));
      plotDatum0.getLineColor();
      plotDatum0.getLineColor();
      plotDatum0.getPlotSymbol();
      AxisLimitData axisLimitData0 = new AxisLimitData();
      axisLimitData0.quantum = 0.4035;
      linearAxisScale0.adjustForErrorBars(plotDatum0, (-805.622614406141), (-1689.2257849513), axisLimitData0);
      linearAxisScale0.lowerBounds();
      // Undeclared exception!
      linearAxisScale0.findGoodLimits(100.0, 10.0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      linearAxisScale0.findGoodLimits(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      linearAxisScale0.findGoodLimits(0.0, 5.0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      linearAxisScale0.upperBounds();
      linearAxisScale0.lowerBounds();
      linearAxisScale0.findGoodLimits((-843.853325), (-409.5339));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      linearAxisScale0.findGoodLimits((-2.282449880000001E275), (-2.282449880000001E275));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      linearAxisScale0.calcTickMarks((-1138.2509482183782), 1.0E-6, 1.0E-6, 1890.612034, 1890.612034);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      linearAxisScale0.lowerBounds();
      AxisLimitData axisLimitData0 = linearAxisScale0.findGoodLimits((-1.0), 0.0);
      axisLimitData0.quantum = (-608.878723);
      TabDSymbol tabDSymbol0 = new TabDSymbol();
      PlotDatum plotDatum0 = new PlotDatum((-541.864173), (-0.6000000000000001), false, tabDSymbol0);
      plotDatum0.connected();
      plotDatum0.setX((-541.864173));
      plotDatum0.hasErrorBar();
      plotDatum0.setY(1.0);
      plotDatum0.getYError();
      plotDatum0.getLineColor();
      plotDatum0.getLineColor();
      plotDatum0.getPlotSymbol();
      linearAxisScale0.adjustForErrorBars(plotDatum0, 1.0, 1095.0, axisLimitData0);
      linearAxisScale0.upperBounds();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      double double0 = 0.0;
      linearAxisScale0.findGoodLimits(0.0, 3376.050550182);
      double double1 = 2.0;
      double double2 = (-3331.80825916362);
      double double3 = 2647.575655729;
      double double4 = (-3013.77873565);
      // Undeclared exception!
      linearAxisScale0.findGoodLimits(0.0, (-1407.345564571));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      double double0 = (-1.0);
      // Undeclared exception!
      try { 
        linearAxisScale0.calcTickMarks((-1.0), 0.0, 4488.653225428959, (-3404.1102287068), (-1.0));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.LinearAxisScale", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      PlotDatum plotDatum0 = new PlotDatum((-1.0), 0.0, false);
      plotDatum0.setPlotSymbol((PlotSymbol) null);
      AxisLimitData axisLimitData0 = new AxisLimitData();
      linearAxisScale0.adjustForErrorBars(plotDatum0, (-1.0), (-1.0), axisLimitData0);
      linearAxisScale0.findGoodLimits((-926.4), (-926.4));
      linearAxisScale0.upperBounds();
      double double0 = 2.0;
      // Undeclared exception!
      linearAxisScale0.findGoodLimits(2.0, (-926.4));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      linearAxisScale0.findGoodLimits((-613.7), 0.0);
      linearAxisScale0.calcTickMarks(748.0900525974416, (-4187.1), 2.0, 0.0, 567.0802);
      linearAxisScale0.findGoodLimits(4681.022240555, 4681.022240555);
      AxisLimitData axisLimitData0 = linearAxisScale0.findGoodLimits(1.0E-6, 300.0);
      PlotDatum plotDatum0 = new PlotDatum((-1.0), 0.0, false);
      plotDatum0.setPlotSymbol((PlotSymbol) null);
      linearAxisScale0.calcTickMarks(0.0, (-1.0), 300.0, 4681.022240555, 0.0);
      plotDatum0.y = 17.6998;
      linearAxisScale0.adjustForErrorBars(plotDatum0, 0.0, 300.0, axisLimitData0);
      AxisLimitData axisLimitData1 = new AxisLimitData();
      axisLimitData1.lb = 1.0E-6;
      linearAxisScale0.adjustForErrorBars(plotDatum0, 748.0900525974416, (-1.0), axisLimitData1);
      linearAxisScale0.upperBounds();
      linearAxisScale0.lowerBounds();
      linearAxisScale0.findGoodLimits((-1.0), 2.0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      linearAxisScale0.calcTickMarks(0.0, (-3715.07475924948), 40.0, 40.0, (-3715.07475924948));
      linearAxisScale0.upperBounds();
      AxisLimitData axisLimitData0 = new AxisLimitData();
      // Undeclared exception!
      try { 
        linearAxisScale0.adjustForErrorBars((PlotDatum) null, (-3402.23), (-3715.07475924948), axisLimitData0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.LinearAxisScale", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      linearAxisScale0.calcTickMarks(40.0, (-3715.07475924948), 40.0, 40.0, 40.0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      // Undeclared exception!
      linearAxisScale0.calcTickMarks(0.6951053011675952, (-3715.07475924948), 17.416042095700522, 17.416042095700522, (-3715.07475924948));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      AxisLimitData axisLimitData0 = linearAxisScale0.findGoodLimits(1.0, 1.0);
      PlotDatum plotDatum0 = new PlotDatum((-1.0), 0.0, false);
      plotDatum0.setYError(31.7284439476142);
      plotDatum0.setPlotSymbol((PlotSymbol) null);
      linearAxisScale0.adjustForErrorBars(plotDatum0, 1.0E-6, 0.0, axisLimitData0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AxisLimitData axisLimitData0 = new AxisLimitData();
      AxisLimitData axisLimitData1 = new AxisLimitData();
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      linearAxisScale0.lowerBounds();
      linearAxisScale0.findGoodLimits(2243.8621443, 2282.0793150223);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      linearAxisScale0.findGoodLimits(938.70142802, 2476.4131397957);
      linearAxisScale0.findGoodLimits(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          LinearAxisScale linearAxisScale0 = new LinearAxisScale();
          linearAxisScale0.findGoodLimits(4472.51366, 4472.51366);
          double double0 = 0.0;
          linearAxisScale0.findGoodLimits(0.0, 0.0);
          double double1 = (-2296.6196);
          double double2 = 2366.5165516495736;
          linearAxisScale0.calcTickMarks((-2485.8367494), (-2485.8367494), (-2296.6196), 2366.5165516495736, 2366.5165516495736);
          double double3 = 3335.3149402557087;
          linearAxisScale0.func(3335.3149402557087);
          // Undeclared exception!
          linearAxisScale0.findGoodLimits(4472.51366, (-478.090944564));
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      linearAxisScale0.upperBounds();
      linearAxisScale0.findGoodLimits(1.0, 1.0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      linearAxisScale0.calcTickMarks(1096.421, 1096.421, 1096.421, (-1.0), 1096.421);
      PlotDatum plotDatum0 = new PlotDatum((-1.0), 0.0, true);
      plotDatum0.setPlotSymbol((PlotSymbol) null);
      double double0 = 156.025961;
      // Undeclared exception!
      linearAxisScale0.calcTickMarks((-1.0), (-1.9009670000000005E301), (-1.9009670000000005E301), 156.025961, (-1.9009670000000004E284));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      TabDSymbol tabDSymbol0 = new TabDSymbol();
      PlotDatum plotDatum0 = new PlotDatum((-541.864173), (-1689.2257849513), true, tabDSymbol0);
      plotDatum0.connected();
      plotDatum0.hasErrorBar();
      plotDatum0.getYError();
      plotDatum0.getLineColor();
      plotDatum0.getLineColor();
      plotDatum0.getPlotSymbol();
      AxisLimitData axisLimitData0 = new AxisLimitData();
      linearAxisScale0.adjustForErrorBars(plotDatum0, (-1689.2257849513), 0.0, axisLimitData0);
      PlotDatum plotDatum1 = new PlotDatum((-1.0), 0.0, false);
      plotDatum1.setY(470.37658452);
      plotDatum1.clone();
      plotDatum1.setPlotSymbol((PlotSymbol) null);
      AxisLimitData axisLimitData1 = new AxisLimitData();
      linearAxisScale0.adjustForErrorBars(plotDatum1, (-1.0), (-1.0), axisLimitData1);
      linearAxisScale0.func(0.0);
      linearAxisScale0.findGoodLimits((-840.12584650219), 2250.43231755287);
      linearAxisScale0.findGoodLimits((-1.0), (-1.0));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      linearAxisScale0.calcTickMarks(1096.421, 1096.421, 1096.421, (-1.0), 1096.421);
      PlotDatum plotDatum0 = new PlotDatum((-1.0), 0.0, true);
      double double0 = 156.025961;
      // Undeclared exception!
      linearAxisScale0.calcTickMarks((-1.0), (-1.9009670000000005E301), (-1.9009670000000005E301), 156.025961, (-1.9009670000000004E284));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      linearAxisScale0.findGoodLimits((-215.151665600462), 414.3457418665821);
      linearAxisScale0.calcTickMarks((-215.151665600462), 414.3457418665821, 414.3457418665821, (-215.151665600462), 0.0);
      linearAxisScale0.calcTickMarks((-175.4373), 0.0, 0.0, 335.6941, (-647.3434863));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      PlotDatum plotDatum0 = new PlotDatum((-1.0), 0.0, false);
      plotDatum0.setPlotSymbol((PlotSymbol) null);
      AxisLimitData axisLimitData0 = new AxisLimitData();
      linearAxisScale0.adjustForErrorBars(plotDatum0, (-1.0), 4152.959155796813, axisLimitData0);
      linearAxisScale0.findGoodLimits((-2939.81876), (-1107.502831674488));
      linearAxisScale0.adjustForErrorBars(plotDatum0, 0.0, 4152.959155796813, axisLimitData0);
      linearAxisScale0.lowerBounds();
      linearAxisScale0.calcTickMarks(0.0, 10.0, 1.0E-6, (-2939.81876), 4152.959155796813);
      linearAxisScale0.upperBounds();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      linearAxisScale0.upperBounds();
      TabDSymbol tabDSymbol0 = new TabDSymbol();
      PlotDatum plotDatum0 = new PlotDatum((-541.864173), (-1689.2257849513), true, tabDSymbol0);
      plotDatum0.connected();
      plotDatum0.hasErrorBar();
      plotDatum0.getYError();
      plotDatum0.getLineColor();
      plotDatum0.getLineColor();
      plotDatum0.getPlotSymbol();
      AxisLimitData axisLimitData0 = new AxisLimitData();
      axisLimitData0.ub = (-541.864173);
      linearAxisScale0.adjustForErrorBars(plotDatum0, (-2823.76), (-541.864173), axisLimitData0);
      linearAxisScale0.upperBounds();
      PlotDatum plotDatum1 = new PlotDatum((-1.0), 0.0, false);
      plotDatum1.setPlotSymbol((PlotSymbol) null);
      plotDatum1.x = (-1.0);
      AxisLimitData axisLimitData1 = new AxisLimitData();
      axisLimitData1.ub = (-193.32712);
      axisLimitData1.quantum = 267.579;
      axisLimitData1.ub = 1.0;
      linearAxisScale0.adjustForErrorBars(plotDatum1, 2379.507340614644, 0.0, axisLimitData1);
      linearAxisScale0.lowerBounds();
      linearAxisScale0.calcTickMarks((-2352.7142409058), (-1.0), (-2000.12690664), 1841.2, (-5822.84286019613));
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      LinearAxisScale linearAxisScale1 = new LinearAxisScale();
      LinearAxisScale linearAxisScale2 = new LinearAxisScale();
      linearAxisScale2.lowerBounds();
      linearAxisScale2.findGoodLimits((-4484.0), (-1705.0));
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      linearAxisScale0.calcTickMarks(40.0, 40.0, 40.0, 40.0, 40.0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      linearAxisScale0.calcTickMarks((-0.1), 532.55012, 395.2966204597061, 395.2966204597061, 395.2966204597061);
      linearAxisScale0.findGoodLimits(1.0, 5.0);
      AxisLimitData axisLimitData0 = new AxisLimitData();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      PlotDatum plotDatum0 = new PlotDatum((-1.0), 0.0, true);
      AxisLimitData axisLimitData0 = new AxisLimitData();
      linearAxisScale0.adjustForErrorBars(plotDatum0, (-1.0), 0.0, axisLimitData0);
      linearAxisScale0.lowerBounds();
      linearAxisScale0.lowerBounds();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      linearAxisScale0.calcTickMarks((-1577.019818074299), (-1577.019818074299), (-1577.019818074299), (-1577.019818074299), 750.52354177);
      linearAxisScale0.calcTickMarks(1.0, (-1577.019818074299), 1.0, (-1690.0), (-1690.0));
      linearAxisScale0.calcTickMarks((-1690.0), (-1690.0), (-1690.0), (-1690.0), (-1690.0));
      linearAxisScale0.upperBounds();
      linearAxisScale0.lowerBounds();
      linearAxisScale0.func((-1.0));
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      double double0 = (-1104.77);
      double double1 = 944.5279338;
      double double2 = 1170.3;
      // Undeclared exception!
      try { 
        linearAxisScale0.calcTickMarks(1.0, 944.5279338, (-1208.22311), (-1104.77), 1170.3);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.LinearAxisScale", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      linearAxisScale0.findGoodLimits(1.0, 532.55012);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      linearAxisScale0.calcTickMarks((-1.9009670000000007E292), 0.0, (-1.9009670000000007E292), 5.0, (-1.9009670000000007E292));
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      linearAxisScale0.calcTickMarks((-1577.019818074299), (-1577.019818074299), (-1577.019818074299), (-1577.019818074299), 750.52354177);
      linearAxisScale0.calcTickMarks(1.0, (-1577.019818074299), 1.0, (-1690.0), (-1690.0));
      linearAxisScale0.upperBounds();
      double double0 = linearAxisScale0.lowerBounds();
      assertEquals((-1.0), double0, 0.01);
      
      linearAxisScale0.calcTickMarks((-7.048494553573017E301), 0.4035, (-7.048494553573017E301), (-1577.019818074299), (-3712.0));
      linearAxisScale0.func((-1.0));
      linearAxisScale0.findGoodLimits(750.52354177, 1234.2425);
      double double1 = linearAxisScale0.upperBounds();
      assertNotEquals(double1, double0, 0.01);
  }
}
