/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 22:43:05 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.Triangle1Symbol;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Triangle1Symbol_ESTest extends Triangle1Symbol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Triangle1Symbol triangle1Symbol0 = new Triangle1Symbol();
      int[] intArray0 = new int[9];
      triangle1Symbol0.xPoints = intArray0;
      // Undeclared exception!
      try { 
        triangle1Symbol0.generatePoints(1, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.Triangle1Symbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Triangle1Symbol triangle1Symbol0 = new Triangle1Symbol();
      int[] intArray0 = new int[0];
      triangle1Symbol0.xPoints = intArray0;
      // Undeclared exception!
      try { 
        triangle1Symbol0.generatePoints(0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jahuwaldt.plot.Triangle1Symbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Triangle1Symbol triangle1Symbol0 = new Triangle1Symbol();
      triangle1Symbol0.generatePoints(4378, 4378);
      triangle1Symbol0.generatePoints(4378, 0);
      assertEquals(8, triangle1Symbol0.getSize());
  }
}
