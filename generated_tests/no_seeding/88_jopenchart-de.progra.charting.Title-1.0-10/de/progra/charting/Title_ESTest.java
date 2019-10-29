/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 00:23:56 GMT 2019
 */

package de.progra.charting;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.progra.charting.Title;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.text.AttributedCharacterIterator;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Title_ESTest extends Title_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Font font0 = new Font(",*H:abuDP wy8h2lM", (-845), 769);
      Title title0 = new Title((String) null, font0);
      String string0 = title0.getText();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Title title0 = new Title("");
      String string0 = title0.getText();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Title title0 = new Title("");
      Dimension dimension0 = title0.getPreferredSize();
      assertEquals(0, dimension0.width);
      assertEquals(25, dimension0.height);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Font font0 = new Font(".x", (-3543), (-3543));
      Title title0 = new Title(".x", font0);
      Dimension dimension0 = title0.getPreferredSize();
      assertEquals((-3221), dimension0.width);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Title title0 = new Title("qL^w[<O>#%^75XiIJOD", (Font) null);
      Font font0 = title0.getFont();
      assertNull(font0);
      assertEquals("qL^w[<O>#%^75XiIJOD", title0.getText());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Title title0 = new Title("");
      Font font0 = Font.decode("!6jJ8");
      AffineTransform affineTransform0 = AffineTransform.getQuadrantRotateInstance(134, (-4832.849862993974), (double) 134);
      Font font1 = font0.deriveFont(affineTransform0);
      title0.font = font1;
      title0.getFont();
      assertEquals("", title0.getText());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Title title0 = new Title();
      HashMap<AttributedCharacterIterator.Attribute, String> hashMap0 = new HashMap<AttributedCharacterIterator.Attribute, String>();
      Font font0 = new Font(hashMap0);
      Font font1 = font0.deriveFont((-1));
      title0.setFont(font1);
      Font font2 = title0.getFont();
      assertEquals("Chart Title", title0.getText());
      assertTrue(font2.isItalic());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Font font0 = Font.decode("");
      Title title0 = new Title("", font0);
      Font font1 = font0.deriveFont((float) 0);
      title0.setFont(font1);
      Font font2 = title0.getFont();
      assertEquals("", title0.getText());
      assertEquals(0.0F, font2.getSize2D(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Title title0 = new Title((String) null);
      // Undeclared exception!
      try { 
        title0.paintDefault((Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.Title", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Title title0 = new Title("");
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        title0.paintDefault(graphics2D0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Zero length string passed to TextLayout constructor.
         //
         verifyException("java.awt.font.TextLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<AttributedCharacterIterator.Attribute, Integer> hashMap0 = new HashMap<AttributedCharacterIterator.Attribute, Integer>();
      Font font0 = Font.getFont((Map<? extends AttributedCharacterIterator.Attribute, ?>) hashMap0);
      AffineTransform affineTransform0 = AffineTransform.getQuadrantRotateInstance((-918), (double) (-918), (double) (-918));
      Font font1 = font0.deriveFont(affineTransform0);
      Title title0 = new Title("", font1);
      // Undeclared exception!
      try { 
        title0.getPreferredSize();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Zero length string passed to TextLayout constructor.
         //
         verifyException("java.awt.font.TextLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Title title0 = new Title();
      title0.setText("Q- 8.xKA*a");
      assertEquals("Q- 8.xKA*a", title0.getText());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Title title0 = new Title();
      Dimension dimension0 = title0.getPreferredSize();
      assertEquals(115, dimension0.width);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Title title0 = new Title();
      String string0 = title0.getText();
      assertEquals("Chart Title", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Title title0 = new Title("dYQl$2'*6]|");
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      title0.paintDefault(graphics2D0);
      assertEquals("dYQl$2'*6]|", title0.getText());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Font font0 = new Font(".x", (-3543), (-3543));
      Title title0 = new Title(".x", font0);
      Font font1 = title0.getFont();
      assertEquals(".x", title0.getText());
      assertEquals(".x", font1.getName());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Title title0 = new Title((String) null);
      // Undeclared exception!
      try { 
        title0.getPreferredSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.Font", e);
      }
  }
}
