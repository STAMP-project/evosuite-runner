/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 17:00:31 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.BoxLLSymbol;
import jahuwaldt.plot.BoxLRSymbol;
import jahuwaldt.plot.BoxULSymbol;
import jahuwaldt.plot.CircleSymbol;
import jahuwaldt.plot.TabRSymbol;
import jahuwaldt.plot.Triangle3Symbol;
import jahuwaldt.plot.Triangle4Symbol;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.SystemColor;
import javax.swing.tree.DefaultTreeCellRenderer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PlotSymbol_ESTest extends PlotSymbol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Triangle3Symbol triangle3Symbol0 = new Triangle3Symbol();
      assertEquals(8, triangle3Symbol0.getSize());
      
      triangle3Symbol0.setSize(0);
      int int0 = triangle3Symbol0.getSize();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Triangle3Symbol triangle3Symbol0 = new Triangle3Symbol();
      int int0 = triangle3Symbol0.getSize();
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BoxULSymbol boxULSymbol0 = new BoxULSymbol();
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      Color color0 = defaultTreeCellRenderer0.getTextSelectionColor();
      boxULSymbol0.setFillColor(color0);
      boxULSymbol0.getFillColor();
      assertEquals(8, boxULSymbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Triangle4Symbol triangle4Symbol0 = new Triangle4Symbol();
      SystemColor systemColor0 = SystemColor.textText;
      triangle4Symbol0.setFillColor(systemColor0);
      triangle4Symbol0.getFillColor();
      assertEquals(8, triangle4Symbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SystemColor systemColor0 = SystemColor.info;
      BoxLRSymbol boxLRSymbol0 = new BoxLRSymbol();
      boxLRSymbol0.setBorderColor(systemColor0);
      boxLRSymbol0.getBorderColor();
      assertEquals(8, boxLRSymbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BoxLRSymbol boxLRSymbol0 = new BoxLRSymbol();
      Color color0 = Color.magenta;
      boxLRSymbol0.setBorderColor(color0);
      boxLRSymbol0.getBorderColor();
      assertEquals(8, boxLRSymbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CircleSymbol circleSymbol0 = new CircleSymbol();
      // Undeclared exception!
      try { 
        circleSymbol0.draw((Graphics) null, 662, 662);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.CircleSymbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Triangle3Symbol triangle3Symbol0 = new Triangle3Symbol();
      triangle3Symbol0.getFillColor();
      assertEquals(8, triangle3Symbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TabRSymbol tabRSymbol0 = new TabRSymbol();
      tabRSymbol0.getBorderColor();
      assertEquals(8, tabRSymbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TabRSymbol tabRSymbol0 = new TabRSymbol();
      tabRSymbol0.setBorderColor((Color) null);
      tabRSymbol0.getBorderColor();
      assertEquals(8, tabRSymbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Triangle3Symbol triangle3Symbol0 = new Triangle3Symbol();
      Triangle3Symbol triangle3Symbol1 = (Triangle3Symbol)triangle3Symbol0.clone();
      assertEquals(8, triangle3Symbol1.getSize());
      assertNotSame(triangle3Symbol1, triangle3Symbol0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BoxLLSymbol boxLLSymbol0 = new BoxLLSymbol();
      boxLLSymbol0.setSize((-922));
      int int0 = boxLLSymbol0.getSize();
      assertEquals((-922), int0);
  }
}
