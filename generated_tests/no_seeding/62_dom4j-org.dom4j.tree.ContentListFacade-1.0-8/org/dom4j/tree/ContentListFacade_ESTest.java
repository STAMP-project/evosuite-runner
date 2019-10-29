/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 22:04:56 GMT 2019
 */

package org.dom4j.tree;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.dom4j.Attribute;
import org.dom4j.Namespace;
import org.dom4j.Node;
import org.dom4j.QName;
import org.dom4j.bean.BeanAttributeList;
import org.dom4j.bean.BeanElement;
import org.dom4j.bean.BeanMetaData;
import org.dom4j.dom.DOMAttribute;
import org.dom4j.dom.DOMDocument;
import org.dom4j.dom.DOMDocumentType;
import org.dom4j.dom.DOMElement;
import org.dom4j.dom.DOMNamespace;
import org.dom4j.tree.AbstractBranch;
import org.dom4j.tree.BaseElement;
import org.dom4j.tree.ContentListFacade;
import org.dom4j.tree.DefaultAttribute;
import org.dom4j.tree.DefaultDocument;
import org.dom4j.tree.DefaultElement;
import org.dom4j.util.NonLazyElement;
import org.dom4j.util.UserDataAttribute;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ContentListFacade_ESTest extends ContentListFacade_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QName qName0 = QName.get("QGsT%=-", "");
      BeanElement beanElement0 = new BeanElement(qName0);
      Class<Object> class0 = Object.class;
      BeanMetaData beanMetaData0 = BeanMetaData.get(class0);
      BeanAttributeList beanAttributeList0 = beanMetaData0.createAttributeList(beanElement0);
      ContentListFacade<Namespace> contentListFacade0 = new ContentListFacade<Namespace>(beanElement0, beanAttributeList0);
      Node[] nodeArray0 = new Node[3];
      Node[] nodeArray1 = contentListFacade0.toArray(nodeArray0);
      assertSame(nodeArray1, nodeArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultDocument defaultDocument0 = new DefaultDocument();
      Namespace namespace0 = Namespace.get(":", ":");
      NonLazyElement nonLazyElement0 = new NonLazyElement(":", namespace0);
      List<Namespace> list0 = nonLazyElement0.declaredNamespaces();
      ContentListFacade<Namespace> contentListFacade0 = new ContentListFacade<Namespace>(defaultDocument0, list0);
      int int0 = contentListFacade0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultDocument defaultDocument0 = new DefaultDocument();
      Class<Object> class0 = Object.class;
      BeanMetaData beanMetaData0 = new BeanMetaData(class0);
      BeanElement beanElement0 = new BeanElement("Du*W;;<JRY", "Du*W;;<JRY");
      BeanAttributeList beanAttributeList0 = beanMetaData0.createAttributeList(beanElement0);
      ContentListFacade<Namespace> contentListFacade0 = new ContentListFacade<Namespace>(defaultDocument0, beanAttributeList0);
      int int0 = contentListFacade0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DOMDocument dOMDocument0 = new DOMDocument();
      Namespace namespace0 = Namespace.get(":", ":");
      LinkedList<Namespace> linkedList0 = new LinkedList<Namespace>();
      ContentListFacade<Namespace> contentListFacade0 = new ContentListFacade<Namespace>(dOMDocument0, linkedList0);
      boolean boolean0 = linkedList0.add(namespace0);
      boolean boolean1 = contentListFacade0.remove(namespace0);
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<DOMAttribute> linkedList0 = new LinkedList<DOMAttribute>();
      linkedList0.add((DOMAttribute) null);
      ContentListFacade<DOMAttribute> contentListFacade0 = new ContentListFacade<DOMAttribute>((AbstractBranch) null, linkedList0);
      int int0 = contentListFacade0.lastIndexOf((DOMAttribute) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<Namespace> linkedList0 = new LinkedList<Namespace>();
      Namespace namespace0 = Namespace.get("[Z=;GC4M7}!");
      linkedList0.add(namespace0);
      DOMDocument dOMDocument0 = new DOMDocument();
      ContentListFacade<Namespace> contentListFacade0 = new ContentListFacade<Namespace>(dOMDocument0, linkedList0);
      int int0 = contentListFacade0.indexOf(namespace0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ContentListFacade<DOMNamespace> contentListFacade0 = new ContentListFacade<DOMNamespace>((AbstractBranch) null, (List<DOMNamespace>) null);
      List<DOMNamespace> list0 = contentListFacade0.getBackingList();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Namespace namespace0 = new Namespace("':IU&An/", "");
      QName qName0 = QName.get("", namespace0, "97Z-9");
      BaseElement baseElement0 = new BaseElement(qName0);
      List<Namespace> list0 = baseElement0.additionalNamespaces("");
      ContentListFacade<Namespace> contentListFacade0 = new ContentListFacade<Namespace>((AbstractBranch) null, list0);
      ContentListFacade<Namespace> contentListFacade1 = new ContentListFacade<Namespace>((AbstractBranch) null, contentListFacade0);
      List<Namespace> list1 = contentListFacade1.getBackingList();
      assertTrue(list1.equals((Object)list0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NonLazyElement nonLazyElement0 = new NonLazyElement((String) null);
      Object object0 = new Object();
      BeanElement beanElement0 = new BeanElement((String) null, object0);
      QName qName0 = QName.get((String) null, "", "");
      DOMElement dOMElement0 = new DOMElement(qName0);
      Class<Integer> class0 = Integer.class;
      BeanMetaData beanMetaData0 = BeanMetaData.get(class0);
      BeanAttributeList beanAttributeList0 = new BeanAttributeList(beanElement0, beanMetaData0);
      ContentListFacade<UserDataAttribute> contentListFacade0 = new ContentListFacade<UserDataAttribute>(nonLazyElement0, beanAttributeList0);
      ContentListFacade<UserDataAttribute> contentListFacade1 = new ContentListFacade<UserDataAttribute>(dOMElement0, contentListFacade0);
      List<UserDataAttribute> list0 = contentListFacade1.getBackingList();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NonLazyElement nonLazyElement0 = new NonLazyElement("orb@1rX`");
      List<Namespace> list0 = nonLazyElement0.declaredNamespaces();
      ContentListFacade<Namespace> contentListFacade0 = new ContentListFacade<Namespace>(nonLazyElement0, list0);
      // Undeclared exception!
      try { 
        contentListFacade0.toArray((Node[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<Namespace> linkedList0 = new LinkedList<Namespace>();
      DOMDocument dOMDocument0 = new DOMDocument();
      ContentListFacade<Namespace> contentListFacade0 = new ContentListFacade<Namespace>(dOMDocument0, linkedList0);
      // Undeclared exception!
      try { 
        contentListFacade0.toArray();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // [Ljava.lang.Object; cannot be cast to [Lorg.dom4j.Node;
         //
         verifyException("org.dom4j.tree.ContentListFacade", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DOMDocument dOMDocument0 = new DOMDocument();
      ContentListFacade<DOMNamespace> contentListFacade0 = new ContentListFacade<DOMNamespace>(dOMDocument0, (List<DOMNamespace>) null);
      // Undeclared exception!
      try { 
        contentListFacade0.size();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BeanElement beanElement0 = new BeanElement("s", "s");
      BeanAttributeList beanAttributeList0 = new BeanAttributeList(beanElement0);
      ContentListFacade<DefaultAttribute> contentListFacade0 = new ContentListFacade<DefaultAttribute>(beanElement0, beanAttributeList0);
      DefaultAttribute defaultAttribute0 = new DefaultAttribute("s", "s");
      // Undeclared exception!
      try { 
        contentListFacade0.set(765, defaultAttribute0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // set(int,Object) unsupported
         //
         verifyException("org.dom4j.bean.BeanAttributeList", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultDocument defaultDocument0 = new DefaultDocument("org.dom4j.tree.ContentListFacade");
      ContentListFacade<DOMNamespace> contentListFacade0 = new ContentListFacade<DOMNamespace>(defaultDocument0, (List<DOMNamespace>) null);
      DOMNamespace dOMNamespace0 = new DOMNamespace("V~X7vO3Mb<N<ZTAm", "org.dom4j.tree.ContentListFacade");
      // Undeclared exception!
      try { 
        contentListFacade0.set((-449), dOMNamespace0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dom4j.tree.ContentListFacade", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<Namespace> linkedList0 = new LinkedList<Namespace>();
      DOMDocument dOMDocument0 = new DOMDocument();
      ContentListFacade<Namespace> contentListFacade0 = new ContentListFacade<Namespace>(dOMDocument0, linkedList0);
      // Undeclared exception!
      try { 
        contentListFacade0.set((-16), (Namespace) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -16, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultDocument defaultDocument0 = new DefaultDocument();
      Namespace namespace0 = Namespace.NO_NAMESPACE;
      QName qName0 = QName.get("", namespace0, "");
      DefaultElement defaultElement0 = new DefaultElement(qName0);
      List<Attribute> list0 = defaultElement0.attributeList();
      ContentListFacade<Attribute> contentListFacade0 = new ContentListFacade<Attribute>(defaultDocument0, list0);
      DOMAttribute dOMAttribute0 = new DOMAttribute(qName0);
      // Undeclared exception!
      try { 
        contentListFacade0.set(1, (Attribute) dOMAttribute0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("org.dom4j.tree.LazyList", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<Namespace> class0 = Namespace.class;
      BeanMetaData beanMetaData0 = new BeanMetaData(class0);
      BeanAttributeList beanAttributeList0 = beanMetaData0.createAttributeList((BeanElement) null);
      ContentListFacade<Namespace> contentListFacade0 = new ContentListFacade<Namespace>((AbstractBranch) null, beanAttributeList0);
      // Undeclared exception!
      try { 
        contentListFacade0.removeAll(beanAttributeList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dom4j.tree.ContentListFacade", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DOMElement dOMElement0 = new DOMElement("?cx^");
      DOMDocumentType dOMDocumentType0 = new DOMDocumentType();
      DOMDocument dOMDocument0 = new DOMDocument("", dOMElement0, dOMDocumentType0);
      ContentListFacade<DefaultAttribute> contentListFacade0 = new ContentListFacade<DefaultAttribute>(dOMDocument0, (List<DefaultAttribute>) null);
      DefaultAttribute defaultAttribute0 = new DefaultAttribute("", "dGHuO{)dXm$MQ]E");
      // Undeclared exception!
      try { 
        contentListFacade0.remove(defaultAttribute0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dom4j.tree.ContentListFacade", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DOMDocument dOMDocument0 = new DOMDocument("org.dom4j.tree.ContentListFacade");
      ContentListFacade<DOMNamespace> contentListFacade0 = new ContentListFacade<DOMNamespace>(dOMDocument0, (List<DOMNamespace>) null);
      // Undeclared exception!
      try { 
        contentListFacade0.remove(58);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dom4j.tree.ContentListFacade", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DOMDocument dOMDocument0 = new DOMDocument();
      LinkedList<DefaultAttribute> linkedList0 = new LinkedList<DefaultAttribute>();
      ContentListFacade<DefaultAttribute> contentListFacade0 = new ContentListFacade<DefaultAttribute>(dOMDocument0, linkedList0);
      // Undeclared exception!
      try { 
        contentListFacade0.remove((-879));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -879, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NonLazyElement nonLazyElement0 = new NonLazyElement("orb@1rX`");
      List<Namespace> list0 = nonLazyElement0.declaredNamespaces();
      ContentListFacade<Namespace> contentListFacade0 = new ContentListFacade<Namespace>(nonLazyElement0, list0);
      // Undeclared exception!
      try { 
        contentListFacade0.remove(13);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 13, Size: 0
         //
         verifyException("org.dom4j.tree.LazyList", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultDocument defaultDocument0 = new DefaultDocument();
      Class<Object> class0 = Object.class;
      BeanMetaData beanMetaData0 = new BeanMetaData(class0);
      BeanElement beanElement0 = new BeanElement("`3", defaultDocument0);
      BeanAttributeList beanAttributeList0 = beanMetaData0.createAttributeList(beanElement0);
      ContentListFacade<Namespace> contentListFacade0 = new ContentListFacade<Namespace>(defaultDocument0, beanAttributeList0);
      // Undeclared exception!
      try { 
        contentListFacade0.remove(0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.dom4j.Node
         //
         verifyException("org.dom4j.tree.ContentListFacade", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BeanElement beanElement0 = new BeanElement("k", "k");
      BeanAttributeList beanAttributeList0 = new BeanAttributeList(beanElement0);
      ContentListFacade<UserDataAttribute> contentListFacade0 = new ContentListFacade<UserDataAttribute>(beanElement0, beanAttributeList0);
      // Undeclared exception!
      try { 
        contentListFacade0.remove((-15));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DOMDocument dOMDocument0 = new DOMDocument("pGP{");
      ContentListFacade<UserDataAttribute> contentListFacade0 = new ContentListFacade<UserDataAttribute>(dOMDocument0, (List<UserDataAttribute>) null);
      QName qName0 = QName.get("pGP{");
      UserDataAttribute userDataAttribute0 = new UserDataAttribute(qName0, "pGP{");
      // Undeclared exception!
      try { 
        contentListFacade0.lastIndexOf(userDataAttribute0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dom4j.tree.ContentListFacade", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DOMDocument dOMDocument0 = new DOMDocument("XcgfKG32 ");
      ContentListFacade<Namespace> contentListFacade0 = new ContentListFacade<Namespace>(dOMDocument0, (List<Namespace>) null);
      // Undeclared exception!
      try { 
        contentListFacade0.isEmpty();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ContentListFacade<Namespace> contentListFacade0 = new ContentListFacade<Namespace>((AbstractBranch) null, (List<Namespace>) null);
      Namespace namespace0 = Namespace.get("f2pvcM3", "");
      // Undeclared exception!
      try { 
        contentListFacade0.indexOf(namespace0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dom4j.tree.ContentListFacade", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DOMDocument dOMDocument0 = new DOMDocument();
      ContentListFacade<DOMNamespace> contentListFacade0 = new ContentListFacade<DOMNamespace>(dOMDocument0, (List<DOMNamespace>) null);
      // Undeclared exception!
      try { 
        contentListFacade0.get(15);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dom4j.tree.ContentListFacade", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DOMDocument dOMDocument0 = new DOMDocument();
      LinkedList<Namespace> linkedList0 = new LinkedList<Namespace>();
      ContentListFacade<Namespace> contentListFacade0 = new ContentListFacade<Namespace>(dOMDocument0, linkedList0);
      // Undeclared exception!
      try { 
        contentListFacade0.get((-444));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -444, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DefaultElement defaultElement0 = new DefaultElement("LUN42)%C%(s(Fwrg\"=");
      List<Namespace> list0 = defaultElement0.additionalNamespaces("LUN42)%C%(s(Fwrg\"=");
      ContentListFacade<Namespace> contentListFacade0 = new ContentListFacade<Namespace>((AbstractBranch) null, list0);
      // Undeclared exception!
      try { 
        contentListFacade0.get((-2302));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2302
         //
         verifyException("org.dom4j.tree.LazyList", e);
      }
  }
}
