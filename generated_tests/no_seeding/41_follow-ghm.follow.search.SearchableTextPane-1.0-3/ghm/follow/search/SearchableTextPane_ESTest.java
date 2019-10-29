/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 15:53:15 GMT 2019
 */

package ghm.follow.search;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ghm.follow.search.LineResult;
import ghm.follow.search.SearchableTextPane;
import java.awt.Font;
import java.util.List;
import java.util.regex.PatternSyntaxException;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.plaf.TextUI;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.StringContent;
import javax.swing.text.Style;
import javax.swing.text.StyleContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SearchableTextPane_ESTest extends SearchableTextPane_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Font font0 = new Font("", 30, 30);
      SearchableTextPane searchableTextPane0 = new SearchableTextPane(font0, 30);
      searchableTextPane0.append("ghm.follow.search.LineResult");
      int int0 = searchableTextPane0.search("", 10);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SearchableTextPane searchableTextPane0 = new SearchableTextPane((Font) null, 374);
      int int0 = searchableTextPane0.search("w\"\"3l7^:&8P,\u0002", 374);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Font font0 = new Font("", (-1), (-814));
      SearchableTextPane searchableTextPane0 = new SearchableTextPane(font0, (-814));
      searchableTextPane0.append("{B(-e0");
      int int0 = searchableTextPane0.search("-");
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SearchableTextPane searchableTextPane0 = new SearchableTextPane((Font) null, 15);
      // Undeclared exception!
      try { 
        searchableTextPane0.search((String) null, 15);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Font font0 = Font.decode("/{");
      SearchableTextPane searchableTextPane0 = new SearchableTextPane(font0, (-333));
      // Undeclared exception!
      try { 
        searchableTextPane0.highlight("/{", (-333));
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Illegal repetition near index 0
         // /{
         // ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Font font0 = Font.decode("");
      SearchableTextPane searchableTextPane0 = new SearchableTextPane(font0, (-293));
      searchableTextPane0.setUI((TextUI) null);
      // Undeclared exception!
      try { 
        searchableTextPane0.highlight((String) null, 18);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ghm.follow.search.SearchableTextPane", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SearchableTextPane searchableTextPane0 = new SearchableTextPane((Font) null, 1300);
      // Undeclared exception!
      try { 
        searchableTextPane0.highlight("B _RG!WZx79q", 1300);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown search strategy requested [flags=1300
         //
         verifyException("ghm.follow.search.SearchEngine", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Font font0 = new Font("BadLocationException in SearchableTextPane", 153, 1);
      SearchableTextPane searchableTextPane0 = new SearchableTextPane(font0, (-2306));
      searchableTextPane0.removeHighlights();
      assertFalse(searchableTextPane0.isFocusTraversalPolicyProvider());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Font font0 = new Font("", 30, 30);
      SearchableTextPane searchableTextPane0 = new SearchableTextPane(font0, 30);
      int int0 = searchableTextPane0.search("", 10);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Font font0 = Font.decode("_RG!WZx79q");
      SearchableTextPane searchableTextPane0 = new SearchableTextPane(font0, (-293));
      List<LineResult> list0 = searchableTextPane0.highlight("_RG!WZx79q", (-293));
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Font font0 = Font.decode("Clf|M*");
      SearchableTextPane searchableTextPane0 = new SearchableTextPane(font0, (-1));
      searchableTextPane0.append("Clf|M*");
      List<LineResult> list0 = searchableTextPane0.highlight("Clf|M*", (-2570));
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Font font0 = Font.decode("Clf|M*");
      SearchableTextPane searchableTextPane0 = new SearchableTextPane(font0, (-1));
      searchableTextPane0.append("Clf|M*");
      int int0 = searchableTextPane0.search("Clf|M*");
      int int1 = searchableTextPane0.search("Clf|M*");
      assertEquals((-1), int1);
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringContent stringContent0 = new StringContent();
      StyleContext styleContext0 = new StyleContext();
      DefaultStyledDocument defaultStyledDocument0 = new DefaultStyledDocument(stringContent0, styleContext0);
      JTextPane jTextPane0 = new JTextPane(defaultStyledDocument0);
      Style style0 = jTextPane0.getLogicalStyle();
      Font font0 = defaultStyledDocument0.getFont(style0);
      SearchableTextPane searchableTextPane0 = new SearchableTextPane(font0, (-1390));
      int int0 = searchableTextPane0.search("");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringContent stringContent0 = new StringContent();
      StyleContext styleContext0 = new StyleContext();
      DefaultStyledDocument defaultStyledDocument0 = new DefaultStyledDocument(stringContent0, styleContext0);
      JTextPane jTextPane0 = new JTextPane(defaultStyledDocument0);
      Style style0 = jTextPane0.getLogicalStyle();
      Font font0 = defaultStyledDocument0.getFont(style0);
      SearchableTextPane searchableTextPane0 = new SearchableTextPane(font0, (-1390));
      int int0 = searchableTextPane0.search((String) null);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Font font0 = new Font("", (-1), (-814));
      SearchableTextPane searchableTextPane0 = new SearchableTextPane(font0, (-814));
      List<LineResult> list0 = searchableTextPane0.highlight("", (-3140));
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Font font0 = new Font("BadLocationException in SearchableTextPane", 1, 1);
      SearchableTextPane searchableTextPane0 = new SearchableTextPane(font0, 1);
      List<LineResult> list0 = searchableTextPane0.highlight((String) null, 1);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Font font0 = Font.decode("Clf|M*");
      SearchableTextPane searchableTextPane0 = new SearchableTextPane(font0, (-1));
      searchableTextPane0.append("Clf|M*");
      JScrollPane jScrollPane0 = new JScrollPane(searchableTextPane0);
      boolean boolean0 = searchableTextPane0.getScrollableTracksViewportWidth();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SearchableTextPane searchableTextPane0 = new SearchableTextPane((Font) null, (-4209));
      JScrollPane jScrollPane0 = new JScrollPane(searchableTextPane0);
      boolean boolean0 = searchableTextPane0.getScrollableTracksViewportWidth();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Font font0 = new Font("", (-1), (-814));
      SearchableTextPane searchableTextPane0 = new SearchableTextPane(font0, (-814));
      boolean boolean0 = searchableTextPane0.getScrollableTracksViewportWidth();
      assertTrue(boolean0);
  }
}
