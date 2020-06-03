/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 07 12:24:59 GMT 2019
 */

package fr.pingtimeout.jtail.gui.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import fr.pingtimeout.jtail.gui.controller.UpdateIndexFileWatcher;
import fr.pingtimeout.jtail.io.FileIndexer;
import fr.pingtimeout.jtail.io.index.FileIndex;
import fr.pingtimeout.jtail.io.index.RamFileIndex;
import java.io.File;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UpdateIndexFileWatcher_ESTest extends UpdateIndexFileWatcher_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockFile mockFile0 = new MockFile((String) null, "");
      FileIndexer fileIndexer0 = new FileIndexer(mockFile0);
      UpdateIndexFileWatcher updateIndexFileWatcher0 = new UpdateIndexFileWatcher(fileIndexer0);
      updateIndexFileWatcher0.processIndexation(0);
      assertEquals(0L, updateIndexFileWatcher0.scheduledExecutionTime());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FileIndexer fileIndexer0 = mock(FileIndexer.class, new ViolatedAssumptionAnswer());
      doReturn((File) null).when(fileIndexer0).getFile();
      doReturn((-3876L), (-2150L)).when(fileIndexer0).getFileLength();
      doReturn((FileIndex) null).when(fileIndexer0).getIndex();
      UpdateIndexFileWatcher updateIndexFileWatcher0 = new UpdateIndexFileWatcher(fileIndexer0);
      // Undeclared exception!
      try { 
        updateIndexFileWatcher0.fileChanged();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.pingtimeout.jtail.gui.controller.UpdateIndexFileWatcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UpdateIndexFileWatcher updateIndexFileWatcher0 = null;
      try {
        updateIndexFileWatcher0 = new UpdateIndexFileWatcher((FileIndexer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.pingtimeout.jtail.gui.controller.UpdateIndexFileWatcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileIndexer fileIndexer0 = new FileIndexer(mockFile0);
      UpdateIndexFileWatcher updateIndexFileWatcher0 = new UpdateIndexFileWatcher(fileIndexer0);
      updateIndexFileWatcher0.fileChanged();
      assertEquals(0L, updateIndexFileWatcher0.scheduledExecutionTime());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RamFileIndex ramFileIndex0 = new RamFileIndex((File) null);
      FileIndexer fileIndexer0 = mock(FileIndexer.class, new ViolatedAssumptionAnswer());
      doReturn((File) null).when(fileIndexer0).getFile();
      doReturn(0L, 592L).when(fileIndexer0).getFileLength();
      doReturn(ramFileIndex0).when(fileIndexer0).getIndex();
      UpdateIndexFileWatcher updateIndexFileWatcher0 = new UpdateIndexFileWatcher(fileIndexer0);
      updateIndexFileWatcher0.fileChanged();
      assertEquals(0L, updateIndexFileWatcher0.scheduledExecutionTime());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FileIndexer fileIndexer0 = mock(FileIndexer.class, new ViolatedAssumptionAnswer());
      doReturn((File) null).when(fileIndexer0).getFile();
      doReturn(2262L, 721L).when(fileIndexer0).getFileLength();
      UpdateIndexFileWatcher updateIndexFileWatcher0 = new UpdateIndexFileWatcher(fileIndexer0);
      updateIndexFileWatcher0.fileChanged();
      assertEquals(0L, updateIndexFileWatcher0.scheduledExecutionTime());
  }
}
