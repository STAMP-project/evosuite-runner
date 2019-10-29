/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 15:46:51 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.SquareSymbol;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.SystemColor;
import java.awt.image.BufferedImage;
import javax.swing.DebugGraphics;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SquareSymbol_ESTest extends SquareSymbol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SquareSymbol squareSymbol0 = new SquareSymbol();
      SystemColor systemColor0 = SystemColor.menuText;
      BufferedImage bufferedImage0 = new BufferedImage((short)1, (short)1, (short)1);
      Graphics graphics0 = bufferedImage0.getGraphics();
      squareSymbol0.setFillColor(systemColor0);
      squareSymbol0.draw(graphics0, (short)1, 0);
      assertEquals(8, squareSymbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SquareSymbol squareSymbol0 = new SquareSymbol();
      DebugGraphics debugGraphics0 = new DebugGraphics();
      // Undeclared exception!
      try { 
        squareSymbol0.draw(debugGraphics0, 39, 39);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.swing.DebugGraphics", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SquareSymbol squareSymbol0 = new SquareSymbol();
      BufferedImage bufferedImage0 = new BufferedImage((short)1, (short)1, (short)1);
      squareSymbol0.setBorderColor((Color) null);
      Graphics graphics0 = bufferedImage0.getGraphics();
      squareSymbol0.draw(graphics0, (short)1, (short)1);
      assertEquals(8, squareSymbol0.getSize());
  }
}
