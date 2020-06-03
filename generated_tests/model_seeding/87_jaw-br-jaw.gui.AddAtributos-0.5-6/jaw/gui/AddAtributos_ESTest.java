/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 19:40:40 GMT 2019
 */

package jaw.gui;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import jaw.gui.AddAtributos;
import jaw.gui.ProcessarEntidadesTree;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AddAtributos_ESTest extends AddAtributos_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ProcessarEntidadesTree processarEntidadesTree0 = new ProcessarEntidadesTree();
      AddAtributos addAtributos0 = null;
      try {
        addAtributos0 = new AddAtributos(processarEntidadesTree0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
