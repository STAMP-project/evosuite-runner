/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 16:58:42 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.TabUpSymbol;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TabUpSymbol_ESTest extends TabUpSymbol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TabUpSymbol tabUpSymbol0 = new TabUpSymbol();
      int[] intArray0 = new int[4];
      tabUpSymbol0.xPoints = intArray0;
      // Undeclared exception!
      try { 
        tabUpSymbol0.generatePoints((-3273), 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.TabUpSymbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TabUpSymbol tabUpSymbol0 = new TabUpSymbol();
      tabUpSymbol0.generatePoints(2053, 2053);
      int[] intArray0 = new int[2];
      tabUpSymbol0.xPoints = intArray0;
      // Undeclared exception!
      try { 
        tabUpSymbol0.generatePoints(2053, 1520);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("jahuwaldt.plot.TabUpSymbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TabUpSymbol tabUpSymbol0 = new TabUpSymbol();
      tabUpSymbol0.generatePoints((-3516), (-3516));
      tabUpSymbol0.generatePoints((-3516), 0);
      assertEquals(8, tabUpSymbol0.getSize());
  }
}
