/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 07 13:12:40 GMT 2019
 */

package Newzgrabber;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Newzgrabber.Newzgrabber;
import Newzgrabber.SearchPanel;
import java.awt.AWTKeyStroke;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.event.ListSelectionEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SearchPanel_ESTest extends SearchPanel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[5];
      SearchPanel.main(stringArray0);
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SearchPanel searchPanel0 = new SearchPanel((JFrame) null);
      String[] stringArray0 = searchPanel0.getSelectedGroups();
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SearchPanel searchPanel0 = new SearchPanel((JFrame) null);
      searchPanel0.valueChanged((ListSelectionEvent) null);
      assertFalse(searchPanel0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SearchPanel searchPanel0 = new SearchPanel((JFrame) null);
      AWTKeyStroke aWTKeyStroke0 = AWTKeyStroke.getAWTKeyStroke((-763), (-763), false);
      ActionEvent actionEvent0 = new ActionEvent(aWTKeyStroke0, 30, "Newzgrabber.CustomFileOutputStream", (-763));
      searchPanel0.actionPerformed(actionEvent0);
      assertEquals(0L, actionEvent0.getWhen());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ActionEvent actionEvent0 = new ActionEvent("STOPSEARCH", 85, "STOPSEARCH");
      SearchPanel searchPanel0 = new SearchPanel((JFrame) null);
      searchPanel0.actionPerformed(actionEvent0);
      assertEquals("STOPSEARCH", actionEvent0.getActionCommand());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ActionEvent actionEvent0 = new ActionEvent("SEARCH", 85, "SEARCH");
      SearchPanel searchPanel0 = new SearchPanel((JFrame) null);
      Newzgrabber.debug = true;
      // Undeclared exception!
      try { 
        searchPanel0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Newzgrabber.SearchPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ActionEvent actionEvent0 = new ActionEvent("SEARCH", 85, "SEARCH");
      SearchPanel searchPanel0 = new SearchPanel((JFrame) null);
      // Undeclared exception!
      try { 
        searchPanel0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Newzgrabber.SearchPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SearchPanel searchPanel0 = new SearchPanel((JFrame) null);
      AWTKeyStroke aWTKeyStroke0 = AWTKeyStroke.getAWTKeyStroke((-811), (-811), false);
      ActionEvent actionEvent0 = new ActionEvent(aWTKeyStroke0, 30, "DOWNLOAD", (-811));
      // Undeclared exception!
      try { 
        searchPanel0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Newzgrabber.SearchPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SearchPanel searchPanel0 = new SearchPanel((JFrame) null);
      searchPanel0.windowDeactivated((WindowEvent) null);
      assertFalse(searchPanel0.isFocusCycleRoot());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SearchPanel searchPanel0 = new SearchPanel((JFrame) null);
      searchPanel0.windowDeiconified((WindowEvent) null);
      assertTrue(searchPanel0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SearchPanel searchPanel0 = new SearchPanel((JFrame) null);
      searchPanel0.windowIconified((WindowEvent) null);
      assertFalse(searchPanel0.isFocusTraversalPolicySet());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SearchPanel searchPanel0 = new SearchPanel((JFrame) null);
      searchPanel0.windowOpened((WindowEvent) null);
      assertFalse(searchPanel0.isFocusTraversalPolicySet());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SearchPanel searchPanel0 = new SearchPanel((JFrame) null);
      searchPanel0.windowClosed((WindowEvent) null);
      assertTrue(searchPanel0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SearchPanel searchPanel0 = new SearchPanel((JFrame) null);
      searchPanel0.windowActivated((WindowEvent) null);
      assertFalse(searchPanel0.isFocusCycleRoot());
  }
}
