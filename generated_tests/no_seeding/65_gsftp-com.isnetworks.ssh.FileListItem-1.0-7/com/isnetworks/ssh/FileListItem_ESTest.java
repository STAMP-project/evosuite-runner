/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 21:01:32 GMT 2019
 */

package com.isnetworks.ssh;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.isnetworks.ssh.FileListItem;
import java.io.File;
import java.net.URI;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileListItem_ESTest extends FileListItem_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileListItem fileListItem0 = new FileListItem("*", "*", false, 2171L, 2171L);
      Vector<FileListItem> vector0 = new Vector<FileListItem>();
      FileListItem fileListItem1 = new FileListItem("**", "*", false, 2171L, 0L);
      vector0.add(fileListItem1);
      assertEquals(0L, fileListItem1.getLastModify());
      assertEquals(2171L, fileListItem1.getSize());
      assertEquals("**", fileListItem1.getName());
      assertEquals("*", fileListItem1.getParent());
      
      vector0.add(fileListItem0);
      assertEquals(2171L, fileListItem0.getLastModify());
      assertFalse(fileListItem0.isDirectory());
      
      FileListItem.sort(vector0);
      assertTrue(vector0.contains(fileListItem1));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileListItem fileListItem0 = new FileListItem(mockFile0);
      boolean boolean0 = fileListItem0.isDirectory();
      assertEquals(1392409281320L, fileListItem0.getLastModify());
      assertTrue(boolean0);
      assertEquals(0L, fileListItem0.getSize());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileListItem fileListItem0 = new FileListItem(mockFile0);
      long long0 = fileListItem0.getSize();
      assertEquals(0L, long0);
      assertEquals(1392409281320L, fileListItem0.getLastModify());
      assertTrue(fileListItem0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileListItem fileListItem0 = new FileListItem("", "uoL;#*f~5C?V", false, (-2880L), (-428L));
      long long0 = fileListItem0.getSize();
      assertEquals((-428L), fileListItem0.getLastModify());
      assertFalse(fileListItem0.isDirectory());
      assertEquals("", fileListItem0.getName());
      assertEquals((-2880L), long0);
      assertEquals("uoL;#*f~5C?V", fileListItem0.getParent());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileListItem fileListItem0 = new FileListItem(mockFile0);
      String string0 = fileListItem0.getParent();
      assertNull(string0);
      assertEquals(1392409281320L, fileListItem0.getLastModify());
      assertTrue(fileListItem0.isDirectory());
      assertEquals(0L, fileListItem0.getSize());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileListItem fileListItem0 = new FileListItem("", "", false, 2171L, 2171L);
      fileListItem0.getParent();
      assertFalse(fileListItem0.isDirectory());
      assertEquals(2171L, fileListItem0.getLastModify());
      assertEquals(2171L, fileListItem0.getSize());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileListItem fileListItem0 = new FileListItem("OP6csDn[o", "}ZkGvezh(sd", true, (-2407L), (-2407L));
      String string0 = fileListItem0.getName();
      assertEquals((-2407L), fileListItem0.getSize());
      assertEquals("OP6csDn[o", string0);
      assertEquals((-2407L), fileListItem0.getLastModify());
      assertTrue(fileListItem0.isDirectory());
      assertEquals("}ZkGvezh(sd", fileListItem0.getParent());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileListItem fileListItem0 = new FileListItem("", "..", false, 0L, 0L);
      String string0 = fileListItem0.getName();
      assertFalse(fileListItem0.isDirectory());
      assertEquals("", string0);
      assertEquals("..", fileListItem0.getParent());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileListItem fileListItem0 = new FileListItem("VH>", "VH>", true, 0L, 0L);
      fileListItem0.getLastModify();
      assertTrue(fileListItem0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileListItem fileListItem0 = new FileListItem("OP6csDn[o", "}ZkGvezh(sd", true, (-2407L), (-2407L));
      long long0 = fileListItem0.getLastModify();
      assertTrue(fileListItem0.isDirectory());
      assertEquals("}ZkGvezh(sd", fileListItem0.getParent());
      assertEquals((-2407L), fileListItem0.getSize());
      assertEquals("OP6csDn[o", fileListItem0.getName());
      assertEquals((-2407L), long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileListItem fileListItem0 = new FileListItem("", "", false, (-3474L), (-3474L));
      fileListItem0.getAbsolutePath();
      assertEquals((-3474L), fileListItem0.getLastModify());
      assertEquals((-3474L), fileListItem0.getSize());
      assertFalse(fileListItem0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        FileListItem.sort((Vector) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.isnetworks.ssh.FileListItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      vector0.add((Object) "");
      // Undeclared exception!
      try { 
        FileListItem.sort(vector0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to com.isnetworks.ssh.FileListItem
         //
         verifyException("com.isnetworks.ssh.FileListItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileListItem fileListItem0 = null;
      try {
        fileListItem0 = new FileListItem((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.isnetworks.ssh.FileListItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileListItem fileListItem0 = new FileListItem("*", "*", false, 2171L, 2171L);
      boolean boolean0 = fileListItem0.isDirectory();
      assertEquals(2171L, fileListItem0.getSize());
      assertFalse(boolean0);
      assertEquals(2171L, fileListItem0.getLastModify());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileListItem fileListItem0 = new FileListItem("*", "*", false, 2171L, 2171L);
      Vector<FileListItem> vector0 = new Vector<FileListItem>();
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      vector0.add(fileListItem0);
      FileListItem fileListItem1 = new FileListItem(mockFile0);
      vector0.add(fileListItem1);
      FileListItem.sort(vector0);
      assertFalse(vector0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Vector<FileListItem> vector0 = new Vector<FileListItem>();
      FileListItem fileListItem0 = new FileListItem("com.isnetworks.ssh.FileListItem", "com.isnetworks.ssh.FileListItem", true, 0L, 1L);
      vector0.add(fileListItem0);
      FileListItem.sort(vector0);
      assertEquals(1, vector0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileListItem fileListItem0 = new FileListItem("*", "*", false, 2171L, 2171L);
      Vector<FileListItem> vector0 = new Vector<FileListItem>();
      vector0.add(fileListItem0);
      FileListItem fileListItem1 = new FileListItem("..", "dcKy+m SKU`", false, 2319L, 0L);
      vector0.add(fileListItem1);
      FileListItem.sort(vector0);
      assertTrue(vector0.contains(fileListItem0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Vector<FileListItem> vector0 = new Vector<FileListItem>();
      FileListItem fileListItem0 = new FileListItem("..", "..", true, 0L, (-1106L));
      vector0.add(fileListItem0);
      FileListItem.sort(vector0);
      assertEquals(10, vector0.capacity());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileListItem fileListItem0 = new FileListItem("*", "*", false, 2171L, 2171L);
      fileListItem0.getAbsolutePath();
      assertEquals(2171L, fileListItem0.getLastModify());
      assertEquals(2171L, fileListItem0.getSize());
      assertFalse(fileListItem0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FileListItem fileListItem0 = new FileListItem("*", "*", false, 2171L, 2171L);
      fileListItem0.getParent();
      assertEquals(2171L, fileListItem0.getSize());
      assertFalse(fileListItem0.isDirectory());
      assertEquals(2171L, fileListItem0.getLastModify());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FileListItem fileListItem0 = new FileListItem((String) null, "Z &$5h.T=eDdp", true, 2061L, (-1L));
      String string0 = fileListItem0.getName();
      assertEquals((-1L), fileListItem0.getLastModify());
      assertEquals(2061L, fileListItem0.getSize());
      assertTrue(fileListItem0.isDirectory());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileListItem fileListItem0 = new FileListItem(mockFile0);
      long long0 = fileListItem0.getLastModify();
      assertEquals(1392409281320L, long0);
      assertTrue(fileListItem0.isDirectory());
      assertEquals(0L, fileListItem0.getSize());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FileListItem fileListItem0 = new FileListItem("*", "*", false, 2171L, 2171L);
      long long0 = fileListItem0.getSize();
      assertEquals(2171L, fileListItem0.getLastModify());
      assertFalse(fileListItem0.isDirectory());
      assertEquals(2171L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockFile mockFile0 = new MockFile(",", ",");
      FileListItem fileListItem0 = new FileListItem(mockFile0);
      Vector<FileListItem> vector0 = new Vector<FileListItem>();
      vector0.add(fileListItem0);
      FileListItem fileListItem1 = new FileListItem("com.isnetworks.ssh.FileListItem", "com.isnetworks.ssh.FileListItem", true, 0L, 1L);
      vector0.add(fileListItem1);
      FileListItem.sort(vector0);
      FileListItem.sort(vector0);
      assertTrue(vector0.contains(fileListItem0));
  }
}
