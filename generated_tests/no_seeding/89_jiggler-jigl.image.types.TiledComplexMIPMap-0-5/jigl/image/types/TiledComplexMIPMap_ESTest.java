/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 05 12:29:25 GMT 2019
 */

package jigl.image.types;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jigl.image.types.ComplexImage;
import jigl.image.types.InterpolatedRealColorImage;
import jigl.image.types.TiledComplexMIPMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TiledComplexMIPMap_ESTest extends TiledComplexMIPMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      InterpolatedRealColorImage interpolatedRealColorImage0 = new InterpolatedRealColorImage(3, 1);
      TiledComplexMIPMap tiledComplexMIPMap0 = new TiledComplexMIPMap(interpolatedRealColorImage0, 1);
      // Undeclared exception!
      try { 
        tiledComplexMIPMap0.getImage(3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledComplexMIPMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      InterpolatedRealColorImage interpolatedRealColorImage0 = new InterpolatedRealColorImage(3, 3);
      TiledComplexMIPMap tiledComplexMIPMap0 = new TiledComplexMIPMap(interpolatedRealColorImage0, 3);
      // Undeclared exception!
      try { 
        tiledComplexMIPMap0.get(3, 3623.8F, 255);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledComplexMIPMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      InterpolatedRealColorImage interpolatedRealColorImage0 = new InterpolatedRealColorImage(3, 0);
      TiledComplexMIPMap tiledComplexMIPMap0 = new TiledComplexMIPMap(interpolatedRealColorImage0, 3);
      ComplexImage complexImage0 = new ComplexImage();
      TiledComplexMIPMap.Threader tiledComplexMIPMap_Threader0 = tiledComplexMIPMap0.new Threader(0, 0.0F, 1.0F, 255, 0.0F, complexImage0, complexImage0, complexImage0);
      // Undeclared exception!
      try { 
        tiledComplexMIPMap_Threader0.run();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The width and height of the image should be power of 2 in order to apply FFT.
         //
         verifyException("jigl.image.utils.FFT", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      InterpolatedRealColorImage interpolatedRealColorImage0 = new InterpolatedRealColorImage(18, 18);
      interpolatedRealColorImage0.clear();
      TiledComplexMIPMap tiledComplexMIPMap0 = new TiledComplexMIPMap(interpolatedRealColorImage0, 356);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      InterpolatedRealColorImage interpolatedRealColorImage0 = new InterpolatedRealColorImage(3, 0);
      TiledComplexMIPMap tiledComplexMIPMap0 = new TiledComplexMIPMap(interpolatedRealColorImage0, 855);
      tiledComplexMIPMap0.getImage((-918.3845F));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      InterpolatedRealColorImage interpolatedRealColorImage0 = new InterpolatedRealColorImage(3, 3);
      TiledComplexMIPMap tiledComplexMIPMap0 = new TiledComplexMIPMap(interpolatedRealColorImage0, (-84199911));
      // Undeclared exception!
      try { 
        tiledComplexMIPMap0.getImage((-1.0F));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.RealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      InterpolatedRealColorImage interpolatedRealColorImage0 = new InterpolatedRealColorImage(27, 27);
      TiledComplexMIPMap tiledComplexMIPMap0 = null;
      try {
        tiledComplexMIPMap0 = new TiledComplexMIPMap(interpolatedRealColorImage0, (-54));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledComplexMIPMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      InterpolatedRealColorImage interpolatedRealColorImage0 = new InterpolatedRealColorImage(18, 18);
      TiledComplexMIPMap tiledComplexMIPMap0 = null;
      try {
        tiledComplexMIPMap0 = new TiledComplexMIPMap(interpolatedRealColorImage0, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jigl.image.types.TiledComplexMIPMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      InterpolatedRealColorImage interpolatedRealColorImage0 = new InterpolatedRealColorImage(3, 3);
      TiledComplexMIPMap tiledComplexMIPMap0 = new TiledComplexMIPMap(interpolatedRealColorImage0, 3);
      // Undeclared exception!
      try { 
        tiledComplexMIPMap0.get((-851.01F), 3, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledComplexMIPMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      InterpolatedRealColorImage interpolatedRealColorImage0 = new InterpolatedRealColorImage(8, 8);
      TiledComplexMIPMap tiledComplexMIPMap0 = new TiledComplexMIPMap(interpolatedRealColorImage0, 3);
      // Undeclared exception!
      try { 
        tiledComplexMIPMap0.get(3, 3, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledComplexMIPMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InterpolatedRealColorImage interpolatedRealColorImage0 = new InterpolatedRealColorImage(18, 18);
      TiledComplexMIPMap tiledComplexMIPMap0 = null;
      try {
        tiledComplexMIPMap0 = new TiledComplexMIPMap(interpolatedRealColorImage0, 356);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.utils.FFT", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      InterpolatedRealColorImage interpolatedRealColorImage0 = new InterpolatedRealColorImage(3, 0);
      TiledComplexMIPMap tiledComplexMIPMap0 = new TiledComplexMIPMap(interpolatedRealColorImage0, 3);
      // Undeclared exception!
      try { 
        tiledComplexMIPMap0.get(2623.1F, 16.0F, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledComplexMIPMap", e);
      }
  }
}
