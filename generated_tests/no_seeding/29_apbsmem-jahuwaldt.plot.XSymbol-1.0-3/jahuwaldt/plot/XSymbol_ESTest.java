/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 15:45:19 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.XSymbol;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XSymbol_ESTest extends XSymbol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XSymbol xSymbol0 = new XSymbol();
      // Undeclared exception!
      try { 
        xSymbol0.draw((Graphics) null, 1768, 1768);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.XSymbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XSymbol xSymbol0 = new XSymbol();
      BufferedImage bufferedImage0 = new BufferedImage(9, 93, 9);
      Graphics graphics0 = bufferedImage0.getGraphics();
      xSymbol0.setBorderColor((Color) null);
      xSymbol0.draw(graphics0, 1024, 1024);
      assertEquals(8, xSymbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      XSymbol xSymbol0 = new XSymbol();
      BufferedImage bufferedImage0 = new BufferedImage(9, 9, 9);
      Color color0 = Color.darkGray;
      xSymbol0.setFillColor(color0);
      Graphics graphics0 = bufferedImage0.getGraphics();
      xSymbol0.draw(graphics0, (-3064), 9);
      assertEquals(8, xSymbol0.getSize());
  }
}
