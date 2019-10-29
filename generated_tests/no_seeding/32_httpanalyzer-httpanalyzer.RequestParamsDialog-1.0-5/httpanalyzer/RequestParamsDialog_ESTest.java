/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 18:18:52 GMT 2019
 */

package httpanalyzer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import httpanalyzer.RequestParamsDialog;
import java.awt.Frame;
import java.awt.HeadlessException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RequestParamsDialog_ESTest extends RequestParamsDialog_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RequestParamsDialog requestParamsDialog0 = null;
      try {
        requestParamsDialog0 = new RequestParamsDialog((Frame) null, true);
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
      String string0 = RequestParamsDialog.getRequestParams();
      assertEquals("&null", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RequestParamsDialog.main((String[]) null);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      boolean boolean0 = RequestParamsDialog.isDataChanged();
      assertFalse(boolean0);
  }
}
