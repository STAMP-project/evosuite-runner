/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 17 08:01:21 GMT 2019
 */

package org.sat4j.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.opt.MinOneDecorator;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.LexicoDecorator;
import org.sat4j.tools.ManyCore;
import org.sat4j.tools.RemiUtils;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RemiUtils_ESTest extends RemiUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MinOneDecorator minOneDecorator0 = mock(MinOneDecorator.class, new ViolatedAssumptionAnswer());
      doReturn(false, true, false, false, true).when(minOneDecorator0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(0, 3077, 0).when(minOneDecorator0).nVars();
      LexicoDecorator<MinOneDecorator> lexicoDecorator0 = new LexicoDecorator<MinOneDecorator>(minOneDecorator0);
      RemiUtils.backbone(lexicoDecorator0);
      IVecInt iVecInt0 = RemiUtils.backbone(lexicoDecorator0);
      assertEquals((-3), iVecInt0.last());
      
      IVecInt iVecInt1 = RemiUtils.backbone(lexicoDecorator0);
      assertFalse(iVecInt1.equals((Object)iVecInt0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MinOneDecorator[] minOneDecoratorArray0 = new MinOneDecorator[3];
      MinOneDecorator minOneDecorator0 = mock(MinOneDecorator.class, new ViolatedAssumptionAnswer());
      doReturn(0, (-522), 11).when(minOneDecorator0).nVars();
      minOneDecoratorArray0[0] = minOneDecorator0;
      minOneDecoratorArray0[1] = minOneDecorator0;
      minOneDecoratorArray0[2] = minOneDecorator0;
      ManyCore<MinOneDecorator> manyCore0 = new ManyCore<MinOneDecorator>(minOneDecoratorArray0);
      RemiUtils.backbone(minOneDecorator0);
      RemiUtils.backbone(minOneDecorator0);
      // Undeclared exception!
      try { 
        RemiUtils.backbone(manyCore0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.ManyCore", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        RemiUtils.backbone((ISolver) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.RemiUtils", e);
      }
  }
}
