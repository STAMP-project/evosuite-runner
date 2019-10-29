/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 23:24:16 GMT 2019
 */

package Newzgrabber;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Newzgrabber.MultiLineLabel;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.SystemColor;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import javax.swing.DebugGraphics;
import javax.swing.JTextPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.StyleContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MultiLineLabel_ESTest extends MultiLineLabel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JTextPane jTextPane0 = new JTextPane();
      AttributeSet attributeSet0 = jTextPane0.getCharacterAttributes();
      StyleContext styleContext0 = StyleContext.getDefaultStyleContext();
      Font font0 = styleContext0.getFont(attributeSet0);
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("/%jo's+", (-1051));
      multiLineLabel0.setFont(font0);
      // Undeclared exception!
      try { 
        multiLineLabel0.paint((Graphics) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Newzgrabber.MultiLineLabel", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DebugGraphics debugGraphics0 = new DebugGraphics();
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("H]cKw", 1, 41);
      // Undeclared exception!
      try { 
        multiLineLabel0.paint(debugGraphics0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.swing.DebugGraphics", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("0|;W:nf*.");
      BufferedImage bufferedImage0 = new BufferedImage(2, 8, 8);
      Graphics graphics0 = bufferedImage0.getGraphics();
      Font font0 = new Font("{p38)", 0, (-907));
      multiLineLabel0.setFont(font0);
      multiLineLabel0.paint(graphics0);
      assertEquals(10, multiLineLabel0.getMarginWidth());
      assertEquals(0, multiLineLabel0.getAlignment());
      assertEquals(10, multiLineLabel0.getMarginHeight());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("");
      multiLineLabel0.num_lines = (-721);
      multiLineLabel0.paint((Graphics) null);
      assertEquals(10, multiLineLabel0.getMarginHeight());
      assertEquals(0, multiLineLabel0.getAlignment());
      assertEquals(10, multiLineLabel0.getMarginWidth());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("", 0, 513, 513);
      Dimension dimension0 = multiLineLabel0.getPreferredSize();
      assertEquals(1026, dimension0.height);
      assertEquals(513, multiLineLabel0.getAlignment());
      assertEquals(0, dimension0.width);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JTextPane jTextPane0 = new JTextPane();
      AttributeSet attributeSet0 = jTextPane0.getCharacterAttributes();
      StyleContext styleContext0 = StyleContext.getDefaultStyleContext();
      Font font0 = styleContext0.getFont(attributeSet0);
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("/%jo's+", (-1051));
      multiLineLabel0.setFont(font0);
      Dimension dimension0 = multiLineLabel0.getPreferredSize();
      assertEquals((-1051), multiLineLabel0.getAlignment());
      assertEquals(35, dimension0.height);
      assertEquals(66, dimension0.width);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("", (-380), (-380));
      multiLineLabel0.setMarginWidth((-380));
      assertEquals(0, multiLineLabel0.getAlignment());
      assertEquals((-380), multiLineLabel0.getMarginWidth());
      assertEquals((-380), multiLineLabel0.getMarginHeight());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("0|;W:nf*.");
      Font font0 = new Font("{p38)", 0, (-907));
      AffineTransform affineTransform0 = new AffineTransform(0.0F, (float) 0, (-1.0F), 2221.8872F, 1.0F, (-1.0F));
      Font font1 = font0.deriveFont(affineTransform0);
      multiLineLabel0.setFont(font1);
      assertEquals(10, multiLineLabel0.getMarginWidth());
      assertEquals(10, multiLineLabel0.getMarginHeight());
      assertEquals(0, multiLineLabel0.getAlignment());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("", 0);
      multiLineLabel0.newLabel("Center");
      assertEquals(10, multiLineLabel0.getMarginHeight());
      assertEquals(10, multiLineLabel0.getMarginWidth());
      assertEquals(0, multiLineLabel0.getAlignment());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JTextPane jTextPane0 = new JTextPane();
      AttributeSet attributeSet0 = jTextPane0.getCharacterAttributes();
      StyleContext styleContext0 = StyleContext.getDefaultStyleContext();
      Font font0 = styleContext0.getFont(attributeSet0);
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("/%jo's+", (-1051));
      multiLineLabel0.setFont(font0);
      multiLineLabel0.measure();
      assertEquals(10, multiLineLabel0.getMarginWidth());
      assertEquals(10, multiLineLabel0.getMarginHeight());
      assertEquals((-1051), multiLineLabel0.getAlignment());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JTextPane jTextPane0 = new JTextPane();
      AttributeSet attributeSet0 = jTextPane0.getCharacterAttributes();
      StyleContext styleContext0 = StyleContext.getDefaultStyleContext();
      Font font0 = styleContext0.getFont(attributeSet0);
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("/%jo's+", (-1051));
      multiLineLabel0.setFont(font0);
      multiLineLabel0.addNotify();
      assertEquals(10, multiLineLabel0.getMarginWidth());
      assertEquals((-1051), multiLineLabel0.getAlignment());
      assertEquals(10, multiLineLabel0.getMarginHeight());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JTextPane jTextPane0 = new JTextPane();
      AttributeSet attributeSet0 = jTextPane0.getCharacterAttributes();
      StyleContext styleContext0 = StyleContext.getDefaultStyleContext();
      Font font0 = styleContext0.getFont(attributeSet0);
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("/%jo's+", (-1051));
      multiLineLabel0.setFont(font0);
      multiLineLabel0.setLabel("XC");
      assertEquals(10, multiLineLabel0.getMarginWidth());
      assertEquals(10, multiLineLabel0.getMarginHeight());
      assertEquals((-1051), multiLineLabel0.getAlignment());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("", 0, 0, (-204));
      Dimension dimension0 = multiLineLabel0.getPreferredSize();
      assertEquals(0, dimension0.width);
      assertEquals((-204), multiLineLabel0.getAlignment());
      assertEquals(0, dimension0.height);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("e*", (-2407), (-2407), (-2407));
      Dimension dimension0 = multiLineLabel0.getPreferredSize();
      assertEquals((-4814), dimension0.width);
      assertEquals((-4814), dimension0.height);
      assertEquals((-2407), multiLineLabel0.getAlignment());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("\n", (-134), (-134));
      multiLineLabel0.max_width = (-1);
      Dimension dimension0 = multiLineLabel0.getMinimumSize();
      assertEquals((-134), multiLineLabel0.getMarginWidth());
      assertEquals((-134), multiLineLabel0.getMarginHeight());
      assertEquals(0, multiLineLabel0.getAlignment());
      assertEquals((-1), dimension0.width);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JTextPane jTextPane0 = new JTextPane();
      AttributeSet attributeSet0 = jTextPane0.getCharacterAttributes();
      StyleContext styleContext0 = StyleContext.getDefaultStyleContext();
      Font font0 = styleContext0.getFont(attributeSet0);
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("/%jo's+", (-1051));
      multiLineLabel0.setFont(font0);
      Dimension dimension0 = multiLineLabel0.getMinimumSize();
      assertEquals((-1051), multiLineLabel0.getAlignment());
      assertEquals(46, dimension0.width);
      assertEquals(10, multiLineLabel0.getMarginHeight());
      assertEquals(10, multiLineLabel0.getMarginWidth());
      assertEquals(15, dimension0.height);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("", 0, 513, 513);
      int int0 = multiLineLabel0.getMarginWidth();
      assertEquals(513, multiLineLabel0.getMarginHeight());
      assertEquals(513, multiLineLabel0.getAlignment());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("", (-171), (-2519), 3);
      int int0 = multiLineLabel0.getMarginWidth();
      assertEquals(3, multiLineLabel0.getAlignment());
      assertEquals((-2519), multiLineLabel0.getMarginHeight());
      assertEquals((-171), int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("", 0);
      int int0 = multiLineLabel0.getMarginHeight();
      assertEquals(10, multiLineLabel0.getMarginWidth());
      assertEquals(10, int0);
      assertEquals(0, multiLineLabel0.getAlignment());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("7C@UqUFn33);D*<XiL", (-2977), (-3389));
      int int0 = multiLineLabel0.getMarginHeight();
      assertEquals((-2977), multiLineLabel0.getMarginWidth());
      assertEquals((-3389), int0);
      assertEquals(0, multiLineLabel0.getAlignment());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("+}:tsOH4' j", 0, 10, 1);
      int int0 = multiLineLabel0.getAlignment();
      assertEquals(1, int0);
      assertEquals(10, multiLineLabel0.getMarginHeight());
      assertEquals(0, multiLineLabel0.getMarginWidth());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("", (-380), (-380));
      multiLineLabel0.setAlignment((-1355));
      int int0 = multiLineLabel0.getAlignment();
      assertEquals((-1355), int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("oH7|^k");
      // Undeclared exception!
      try { 
        multiLineLabel0.setFont((Font) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("i0maO4S-zVN?");
      multiLineLabel0.num_lines = 1791;
      Font font0 = Font.decode("i0maO4S-zVN?");
      // Undeclared exception!
      try { 
        multiLineLabel0.setFont(font0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("Newzgrabber.MultiLineLabel", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("");
      multiLineLabel0.num_lines = 1;
      // Undeclared exception!
      try { 
        multiLineLabel0.paint((Graphics) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("Newzgrabber.MultiLineLabel", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("588,`P");
      // Undeclared exception!
      try { 
        multiLineLabel0.newLabel((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("+}:tsOH4' j");
      // Undeclared exception!
      try { 
        multiLineLabel0.measure();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = null;
      try {
        multiLineLabel0 = new MultiLineLabel((String) null, 2416, 2416, 2416);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = null;
      try {
        multiLineLabel0 = new MultiLineLabel((String) null, 2, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = null;
      try {
        multiLineLabel0 = new MultiLineLabel((String) null, 48);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = null;
      try {
        multiLineLabel0 = new MultiLineLabel((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("u Hr !8ngT1uG`", 0, 2, 1);
      // Undeclared exception!
      try { 
        multiLineLabel0.paint((Graphics) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Newzgrabber.MultiLineLabel", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("`", 2782, (-1454), 2);
      // Undeclared exception!
      try { 
        multiLineLabel0.paint((Graphics) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Newzgrabber.MultiLineLabel", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("", 0);
      int int0 = multiLineLabel0.getAlignment();
      assertEquals(0, int0);
      assertEquals(10, multiLineLabel0.getMarginHeight());
      assertEquals(10, multiLineLabel0.getMarginWidth());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("Tm1hE}'\"4l", 0, 0, 10);
      int int0 = multiLineLabel0.getMarginHeight();
      assertEquals(0, int0);
      assertEquals(10, multiLineLabel0.getAlignment());
      assertEquals(0, multiLineLabel0.getMarginWidth());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("/%jo's+", (-1051));
      // Undeclared exception!
      try { 
        multiLineLabel0.setLabel("XC");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("29;n%");
      assertEquals(10, multiLineLabel0.getMarginWidth());
      
      multiLineLabel0.setMarginWidth(1);
      assertEquals(1, multiLineLabel0.getMarginWidth());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("\n", (-134), (-134));
      Dimension dimension0 = multiLineLabel0.getMinimumSize();
      assertEquals((-134), multiLineLabel0.getMarginWidth());
      assertEquals(0, dimension0.width);
      assertEquals((-134), multiLineLabel0.getMarginHeight());
      assertEquals(0, multiLineLabel0.getAlignment());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("fSD]Z$or!%t-");
      // Undeclared exception!
      try { 
        multiLineLabel0.addNotify();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("", 0);
      int int0 = multiLineLabel0.getMarginWidth();
      assertEquals(10, multiLineLabel0.getMarginHeight());
      assertEquals(0, multiLineLabel0.getAlignment());
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("`", 2782, (-1454), 2);
      Font font0 = Font.decode("h7[(1o)|bF");
      multiLineLabel0.setFont(font0);
      // Undeclared exception!
      try { 
        multiLineLabel0.paint((Graphics) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Newzgrabber.MultiLineLabel", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("!");
      SystemColor systemColor0 = SystemColor.controlText;
      multiLineLabel0.setForeground(systemColor0);
      assertEquals(0, multiLineLabel0.getAlignment());
      assertEquals(10, multiLineLabel0.getMarginWidth());
      assertEquals(10, multiLineLabel0.getMarginHeight());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("");
      multiLineLabel0.setMarginHeight(2217);
      assertEquals(2217, multiLineLabel0.getMarginHeight());
  }
}
