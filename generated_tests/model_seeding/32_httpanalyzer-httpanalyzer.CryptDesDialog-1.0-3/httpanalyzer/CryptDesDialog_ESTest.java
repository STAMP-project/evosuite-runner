/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 05 13:45:41 GMT 2019
 */

package httpanalyzer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import httpanalyzer.CryptDesDialog;
import java.awt.Frame;
import java.awt.HeadlessException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CryptDesDialog_ESTest extends CryptDesDialog_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CryptDesDialog cryptDesDialog0 = null;
      try {
        cryptDesDialog0 = new CryptDesDialog((Frame) null, true);
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
      String[] stringArray0 = new String[1];
      CryptDesDialog.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }
}
