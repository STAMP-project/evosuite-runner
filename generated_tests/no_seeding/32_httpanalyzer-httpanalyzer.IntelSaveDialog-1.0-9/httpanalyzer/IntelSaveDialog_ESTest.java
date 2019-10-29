/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 22:49:13 GMT 2019
 */

package httpanalyzer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import httpanalyzer.IntelSaveDialog;
import java.awt.Frame;
import java.awt.HeadlessException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IntelSaveDialog_ESTest extends IntelSaveDialog_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = IntelSaveDialog.getFilename();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = IntelSaveDialog.getStatus();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      IntelSaveDialog intelSaveDialog0 = null;
      try {
        intelSaveDialog0 = new IntelSaveDialog((Frame) null, false);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      IntelSaveDialog.main((String[]) null);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        IntelSaveDialog.setMessage("What would you like to do with it?</html>");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("httpanalyzer.IntelSaveDialog", e);
      }
  }
}
