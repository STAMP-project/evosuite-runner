/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 09 11:48:40 GMT 2020
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
import java.util.function.BiFunction;
import java.util.function.Function;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LinkedTreeMap_ESTest extends LinkedTreeMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      Object object0 = linkedTreeMap_Node0.getValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      Object object0 = linkedTreeMap_Node0.getKey();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedTreeMap<String, AbstractMap.SimpleEntry<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<String, AbstractMap.SimpleEntry<Object, Object>>((Comparator<? super String>) null);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      int int0 = linkedTreeMap_EntrySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedTreeMap<String, AbstractMap.SimpleEntry<String, String>> linkedTreeMap0 = new LinkedTreeMap<String, AbstractMap.SimpleEntry<String, String>>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.iterator();
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      LinkedTreeMap<String, Integer> linkedTreeMap0 = new LinkedTreeMap<String, Integer>();
      LinkedTreeMap<Integer, Object> linkedTreeMap1 = new LinkedTreeMap<Integer, Object>();
      Integer integer0 = new Integer((-209));
      linkedTreeMap1.put(integer0, linkedTreeMap_Node0);
      linkedTreeMap1.remove((Object) linkedTreeMap0);
      assertEquals(1, linkedTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>(comparator0);
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0, true);
      int int0 = linkedTreeMap0.size();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, Object>, AbstractMap.SimpleImmutableEntry<String, String>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, Object>, AbstractMap.SimpleImmutableEntry<String, String>>();
      LinkedTreeMap<String, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap0 = new LinkedTreeMap<String, AbstractMap.SimpleEntry<String, Object>>((Comparator<? super String>) null);
      LinkedTreeMap.Node<String, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap_Node1 = linkedTreeMap0.removeInternalByKey(linkedTreeMap_Node0);
      assertNull(linkedTreeMap_Node1);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>(comparator0);
      linkedTreeMap0.put("", "aPFcY");
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedTreeMap<Comparable<String>, Comparable<Integer>> linkedTreeMap0 = new LinkedTreeMap<Comparable<String>, Comparable<Integer>>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      LinkedTreeMap<String, Object> linkedTreeMap1 = new LinkedTreeMap<String, Object>();
      BiFunction<Object, Object, String> biFunction0 = (BiFunction<Object, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedTreeMap1.merge("[]", linkedTreeMap_KeySet0, biFunction0);
      linkedTreeMap1.keySet();
      assertEquals(1, linkedTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>(comparator0);
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0, true);
      linkedTreeMap0.keySet();
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      Function<Object, Object> function0 = Function.identity();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, Object> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, Object>(comparator0);
      AbstractMap.SimpleEntry<Object, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Object>(linkedTreeMap_Node0);
      Object object0 = linkedTreeMap0.computeIfAbsent(abstractMap_SimpleEntry0, function0);
      linkedTreeMap0.get(object0);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      LinkedTreeMap<String, Comparable<Integer>> linkedTreeMap0 = new LinkedTreeMap<String, Comparable<Integer>>();
      linkedTreeMap0.findByEntry(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<Integer, Object>, String> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Integer, Object>, String>();
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Integer>();
      AbstractMap.SimpleEntry<Integer, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Integer, Object>(linkedTreeMap_Node0);
      linkedTreeMap0.find(abstractMap_SimpleEntry0, false);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedTreeMap<Comparable<String>, Comparable<Integer>> linkedTreeMap0 = new LinkedTreeMap<Comparable<String>, Comparable<Integer>>();
      linkedTreeMap0.size = (-451);
      Set<Map.Entry<Comparable<String>, Comparable<Integer>>> set0 = (Set<Map.Entry<Comparable<String>, Comparable<Integer>>>)linkedTreeMap0.entrySet();
      assertEquals((-451), set0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedTreeMap<LinkedTreeMap<Integer, Object>, String> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<Integer, Object>, String>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, Object> linkedTreeMap1 = new LinkedTreeMap<Integer, Object>(comparator0);
      // Undeclared exception!
      try { 
        linkedTreeMap0.put(linkedTreeMap1, "f?#*Vh Jjkdi>");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.internal.LinkedTreeMap is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedTreeMap<String, Integer> linkedTreeMap0 = new LinkedTreeMap<String, Integer>();
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
  public void test16()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<Integer, Object>, String> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Integer, Object>, String>();
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Integer>();
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, Object>, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, Object>, String>();
      linkedTreeMap0.root = linkedTreeMap_Node1;
      AbstractMap.SimpleEntry<Integer, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Integer, Object>(linkedTreeMap_Node0);
      // Undeclared exception!
      try { 
        linkedTreeMap0.find(abstractMap_SimpleEntry0, false);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.AbstractMap$SimpleEntry cannot be cast to java.lang.Comparable
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedTreeMap<LinkedTreeMap<Integer, Object>, Object> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<Integer, Object>, Object>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, Object> linkedTreeMap1 = new LinkedTreeMap<Integer, Object>(comparator0);
      // Undeclared exception!
      try { 
        linkedTreeMap0.find(linkedTreeMap1, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.internal.LinkedTreeMap is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedTreeMap<Comparable<String>, Comparable<Integer>> linkedTreeMap0 = new LinkedTreeMap<Comparable<String>, Comparable<Integer>>();
      linkedTreeMap0.entrySet();
      Set<Map.Entry<Comparable<String>, Comparable<Integer>>> set0 = (Set<Map.Entry<Comparable<String>, Comparable<Integer>>>)linkedTreeMap0.entrySet();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedTreeMap<Integer, LinkedTreeMap<Integer, String>> linkedTreeMap0 = new LinkedTreeMap<Integer, LinkedTreeMap<Integer, String>>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap0.containsKey(linkedTreeMap_KeySet0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Comparable<Object>> linkedTreeMap0 = new LinkedTreeMap<Object, Comparable<Object>>(comparator0);
      linkedTreeMap0.clear();
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, Object> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, Object>(comparator0);
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      AbstractMap.SimpleEntry<Object, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Object>(linkedTreeMap_Node0);
      linkedTreeMap0.find(abstractMap_SimpleEntry0, true);
      Integer integer0 = new Integer((-1));
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.remove(integer0);
      assertEquals(0, linkedTreeMap_KeySet0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>(comparator0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.remove(linkedTreeMap0);
      assertEquals(0, linkedTreeMap_KeySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.remove((Object) null);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      LinkedTreeMap<String, Integer> linkedTreeMap0 = new LinkedTreeMap<String, Integer>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains(linkedTreeMap_Node0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedTreeMap<Comparable<Object>, Object> linkedTreeMap0 = new LinkedTreeMap<Comparable<Object>, Object>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains(linkedTreeMap0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedTreeMap.Node<Comparable<Object>, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Comparable<Object>, Object>();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap.Node<Comparable<Object>, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Comparable<Object>, Object>(linkedTreeMap_Node0, comparable0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      linkedTreeMap_Node1.right = linkedTreeMap_Node0;
      LinkedTreeMap.Node<Comparable<Object>, Object> linkedTreeMap_Node2 = linkedTreeMap_Node1.last();
      assertNotNull(linkedTreeMap_Node2);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedTreeMap.Node<Object, LinkedTreeMap<Object, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, LinkedTreeMap<Object, Object>>();
      LinkedTreeMap.Node<Object, LinkedTreeMap<Object, Object>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, LinkedTreeMap<Object, Object>>();
      linkedTreeMap_Node0.left = linkedTreeMap_Node1;
      LinkedTreeMap.Node<Object, LinkedTreeMap<Object, Object>> linkedTreeMap_Node2 = linkedTreeMap_Node0.first();
      assertNotNull(linkedTreeMap_Node2);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedTreeMap.Node<Object, LinkedTreeMap<Object, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, LinkedTreeMap<Object, Object>>();
      LinkedTreeMap.Node<Object, LinkedTreeMap<Object, Object>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, LinkedTreeMap<Object, Object>>();
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      LinkedTreeMap<Object, Object> linkedTreeMap1 = linkedTreeMap_Node1.setValue(linkedTreeMap0);
      assertNull(linkedTreeMap1);
      assertEquals(0, linkedTreeMap0.size());
      
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedTreeMap<String, Integer> linkedTreeMap0 = new LinkedTreeMap<String, Integer>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      LinkedTreeMap.Node<Object, LinkedTreeMap<Object, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, LinkedTreeMap<Object, Object>>();
      LinkedTreeMap.Node<Object, LinkedTreeMap<Object, Object>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, LinkedTreeMap<Object, Object>>(linkedTreeMap_Node0, linkedTreeMap_KeySet0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      LinkedTreeMap.Node<LinkedTreeMap<String, String>, Object> linkedTreeMap_Node2 = new LinkedTreeMap.Node<LinkedTreeMap<String, String>, Object>();
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node2);
      assertEquals(0, linkedTreeMap_KeySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedTreeMap<String, Integer> linkedTreeMap0 = new LinkedTreeMap<String, Integer>();
      LinkedTreeMap.Node<Object, LinkedTreeMap<Object, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, LinkedTreeMap<Object, Object>>();
      LinkedTreeMap<String, String> linkedTreeMap1 = new LinkedTreeMap<String, String>();
      AbstractMap.SimpleImmutableEntry<LinkedTreeMap<String, String>, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<LinkedTreeMap<String, String>, Object>(linkedTreeMap1, linkedTreeMap0);
      boolean boolean0 = linkedTreeMap_Node0.equals(abstractMap_SimpleImmutableEntry0);
      assertEquals(0, linkedTreeMap1.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>(comparator0);
      LinkedTreeMap.Node<Object, LinkedTreeMap<Object, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, LinkedTreeMap<Object, Object>>();
      LinkedTreeMap.Node<Object, LinkedTreeMap<Object, Object>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, LinkedTreeMap<Object, Object>>();
      LinkedTreeMap<Object, Object> linkedTreeMap1 = new LinkedTreeMap<Object, Object>();
      LinkedTreeMap.Node<Object, LinkedTreeMap<Object, Object>> linkedTreeMap_Node2 = new LinkedTreeMap.Node<Object, LinkedTreeMap<Object, Object>>(linkedTreeMap_Node0, linkedTreeMap1, linkedTreeMap_Node1, linkedTreeMap_Node1);
      AbstractMap.SimpleEntry<LinkedTreeMap<String, String>, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<LinkedTreeMap<String, String>, Object>(linkedTreeMap0, linkedTreeMap_Node2);
      boolean boolean0 = linkedTreeMap_Node2.equals(abstractMap_SimpleEntry0);
      assertFalse(linkedTreeMap_Node2.equals((Object)linkedTreeMap_Node0));
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedTreeMap.Node<Object, LinkedTreeMap<Object, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, LinkedTreeMap<Object, Object>>();
      LinkedTreeMap.Node<Object, LinkedTreeMap<Object, Object>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, LinkedTreeMap<Object, Object>>();
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedTreeMap.Node<Comparable<Integer>, LinkedTreeMap<Object, Integer>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Comparable<Integer>, LinkedTreeMap<Object, Integer>>();
      boolean boolean0 = linkedTreeMap_Node0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<LinkedTreeMap<Object, String>, Comparable<Integer>> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<Object, String>, Comparable<Integer>>(comparator0);
      LinkedTreeMap.Node<LinkedTreeMap<Object, String>, Comparable<Integer>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<LinkedTreeMap<Object, String>, Comparable<Integer>>();
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, String> linkedTreeMap1 = new LinkedTreeMap<Object, String>(comparator1);
      LinkedTreeMap.Node<LinkedTreeMap<Object, String>, Comparable<Integer>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<LinkedTreeMap<Object, String>, Comparable<Integer>>(linkedTreeMap_Node0, linkedTreeMap1, linkedTreeMap_Node0, linkedTreeMap_Node0);
      linkedTreeMap_Node0.left = linkedTreeMap_Node1;
      linkedTreeMap0.removeInternal(linkedTreeMap_Node1, true);
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1609), (-1609), (-1609), (-1609), (-1609)).when(comparator0).compare(any() , any());
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, Object> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, Object>(comparator0);
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      AbstractMap.SimpleEntry<Object, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Object>(linkedTreeMap_Node0);
      linkedTreeMap0.find(abstractMap_SimpleEntry0, true);
      Function<Object, Object> function0 = Function.identity();
      linkedTreeMap0.computeIfAbsent(abstractMap_SimpleEntry0, function0);
      linkedTreeMap0.computeIfAbsent(abstractMap_SimpleEntry0, function0);
      assertEquals(3, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1649), 1, 1, 1, 1).when(comparator0).compare(any() , any());
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, Object> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, Object>(comparator0);
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      AbstractMap.SimpleEntry<Object, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Object>(linkedTreeMap_Node0);
      linkedTreeMap0.find(abstractMap_SimpleEntry0, true);
      Function<Object, Object> function0 = Function.identity();
      linkedTreeMap0.computeIfAbsent(abstractMap_SimpleEntry0, function0);
      linkedTreeMap0.computeIfAbsent(abstractMap_SimpleEntry0, function0);
      assertEquals(3, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedTreeMap<Comparable<Object>, Object> linkedTreeMap0 = new LinkedTreeMap<Comparable<Object>, Object>();
      LinkedTreeMap.Node<Comparable<Object>, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Comparable<Object>, Object>();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(comparable0).toString();
      LinkedTreeMap.Node<Comparable<Object>, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Comparable<Object>, Object>(linkedTreeMap_Node0, comparable0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      LinkedTreeMap.Node<Comparable<Object>, Object> linkedTreeMap_Node2 = linkedTreeMap_Node1.last();
      // Undeclared exception!
      try { 
        linkedTreeMap0.removeInternal(linkedTreeMap_Node2, true);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LinkedTreeMap.Node<Comparable<Object>, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Comparable<Object>, Object>();
      LinkedTreeMap.Node<Comparable<Object>, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Comparable<Object>, Object>();
      linkedTreeMap_Node0.left = linkedTreeMap_Node1;
      LinkedTreeMap<Comparable<Object>, Object> linkedTreeMap0 = new LinkedTreeMap<Comparable<Object>, Object>();
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0, true);
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LinkedTreeMap<Comparable<Object>, Object> linkedTreeMap0 = new LinkedTreeMap<Comparable<Object>, Object>();
      // Undeclared exception!
      try { 
        linkedTreeMap0.removeInternal((LinkedTreeMap.Node<Comparable<Object>, Object>) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, Object> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, Object>(comparator0);
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      AbstractMap.SimpleEntry<Object, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Object>(linkedTreeMap_Node0);
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Object> linkedTreeMap_Node1 = linkedTreeMap0.find(abstractMap_SimpleEntry0, true);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains(linkedTreeMap_Node1);
      assertEquals(1, linkedTreeMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LinkedTreeMap<Comparable<String>, Comparable<Integer>> linkedTreeMap0 = new LinkedTreeMap<Comparable<String>, Comparable<Integer>>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      LinkedTreeMap.Node<LinkedTreeMap<String, String>, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<LinkedTreeMap<String, String>, Object>();
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1649), 1, 1, 1, (-1)).when(comparator0).compare(any() , any());
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, Object> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, Object>(comparator0);
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      AbstractMap.SimpleEntry<Object, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Object>(linkedTreeMap_Node0);
      linkedTreeMap0.find(abstractMap_SimpleEntry0, true);
      Function<Object, Object> function0 = Function.identity();
      linkedTreeMap0.computeIfAbsent(abstractMap_SimpleEntry0, function0);
      linkedTreeMap0.computeIfAbsent(abstractMap_SimpleEntry0, function0);
      assertEquals(3, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      // Undeclared exception!
      try { 
        linkedTreeMap0.find((Object) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1649), 1, 1, 1).when(comparator0).compare(any() , any());
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, Object> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, Object>(comparator0);
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      AbstractMap.SimpleEntry<Object, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Object>(linkedTreeMap_Node0);
      linkedTreeMap0.find(abstractMap_SimpleEntry0, true);
      Object object0 = new Object();
      Function<Object, Object> function0 = Function.identity();
      linkedTreeMap0.computeIfAbsent(abstractMap_SimpleEntry0, function0);
      linkedTreeMap0.get(object0);
      assertEquals(2, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LinkedTreeMap<String, Map.Entry<String, String>> linkedTreeMap0 = new LinkedTreeMap<String, Map.Entry<String, String>>();
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, String>();
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, String>(linkedTreeMap_Node0, "<$uPV,T$79-", linkedTreeMap_Node0, linkedTreeMap_Node0);
      // Undeclared exception!
      try { 
        linkedTreeMap0.put((String) null, linkedTreeMap_Node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LinkedTreeMap<Integer, String> linkedTreeMap0 = new LinkedTreeMap<Integer, String>();
      Set<Integer> set0 = linkedTreeMap0.keySet();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<LinkedTreeMap<Object, Object>, AbstractMap.SimpleEntry<String, String>> linkedTreeMap1 = new LinkedTreeMap<LinkedTreeMap<Object, Object>, AbstractMap.SimpleEntry<String, String>>(comparator0);
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Object> linkedTreeMap2 = new LinkedTreeMap<Object, Object>(comparator1);
      linkedTreeMap1.find(linkedTreeMap2, true);
      boolean boolean0 = linkedTreeMap1.containsKey(set0);
      assertEquals(1, linkedTreeMap1.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(comparator0).toString();
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      linkedTreeMap0.putIfAbsent(")9`o4y{-X{~!", comparator0);
      assertEquals(1, linkedTreeMap0.size());
      
      Integer integer0 = new Integer((-1293));
      BiFunction<Object, Object, String> biFunction0 = (BiFunction<Object, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(biFunction0).apply(any() , any());
      linkedTreeMap0.merge(")9`o4y{-X{~!", integer0, biFunction0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LinkedTreeMap<Integer, String> linkedTreeMap0 = new LinkedTreeMap<Integer, String>((Comparator<? super Integer>) null);
      LinkedTreeMap<Object, Integer> linkedTreeMap1 = new LinkedTreeMap<Object, Integer>((Comparator<? super Object>) null);
      linkedTreeMap0.findByObject(linkedTreeMap1);
      assertEquals(0, linkedTreeMap1.size());
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LinkedTreeMap<LinkedTreeMap<Object, String>, Map.Entry<LinkedTreeMap<String, String>, Object>> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<Object, String>, Map.Entry<LinkedTreeMap<String, String>, Object>>();
      int int0 = linkedTreeMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>(comparator0);
      linkedTreeMap0.putIfAbsent("*H|Gbki.s\"fahA`", linkedTreeMap_Node0);
      BiFunction<String, Object, Integer> biFunction0 = (BiFunction<String, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(biFunction0).apply(anyString() , any());
      linkedTreeMap0.replaceAll(biFunction0);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LinkedTreeMap<Comparable<String>, Comparable<Integer>> linkedTreeMap0 = new LinkedTreeMap<Comparable<String>, Comparable<Integer>>();
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, Object>, Comparable<Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, Object>, Comparable<Object>>();
      AbstractMap.SimpleImmutableEntry<Object, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Object, Object>(linkedTreeMap0, linkedTreeMap0);
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, Object>, Comparable<Object>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, Object>, Comparable<Object>>(linkedTreeMap_Node0, abstractMap_SimpleImmutableEntry0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      String string0 = linkedTreeMap_Node1.toString();
      assertEquals("{}={}=null", string0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LinkedTreeMap<String, Integer> linkedTreeMap0 = new LinkedTreeMap<String, Integer>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      int int0 = linkedTreeMap_KeySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      LinkedTreeMap<Comparable<String>, Comparable<Integer>> linkedTreeMap0 = new LinkedTreeMap<Comparable<String>, Comparable<Integer>>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.toString();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LinkedTreeMap<Comparable<Object>, Object> linkedTreeMap0 = new LinkedTreeMap<Comparable<Object>, Object>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.contains(linkedTreeMap0);
      assertEquals(0, linkedTreeMap_KeySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      LinkedTreeMap<Comparable<String>, Comparable<Integer>> linkedTreeMap0 = new LinkedTreeMap<Comparable<String>, Comparable<Integer>>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.clear();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>(comparator0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.clear();
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }
}
