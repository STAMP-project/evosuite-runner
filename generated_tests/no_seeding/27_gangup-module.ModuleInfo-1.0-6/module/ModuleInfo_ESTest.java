/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 19:29:18 GMT 2019
 */

package module;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.annotation.Annotation;
import module.Kernel;
import module.Module;
import module.ModuleInfo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ModuleInfo_ESTest extends ModuleInfo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ModuleInfo moduleInfo0 = new ModuleInfo();
      moduleInfo0.name = ":;wn6-";
      moduleInfo0.update();
      assertEquals("{name=:;wn6-}", moduleInfo0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Annotation[] annotationArray0 = new Annotation[7];
      Annotation annotation0 = mock(Annotation.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(annotation0).toString();
      annotationArray0[0] = annotation0;
      annotationArray0[1] = annotation0;
      annotationArray0[2] = annotation0;
      annotationArray0[3] = annotation0;
      annotationArray0[4] = annotation0;
      annotationArray0[5] = annotation0;
      annotationArray0[6] = annotation0;
      ModuleInfo moduleInfo0 = null;
      try {
        moduleInfo0 = new ModuleInfo(annotationArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("module.ModuleInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ModuleInfo moduleInfo0 = new ModuleInfo();
      moduleInfo0.set(" YleV(tYF}", "<BXO?bqT%2");
      String string0 = moduleInfo0.get(" YleV(tYF}");
      assertNotNull(string0);
      assertEquals("{ YleV(tYF}=<BXO?bqT%2}", moduleInfo0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ModuleInfo moduleInfo0 = new ModuleInfo();
      moduleInfo0.set("", "");
      String string0 = moduleInfo0.get("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ModuleInfo moduleInfo0 = new ModuleInfo();
      // Undeclared exception!
      try { 
        moduleInfo0.set((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Hashtable", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ModuleInfo moduleInfo0 = null;
      try {
        moduleInfo0 = new ModuleInfo((Module) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("module.ModuleInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ModuleInfo moduleInfo0 = new ModuleInfo();
      // Undeclared exception!
      try { 
        moduleInfo0.get((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ModuleInfo moduleInfo0 = new ModuleInfo();
      // Undeclared exception!
      try { 
        moduleInfo0.update();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Hashtable", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Kernel kernel0 = null;
      try {
        kernel0 = new Kernel();
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("module.ModuleInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ModuleInfo moduleInfo0 = new ModuleInfo();
      String string0 = moduleInfo0.toString();
      assertEquals("{}", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Annotation[] annotationArray0 = new Annotation[8];
      Annotation annotation0 = mock(Annotation.class, new ViolatedAssumptionAnswer());
      doReturn("7").when(annotation0).toString();
      annotationArray0[0] = annotation0;
      annotationArray0[1] = annotation0;
      annotationArray0[2] = annotation0;
      annotationArray0[3] = annotation0;
      annotationArray0[4] = annotation0;
      annotationArray0[5] = annotation0;
      annotationArray0[6] = annotation0;
      annotationArray0[7] = annotation0;
      ModuleInfo moduleInfo0 = null;
      try {
        moduleInfo0 = new ModuleInfo(annotationArray0);
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("module.ModuleInfo", e);
      }
  }
}
