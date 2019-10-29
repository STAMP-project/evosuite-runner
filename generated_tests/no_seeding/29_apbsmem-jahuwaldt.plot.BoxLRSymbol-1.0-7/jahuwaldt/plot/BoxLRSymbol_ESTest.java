/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 20:42:58 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.BoxLRSymbol;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BoxLRSymbol_ESTest extends BoxLRSymbol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BoxLRSymbol boxLRSymbol0 = new BoxLRSymbol();
      int[] intArray0 = new int[9];
      boxLRSymbol0.xPoints = intArray0;
      // Undeclared exception!
      try { 
        boxLRSymbol0.generatePoints(200, 200);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.BoxLRSymbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BoxLRSymbol boxLRSymbol0 = new BoxLRSymbol();
      boxLRSymbol0.generatePoints((-1806), (-1806));
      boxLRSymbol0.generatePoints((-1806), 528);
      assertEquals(8, boxLRSymbol0.getSize());
  }
}
