/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 16:28:01 GMT 2019
 */

package Newzgrabber;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Newzgrabber.OptionsPanel;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OptionsPanel_ESTest extends OptionsPanel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OptionsPanel optionsPanel0 = new OptionsPanel((Frame) null);
      JRadioButton jRadioButton0 = new JRadioButton((String) null);
      optionsPanel0.GetAll = jRadioButton0;
      boolean boolean0 = optionsPanel0.searchAll();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OptionsPanel optionsPanel0 = new OptionsPanel((Frame) null);
      // Undeclared exception!
      try { 
        optionsPanel0.actionPerformed((ActionEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Newzgrabber.OptionsPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("null/Newzgrabber.ini");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "user.home");
      OptionsPanel optionsPanel0 = new OptionsPanel((Frame) null);
      optionsPanel0.updateIni();
      assertFalse(optionsPanel0.isFocusTraversalPolicyProvider());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      OptionsPanel optionsPanel0 = new OptionsPanel((Frame) null);
      JRadioButton jRadioButton0 = new JRadioButton((String) null);
      optionsPanel0.GetAll = jRadioButton0;
      optionsPanel0.updateIni();
      assertFalse(optionsPanel0.isFocusTraversalPolicyProvider());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      OptionsPanel optionsPanel0 = new OptionsPanel((Frame) null);
      OptionsPanel.UsernameText = null;
      optionsPanel0.updateIni();
      assertFalse(optionsPanel0.isFocusTraversalPolicySet());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      OptionsPanel optionsPanel0 = new OptionsPanel((Frame) null);
      ActionEvent actionEvent0 = new ActionEvent(optionsPanel0, 0, "BUILD", 0, (-1165338382));
      optionsPanel0.actionPerformed(actionEvent0);
      assertFalse(optionsPanel0.isFocusTraversalPolicyProvider());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      OptionsPanel optionsPanel0 = new OptionsPanel((Frame) null);
      ActionEvent actionEvent0 = new ActionEvent(optionsPanel0, (-11), "BROWSE", (-11), (-11));
      // Undeclared exception!
      try { 
        optionsPanel0.actionPerformed(actionEvent0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      OptionsPanel optionsPanel0 = new OptionsPanel((Frame) null);
      Object object0 = new Object();
      ActionEvent actionEvent0 = new ActionEvent(object0, 0, "list\r\n", 0, 0);
      optionsPanel0.actionPerformed(actionEvent0);
      assertFalse(optionsPanel0.isFocusTraversalPolicyProvider());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      OptionsPanel optionsPanel0 = new OptionsPanel((Frame) null);
      boolean boolean0 = optionsPanel0.searchAll();
      assertTrue(boolean0);
  }
}
