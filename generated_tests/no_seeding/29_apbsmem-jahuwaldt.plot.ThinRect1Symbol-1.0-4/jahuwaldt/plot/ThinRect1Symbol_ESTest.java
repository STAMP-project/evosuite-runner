/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 16:57:25 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.ThinRect1Symbol;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ThinRect1Symbol_ESTest extends ThinRect1Symbol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ThinRect1Symbol thinRect1Symbol0 = new ThinRect1Symbol();
      thinRect1Symbol0.generatePoints(13, 13);
      assertEquals(8, thinRect1Symbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ThinRect1Symbol thinRect1Symbol0 = new ThinRect1Symbol();
      int[] intArray0 = new int[9];
      thinRect1Symbol0.xPoints = intArray0;
      // Undeclared exception!
      try { 
        thinRect1Symbol0.generatePoints(652, 652);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.ThinRect1Symbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ThinRect1Symbol thinRect1Symbol0 = new ThinRect1Symbol();
      int[] intArray0 = new int[8];
      thinRect1Symbol0.yPoints = intArray0;
      int[] intArray1 = new int[2];
      thinRect1Symbol0.xPoints = intArray1;
      // Undeclared exception!
      try { 
        thinRect1Symbol0.generatePoints(17, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("jahuwaldt.plot.ThinRect1Symbol", e);
      }
  }
}
