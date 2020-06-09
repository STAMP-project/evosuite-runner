/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 09 12:08:51 GMT 2020
 */

package com.google.gson.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.internal.LinkedTreeMap;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LinkedTreeMap_ESTest extends LinkedTreeMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedTreeMap.Node<Comparable<Object>, AbstractMap.SimpleImmutableEntry<String, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Comparable<Object>, AbstractMap.SimpleImmutableEntry<String, Object>>();
      AbstractMap.SimpleImmutableEntry<String, Object> abstractMap_SimpleImmutableEntry0 = linkedTreeMap_Node0.getValue();
      assertNull(abstractMap_SimpleImmutableEntry0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleImmutableEntry<String, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleImmutableEntry<String, Object>>();
      AbstractMap.SimpleEntry<Object, Object> abstractMap_SimpleEntry0 = linkedTreeMap_Node0.getKey();
      assertNull(abstractMap_SimpleEntry0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      int int0 = linkedTreeMap_EntrySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, Integer>, Object> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, Integer>, Object>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.iterator();
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>>(comparator0);
      // Undeclared exception!
      try { 
        linkedTreeMap0.removeInternal((LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>>) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>();
      LinkedTreeMap<String, String> linkedTreeMap1 = new LinkedTreeMap<String, String>();
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, String>();
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, String>(linkedTreeMap_Node0, "lhi", linkedTreeMap_Node0, linkedTreeMap_Node0);
      linkedTreeMap1.root = linkedTreeMap_Node1;
      linkedTreeMap1.findByObject(linkedTreeMap0);
      assertEquals(0, linkedTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedTreeMap<Object, AbstractMap.SimpleImmutableEntry<String, String>> linkedTreeMap0 = new LinkedTreeMap<Object, AbstractMap.SimpleImmutableEntry<String, String>>();
      int int0 = linkedTreeMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedTreeMap<Object, Map.Entry<String, AbstractMap.SimpleImmutableEntry<Object, Object>>> linkedTreeMap0 = new LinkedTreeMap<Object, Map.Entry<String, AbstractMap.SimpleImmutableEntry<Object, Object>>>();
      LinkedTreeMap<Object, Integer> linkedTreeMap1 = new LinkedTreeMap<Object, Integer>();
      LinkedTreeMap.Node<Object, Map.Entry<String, AbstractMap.SimpleImmutableEntry<Object, Object>>> linkedTreeMap_Node0 = linkedTreeMap0.removeInternalByKey(linkedTreeMap1);
      assertEquals(0, linkedTreeMap1.size());
      assertNull(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      linkedTreeMap0.put("t-*@f|Zf5u; :/oZN", "t-*@f|Zf5u; :/oZN");
      linkedTreeMap0.remove((Object) "t-*@f|Zf5u; :/oZN");
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>(comparator0);
      linkedTreeMap0.find((Integer) null, true);
      linkedTreeMap0.keySet();
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, String>, Object> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, String>, Object>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Integer> linkedTreeMap1 = new LinkedTreeMap<Object, Integer>(comparator0);
      linkedTreeMap1.get(linkedTreeMap0);
      assertEquals(0, linkedTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, String>, AbstractMap.SimpleEntry<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, String>, AbstractMap.SimpleEntry<Object, Object>>(comparator0);
      AbstractMap.SimpleEntry<Object, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, String>(linkedTreeMap0, "Bth=e9(z");
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, String>();
      AbstractMap.SimpleEntry<Object, Object> abstractMap_SimpleEntry1 = new AbstractMap.SimpleEntry<Object, Object>(linkedTreeMap_Node0);
      linkedTreeMap0.put(abstractMap_SimpleEntry0, abstractMap_SimpleEntry1);
      linkedTreeMap0.get("");
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedTreeMap<Comparable<Object>, Integer> linkedTreeMap0 = new LinkedTreeMap<Comparable<Object>, Integer>();
      linkedTreeMap0.findByObject((Object) null);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleEntry<String, Object>, String> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<String, Object>, String>(comparator0);
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, String>();
      linkedTreeMap0.findByEntry(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      linkedTreeMap0.find("JFuD&m)[5w%/[p#", false);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedTreeMap<Comparable<Object>, Object> linkedTreeMap0 = new LinkedTreeMap<Comparable<Object>, Object>();
      Set<Map.Entry<Comparable<Object>, Object>> set0 = (Set<Map.Entry<Comparable<Object>, Object>>)linkedTreeMap0.entrySet();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, String>, AbstractMap.SimpleEntry<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, String>, AbstractMap.SimpleEntry<Object, Object>>(comparator0);
      AbstractMap.SimpleEntry<Object, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, String>(linkedTreeMap0, "Bth=e9(z");
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, String>();
      AbstractMap.SimpleEntry<Object, Object> abstractMap_SimpleEntry1 = new AbstractMap.SimpleEntry<Object, Object>(linkedTreeMap_Node0);
      linkedTreeMap0.put(abstractMap_SimpleEntry0, abstractMap_SimpleEntry1);
      linkedTreeMap0.entrySet();
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Object>(linkedTreeMap_Node0, linkedTreeMap_Node0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>(comparator0);
      Integer integer0 = new Integer(0);
      linkedTreeMap0.put(linkedTreeMap_Node0, integer0);
      boolean boolean0 = linkedTreeMap0.containsKey(linkedTreeMap_Node1);
      assertEquals(1, linkedTreeMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      linkedTreeMap0.root = linkedTreeMap_Node0;
      // Undeclared exception!
      try { 
        linkedTreeMap0.put("JU5!R <p=.wdbp", (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedTreeMap<Integer, AbstractMap.SimpleEntry<Object, String>> linkedTreeMap0 = new LinkedTreeMap<Integer, AbstractMap.SimpleEntry<Object, String>>();
      // Undeclared exception!
      try { 
        linkedTreeMap0.findByEntry((Map.Entry<?, ?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Object>();
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Object>, Object> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Object>, Object>();
      AbstractMap.SimpleImmutableEntry<Integer, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Integer, Object>(linkedTreeMap_Node0);
      // Undeclared exception!
      try { 
        linkedTreeMap0.find(abstractMap_SimpleImmutableEntry0, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.AbstractMap$SimpleImmutableEntry is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>();
      Integer integer0 = new Integer(1228);
      Integer integer1 = new Integer(1265);
      linkedTreeMap0.putIfAbsent(integer1, (Object) null);
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node0 = linkedTreeMap0.find(integer0, true);
      Integer integer2 = new Integer((-4623));
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node1 = linkedTreeMap0.find(integer2, true);
      assertFalse(linkedTreeMap_Node1.equals((Object)linkedTreeMap_Node0));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(472, 472, 472, 472, 0).when(comparator0).compare(any() , any());
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>(comparator0);
      Integer integer0 = new Integer(472);
      linkedTreeMap0.put(integer0, "thEEQI5$");
      linkedTreeMap0.find(integer0, true);
      linkedTreeMap0.putIfAbsent(integer0, integer0);
      assertEquals(2, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>>();
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>>();
      linkedTreeMap_Node0.left = linkedTreeMap_Node0;
      linkedTreeMap_Node0.right = linkedTreeMap_Node0.left;
      // Undeclared exception!
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0.left, false);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, String>, Object> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, String>, Object>();
      LinkedTreeMap<Integer, AbstractMap.SimpleEntry<Integer, Object>> linkedTreeMap1 = new LinkedTreeMap<Integer, AbstractMap.SimpleEntry<Integer, Object>>();
      boolean boolean0 = linkedTreeMap1.containsKey(linkedTreeMap0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      linkedTreeMap0.clear();
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>(comparator0);
      Integer integer0 = new Integer((-1097));
      linkedTreeMap0.putIfAbsent(integer0, (Object) null);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.remove(linkedTreeMap0);
      assertEquals(0, linkedTreeMap_KeySet0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.remove(">ym\"jmL=r:7.&FZS");
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedTreeMap.Node<Object, Comparable<Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Comparable<Object>>();
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(linkedTreeMap_Node0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, String> linkedTreeMap0 = new LinkedTreeMap<Integer, String>(comparator0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Integer> linkedTreeMap1 = new LinkedTreeMap<Object, Integer>(comparator1);
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(linkedTreeMap1);
      assertEquals(0, linkedTreeMap1.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>(comparator0);
      Integer integer0 = new Integer(1372);
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node0 = linkedTreeMap0.find(integer0, true);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains(linkedTreeMap_Node0);
      assertEquals(1, linkedTreeMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<String, String>, Object> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<String, String>, Object>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains((Object) null);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedTreeMap.Node<Object, Comparable<Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Comparable<Object>>();
      Integer integer0 = new Integer((-2));
      LinkedTreeMap.Node<Object, Comparable<Object>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Comparable<Object>>(linkedTreeMap_Node0, integer0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>(comparator0);
      linkedTreeMap0.find((Integer) null, true);
      boolean boolean0 = linkedTreeMap0.containsValue(linkedTreeMap_Node1);
      assertEquals(1, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedTreeMap.Node<String, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Integer>();
      LinkedTreeMap.Node<String, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, Integer>(linkedTreeMap_Node0, "8#Lk %J<_*XogRPdu\"H", linkedTreeMap_Node0, linkedTreeMap_Node0);
      linkedTreeMap_Node0.right = linkedTreeMap_Node1;
      LinkedTreeMap.Node<String, Integer> linkedTreeMap_Node2 = linkedTreeMap_Node0.last();
      assertNotNull(linkedTreeMap_Node2);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, String>, AbstractMap.SimpleImmutableEntry<Object, String>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, String>, AbstractMap.SimpleImmutableEntry<Object, String>>();
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, String>, AbstractMap.SimpleImmutableEntry<Object, String>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, String>, AbstractMap.SimpleImmutableEntry<Object, String>>();
      linkedTreeMap_Node0.left = linkedTreeMap_Node1;
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, String>, AbstractMap.SimpleImmutableEntry<Object, String>> linkedTreeMap_Node2 = linkedTreeMap_Node0.first();
      assertNotNull(linkedTreeMap_Node2);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Object>();
      Integer integer0 = new Integer((-1964));
      Object object0 = linkedTreeMap_Node0.setValue(integer0);
      assertNull(object0);
      
      boolean boolean0 = linkedTreeMap_Node0.equals(linkedTreeMap_Node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Object>();
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Integer, Object>(linkedTreeMap_Node0, (Integer) null, linkedTreeMap_Node0, linkedTreeMap_Node0);
      Object object0 = linkedTreeMap_Node1.setValue(linkedTreeMap_Node0);
      assertNull(object0);
      
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedTreeMap.Node<Object, Comparable<Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Comparable<Object>>();
      Integer integer0 = new Integer((-2));
      LinkedTreeMap.Node<Object, Comparable<Object>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Comparable<Object>>(linkedTreeMap_Node0, integer0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      LinkedTreeMap.Node<Object, Comparable<Object>> linkedTreeMap_Node2 = linkedTreeMap_Node1.first();
      assertNotNull(linkedTreeMap_Node2);
      
      LinkedTreeMap.Node<Object, Comparable<Object>> linkedTreeMap_Node3 = linkedTreeMap_Node2.first();
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node4 = new LinkedTreeMap.Node<Integer, Object>();
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node5 = new LinkedTreeMap.Node<Integer, Object>(linkedTreeMap_Node4, integer0, linkedTreeMap_Node4, linkedTreeMap_Node4);
      boolean boolean0 = linkedTreeMap_Node5.equals(linkedTreeMap_Node3);
      assertSame(linkedTreeMap_Node3, linkedTreeMap_Node2);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LinkedTreeMap.Node<Object, Comparable<Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Comparable<Object>>();
      Integer integer0 = new Integer((-2));
      LinkedTreeMap.Node<Object, Comparable<Object>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Comparable<Object>>(linkedTreeMap_Node0, integer0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      LinkedTreeMap.Node<Integer, Comparable<Object>> linkedTreeMap_Node2 = new LinkedTreeMap.Node<Integer, Comparable<Object>>();
      boolean boolean0 = linkedTreeMap_Node2.equals(linkedTreeMap_Node1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>((Comparator<? super Object>) null);
      linkedTreeMap0.keySet();
      Set<Object> set0 = linkedTreeMap0.keySet();
      assertNotNull(set0);
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, String>, AbstractMap.SimpleEntry<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, String>, AbstractMap.SimpleEntry<Object, Object>>(comparator0);
      AbstractMap.SimpleEntry<Object, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, String>(linkedTreeMap0, "Bth=e9(z");
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, String>();
      AbstractMap.SimpleEntry<Object, Object> abstractMap_SimpleEntry1 = new AbstractMap.SimpleEntry<Object, Object>(linkedTreeMap_Node0);
      linkedTreeMap0.put(abstractMap_SimpleEntry0, abstractMap_SimpleEntry1);
      BiConsumer<Object, Object> biConsumer0 = (BiConsumer<Object, Object>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      linkedTreeMap0.forEach(biConsumer0);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>();
      Integer integer0 = new Integer(1228);
      Integer integer1 = new Integer(1268);
      linkedTreeMap0.putIfAbsent(integer1, (Object) null);
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node0 = linkedTreeMap0.find(integer0, true);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(linkedTreeMap_Node0);
      assertEquals(1, linkedTreeMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(3006, 3006, (-1)).when(comparator0).compare(any() , any());
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>(comparator0);
      Integer integer0 = new Integer(1372);
      linkedTreeMap0.find(integer0, true);
      linkedTreeMap0.putIfAbsent(integer0, linkedTreeMap_Node0);
      linkedTreeMap0.find(integer0, true);
      assertEquals(3, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>> linkedTreeMap1 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>>();
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>>();
      AbstractMap.SimpleEntry<Object, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Object>(linkedTreeMap_Node0, linkedTreeMap0);
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>>(linkedTreeMap_Node0, abstractMap_SimpleEntry0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      // Undeclared exception!
      try { 
        linkedTreeMap1.removeInternal(linkedTreeMap_Node1, false);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(472, (-2), (-2), 640).when(comparator0).compare(any() , any());
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>(comparator0);
      Integer integer0 = new Integer(1372);
      linkedTreeMap0.find(integer0, true);
      linkedTreeMap0.putIfAbsent(integer0, linkedTreeMap_Node0);
      linkedTreeMap0.find(integer0, true);
      assertEquals(3, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      linkedTreeMap_Node0.right = linkedTreeMap_Node0;
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>>(comparator0);
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0, true);
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>>(comparator0);
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>>();
      linkedTreeMap_Node0.left = linkedTreeMap_Node0;
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0, true);
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Integer integer0 = new Integer((-2));
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Object>();
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Integer, Object>(linkedTreeMap_Node0, integer0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>(comparator0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains(linkedTreeMap_Node1);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LinkedTreeMap<LinkedTreeMap<Integer, Object>, Object> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<Integer, Object>, Object>();
      LinkedTreeMap<Integer, Object> linkedTreeMap1 = new LinkedTreeMap<Integer, Object>((Comparator<? super Integer>) null);
      // Undeclared exception!
      try { 
        linkedTreeMap0.put(linkedTreeMap1, (Object) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.internal.LinkedTreeMap is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(472, 472, 472, (-2731)).when(comparator0).compare(any() , any());
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>(comparator0);
      Integer integer0 = new Integer(472);
      linkedTreeMap0.find(integer0, true);
      linkedTreeMap0.putIfAbsent(integer0, integer0);
      linkedTreeMap0.find(integer0, true);
      assertEquals(3, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LinkedTreeMap<String, AbstractMap.SimpleEntry<Object, Integer>> linkedTreeMap0 = new LinkedTreeMap<String, AbstractMap.SimpleEntry<Object, Integer>>();
      linkedTreeMap0.remove((Object) "U");
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      // Undeclared exception!
      try { 
        linkedTreeMap0.put((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Object>();
      Integer integer0 = new Integer((-1964));
      Object object0 = linkedTreeMap_Node0.setValue(integer0);
      assertNull(object0);
      
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Integer, Object>();
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Object>();
      String string0 = linkedTreeMap_Node0.toString();
      assertEquals("null=null", string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(472, (-2)).when(comparator0).compare(any() , any());
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>(comparator0);
      Integer integer0 = new Integer(1372);
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node1 = linkedTreeMap0.find(integer0, true);
      linkedTreeMap0.putIfAbsent(integer0, linkedTreeMap_Node0);
      boolean boolean0 = linkedTreeMap0.containsValue(linkedTreeMap_Node1);
      assertEquals(2, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      LinkedTreeMap<Integer, AbstractMap.SimpleImmutableEntry<Integer, Object>> linkedTreeMap0 = new LinkedTreeMap<Integer, AbstractMap.SimpleImmutableEntry<Integer, Object>>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      int int0 = linkedTreeMap_KeySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      LinkedTreeMap<Integer, AbstractMap.SimpleImmutableEntry<Integer, Object>> linkedTreeMap0 = new LinkedTreeMap<Integer, AbstractMap.SimpleImmutableEntry<Integer, Object>>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.iterator();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>(comparator0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.contains((Object) null);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>(comparator0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.clear();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Integer integer0 = new Integer(1268);
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>((Comparator<? super Integer>) null);
      LinkedTreeMap<Object, Object> linkedTreeMap1 = new LinkedTreeMap<Object, Object>((Comparator<? super Object>) null);
      linkedTreeMap0.putIfAbsent(integer0, linkedTreeMap1);
      // Undeclared exception!
      try { 
        linkedTreeMap0.find((Integer) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedTreeMap$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      LinkedTreeMap<String, Integer> linkedTreeMap0 = new LinkedTreeMap<String, Integer>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.clear();
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }
}
