/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 17 07:56:13 GMT 2019
 */

package org.sat4j.reader;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.sat4j.reader.AAGReader;
import org.sat4j.reader.DimacsReader;
import org.sat4j.reader.InstanceReader;
import org.sat4j.reader.Reader;
import org.sat4j.specs.ISolver;
import org.sat4j.tools.DimacsOutputSolver;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.FullClauseSelectorSolver;
import org.sat4j.tools.SolutionCounter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InstanceReader_ESTest extends InstanceReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = mock(DimacsOutputSolver.class, new ViolatedAssumptionAnswer());
      FullClauseSelectorSolver<DimacsOutputSolver> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<DimacsOutputSolver>(dimacsOutputSolver0, true);
      SolutionCounter solutionCounter0 = new SolutionCounter(fullClauseSelectorSolver0);
      AAGReader aAGReader0 = new AAGReader(solutionCounter0);
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null, aAGReader0);
      boolean boolean0 = instanceReader0.hasAMapping();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = mock(DimacsOutputSolver.class, new ViolatedAssumptionAnswer());
      FullClauseSelectorSolver<DimacsOutputSolver> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<DimacsOutputSolver>(dimacsOutputSolver0, true);
      SolutionCounter solutionCounter0 = new SolutionCounter(fullClauseSelectorSolver0);
      AAGReader aAGReader0 = new AAGReader(solutionCounter0);
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null, aAGReader0);
      String string0 = instanceReader0.decode((int[]) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(".aag");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "backjumping to decision level ");
      InstanceReader instanceReader0 = new InstanceReader(dimacsStringSolver0);
      try { 
        instanceReader0.parseInstance(".aag");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parsing ErrorAAG format only!
         //
         verifyException("org.sat4j.reader.AAGReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/VZv.aig.aag");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "EZCNF");
      // Undeclared exception!
      instanceReader0.parseInstance("/VZv.aig.aag");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      InstanceReader instanceReader0 = new InstanceReader(dimacsStringSolver0);
      // Undeclared exception!
      try { 
        instanceReader0.parseInstance((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(".aQg");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "#F4Y&Ib4EjPB");
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null);
      // Undeclared exception!
      try { 
        instanceReader0.parseInstance(".aQg");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.LecteurDimacs", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("'n~7>4 u.aag");
      byte[] byteArray0 = new byte[4];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null);
      try { 
        instanceReader0.parseInstance("'n~7>4 u.aag");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null);
      // Undeclared exception!
      try { 
        instanceReader0.handleFileName((String) null, ".bz2");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null);
      // Undeclared exception!
      try { 
        instanceReader0.getMapping();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.InstanceReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null);
      int[] intArray0 = new int[2];
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      PrintWriter printWriter0 = new PrintWriter(writer0);
      // Undeclared exception!
      try { 
        instanceReader0.decode(intArray0, printWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.InstanceReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null);
      // Undeclared exception!
      try { 
        instanceReader0.decode((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.InstanceReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null);
      try { 
        instanceReader0.parseInstance(".gz");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = mock(DimacsOutputSolver.class, new ViolatedAssumptionAnswer());
      FullClauseSelectorSolver<DimacsOutputSolver> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<DimacsOutputSolver>(dimacsOutputSolver0, true);
      SolutionCounter solutionCounter0 = new SolutionCounter(fullClauseSelectorSolver0);
      AAGReader aAGReader0 = new AAGReader(solutionCounter0);
      InstanceReader instanceReader0 = new InstanceReader(fullClauseSelectorSolver0, aAGReader0);
      try { 
        instanceReader0.parseInstance("E62.ja>[l~:3");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      InstanceReader instanceReader0 = new InstanceReader(dimacsStringSolver0);
      try { 
        instanceReader0.parseInstance("http://");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      InstanceReader instanceReader0 = new InstanceReader(dimacsStringSolver0);
      instanceReader0.handleFileName("/VZv.aig.aag", "/VZv.aig.aag");
      try { 
        instanceReader0.parseInstance("/VZv.aig.aag");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null);
      instanceReader0.handleFileName("/cp.aig", "aBS6ieLB&]8_~+^LYj ");
      try { 
        instanceReader0.parseInstance("/VZv.aig");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null);
      Reader reader0 = instanceReader0.handleFileName("EZCNF", "EZCNF");
      Reader reader1 = instanceReader0.handleFileName("EZCNF", "EZCNF");
      assertSame(reader1, reader0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DimacsReader dimacsReader0 = new DimacsReader((ISolver) null);
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null, dimacsReader0);
      instanceReader0.handleFileName("ZGEE", "ZGEE");
      Reader reader0 = instanceReader0.handleFileName("ZGEE", "ZGEE");
      assertFalse(reader0.hasAMapping());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null);
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        instanceReader0.parseInstance(inputStream0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Use a domain specific Reader (LecteurDimacs, AIGReader, etc.) for stream input 
         //
         verifyException("org.sat4j.reader.InstanceReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null);
      // Undeclared exception!
      try { 
        instanceReader0.hasAMapping();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.InstanceReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DimacsReader dimacsReader0 = new DimacsReader((ISolver) null);
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null, dimacsReader0);
      int[] intArray0 = new int[6];
      MockFile mockFile0 = new MockFile("high level ");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      instanceReader0.decode(intArray0, (PrintWriter) mockPrintWriter0);
      assertEquals(6, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DimacsReader dimacsReader0 = new DimacsReader((ISolver) null);
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null, dimacsReader0);
      int[] intArray0 = new int[6];
      String string0 = instanceReader0.decode(intArray0);
      assertEquals("0 0 0 0 0 0 0", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DimacsReader dimacsReader0 = new DimacsReader((ISolver) null);
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null, dimacsReader0);
      Map<Integer, String> map0 = instanceReader0.getMapping();
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = mock(DimacsOutputSolver.class, new ViolatedAssumptionAnswer());
      FullClauseSelectorSolver<DimacsOutputSolver> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<DimacsOutputSolver>(dimacsOutputSolver0, true);
      InstanceReader instanceReader0 = new InstanceReader(fullClauseSelectorSolver0, (Reader) null);
      try { 
        instanceReader0.parseInstance(".aig.bz2");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }
}
