/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 13:32:49 GMT 2019
 */

package com.allenstudio.ir.ui;

import org.junit.Test;
import static org.junit.Assert.*;
import com.allenstudio.ir.ui.Toolbar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Toolbar_ESTest extends Toolbar_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Toolbar toolbar0 = new Toolbar();
      assertFalse(toolbar0.isFocusTraversalPolicyProvider());
  }
}
