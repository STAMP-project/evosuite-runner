/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 21:01:48 GMT 2019
 */

package de.progra.charting.render;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.progra.charting.Legend;
import de.progra.charting.Title;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractRenderer_ESTest extends AbstractRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Legend legend0 = new Legend();
      legend0.setBounds((Rectangle) null);
      Rectangle rectangle0 = legend0.getBounds();
      assertNull(rectangle0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Title title0 = new Title();
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
  public void test2()  throws Throwable  {
      Legend legend0 = new Legend();
      Rectangle rectangle0 = legend0.getBounds();
      assertEquals(2.147483647E9, rectangle0.getMaxX(), 0.01);
      assertEquals(1.0737418235E9, rectangle0.getCenterY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Title title0 = new Title();
      Rectangle rectangle0 = new Rectangle();
      title0.setBounds(rectangle0);
      // Undeclared exception!
      try { 
        title0.render((Graphics2D) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Width (0) and height (0) must be non-zero
         //
         verifyException("java.awt.image.ReplicateScaleFilter", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Title title0 = new Title();
      Rectangle rectangle0 = new Rectangle(3510, 3510, 3510, (-1));
      title0.setBounds(rectangle0);
      // Undeclared exception!
      try { 
        title0.render((Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.render.AbstractRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Title title0 = new Title();
      // Undeclared exception!
      try { 
        title0.render((Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.render.AbstractRenderer", e);
      }
  }
}
