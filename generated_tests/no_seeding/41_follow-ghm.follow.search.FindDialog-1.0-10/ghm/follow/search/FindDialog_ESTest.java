/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 04 14:35:16 GMT 2019
 */

package ghm.follow.search;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ghm.follow.search.Find;
import ghm.follow.search.FindDialog;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FindDialog_ESTest extends FindDialog_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FindDialog findDialog0 = null;
      try {
        findDialog0 = new FindDialog((Find) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ghm.follow.search.FindDialog", e);
      }
  }
}
