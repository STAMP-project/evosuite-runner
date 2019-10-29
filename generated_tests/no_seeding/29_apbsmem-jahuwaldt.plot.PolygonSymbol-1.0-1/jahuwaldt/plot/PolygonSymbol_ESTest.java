/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 13:16:49 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.RTriangle4Symbol;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PolygonSymbol_ESTest extends PolygonSymbol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RTriangle4Symbol rTriangle4Symbol0 = new RTriangle4Symbol();
      BufferedImage bufferedImage0 = new BufferedImage(8, 8, 8);
      Graphics graphics0 = bufferedImage0.getGraphics();
      rTriangle4Symbol0.draw(graphics0, 8, 2437);
      assertEquals(8, rTriangle4Symbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RTriangle4Symbol rTriangle4Symbol0 = new RTriangle4Symbol();
      // Undeclared exception!
      try { 
        rTriangle4Symbol0.draw((Graphics) null, 99, 99);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PolygonSymbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RTriangle4Symbol rTriangle4Symbol0 = new RTriangle4Symbol();
      BufferedImage bufferedImage0 = new BufferedImage(8, 8, 8);
      int[] intArray0 = new int[0];
      rTriangle4Symbol0.xPoints = intArray0;
      Graphics graphics0 = bufferedImage0.getGraphics();
      // Undeclared exception!
      try { 
        rTriangle4Symbol0.draw(graphics0, 8, 8);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jahuwaldt.plot.RTriangle4Symbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RTriangle4Symbol rTriangle4Symbol0 = new RTriangle4Symbol();
      rTriangle4Symbol0.setBorderColor((Color) null);
      BufferedImage bufferedImage0 = new BufferedImage(8, 8, 8);
      Graphics graphics0 = bufferedImage0.getGraphics();
      rTriangle4Symbol0.draw(graphics0, 8, 8);
      assertEquals(8, rTriangle4Symbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RTriangle4Symbol rTriangle4Symbol0 = new RTriangle4Symbol();
      BufferedImage bufferedImage0 = new BufferedImage(8, 8, 8);
      Graphics graphics0 = bufferedImage0.getGraphics();
      Color color0 = Color.green;
      rTriangle4Symbol0.setFillColor(color0);
      rTriangle4Symbol0.draw(graphics0, 0, 0);
      assertEquals(8, rTriangle4Symbol0.getSize());
  }
}
