/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 16:10:23 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.CircleSymbol;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.SystemColor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CircleSymbol_ESTest extends CircleSymbol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CircleSymbol circleSymbol0 = new CircleSymbol();
      SystemColor systemColor0 = SystemColor.text;
      Graphics graphics0 = mock(Graphics.class, new ViolatedAssumptionAnswer());
      doReturn(systemColor0).when(graphics0).getColor();
      Color color0 = Color.RED;
      circleSymbol0.setFillColor(color0);
      circleSymbol0.draw(graphics0, (-3372), 1853);
      assertEquals(8, circleSymbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CircleSymbol circleSymbol0 = new CircleSymbol();
      // Undeclared exception!
      try { 
        circleSymbol0.draw((Graphics) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.CircleSymbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CircleSymbol circleSymbol0 = new CircleSymbol();
      SystemColor systemColor0 = SystemColor.text;
      Graphics graphics0 = mock(Graphics.class, new ViolatedAssumptionAnswer());
      doReturn(systemColor0).when(graphics0).getColor();
      circleSymbol0.setBorderColor((Color) null);
      circleSymbol0.draw(graphics0, 488, 0);
      assertEquals(8, circleSymbol0.getSize());
  }
}
