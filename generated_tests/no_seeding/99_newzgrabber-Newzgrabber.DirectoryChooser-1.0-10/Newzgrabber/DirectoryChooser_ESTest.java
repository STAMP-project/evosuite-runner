/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 04 14:48:36 GMT 2019
 */

package Newzgrabber;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Newzgrabber.DirectoryChooser;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DirectoryChooser_ESTest extends DirectoryChooser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DirectoryChooser directoryChooser0 = new DirectoryChooser();
      // Undeclared exception!
      try { 
        directoryChooser0.getSelectedDirectory();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DirectoryChooser directoryChooser0 = new DirectoryChooser();
      directoryChooser0.actionPerformed((ActionEvent) null);
      assertTrue(directoryChooser0.getFocusTraversalKeysEnabled());
  }
}
