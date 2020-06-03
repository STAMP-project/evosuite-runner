/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 05 16:38:23 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.TabRSymbol;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.swing.DebugGraphics;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PolygonSymbol_ESTest extends PolygonSymbol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TabRSymbol tabRSymbol0 = new TabRSymbol();
      BufferedImage bufferedImage0 = new BufferedImage(15, 15, 1);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      tabRSymbol0.draw(graphics2D0, 214, 5738);
      assertEquals(8, tabRSymbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TabRSymbol tabRSymbol0 = new TabRSymbol();
      // Undeclared exception!
      try { 
        tabRSymbol0.draw((Graphics) null, (-2997), (-2997));
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
      TabRSymbol tabRSymbol0 = new TabRSymbol();
      tabRSymbol0.setBorderColor((Color) null);
      BufferedImage bufferedImage0 = new BufferedImage(95, 95, 1);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      DebugGraphics debugGraphics0 = new DebugGraphics(graphics2D0);
      tabRSymbol0.draw(debugGraphics0, 95, 95);
      assertEquals(8, tabRSymbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TabRSymbol tabRSymbol0 = new TabRSymbol();
      Color color0 = new Color((-2100));
      tabRSymbol0.setFillColor(color0);
      BufferedImage bufferedImage0 = new BufferedImage(15, 15, 1);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      DebugGraphics debugGraphics0 = new DebugGraphics(graphics2D0);
      tabRSymbol0.draw(debugGraphics0, 15, 15);
      assertEquals(8, tabRSymbol0.getSize());
  }
}
