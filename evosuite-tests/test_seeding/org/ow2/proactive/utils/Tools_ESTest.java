/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 16:02:36 GMT 2019
 */

package org.ow2.proactive.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import java.util.ResourceBundle;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.NOPLoggerRepository;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;
import org.ow2.proactive.utils.ObjectArrayFormatter;
import org.ow2.proactive.utils.Tools;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Tools_ESTest extends Tools_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tools.parsePeriod(" u&T");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid period string: u
         //
         verifyException("org.ow2.proactive.utils.Tools", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = Tools.dataSpaceConfigPropertyToUrls("\"");
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      long long0 = Tools.formatDate("e:H{`j5Y#M]x]:q~&");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      long long0 = Tools.formatDate(":");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = Tools.getElapsedTime(9223372036854775807L);
      assertEquals("-34s ago", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = Tools.getFormattedDate(0L);
      assertEquals("1/1/70 12:00 AM", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = Tools.getFormattedDuration(826L, 9223372036854775807L);
      assertEquals("56m -827ms", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = Tools.getFormattedDuration(0L, 0L);
      assertEquals("  0ms", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = Tools.formatNChar((-2198), 1, 'S');
      assertEquals("-2198", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ObjectArrayFormatter objectArrayFormatter0 = new ObjectArrayFormatter();
      List<String> list0 = ResourceBundle.Control.FORMAT_PROPERTIES;
      objectArrayFormatter0.setTitle(list0);
      String string0 = Tools.getStringAsArray(objectArrayFormatter0);
      assertEquals("\t java.properties\n", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      long long0 = Tools.formatDate("3");
      assertEquals(3000L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tools.parsePeriod((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.utils.Tools", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tools.parseCommandLine((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.utils.Tools", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tools.logAvailableScriptEngines((Logger) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.utils.Tools", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ObjectArrayFormatter objectArrayFormatter0 = new ObjectArrayFormatter();
      // Undeclared exception!
      try { 
        Tools.getStringAsArray(objectArrayFormatter0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Title array does not contain anything !
         //
         verifyException("org.ow2.proactive.utils.ObjectArrayFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tools.getHostURL((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URI$Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tools.getHostURL("d ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal character in path at index 1: d 
         //
         verifyException("java.net.URI", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      Tools.formatNChar(3600000, 3600000, '|');
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tools.formatDate((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.utils.Tools", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tools.dataSpaceConfigPropertyToUrls((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.utils.Tools", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NOPLoggerRepository nOPLoggerRepository0 = new NOPLoggerRepository();
      Logger logger0 = nOPLoggerRepository0.getLogger("");
      Tools.logAvailableScriptEngines(logger0);
      assertFalse(logger0.isInfoEnabled());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Logger logger0 = Logger.getRootLogger();
      Tools.logAvailableScriptEngines(logger0);
      assertEquals("root", logger0.getName());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tools.parsePeriod("5 ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period string isn't specified
         //
         verifyException("org.ow2.proactive.utils.Tools", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tools.parsePeriod("ms");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period length isn't specified
         //
         verifyException("org.ow2.proactive.utils.Tools", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tools.parsePeriod("5sV_^t^;W*");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid period string: V
         //
         verifyException("org.ow2.proactive.utils.Tools", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tools.parsePeriod("16103d 10h ago");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid period string: a
         //
         verifyException("org.ow2.proactive.utils.Tools", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      long long0 = Tools.parsePeriod("1d ");
      assertEquals(86400000L, long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tools.parsePeriod("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period string is empty
         //
         verifyException("org.ow2.proactive.utils.Tools", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String[] stringArray0 = Tools.dataSpaceConfigPropertyToUrls("=\"");
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String[] stringArray0 = Tools.dataSpaceConfigPropertyToUrls("\" to ");
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String[] stringArray0 = Tools.dataSpaceConfigPropertyToUrls("");
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String[] stringArray0 = Tools.dataSpaceConfigPropertyToUrls("eZE]kBHo*");
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = Tools.shellExtension();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String[] stringArray0 = Tools.parseCommandLine("%");
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String[] stringArray0 = Tools.parseCommandLine("Not yet");
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String[] stringArray0 = Tools.parseCommandLine("%Aj");
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String string0 = Tools.getHostURL("");
      assertEquals("rmi://localhost/", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String string0 = Tools.getHostURL("rmi://localhost/");
      assertEquals("rmi://localhost/", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      long long0 = Tools.formatDate("-2198");
      assertEquals((-2198000L), long0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      System.setCurrentTimeMillis((-10L));
      String string0 = Tools.getElapsedTime((byte)126);
      assertEquals("0s ago", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      System.setCurrentTimeMillis(86400000L);
      String string0 = Tools.getElapsedTime(10485760L);
      assertEquals("21h5mn ago", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      String string0 = Tools.getElapsedTime(1073741824L);
      assertEquals("16103d 10h ago", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      System.setCurrentTimeMillis(86400L);
      String string0 = Tools.getElapsedTime(445L);
      assertEquals("1mn ago", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      String string0 = Tools.getFormattedDate((-2161L));
      assertEquals("Not yet", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String string0 = Tools.getFormattedDate(86400L);
      assertEquals("1/1/70 12:01 AM", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String string0 = Tools.getFormattedDuration(519L, 3600000L);
      assertEquals("59m 59s 481ms", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      String string0 = Tools.getFormattedDuration(0L, 86400000L);
      assertEquals("1 day -   0ms", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      String string0 = Tools.getFormattedDuration(2552L, (-2286L));
      assertEquals("Not yet", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String string0 = Tools.getFormattedDuration((-3L), (-3L));
      assertEquals("Not yet", string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String string0 = Tools.getFormattedDuration(1073741824L, 1L);
      assertEquals("12 days - 10h 15m 41s 823ms", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Tools tools0 = new Tools();
      assertEquals("", tools0.shellExtension());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tools.getStringAsArray((ObjectArrayFormatter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.utils.Tools", e);
      }
  }
}
