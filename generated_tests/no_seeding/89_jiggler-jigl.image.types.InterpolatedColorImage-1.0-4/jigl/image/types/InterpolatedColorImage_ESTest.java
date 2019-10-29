/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 17:37:05 GMT 2019
 */

package jigl.image.types;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jigl.image.InterpolationMethod;
import jigl.image.types.ColorImage;
import jigl.image.types.GrayImage;
import jigl.image.types.InterpolatedColorImage;
import jigl.image.types.InterpolatedGrayImage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InterpolatedColorImage_ESTest extends InterpolatedColorImage_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(1, 1);
      int[] intArray0 = new int[4];
      interpolatedColorImage0.splat(0.114, 0.0, intArray0);
      assertEquals(4, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(483, 145);
      int[] intArray0 = new int[4];
      // Undeclared exception!
      try { 
        interpolatedColorImage0.splat(0.0, (-168.0), intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -168
         //
         verifyException("jigl.image.types.InterpolatedGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(1, 1);
      int[] intArray0 = new int[5];
      interpolatedColorImage0.splat(0.0, 0.0, intArray0);
      Integer[] integerArray0 = interpolatedColorImage0.interp((-0.44365856F), 0.0F);
      assertEquals(3, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(1, 5);
      InterpolationMethod interpolationMethod0 = InterpolationMethod.CUBIC;
      interpolatedColorImage0.setInterpolationMethod(interpolationMethod0);
      int[] intArray0 = new int[5];
      interpolatedColorImage0.splat(0.0, 0.0, intArray0);
      // Undeclared exception!
      try { 
        interpolatedColorImage0.copy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.GrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(2, 4);
      int[] intArray0 = new int[3];
      interpolatedColorImage0.splat(0.0, intArray0);
      assertEquals(2, interpolatedColorImage0.X());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      InterpolatedGrayImage interpolatedGrayImage0 = new InterpolatedGrayImage(2, 46);
      interpolatedColorImage0.setPlane(2, interpolatedGrayImage0);
      assertEquals(0, interpolatedColorImage0.X());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(1, 1);
      int[] intArray0 = new int[7];
      interpolatedColorImage0.splat(0.0, 0.0, intArray0);
      interpolatedColorImage0.accum((-0.5), intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(1, 1);
      int[] intArray0 = new int[10];
      interpolatedColorImage0.splat(0.0, 0.0, intArray0);
      interpolatedColorImage0.accum(4.9E-324, 0.0, intArray0);
      assertEquals(1, interpolatedColorImage0.Y());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(1, 1);
      int[] intArray0 = new int[7];
      interpolatedColorImage0.splat(0.0, 0.0, intArray0);
      int[] intArray1 = interpolatedColorImage0.interp(0.0);
      assertEquals(3, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      InterpolatedColorImage interpolatedColorImage1 = interpolatedColorImage0.copy();
      InterpolatedColorImage interpolatedColorImage2 = new InterpolatedColorImage(interpolatedColorImage1);
      int[] intArray0 = new int[9];
      // Undeclared exception!
      try { 
        interpolatedColorImage2.splat(0.299, intArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // jigl.image.types.GrayImage cannot be cast to jigl.image.types.InterpolatedGrayImage
         //
         verifyException("jigl.image.types.InterpolatedColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(2, 4);
      int[] intArray0 = new int[3];
      // Undeclared exception!
      try { 
        interpolatedColorImage0.splat((double) 2, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("jigl.image.types.InterpolatedGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      // Undeclared exception!
      try { 
        interpolatedColorImage0.splat(3255.9695624010155, 3255.9695624010155, (int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.InterpolatedColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(3, 3);
      InterpolatedColorImage interpolatedColorImage1 = new InterpolatedColorImage(interpolatedColorImage0);
      int[] intArray0 = new int[2];
      // Undeclared exception!
      try { 
        interpolatedColorImage1.splat(0.0, 0.0, intArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // jigl.image.types.GrayImage cannot be cast to jigl.image.types.InterpolatedGrayImage
         //
         verifyException("jigl.image.types.InterpolatedColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(1, 1);
      InterpolatedGrayImage interpolatedGrayImage0 = new InterpolatedGrayImage(4154, 4154);
      // Undeclared exception!
      interpolatedColorImage0.setPlane(1, interpolatedGrayImage0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      // Undeclared exception!
      try { 
        interpolatedColorImage0.setPlane(1672, (GrayImage) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(1, 1);
      InterpolatedColorImage interpolatedColorImage1 = new InterpolatedColorImage(interpolatedColorImage0);
      InterpolationMethod interpolationMethod0 = InterpolationMethod.LINEAR;
      // Undeclared exception!
      try { 
        interpolatedColorImage1.setInterpolationMethod(interpolationMethod0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // jigl.image.types.GrayImage cannot be cast to jigl.image.types.InterpolatedGrayImage
         //
         verifyException("jigl.image.types.InterpolatedColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(2, 4);
      InterpolationMethod interpolationMethod0 = InterpolationMethod.NEIGHBOR;
      GrayImage[] grayImageArray0 = new GrayImage[1];
      GrayImage grayImage0 = interpolatedColorImage0.plane(2);
      grayImageArray0[0] = grayImage0;
      interpolatedColorImage0.planes = grayImageArray0;
      // Undeclared exception!
      try { 
        interpolatedColorImage0.setInterpolationMethod(interpolationMethod0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("jigl.image.types.InterpolatedColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(1, 1);
      // Undeclared exception!
      try { 
        interpolatedColorImage0.interp((float) 1, (float) 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("jigl.image.types.InterpolatedGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      // Undeclared exception!
      try { 
        interpolatedColorImage0.interp(342.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.InterpolatedColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(2, 2);
      InterpolatedColorImage interpolatedColorImage1 = new InterpolatedColorImage(interpolatedColorImage0);
      // Undeclared exception!
      try { 
        interpolatedColorImage1.interp((double) 2);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // jigl.image.types.GrayImage cannot be cast to jigl.image.types.InterpolatedGrayImage
         //
         verifyException("jigl.image.types.InterpolatedColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(1, 1435);
      // Undeclared exception!
      interpolatedColorImage0.copy();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(3, 244);
      InterpolatedColorImage interpolatedColorImage1 = new InterpolatedColorImage(interpolatedColorImage0);
      int[] intArray0 = new int[5];
      // Undeclared exception!
      try { 
        interpolatedColorImage1.accum(0.0, intArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // jigl.image.types.GrayImage cannot be cast to jigl.image.types.InterpolatedGrayImage
         //
         verifyException("jigl.image.types.InterpolatedColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        interpolatedColorImage0.accum(0.0, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jigl.image.types.InterpolatedColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage(1, 1);
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(colorImage0);
      InterpolatedColorImage interpolatedColorImage1 = new InterpolatedColorImage(interpolatedColorImage0);
      // Undeclared exception!
      try { 
        interpolatedColorImage1.accum(2283.94934, (-1064.285), (int[]) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // jigl.image.types.GrayImage cannot be cast to jigl.image.types.InterpolatedGrayImage
         //
         verifyException("jigl.image.types.InterpolatedColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(2, 4);
      int[] intArray0 = new int[3];
      // Undeclared exception!
      try { 
        interpolatedColorImage0.accum(1775.197, (double) 4, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("jigl.image.types.InterpolatedGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(799, 799);
      InterpolatedColorImage interpolatedColorImage1 = new InterpolatedColorImage(interpolatedColorImage0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      InterpolatedColorImage interpolatedColorImage1 = null;
      try {
        interpolatedColorImage1 = new InterpolatedColorImage(interpolatedColorImage0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      GrayImage[] grayImageArray0 = new GrayImage[0];
      interpolatedColorImage0.planes = grayImageArray0;
      InterpolatedColorImage interpolatedColorImage1 = null;
      try {
        interpolatedColorImage1 = new InterpolatedColorImage(interpolatedColorImage0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage(2485, 2485);
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(colorImage0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage();
      InterpolatedColorImage interpolatedColorImage0 = null;
      try {
        interpolatedColorImage0 = new InterpolatedColorImage(colorImage0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(2294, 2294);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = null;
      try {
        interpolatedColorImage0 = new InterpolatedColorImage((-2529), (-2529));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.GrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      InterpolationMethod interpolationMethod0 = InterpolationMethod.CUBIC;
      // Undeclared exception!
      try { 
        interpolatedColorImage0.setInterpolationMethod(interpolationMethod0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.InterpolatedColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 0);
      InterpolationMethod interpolationMethod0 = interpolatedColorImage0.getInterpolationMethod();
      assertEquals(InterpolationMethod.NEIGHBOR, interpolationMethod0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      int[] intArray0 = new int[9];
      // Undeclared exception!
      try { 
        interpolatedColorImage0.splat(0.299, intArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.InterpolatedColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(1, 1);
      InterpolatedColorImage interpolatedColorImage1 = new InterpolatedColorImage(interpolatedColorImage0);
      // Undeclared exception!
      try { 
        interpolatedColorImage1.interp((float) 1, 0.0F);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // jigl.image.types.GrayImage cannot be cast to jigl.image.types.InterpolatedGrayImage
         //
         verifyException("jigl.image.types.InterpolatedColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(1, 1);
      GrayImage grayImage0 = new GrayImage(1, 340);
      // Undeclared exception!
      try { 
        interpolatedColorImage0.setPlane(340, grayImage0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 340
         //
         verifyException("jigl.image.types.InterpolatedColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(1, 1);
      int[] intArray0 = new int[7];
      // Undeclared exception!
      try { 
        interpolatedColorImage0.accum((-0.5), intArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.InterpolatedGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(1, 1);
      int[] intArray0 = new int[5];
      interpolatedColorImage0.splat(0.0, 0.0, intArray0);
      InterpolatedColorImage interpolatedColorImage1 = interpolatedColorImage0.copy();
      assertNotSame(interpolatedColorImage0, interpolatedColorImage1);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(3, 3);
      // Undeclared exception!
      try { 
        interpolatedColorImage0.interp((double) 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("jigl.image.types.InterpolatedGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(1, 1);
      // Undeclared exception!
      try { 
        interpolatedColorImage0.interp((-0.44365856F), 0.0F);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.InterpolatedGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(1, 1);
      int[] intArray0 = new int[10];
      // Undeclared exception!
      try { 
        interpolatedColorImage0.accum(4.9E-324, 0.0, intArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.InterpolatedGrayImage", e);
      }
  }
}
