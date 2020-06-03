/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 22:24:33 GMT 2019
 */

package ipac;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ipac.IPv6;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.text.DefaultEditorKit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IPv6_ESTest extends IPv6_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IPv6 iPv6_0 = new IPv6();
      // Undeclared exception!
      try { 
        iPv6_0.actionPerformed((ActionEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ipac.IPv6", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IPv6 iPv6_0 = new IPv6();
      DefaultEditorKit.CopyAction defaultEditorKit_CopyAction0 = new DefaultEditorKit.CopyAction();
      JRadioButton jRadioButton0 = new JRadioButton(defaultEditorKit_CopyAction0);
      iPv6_0.splittingPrefixRadioButton = jRadioButton0;
      ActionEvent actionEvent0 = new ActionEvent(iPv6_0, 1823, "");
      iPv6_0.actionPerformed(actionEvent0);
      assertEquals(1823, actionEvent0.getID());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      IPv6 iPv6_0 = new IPv6();
      ActionEvent actionEvent0 = new ActionEvent(iPv6_0, 1823, "");
      iPv6_0.actionPerformed(actionEvent0);
      assertFalse(iPv6_0.isFocusTraversalPolicyProvider());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      IPv6 iPv6_0 = new IPv6();
      // Undeclared exception!
      try { 
        iPv6_0.displayError("/ ");
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
