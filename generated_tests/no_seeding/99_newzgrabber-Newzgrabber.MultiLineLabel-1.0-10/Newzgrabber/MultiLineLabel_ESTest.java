/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 04 14:49:10 GMT 2019
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
import java.text.AttributedCharacterIterator;
import java.util.Hashtable;
import java.util.Map;
import javax.swing.DebugGraphics;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MultiLineLabel_ESTest extends MultiLineLabel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("MW7,eyKQ>bf7/A1jtA", 160);
      Hashtable<AttributedCharacterIterator.Attribute, String> hashtable0 = new Hashtable<AttributedCharacterIterator.Attribute, String>();
      Font font0 = Font.getFont((Map<? extends AttributedCharacterIterator.Attribute, ?>) hashtable0);
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
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("uZT&3M|8Rs1<%lo0");
      multiLineLabel0.setMarginHeight(55);
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
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("[=)", (-1452));
      multiLineLabel0.num_lines = (-1452);
      DebugGraphics debugGraphics0 = new DebugGraphics();
      multiLineLabel0.paint(debugGraphics0);
      assertEquals((-1452), multiLineLabel0.getAlignment());
      assertEquals(10, multiLineLabel0.getMarginHeight());
      assertEquals(10, multiLineLabel0.getMarginWidth());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("R!v-srtKJle<|DfM!f", 30, (-118), 2);
      Hashtable<AttributedCharacterIterator.Attribute, Object> hashtable0 = new Hashtable<AttributedCharacterIterator.Attribute, Object>();
      Font font0 = new Font(hashtable0);
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
  public void test04()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("");
      Dimension dimension0 = multiLineLabel0.getMinimumSize();
      assertEquals(0, multiLineLabel0.getAlignment());
      assertEquals(10, multiLineLabel0.getMarginHeight());
      assertEquals(10, multiLineLabel0.getMarginWidth());
      assertEquals(0, dimension0.width);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("[=)", (-1452));
      multiLineLabel0.num_lines = (-1452);
      Dimension dimension0 = multiLineLabel0.getPreferredSize();
      assertEquals(20, dimension0.width);
      assertEquals((-1452), multiLineLabel0.getAlignment());
      assertEquals(20, dimension0.height);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("}(y`R<DDxz;v5aV5+");
      Font font0 = Font.decode((String) null);
      multiLineLabel0.setFont(font0);
      Dimension dimension0 = multiLineLabel0.getPreferredSize();
      assertEquals(0, multiLineLabel0.getAlignment());
      assertEquals(151, dimension0.width);
      assertEquals(35, dimension0.height);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel(".VgL@NQ", (-1316), 0, 0);
      multiLineLabel0.setAlignment(0);
      assertEquals((-1316), multiLineLabel0.getMarginWidth());
      assertEquals(0, multiLineLabel0.getMarginHeight());
      assertEquals(0, multiLineLabel0.getAlignment());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("5=vc[pR1V4`8XF");
      Font font0 = Font.decode("South");
      Font font1 = font0.deriveFont(1, (-2875.2F));
      multiLineLabel0.setFont(font1);
      assertEquals(10, multiLineLabel0.getMarginHeight());
      assertEquals(10, multiLineLabel0.getMarginWidth());
      assertEquals(0, multiLineLabel0.getAlignment());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("}(y`R<DDxz;v5aV5+");
      Font font0 = Font.decode((String) null);
      multiLineLabel0.setFont(font0);
      multiLineLabel0.setLabel("");
      assertEquals(10, multiLineLabel0.getMarginWidth());
      assertEquals(10, multiLineLabel0.getMarginHeight());
      assertEquals(0, multiLineLabel0.getAlignment());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("Center", 160);
      multiLineLabel0.newLabel("R");
      assertEquals(10, multiLineLabel0.getMarginWidth());
      assertEquals(160, multiLineLabel0.getAlignment());
      assertEquals(10, multiLineLabel0.getMarginHeight());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("}(y`R<DDxz;v5aV5+");
      Font font0 = Font.decode((String) null);
      multiLineLabel0.setFont(font0);
      multiLineLabel0.addNotify();
      assertEquals(10, multiLineLabel0.getMarginHeight());
      assertEquals(10, multiLineLabel0.getMarginWidth());
      assertEquals(0, multiLineLabel0.getAlignment());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("}(y`R<DDxz;v5aV5+");
      Font font0 = Font.decode("}(y`R<DDxz;v5aV5+");
      multiLineLabel0.setFont(font0);
      multiLineLabel0.setLabel("}(y`R<DDxz;v5aV5+");
      assertEquals(0, multiLineLabel0.getAlignment());
      assertEquals(10, multiLineLabel0.getMarginWidth());
      assertEquals(10, multiLineLabel0.getMarginHeight());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("*m!Z!e>J", 0, (-103));
      Dimension dimension0 = multiLineLabel0.getPreferredSize();
      assertEquals((-206), dimension0.height);
      assertEquals(0, multiLineLabel0.getAlignment());
      assertEquals(0, dimension0.width);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel(".VgL@NQ", (-1316), 0, 0);
      Dimension dimension0 = multiLineLabel0.getPreferredSize();
      assertEquals(0, dimension0.height);
      assertEquals(0, multiLineLabel0.getAlignment());
      assertEquals((-2632), dimension0.width);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("file.separator", 307);
      multiLineLabel0.max_width = (-1);
      Dimension dimension0 = multiLineLabel0.getMinimumSize();
      assertEquals(0, dimension0.height);
      assertEquals((-1), dimension0.width);
      assertEquals(307, multiLineLabel0.getAlignment());
      assertEquals(10, multiLineLabel0.getMarginWidth());
      assertEquals(10, multiLineLabel0.getMarginHeight());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("}(y`R<DDxz;v5aV5+");
      Font font0 = Font.decode("}(y`R<DDxz;v5aV5+");
      multiLineLabel0.setFont(font0);
      Dimension dimension0 = multiLineLabel0.getMinimumSize();
      assertEquals(0, multiLineLabel0.getAlignment());
      assertEquals(15, dimension0.height);
      assertEquals(10, multiLineLabel0.getMarginHeight());
      assertEquals(131, dimension0.width);
      assertEquals(10, multiLineLabel0.getMarginWidth());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("xv", 0, 0);
      int int0 = multiLineLabel0.getMarginWidth();
      assertEquals(0, multiLineLabel0.getAlignment());
      assertEquals(0, int0);
      assertEquals(0, multiLineLabel0.getMarginHeight());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel(".VgL@NQ", (-1316), 0, 0);
      int int0 = multiLineLabel0.getMarginWidth();
      assertEquals((-1316), int0);
      assertEquals(0, multiLineLabel0.getAlignment());
      assertEquals(0, multiLineLabel0.getMarginHeight());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel(":>H-Ul", 0, 0);
      int int0 = multiLineLabel0.getMarginHeight();
      assertEquals(0, int0);
      assertEquals(0, multiLineLabel0.getMarginWidth());
      assertEquals(0, multiLineLabel0.getAlignment());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("", 1, (-801));
      int int0 = multiLineLabel0.getMarginHeight();
      assertEquals(1, multiLineLabel0.getMarginWidth());
      assertEquals((-801), int0);
      assertEquals(0, multiLineLabel0.getAlignment());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("Os", 10);
      int int0 = multiLineLabel0.getAlignment();
      assertEquals(10, multiLineLabel0.getMarginHeight());
      assertEquals(10, multiLineLabel0.getMarginWidth());
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("9<E+*H|RJ2t;VWcx&W", (-801));
      int int0 = multiLineLabel0.getAlignment();
      assertEquals(10, multiLineLabel0.getMarginWidth());
      assertEquals(10, multiLineLabel0.getMarginHeight());
      assertEquals((-801), int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("!^pCX{VU<");
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
  public void test24()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("\n");
      multiLineLabel0.num_lines = 2;
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
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("");
      // Undeclared exception!
      try { 
        multiLineLabel0.newLabel((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.StringTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("");
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
        multiLineLabel0 = new MultiLineLabel((String) null, 3110, 3110, 3110);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.StringTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = null;
      try {
        multiLineLabel0 = new MultiLineLabel((String) null, (-519), (-519));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.StringTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = null;
      try {
        multiLineLabel0 = new MultiLineLabel((String) null, (-457));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.StringTokenizer", e);
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
         verifyException("java.util.StringTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("#e6M1OHSn}!t4Te", 1);
      DebugGraphics debugGraphics0 = new DebugGraphics();
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
  public void test32()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("\n");
      multiLineLabel0.paint((Graphics) null);
      assertEquals(10, multiLineLabel0.getMarginWidth());
      assertEquals(10, multiLineLabel0.getMarginHeight());
      assertEquals(0, multiLineLabel0.getAlignment());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("R!v-srtKJle<|DfM!f");
      Font font0 = Font.decode("R!v-srtKJle<|DfM!f");
      Font font1 = font0.deriveFont((float) 0);
      multiLineLabel0.setFont(font1);
      assertEquals(10, multiLineLabel0.getMarginWidth());
      assertEquals(10, multiLineLabel0.getMarginHeight());
      assertEquals(0, multiLineLabel0.getAlignment());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("N!@K\"%ejF=-oHnclV9");
      assertEquals(0, multiLineLabel0.getAlignment());
      
      multiLineLabel0.setAlignment(1);
      assertEquals(1, multiLineLabel0.getAlignment());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("*m!Z!e>J", (-686), (-686));
      int int0 = multiLineLabel0.getAlignment();
      assertEquals((-686), multiLineLabel0.getMarginWidth());
      assertEquals((-686), multiLineLabel0.getMarginHeight());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("}(y`R<DDxz;v5aV5+");
      int int0 = multiLineLabel0.getMarginHeight();
      assertEquals(10, multiLineLabel0.getMarginWidth());
      assertEquals(0, multiLineLabel0.getAlignment());
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("}(y`R<DDxz;v5aV5+");
      // Undeclared exception!
      try { 
        multiLineLabel0.setLabel("}(y`R<DDxz;v5aV5+");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("_");
      multiLineLabel0.setMarginWidth(1638);
      assertEquals(1638, multiLineLabel0.getMarginWidth());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("T");
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
  public void test40()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("");
      int int0 = multiLineLabel0.getMarginWidth();
      assertEquals(10, int0);
      assertEquals(10, multiLineLabel0.getMarginHeight());
      assertEquals(0, multiLineLabel0.getAlignment());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("R!v-srtKJle<|DfM!f", 30, (-118), 2);
      Hashtable<AttributedCharacterIterator.Attribute, Object> hashtable0 = new Hashtable<AttributedCharacterIterator.Attribute, Object>();
      Font font0 = new Font(hashtable0);
      multiLineLabel0.setFont(font0);
      multiLineLabel0.measure();
      assertEquals(30, multiLineLabel0.getMarginWidth());
      assertEquals(2, multiLineLabel0.getAlignment());
      assertEquals((-118), multiLineLabel0.getMarginHeight());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Integer[] integerArray0 = new Integer[4];
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      integerArray0[0] = integer0;
      MultiLineLabel multiLineLabel0 = new MultiLineLabel("<aX B`P?", 30, (int) integerArray0[0], (-819));
      SystemColor systemColor0 = SystemColor.scrollbar;
      multiLineLabel0.setForeground(systemColor0);
      assertEquals((-819), multiLineLabel0.getAlignment());
      assertEquals(100, multiLineLabel0.getMarginHeight());
      assertEquals(30, multiLineLabel0.getMarginWidth());
  }
}
