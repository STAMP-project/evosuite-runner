/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 13:39:49 GMT 2019
 */

package com.allenstudio.ir.ui.calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.allenstudio.ir.ui.calendar.IMonthlyCalendarModel;
import com.allenstudio.ir.ui.calendar.MonthlyCalendar;
import com.allenstudio.ir.ui.calendar.MonthlyCalendarModel;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.SystemColor;
import java.awt.event.MouseEvent;
import java.util.Calendar;
import javax.swing.JComponent;
import javax.swing.JToolBar;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicSplitPaneUI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MonthlyCalendar_ESTest extends MonthlyCalendar_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      monthlyCalendar0.setYearMonth(27, 20);
      monthlyCalendar0.getSelectedDate();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      monthlyCalendar0.getSelectedDate();
      monthlyCalendar0.setYearMonth(1, 1);
      monthlyCalendar0.getSelectedDate();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      CardLayout cardLayout0 = new CardLayout();
      Dimension dimension0 = cardLayout0.minimumLayoutSize(monthlyCalendar0);
      monthlyCalendar0.setCellDimension(dimension0);
      // Undeclared exception!
      try { 
        monthlyCalendar0.paintComponent((Graphics) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.allenstudio.ir.ui.calendar.MonthlyCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      monthlyCalendar0.setYearMonth(12, 393);
      monthlyCalendar0.setMonth(5);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      monthlyCalendar0.setMonth(12);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      monthlyCalendar0.setYear(1970);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      MonthlyCalendarModel monthlyCalendarModel0 = (MonthlyCalendarModel)monthlyCalendar0.model;
      monthlyCalendarModel0.setSelectedDate((-1691));
      monthlyCalendar0.getSelectedDay();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      monthlyCalendar0.setMouseListeningEnabled(false);
      monthlyCalendar0.getMouseListeningEnabled();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      Font font0 = new Font("%zg$>6cpZT!>", 0, 0);
      monthlyCalendar0.setHeaderFont(font0);
      monthlyCalendar0.getHeaderFont();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      // Undeclared exception!
      try { 
        monthlyCalendar0.setYearMonth((Calendar) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.allenstudio.ir.ui.calendar.MonthlyCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      // Undeclared exception!
      try { 
        monthlyCalendar0.setMarked(3724, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3723
         //
         verifyException("com.allenstudio.ir.ui.calendar.MonthlyCalendarModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      // Undeclared exception!
      try { 
        monthlyCalendar0.setCellDimension((Dimension) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.allenstudio.ir.ui.calendar.MonthlyCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      // Undeclared exception!
      try { 
        monthlyCalendar0.mouseReleased((MouseEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.allenstudio.ir.ui.calendar.MonthlyCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      // Undeclared exception!
      try { 
        monthlyCalendar0.mousePressed((MouseEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.allenstudio.ir.ui.calendar.MonthlyCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      // Undeclared exception!
      try { 
        monthlyCalendar0.mouseMoved((MouseEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.allenstudio.ir.ui.calendar.MonthlyCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      // Undeclared exception!
      try { 
        monthlyCalendar0.mouseExited((MouseEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.allenstudio.ir.ui.calendar.MonthlyCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      // Undeclared exception!
      try { 
        monthlyCalendar0.mouseEntered((MouseEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.allenstudio.ir.ui.calendar.MonthlyCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      // Undeclared exception!
      try { 
        monthlyCalendar0.mouseDragged((MouseEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.allenstudio.ir.ui.calendar.MonthlyCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      // Undeclared exception!
      try { 
        monthlyCalendar0.mouseClicked((MouseEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.allenstudio.ir.ui.calendar.MonthlyCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      monthlyCalendar0.model = null;
      // Undeclared exception!
      try { 
        monthlyCalendar0.getSelectedDate();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.allenstudio.ir.ui.calendar.MonthlyCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Font font0 = new Font("com.allenstudio.ir.ui.calendar.MonthlyCalendarModel", (-3364), 31);
      Color color0 = new Color((-3001));
      // Undeclared exception!
      try { 
        MonthlyCalendar.paintSymbol((Graphics) null, font0, color0, (Color) null, "com.allenstudio.ir.ui.calendar.MonthlyCalendarModel", 4161, (-3001), 31, 31);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.allenstudio.ir.ui.calendar.MonthlyCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      Calendar calendar0 = Calendar.getInstance();
      monthlyCalendar0.setYearMonth(calendar0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      Calendar calendar0 = monthlyCalendar0.getSelectedDate();
      calendar0.add(5, 1);
      monthlyCalendar0.setYearMonth(calendar0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      monthlyCalendar0.setYearMonth(1, 1);
      monthlyCalendar0.setYearMonth(1, 1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      monthlyCalendar0.setYearMonth(1, 1);
      monthlyCalendar0.setYearMonth(1, 15);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      monthlyCalendar0.setYearMonth(122, 122);
      monthlyCalendar0.getSelectedDate();
      assertEquals(132, monthlyCalendar0.getYear());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      monthlyCalendar0.setYearMonth(228, 1);
      monthlyCalendar0.getSelectedDate();
      assertEquals(1, monthlyCalendar0.getMonth());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      // Undeclared exception!
      try { 
        MonthlyCalendar.paintSymbol((Graphics) null, monthlyCalendar0.NORMAL_FONT, monthlyCalendar0.DEFAULT_HIGHLIGHT_BG, monthlyCalendar0.DEFAULT_DATE_BG, (String) null, (-1074), 18, (-1074), 20);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.allenstudio.ir.ui.calendar.MonthlyCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      // Undeclared exception!
      try { 
        monthlyCalendar0.paintComponent((Graphics) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.allenstudio.ir.ui.calendar.MonthlyCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      monthlyCalendar0.setHeaderComponent((JComponent) null);
      assertEquals(2, monthlyCalendar0.getMonth());
      assertTrue(monthlyCalendar0.getMouseListeningEnabled());
      assertEquals(2014, monthlyCalendar0.getYear());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      JToolBar jToolBar0 = new JToolBar();
      // Undeclared exception!
      try { 
        monthlyCalendar0.setHeaderComponent(jToolBar0);
        fail("Expecting exception: IncompatibleClassChangeError");
      
      } catch(IncompatibleClassChangeError e) {
         //
         // Expected static method org.evosuite.runtime.mock.javax.swing.MockJComponent.getPreferredSize()Ljava/awt/Dimension;
         //
         verifyException("com.allenstudio.ir.ui.calendar.MonthlyCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      Dimension dimension0 = monthlyCalendar0.getMinimumSize();
      monthlyCalendar0.setCellDimension(dimension0);
      Dimension dimension1 = monthlyCalendar0.getCellDimension();
      assertTrue(monthlyCalendar0.getMouseListeningEnabled());
      assertEquals(2, monthlyCalendar0.getMonth());
      assertTrue(dimension1.equals((Object)dimension0));
      assertEquals(2014, monthlyCalendar0.getYear());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      monthlyCalendar0.setWeekStartOnSunday(false);
      monthlyCalendar0.setYearMonth((-183), 1);
      assertEquals(184, monthlyCalendar0.getYear());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      Calendar calendar0 = monthlyCalendar0.getSelectedDate();
      monthlyCalendar0.setYearMonth(calendar0);
      assertEquals(28, monthlyCalendar0.getSelectedDay());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      // Undeclared exception!
      try { 
        monthlyCalendar0.setMonth(27);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid month specified!
         //
         verifyException("com.allenstudio.ir.ui.calendar.MonthlyCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      // Undeclared exception!
      try { 
        monthlyCalendar0.setMonth(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid month specified!
         //
         verifyException("com.allenstudio.ir.ui.calendar.MonthlyCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      // Undeclared exception!
      try { 
        monthlyCalendar0.setYear(1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Year must be later than 1970!
         //
         verifyException("com.allenstudio.ir.ui.calendar.MonthlyCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      monthlyCalendar0.setYear(3339);
      assertEquals(3339, monthlyCalendar0.getYear());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      monthlyCalendar0.setMouseListeningEnabled(true);
      assertEquals(2, monthlyCalendar0.getMonth());
      assertEquals(2014, monthlyCalendar0.getYear());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertTrue(monthlyCalendar0.getMouseListeningEnabled());
      
      monthlyCalendar0.setMouseListeningEnabled(false);
      monthlyCalendar0.setMouseListeningEnabled(false);
      assertEquals(2014, monthlyCalendar0.getYear());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      monthlyCalendar0.setModel((IMonthlyCalendarModel) null);
      assertTrue(monthlyCalendar0.getMouseListeningEnabled());
      assertEquals(2014, monthlyCalendar0.getYear());
      assertEquals(2, monthlyCalendar0.getMonth());
      assertTrue(monthlyCalendar0.getWeekStartOnSunday());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      Color color0 = monthlyCalendar0.getHeaderBackground();
      assertEquals(2014, monthlyCalendar0.getYear());
      assertEquals(2, monthlyCalendar0.getMonth());
      assertEquals(150, color0.getGreen());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      monthlyCalendar0.getSelectedDay();
      assertEquals(2014, monthlyCalendar0.getYear());
      assertEquals(2, monthlyCalendar0.getMonth());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      BasicSplitPaneUI basicSplitPaneUI0 = new BasicSplitPaneUI();
      Dimension dimension0 = basicSplitPaneUI0.getMaximumSize(monthlyCalendar0);
      monthlyCalendar0.setPreferredSize(dimension0);
      assertEquals(2, monthlyCalendar0.getMonth());
      assertEquals(2014, monthlyCalendar0.getYear());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      int int0 = monthlyCalendar0.getMonth();
      assertEquals(2014, monthlyCalendar0.getYear());
      assertTrue(monthlyCalendar0.getWeekStartOnSunday());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      monthlyCalendar0.getModel();
      assertEquals(2014, monthlyCalendar0.getYear());
      assertTrue(monthlyCalendar0.getMouseListeningEnabled());
      assertEquals(2, monthlyCalendar0.getMonth());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      monthlyCalendar0.getWeekStartOnSunday();
      assertEquals(2, monthlyCalendar0.getMonth());
      assertTrue(monthlyCalendar0.getMouseListeningEnabled());
      assertEquals(2014, monthlyCalendar0.getYear());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      int int0 = monthlyCalendar0.getYear();
      assertEquals(2014, int0);
      assertEquals(2, monthlyCalendar0.getMonth());
      assertTrue(monthlyCalendar0.getWeekStartOnSunday());
      assertTrue(monthlyCalendar0.getMouseListeningEnabled());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      monthlyCalendar0.setHighlightForeground(monthlyCalendar0.DEFAULT_DATE_BG);
      assertEquals(2, monthlyCalendar0.getMonth());
      assertEquals(2014, monthlyCalendar0.getYear());
      assertTrue(monthlyCalendar0.getMouseListeningEnabled());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      monthlyCalendar0.setHighlightBackground(monthlyCalendar0.DEFAULT_HIGHLIGHT_BG);
      assertTrue(monthlyCalendar0.getMouseListeningEnabled());
      assertEquals(2014, monthlyCalendar0.getYear());
      assertEquals(2, monthlyCalendar0.getMonth());
      assertTrue(monthlyCalendar0.getWeekStartOnSunday());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      monthlyCalendar0.setDateForeground(monthlyCalendar0.DEFAULT_HIGHLIGHT_BG);
      assertEquals(2, monthlyCalendar0.getMonth());
      assertEquals(2014, monthlyCalendar0.getYear());
      assertTrue(monthlyCalendar0.getMouseListeningEnabled());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      monthlyCalendar0.setHeaderForeground(monthlyCalendar0.DEFAULT_HIGHLIGHT_BG);
      assertTrue(monthlyCalendar0.getMouseListeningEnabled());
      assertEquals(2014, monthlyCalendar0.getYear());
      assertEquals(2, monthlyCalendar0.getMonth());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      Dimension dimension0 = monthlyCalendar0.getCellDimension();
      assertEquals(20, dimension0.height);
      assertEquals(2014, monthlyCalendar0.getYear());
      assertEquals(27, dimension0.width);
      assertEquals(2, monthlyCalendar0.getMonth());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      monthlyCalendar0.resetHighlight();
      assertEquals(2014, monthlyCalendar0.getYear());
      assertEquals(2, monthlyCalendar0.getMonth());
      assertTrue(monthlyCalendar0.getMouseListeningEnabled());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      Color color0 = monthlyCalendar0.getDateForeground();
      assertEquals(2014, monthlyCalendar0.getYear());
      assertEquals(2, monthlyCalendar0.getMonth());
      assertEquals((-16777216), color0.getRGB());
      assertTrue(monthlyCalendar0.getWeekStartOnSunday());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      monthlyCalendar0.setMarked(20, false);
      assertTrue(monthlyCalendar0.getMouseListeningEnabled());
      assertEquals(2, monthlyCalendar0.getMonth());
      assertEquals(2014, monthlyCalendar0.getYear());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      monthlyCalendar0.dateSelected();
      assertEquals(2, monthlyCalendar0.getMonth());
      assertEquals(2014, monthlyCalendar0.getYear());
      assertTrue(monthlyCalendar0.getMouseListeningEnabled());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      Color color0 = monthlyCalendar0.getDateBackground();
      assertEquals(2014, monthlyCalendar0.getYear());
      assertEquals(2, monthlyCalendar0.getMonth());
      assertEquals(255, color0.getRed());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      monthlyCalendar0.getHeaderComponent();
      assertEquals(2, monthlyCalendar0.getMonth());
      assertEquals(2014, monthlyCalendar0.getYear());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      SystemColor systemColor0 = SystemColor.controlDkShadow;
      monthlyCalendar0.setHeaderBackground(systemColor0);
      assertEquals(2, monthlyCalendar0.getMonth());
      assertEquals(2014, monthlyCalendar0.getYear());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      monthlyCalendar0.setDateBackground(monthlyCalendar0.DEFAULT_HIGHLIGHT_FG);
      assertEquals(2, monthlyCalendar0.getMonth());
      assertEquals(2014, monthlyCalendar0.getYear());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      Font font0 = monthlyCalendar0.getHeaderFont();
      assertTrue(monthlyCalendar0.getMouseListeningEnabled());
      assertEquals(2014, monthlyCalendar0.getYear());
      assertEquals(2, monthlyCalendar0.getMonth());
      assertTrue(font0.isPlain());
      assertTrue(monthlyCalendar0.getWeekStartOnSunday());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      Color color0 = monthlyCalendar0.getHeaderForeground();
      assertEquals(2, monthlyCalendar0.getMonth());
      assertEquals(2014, monthlyCalendar0.getYear());
      assertEquals(228, color0.getGreen());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      Border border0 = LineBorder.createBlackLineBorder();
      monthlyCalendar0.setBorder(border0);
      assertEquals(2014, monthlyCalendar0.getYear());
      assertTrue(monthlyCalendar0.getWeekStartOnSunday());
      assertTrue(monthlyCalendar0.getMouseListeningEnabled());
      assertEquals(2, monthlyCalendar0.getMonth());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      boolean boolean0 = monthlyCalendar0.getMouseListeningEnabled();
      assertEquals(2014, monthlyCalendar0.getYear());
      assertEquals(2, monthlyCalendar0.getMonth());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      Color color0 = monthlyCalendar0.getHighlightBackground();
      assertEquals(2014, monthlyCalendar0.getYear());
      assertEquals(2, monthlyCalendar0.getMonth());
      assertTrue(monthlyCalendar0.getMouseListeningEnabled());
      assertEquals((-16755485), color0.getRGB());
      assertTrue(monthlyCalendar0.getWeekStartOnSunday());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      Color color0 = monthlyCalendar0.getHighlightForeground();
      assertEquals(2, monthlyCalendar0.getMonth());
      assertTrue(monthlyCalendar0.getWeekStartOnSunday());
      assertEquals(2014, monthlyCalendar0.getYear());
      assertEquals(255, color0.getBlue());
      assertTrue(monthlyCalendar0.getMouseListeningEnabled());
  }
}
