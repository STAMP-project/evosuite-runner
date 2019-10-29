/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 18:22:47 GMT 2019
 */

package ghm.follow.search;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ghm.follow.search.LineResult;
import ghm.follow.search.SearchableTextPane;
import java.awt.Font;
import java.awt.Insets;
import java.util.List;
import java.util.regex.PatternSyntaxException;
import javax.swing.JLayer;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import javax.swing.plaf.TextUI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SearchableTextPane_ESTest extends SearchableTextPane_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SearchableTextPane searchableTextPane0 = new SearchableTextPane((Font) null, Integer.MAX_VALUE);
      JScrollPane jScrollPane0 = new JScrollPane(searchableTextPane0);
      JViewport jViewport0 = jScrollPane0.getViewport();
      Insets insets0 = jViewport0.getInsets();
      insets0.right = (-4328);
      searchableTextPane0.setMargin(insets0);
      boolean boolean0 = searchableTextPane0.getScrollableTracksViewportWidth();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SearchableTextPane searchableTextPane0 = new SearchableTextPane((Font) null, 1621);
      int int0 = searchableTextPane0.search("", 1621);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SearchableTextPane searchableTextPane0 = new SearchableTextPane((Font) null, 1);
      // Undeclared exception!
      try { 
        searchableTextPane0.search((String) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SearchableTextPane searchableTextPane0 = new SearchableTextPane((Font) null, 1647);
      // Undeclared exception!
      try { 
        searchableTextPane0.highlight("2;P)u6u", 1647);
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Unmatched closing ')' near index 2
         // 2;P)u6u
         //   ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SearchableTextPane searchableTextPane0 = new SearchableTextPane((Font) null, (-1982));
      searchableTextPane0.setUI((TextUI) null);
      // Undeclared exception!
      try { 
        searchableTextPane0.highlight("$", (-1982));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ghm.follow.search.SearchableTextPane", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SearchableTextPane searchableTextPane0 = new SearchableTextPane((Font) null, 2860);
      // Undeclared exception!
      try { 
        searchableTextPane0.highlight(")", 2860);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown search strategy requested [flags=2860
         //
         verifyException("ghm.follow.search.SearchEngine", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SearchableTextPane searchableTextPane0 = new SearchableTextPane((Font) null, 1);
      JLayer<SearchableTextPane> jLayer0 = new JLayer<SearchableTextPane>(searchableTextPane0);
      // Undeclared exception!
      try { 
        searchableTextPane0.getScrollableTracksViewportWidth();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.swing.text.PlainView", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Font font0 = Font.decode("Line ");
      SearchableTextPane searchableTextPane0 = new SearchableTextPane(font0, 1);
      searchableTextPane0.removeHighlights();
      assertFalse(searchableTextPane0.isFocusTraversalPolicyProvider());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Font font0 = Font.decode("Line ");
      SearchableTextPane searchableTextPane0 = new SearchableTextPane(font0, 1);
      int int0 = searchableTextPane0.search("?*PVwz[lhH", 1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Font font0 = Font.decode("Line ");
      SearchableTextPane searchableTextPane0 = new SearchableTextPane(font0, 1);
      List<LineResult> list0 = searchableTextPane0.highlight("Line ", (-1));
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SearchableTextPane searchableTextPane0 = new SearchableTextPane((Font) null, (-99));
      int int0 = searchableTextPane0.search("");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Font font0 = Font.decode("Line ");
      SearchableTextPane searchableTextPane0 = new SearchableTextPane(font0, 1);
      int int0 = searchableTextPane0.search((String) null);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Font font0 = Font.decode("");
      SearchableTextPane searchableTextPane0 = new SearchableTextPane(font0, 698);
      List<LineResult> list0 = searchableTextPane0.highlight("", 698);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Font font0 = Font.decode("Line ");
      SearchableTextPane searchableTextPane0 = new SearchableTextPane(font0, 1);
      List<LineResult> list0 = searchableTextPane0.highlight((String) null, (-1));
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SearchableTextPane searchableTextPane0 = new SearchableTextPane((Font) null, 1647);
      JScrollPane jScrollPane0 = new JScrollPane(searchableTextPane0);
      JViewport jViewport0 = jScrollPane0.getViewport();
      Insets insets0 = jViewport0.getInsets();
      searchableTextPane0.setMargin(insets0);
      boolean boolean0 = searchableTextPane0.getScrollableTracksViewportWidth();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SearchableTextPane searchableTextPane0 = new SearchableTextPane((Font) null, 1647);
      JScrollPane jScrollPane0 = new JScrollPane(searchableTextPane0);
      boolean boolean0 = searchableTextPane0.getScrollableTracksViewportWidth();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SearchableTextPane searchableTextPane0 = new SearchableTextPane((Font) null, (-99));
      boolean boolean0 = searchableTextPane0.getScrollableTracksViewportWidth();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SearchableTextPane searchableTextPane0 = new SearchableTextPane((Font) null, (-99));
      int int0 = searchableTextPane0.search("c20Z(");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SearchableTextPane searchableTextPane0 = new SearchableTextPane((Font) null, (-99));
      List<LineResult> list0 = searchableTextPane0.highlight("`Vk&|>?", (-1));
      assertFalse(list0.isEmpty());
  }
}
