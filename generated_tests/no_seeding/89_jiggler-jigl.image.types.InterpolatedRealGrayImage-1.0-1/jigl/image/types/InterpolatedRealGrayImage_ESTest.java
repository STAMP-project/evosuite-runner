/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 04 10:56:41 GMT 2019
 */

package jigl.image.types;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Image;
import jigl.image.InterpolationMethod;
import jigl.image.types.InterpolatedRealGrayImage;
import jigl.image.types.RealGrayImage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InterpolatedRealGrayImage_ESTest extends InterpolatedRealGrayImage_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(4, 4);
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
      assertEquals(4, interpolatedRealGrayImage0.Y());
      assertEquals(4, interpolatedRealGrayImage0.X());
      assertNotNull(interpolatedRealGrayImage0);
      
      interpolatedRealGrayImage0.splat((-0.066615686F), (-0.066615686F), 1769.73F);
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
      assertEquals(4, interpolatedRealGrayImage0.Y());
      assertEquals(4, interpolatedRealGrayImage0.X());
      
      interpolatedRealGrayImage0.accum((-0.066615686F), 0.0F, 0.0F);
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
      assertEquals(4, interpolatedRealGrayImage0.Y());
      assertEquals(4, interpolatedRealGrayImage0.X());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(4, 4);
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
      assertEquals(4, interpolatedRealGrayImage0.X());
      assertEquals(4, interpolatedRealGrayImage0.Y());
      assertNotNull(interpolatedRealGrayImage0);
      
      interpolatedRealGrayImage0.splat((-0.066615686F), (-0.066615686F), 1769.73F);
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
      assertEquals(4, interpolatedRealGrayImage0.X());
      assertEquals(4, interpolatedRealGrayImage0.Y());
      
      interpolatedRealGrayImage0.accum((-0.066615686F), (-0.066615686F), 1769.73F);
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
      assertEquals(4, interpolatedRealGrayImage0.X());
      assertEquals(4, interpolatedRealGrayImage0.Y());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(6, 6);
      assertEquals(6, interpolatedRealGrayImage0.Y());
      assertEquals(6, interpolatedRealGrayImage0.X());
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
      assertNotNull(interpolatedRealGrayImage0);
      
      InterpolationMethod interpolationMethod0 = InterpolationMethod.LINEAR;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      assertEquals(6, interpolatedRealGrayImage0.Y());
      assertEquals(6, interpolatedRealGrayImage0.X());
      assertEquals(InterpolationMethod.LINEAR, interpolatedRealGrayImage0.getInterpolationMethod());
      
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.interp(6, 5.0F);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(6, 6);
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
      assertEquals(6, interpolatedRealGrayImage0.Y());
      assertEquals(6, interpolatedRealGrayImage0.X());
      assertNotNull(interpolatedRealGrayImage0);
      
      InterpolationMethod interpolationMethod0 = InterpolationMethod.LINEAR;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      assertEquals(InterpolationMethod.LINEAR, interpolatedRealGrayImage0.getInterpolationMethod());
      assertEquals(6, interpolatedRealGrayImage0.Y());
      assertEquals(6, interpolatedRealGrayImage0.X());
      
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.interp(0.0F, 5.0F);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(6, 6);
      assertEquals(6, interpolatedRealGrayImage0.Y());
      assertEquals(6, interpolatedRealGrayImage0.X());
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
      assertNotNull(interpolatedRealGrayImage0);
      
      InterpolationMethod interpolationMethod0 = InterpolationMethod.LINEAR;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      assertEquals(6, interpolatedRealGrayImage0.Y());
      assertEquals(6, interpolatedRealGrayImage0.X());
      assertEquals(InterpolationMethod.LINEAR, interpolatedRealGrayImage0.getInterpolationMethod());
      
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.interp(5.0F, 949.9366F);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 949
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(6, 6);
      assertEquals(6, interpolatedRealGrayImage0.Y());
      assertEquals(6, interpolatedRealGrayImage0.X());
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
      assertNotNull(interpolatedRealGrayImage0);
      
      interpolatedRealGrayImage0.splat(5.0F, 0.0F, 1.3745804F);
      assertEquals(6, interpolatedRealGrayImage0.Y());
      assertEquals(6, interpolatedRealGrayImage0.X());
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(6, 6);
      assertEquals(6, interpolatedRealGrayImage0.Y());
      assertEquals(6, interpolatedRealGrayImage0.X());
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
      assertNotNull(interpolatedRealGrayImage0);
      
      interpolatedRealGrayImage0.splat(0.0F, 5.0F, (-191.08658F));
      assertEquals(6, interpolatedRealGrayImage0.Y());
      assertEquals(6, interpolatedRealGrayImage0.X());
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(6, 6);
      assertEquals(6, interpolatedRealGrayImage0.Y());
      assertEquals(6, interpolatedRealGrayImage0.X());
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
      assertNotNull(interpolatedRealGrayImage0);
      
      interpolatedRealGrayImage0.splat(1.3745804F, 0.0F, 1.3745804F);
      assertEquals(6, interpolatedRealGrayImage0.Y());
      assertEquals(6, interpolatedRealGrayImage0.X());
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
      
      InterpolationMethod interpolationMethod0 = InterpolationMethod.CUBIC;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      assertEquals(6, interpolatedRealGrayImage0.Y());
      assertEquals(6, interpolatedRealGrayImage0.X());
      assertEquals(InterpolationMethod.CUBIC, interpolatedRealGrayImage0.getInterpolationMethod());
      
      Float float0 = interpolatedRealGrayImage0.interp(1.3745804F, 0.0F);
      assertEquals(0.7305347F, (float)float0, 0.01F);
      assertEquals(6, interpolatedRealGrayImage0.Y());
      assertEquals(6, interpolatedRealGrayImage0.X());
      assertEquals(InterpolationMethod.CUBIC, interpolatedRealGrayImage0.getInterpolationMethod());
      assertNotNull(float0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(8, 8);
      assertEquals(8, interpolatedRealGrayImage0.X());
      assertEquals(8, interpolatedRealGrayImage0.Y());
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
      assertNotNull(interpolatedRealGrayImage0);
      
      interpolatedRealGrayImage0.splat((-0.066615686F), (-0.066615686F), (-0.066615686F));
      assertEquals(8, interpolatedRealGrayImage0.X());
      assertEquals(8, interpolatedRealGrayImage0.Y());
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
      
      InterpolationMethod interpolationMethod0 = InterpolationMethod.LINEAR;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      assertEquals(InterpolationMethod.LINEAR, interpolatedRealGrayImage0.getInterpolationMethod());
      assertEquals(8, interpolatedRealGrayImage0.X());
      assertEquals(8, interpolatedRealGrayImage0.Y());
      
      Float float0 = interpolatedRealGrayImage0.interp((-0.066615686F), (-0.066615686F));
      assertEquals((-0.08689401F), (float)float0, 0.01F);
      assertEquals(InterpolationMethod.LINEAR, interpolatedRealGrayImage0.getInterpolationMethod());
      assertEquals(8, interpolatedRealGrayImage0.X());
      assertEquals(8, interpolatedRealGrayImage0.Y());
      assertNotNull(float0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(38, 38);
      assertEquals(38, interpolatedRealGrayImage0.X());
      assertEquals(38, interpolatedRealGrayImage0.Y());
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
      assertNotNull(interpolatedRealGrayImage0);
      
      interpolatedRealGrayImage0.splat(35.51691F, 35.51691F, 35.51691F);
      assertEquals(38, interpolatedRealGrayImage0.X());
      assertEquals(38, interpolatedRealGrayImage0.Y());
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
      
      interpolatedRealGrayImage0.accum(35.51691F, 35.51691F, 35.51691F);
      assertEquals(38, interpolatedRealGrayImage0.X());
      assertEquals(38, interpolatedRealGrayImage0.Y());
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(6, 6);
      assertEquals(6, interpolatedRealGrayImage0.Y());
      assertEquals(6, interpolatedRealGrayImage0.X());
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
      assertNotNull(interpolatedRealGrayImage0);
      
      interpolatedRealGrayImage0.splat(0.0F, 0.0F, 0.0F);
      assertEquals(6, interpolatedRealGrayImage0.Y());
      assertEquals(6, interpolatedRealGrayImage0.X());
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
      
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.accum(0.0F, 1.0F, 6);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(6, 6);
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
      assertEquals(6, interpolatedRealGrayImage0.Y());
      assertEquals(6, interpolatedRealGrayImage0.X());
      assertNotNull(interpolatedRealGrayImage0);
      
      interpolatedRealGrayImage0.splat((-0.066615686F), (-0.066615686F), 1769.73F);
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
      assertEquals(6, interpolatedRealGrayImage0.Y());
      assertEquals(6, interpolatedRealGrayImage0.X());
      
      Float float0 = interpolatedRealGrayImage0.interp(0.0F, 0.0F);
      assertEquals(2013.367F, (float)float0, 0.01F);
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
      assertEquals(6, interpolatedRealGrayImage0.Y());
      assertEquals(6, interpolatedRealGrayImage0.X());
      assertNotNull(float0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(6, 6);
      assertEquals(6, interpolatedRealGrayImage0.Y());
      assertEquals(6, interpolatedRealGrayImage0.X());
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
      assertNotNull(interpolatedRealGrayImage0);
      
      interpolatedRealGrayImage0.splat((-0.066615686F), (-0.066615686F), 1769.73F);
      assertEquals(6, interpolatedRealGrayImage0.Y());
      assertEquals(6, interpolatedRealGrayImage0.X());
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
      
      Float float0 = interpolatedRealGrayImage0.interp(1.0F, 0.0F);
      assertEquals((-125.74522F), (float)float0, 0.01F);
      assertEquals(6, interpolatedRealGrayImage0.Y());
      assertEquals(6, interpolatedRealGrayImage0.X());
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
      assertNotNull(float0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(12, 12);
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
      assertEquals(12, interpolatedRealGrayImage0.X());
      assertEquals(12, interpolatedRealGrayImage0.Y());
      assertNotNull(interpolatedRealGrayImage0);
      
      InterpolatedRealGrayImage interpolatedRealGrayImage1 = interpolatedRealGrayImage0.copy();
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
      assertEquals(12, interpolatedRealGrayImage0.X());
      assertEquals(12, interpolatedRealGrayImage0.Y());
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage1.getInterpolationMethod());
      assertEquals(12, interpolatedRealGrayImage1.X());
      assertEquals(12, interpolatedRealGrayImage1.Y());
      assertNotSame(interpolatedRealGrayImage0, interpolatedRealGrayImage1);
      assertNotSame(interpolatedRealGrayImage1, interpolatedRealGrayImage0);
      assertNotNull(interpolatedRealGrayImage1);
      assertFalse(interpolatedRealGrayImage1.equals((Object)interpolatedRealGrayImage0));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(4385, 2711);
      assertEquals(2711, interpolatedRealGrayImage0.Y());
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
      assertEquals(4385, interpolatedRealGrayImage0.X());
      assertNotNull(interpolatedRealGrayImage0);
      
      InterpolatedRealGrayImage interpolatedRealGrayImage1 = new InterpolatedRealGrayImage((RealGrayImage) interpolatedRealGrayImage0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(232, 232);
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
      assertEquals(232, interpolatedRealGrayImage0.Y());
      assertEquals(232, interpolatedRealGrayImage0.X());
      assertNotNull(interpolatedRealGrayImage0);
      
      InterpolatedRealGrayImage interpolatedRealGrayImage1 = new InterpolatedRealGrayImage(interpolatedRealGrayImage0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(255, 32767);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = null;
      try {
        interpolatedRealGrayImage0 = new InterpolatedRealGrayImage((-5), (-5));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.RealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(12, 12);
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
      assertEquals(12, interpolatedRealGrayImage0.X());
      assertEquals(12, interpolatedRealGrayImage0.Y());
      assertNotNull(interpolatedRealGrayImage0);
      
      InterpolatedRealGrayImage interpolatedRealGrayImage1 = new InterpolatedRealGrayImage((RealGrayImage) interpolatedRealGrayImage0);
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
      assertEquals(12, interpolatedRealGrayImage0.X());
      assertEquals(12, interpolatedRealGrayImage0.Y());
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage1.getInterpolationMethod());
      assertEquals(12, interpolatedRealGrayImage1.X());
      assertEquals(12, interpolatedRealGrayImage1.Y());
      assertNotNull(interpolatedRealGrayImage1);
      assertFalse(interpolatedRealGrayImage1.equals((Object)interpolatedRealGrayImage0));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(0, 0);
      assertEquals((-32768.0F), interpolatedRealGrayImage0.max(), 0.01F);
      assertEquals(32767.0F, interpolatedRealGrayImage0.min(), 0.01F);
      assertEquals(0, interpolatedRealGrayImage0.Y());
      assertEquals(0.0F, interpolatedRealGrayImage0.absSum(), 0.01F);
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
      assertEquals(0, interpolatedRealGrayImage0.X());
      assertEquals(0.0F, interpolatedRealGrayImage0.addSum(), 0.01F);
      assertEquals(0.0, interpolatedRealGrayImage0.sqrSum(), 0.01);
      assertNotNull(interpolatedRealGrayImage0);
      
      InterpolationMethod interpolationMethod0 = interpolatedRealGrayImage0.getInterpolationMethod();
      assertEquals(InterpolationMethod.NEIGHBOR, interpolationMethod0);
      assertEquals((-32768.0F), interpolatedRealGrayImage0.max(), 0.01F);
      assertEquals(32767.0F, interpolatedRealGrayImage0.min(), 0.01F);
      assertEquals(0, interpolatedRealGrayImage0.Y());
      assertEquals(0.0F, interpolatedRealGrayImage0.absSum(), 0.01F);
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
      assertEquals(0, interpolatedRealGrayImage0.X());
      assertEquals(0.0F, interpolatedRealGrayImage0.addSum(), 0.01F);
      assertEquals(0.0, interpolatedRealGrayImage0.sqrSum(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(12, 12);
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
      assertEquals(12, interpolatedRealGrayImage0.X());
      assertEquals(12, interpolatedRealGrayImage0.Y());
      assertNotNull(interpolatedRealGrayImage0);
      
      InterpolationMethod interpolationMethod0 = InterpolationMethod.CUBIC;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      assertEquals(InterpolationMethod.CUBIC, interpolatedRealGrayImage0.getInterpolationMethod());
      assertEquals(12, interpolatedRealGrayImage0.X());
      assertEquals(12, interpolatedRealGrayImage0.Y());
      
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.splat(12, 12, 12);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 12
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(0, 0);
      assertEquals(0.0F, interpolatedRealGrayImage0.addSum(), 0.01F);
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
      assertEquals(32767.0F, interpolatedRealGrayImage0.min(), 0.01F);
      assertEquals((-32768.0F), interpolatedRealGrayImage0.max(), 0.01F);
      assertEquals(0, interpolatedRealGrayImage0.Y());
      assertEquals(0.0F, interpolatedRealGrayImage0.absSum(), 0.01F);
      assertEquals(0, interpolatedRealGrayImage0.X());
      assertEquals(0.0, interpolatedRealGrayImage0.sqrSum(), 0.01);
      assertNotNull(interpolatedRealGrayImage0);
      
      InterpolationMethod interpolationMethod0 = InterpolationMethod.LINEAR;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      assertEquals(0.0F, interpolatedRealGrayImage0.addSum(), 0.01F);
      assertEquals(32767.0F, interpolatedRealGrayImage0.min(), 0.01F);
      assertEquals((-32768.0F), interpolatedRealGrayImage0.max(), 0.01F);
      assertEquals(0, interpolatedRealGrayImage0.Y());
      assertEquals(0.0F, interpolatedRealGrayImage0.absSum(), 0.01F);
      assertEquals(0, interpolatedRealGrayImage0.X());
      assertEquals(0.0, interpolatedRealGrayImage0.sqrSum(), 0.01);
      assertEquals(InterpolationMethod.LINEAR, interpolatedRealGrayImage0.getInterpolationMethod());
      
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.splat(255.0F, (-2750.266F), 0.0F);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2750
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(6, 6);
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
      assertEquals(6, interpolatedRealGrayImage0.X());
      assertEquals(6, interpolatedRealGrayImage0.Y());
      assertNotNull(interpolatedRealGrayImage0);
      
      InterpolationMethod interpolationMethod0 = InterpolationMethod.CUBIC;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      assertEquals(6, interpolatedRealGrayImage0.X());
      assertEquals(InterpolationMethod.CUBIC, interpolatedRealGrayImage0.getInterpolationMethod());
      assertEquals(6, interpolatedRealGrayImage0.Y());
      
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.accum(6, 6, 6);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(1686, 1686);
      assertEquals(1686, interpolatedRealGrayImage0.X());
      assertEquals(1686, interpolatedRealGrayImage0.Y());
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
      assertNotNull(interpolatedRealGrayImage0);
      
      InterpolationMethod interpolationMethod0 = InterpolationMethod.LINEAR;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      assertEquals(1686, interpolatedRealGrayImage0.X());
      assertEquals(1686, interpolatedRealGrayImage0.Y());
      assertEquals(InterpolationMethod.LINEAR, interpolatedRealGrayImage0.getInterpolationMethod());
      
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.accum(1686, 1686, 1686);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1686
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(6, 6);
      assertEquals(6, interpolatedRealGrayImage0.Y());
      assertEquals(6, interpolatedRealGrayImage0.X());
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
      assertNotNull(interpolatedRealGrayImage0);
      
      InterpolationMethod interpolationMethod0 = InterpolationMethod.CUBIC;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      assertEquals(6, interpolatedRealGrayImage0.Y());
      assertEquals(6, interpolatedRealGrayImage0.X());
      assertEquals(InterpolationMethod.CUBIC, interpolatedRealGrayImage0.getInterpolationMethod());
      
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.interp(3.0F, 3.0F);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(38, 38);
      assertEquals(38, interpolatedRealGrayImage0.Y());
      assertEquals(38, interpolatedRealGrayImage0.X());
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
      assertNotNull(interpolatedRealGrayImage0);
      
      InterpolationMethod interpolationMethod0 = InterpolationMethod.CUBIC;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      assertEquals(InterpolationMethod.CUBIC, interpolatedRealGrayImage0.getInterpolationMethod());
      assertEquals(38, interpolatedRealGrayImage0.Y());
      assertEquals(38, interpolatedRealGrayImage0.X());
      
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.interp(38, 38);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 38
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(38, 38);
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
      assertEquals(38, interpolatedRealGrayImage0.X());
      assertEquals(38, interpolatedRealGrayImage0.Y());
      assertNotNull(interpolatedRealGrayImage0);
      
      InterpolationMethod interpolationMethod0 = InterpolationMethod.CUBIC;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      assertEquals(38, interpolatedRealGrayImage0.X());
      assertEquals(38, interpolatedRealGrayImage0.Y());
      assertEquals(InterpolationMethod.CUBIC, interpolatedRealGrayImage0.getInterpolationMethod());
      
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.interp(38, (-1160.0F));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1160
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(38, 38);
      assertEquals(38, interpolatedRealGrayImage0.Y());
      assertEquals(38, interpolatedRealGrayImage0.X());
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
      assertNotNull(interpolatedRealGrayImage0);
      
      InterpolationMethod interpolationMethod0 = InterpolationMethod.CUBIC;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      assertEquals(38, interpolatedRealGrayImage0.Y());
      assertEquals(38, interpolatedRealGrayImage0.X());
      assertEquals(InterpolationMethod.CUBIC, interpolatedRealGrayImage0.getInterpolationMethod());
      
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.interp(0.0F, 0.0F);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(6, 6);
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
      assertEquals(6, interpolatedRealGrayImage0.X());
      assertEquals(6, interpolatedRealGrayImage0.Y());
      assertNotNull(interpolatedRealGrayImage0);
      
      InterpolationMethod interpolationMethod0 = InterpolationMethod.LINEAR;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      assertEquals(InterpolationMethod.LINEAR, interpolatedRealGrayImage0.getInterpolationMethod());
      assertEquals(6, interpolatedRealGrayImage0.X());
      assertEquals(6, interpolatedRealGrayImage0.Y());
      
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.interp(6, 0.0F);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(6, 6);
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
      assertEquals(6, interpolatedRealGrayImage0.X());
      assertEquals(6, interpolatedRealGrayImage0.Y());
      assertNotNull(interpolatedRealGrayImage0);
      
      InterpolationMethod interpolationMethod0 = InterpolationMethod.LINEAR;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      assertEquals(InterpolationMethod.LINEAR, interpolatedRealGrayImage0.getInterpolationMethod());
      assertEquals(6, interpolatedRealGrayImage0.X());
      assertEquals(6, interpolatedRealGrayImage0.Y());
      
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.interp(0.0F, 6);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(12, 12);
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
      assertEquals(12, interpolatedRealGrayImage0.Y());
      assertEquals(12, interpolatedRealGrayImage0.X());
      assertNotNull(interpolatedRealGrayImage0);
      
      InterpolationMethod interpolationMethod0 = InterpolationMethod.CUBIC;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      assertEquals(InterpolationMethod.CUBIC, interpolatedRealGrayImage0.getInterpolationMethod());
      assertEquals(12, interpolatedRealGrayImage0.Y());
      assertEquals(12, interpolatedRealGrayImage0.X());
      
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.interp(1.0F, 12);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 12
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(3112, 3112);
      // Undeclared exception!
      interpolatedRealGrayImage0.copy();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(0, 0);
      InterpolatedRealGrayImage interpolatedRealGrayImage1 = interpolatedRealGrayImage0.copy();
      assertNotSame(interpolatedRealGrayImage1, interpolatedRealGrayImage0);
      assertEquals(0, interpolatedRealGrayImage1.Y());
      assertEquals(0, interpolatedRealGrayImage1.X());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = null;
      try {
        interpolatedRealGrayImage0 = new InterpolatedRealGrayImage();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(3, 3);
      InterpolatedRealGrayImage interpolatedRealGrayImage1 = new InterpolatedRealGrayImage(interpolatedRealGrayImage0);
      assertEquals(3, interpolatedRealGrayImage1.Y());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = null;
      try {
        interpolatedRealGrayImage0 = new InterpolatedRealGrayImage((Image) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.AbstractImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = null;
      try {
        interpolatedRealGrayImage0 = new InterpolatedRealGrayImage((RealGrayImage) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = null;
      try {
        interpolatedRealGrayImage0 = new InterpolatedRealGrayImage((InterpolatedRealGrayImage) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
