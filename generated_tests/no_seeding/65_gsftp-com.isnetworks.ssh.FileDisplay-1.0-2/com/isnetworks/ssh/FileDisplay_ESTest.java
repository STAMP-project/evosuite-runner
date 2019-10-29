/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 14:46:09 GMT 2019
 */

package com.isnetworks.ssh;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.isnetworks.ssh.FileDisplay;
import java.awt.Frame;
import java.awt.HeadlessException;
import mindbright.ssh.SSHSCPPanel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileDisplay_ESTest extends FileDisplay_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FileDisplay fileDisplay0 = null;
      try {
        fileDisplay0 = new FileDisplay((Frame) null, (String) null, (SSHSCPPanel) null);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
