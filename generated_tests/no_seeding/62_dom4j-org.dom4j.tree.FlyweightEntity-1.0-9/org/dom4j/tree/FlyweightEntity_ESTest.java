/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 04 14:08:21 GMT 2019
 */

package org.dom4j.tree;

import org.junit.Test;
import static org.junit.Assert.*;
import org.dom4j.NodeType;
import org.dom4j.dom.DOMEntityReference;
import org.dom4j.tree.DefaultEntity;
import org.dom4j.tree.FlyweightEntity;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FlyweightEntity_ESTest extends FlyweightEntity_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FlyweightEntity flyweightEntity0 = new FlyweightEntity("", "");
      flyweightEntity0.setText("");
      assertEquals(NodeType.ENTITY_REFERENCE_NODE, flyweightEntity0.getNodeTypeEnum());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FlyweightEntity flyweightEntity0 = new FlyweightEntity("");
      assertEquals((short)5, flyweightEntity0.getNodeType());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefaultEntity defaultEntity0 = new DefaultEntity("W#");
      String string0 = defaultEntity0.getText();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FlyweightEntity flyweightEntity0 = new FlyweightEntity("", "");
      String string0 = flyweightEntity0.getText();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DOMEntityReference dOMEntityReference0 = new DOMEntityReference("  kUh3#6n:Hcj,Twxi", "  kUh3#6n:Hcj,Twxi");
      String string0 = dOMEntityReference0.getName();
      assertEquals("  kUh3#6n:Hcj,Twxi", string0);
  }
}
