/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 18:21:43 GMT 2019
 */

package jigl.image.types;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jigl.image.InterpolationMethod;
import jigl.image.types.InterpolatedRealColorImage;
import jigl.image.types.RealColorImage;
import jigl.image.types.RealGrayImage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InterpolatedRealColorImage_ESTest extends InterpolatedRealColorImage_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      InterpolatedRealColorImage interpolatedRealColorImage0 = new InterpolatedRealColorImage(2572, 2125);
      float[] floatArray0 = new float[9];
      // Undeclared exception!
      try { 
        interpolatedRealColorImage0.accum(0.0F, 2572, floatArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2572
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      InterpolatedRealColorImage interpolatedRealColorImage0 = new InterpolatedRealColorImage();
      // Undeclared exception!
      try { 
        interpolatedRealColorImage0.interp((-699.1816F), 674.9888F);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.InterpolatedRealColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      InterpolatedRealColorImage interpolatedRealColorImage0 = new InterpolatedRealColorImage(1, 1621);
      interpolatedRealColorImage0.copy();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      InterpolatedRealColorImage interpolatedRealColorImage0 = new InterpolatedRealColorImage(89, 2201);
      InterpolationMethod interpolationMethod0 = interpolatedRealColorImage0.getInterpolationMethod();
      interpolatedRealColorImage0.setInterpolationMethod(interpolationMethod0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      InterpolatedRealColorImage interpolatedRealColorImage0 = new InterpolatedRealColorImage(89, 2201);
      float[] floatArray0 = new float[3];
      interpolatedRealColorImage0.splat(4.0F, 1598.1F, floatArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      InterpolatedRealColorImage interpolatedRealColorImage0 = new InterpolatedRealColorImage();
      interpolatedRealColorImage0.copy();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      InterpolatedRealColorImage interpolatedRealColorImage0 = new InterpolatedRealColorImage();
      // Undeclared exception!
      try { 
        interpolatedRealColorImage0.splat(472, 0.0F, (float[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.InterpolatedRealColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      InterpolatedRealColorImage interpolatedRealColorImage0 = new InterpolatedRealColorImage(1, 1);
      RealGrayImage[] realGrayImageArray0 = new RealGrayImage[0];
      interpolatedRealColorImage0.planes = realGrayImageArray0;
      InterpolationMethod interpolationMethod0 = InterpolationMethod.CUBIC;
      // Undeclared exception!
      try { 
        interpolatedRealColorImage0.setInterpolationMethod(interpolationMethod0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jigl.image.types.InterpolatedRealColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      InterpolatedRealColorImage interpolatedRealColorImage0 = new InterpolatedRealColorImage(428, 428);
      // Undeclared exception!
      interpolatedRealColorImage0.copy();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      InterpolatedRealColorImage interpolatedRealColorImage0 = new InterpolatedRealColorImage(3, 3);
      interpolatedRealColorImage0.planes = null;
      // Undeclared exception!
      try { 
        interpolatedRealColorImage0.copy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InterpolatedRealColorImage interpolatedRealColorImage0 = new InterpolatedRealColorImage(3, 3);
      RealGrayImage[] realGrayImageArray0 = new RealGrayImage[0];
      interpolatedRealColorImage0.planes = realGrayImageArray0;
      // Undeclared exception!
      try { 
        interpolatedRealColorImage0.copy();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      InterpolatedRealColorImage interpolatedRealColorImage0 = null;
      try {
        interpolatedRealColorImage0 = new InterpolatedRealColorImage((RealColorImage) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.RealColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      InterpolatedRealColorImage interpolatedRealColorImage0 = null;
      try {
        interpolatedRealColorImage0 = new InterpolatedRealColorImage((InterpolatedRealColorImage) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.InterpolatedRealColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      InterpolatedRealColorImage interpolatedRealColorImage0 = new InterpolatedRealColorImage(1, 1);
      RealGrayImage[] realGrayImageArray0 = new RealGrayImage[0];
      interpolatedRealColorImage0.planes = realGrayImageArray0;
      InterpolatedRealColorImage interpolatedRealColorImage1 = null;
      try {
        interpolatedRealColorImage1 = new InterpolatedRealColorImage(interpolatedRealColorImage0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jigl.image.types.RealColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      InterpolatedRealColorImage interpolatedRealColorImage0 = new InterpolatedRealColorImage(1, 3438);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      InterpolatedRealColorImage interpolatedRealColorImage0 = null;
      try {
        interpolatedRealColorImage0 = new InterpolatedRealColorImage((-15), (-15));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.RealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      InterpolatedRealColorImage interpolatedRealColorImage0 = new InterpolatedRealColorImage();
      InterpolationMethod interpolationMethod0 = InterpolationMethod.NEIGHBOR;
      // Undeclared exception!
      try { 
        interpolatedRealColorImage0.setInterpolationMethod(interpolationMethod0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.InterpolatedRealColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      InterpolatedRealColorImage interpolatedRealColorImage0 = new InterpolatedRealColorImage(2, 2);
      InterpolatedRealColorImage interpolatedRealColorImage1 = new InterpolatedRealColorImage((RealColorImage) interpolatedRealColorImage0);
      assertEquals(2, interpolatedRealColorImage1.Y());
      assertEquals(2, interpolatedRealColorImage1.X());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      InterpolatedRealColorImage interpolatedRealColorImage0 = new InterpolatedRealColorImage(1, 1);
      // Undeclared exception!
      try { 
        interpolatedRealColorImage0.interp(1, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      InterpolatedRealColorImage interpolatedRealColorImage0 = new InterpolatedRealColorImage(1608, 1608);
      float[] floatArray0 = new float[1];
      // Undeclared exception!
      try { 
        interpolatedRealColorImage0.splat((-1411.797F), 0.0F, floatArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1412
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      InterpolatedRealColorImage interpolatedRealColorImage0 = new InterpolatedRealColorImage();
      // Undeclared exception!
      try { 
        interpolatedRealColorImage0.accum((-149.5F), (-149.5F), (float[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.InterpolatedRealColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      InterpolatedRealColorImage interpolatedRealColorImage0 = new InterpolatedRealColorImage(1, 1);
      InterpolatedRealColorImage interpolatedRealColorImage1 = new InterpolatedRealColorImage(interpolatedRealColorImage0);
      assertEquals(1, interpolatedRealColorImage1.Y());
      assertEquals(1, interpolatedRealColorImage1.X());
  }
}
