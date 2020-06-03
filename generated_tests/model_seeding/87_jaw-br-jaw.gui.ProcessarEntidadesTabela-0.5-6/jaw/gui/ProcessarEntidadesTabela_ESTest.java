/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 19:41:51 GMT 2019
 */

package jaw.gui;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import jaw.gui.ProcessarEntidadesTabela;
import jaw.metamodelo.Atributo;
import jaw.metamodelo.Entidade;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ProcessarEntidadesTabela_ESTest extends ProcessarEntidadesTabela_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      Atributo atributo0 = processarEntidadesTabela0.getAtributo();
      processarEntidadesTabela0.setEntidadeSelecionada(0);
      // Undeclared exception!
      try { 
        processarEntidadesTabela0.setAtributo(atributo0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      ArrayList<Entidade> arrayList0 = new ArrayList<Entidade>();
      Atributo atributo0 = new Atributo();
      Entidade entidade0 = atributo0.getEntidade();
      arrayList0.add(entidade0);
      arrayList0.add(entidade0);
      processarEntidadesTabela0.carregarEntidades(arrayList0);
      assertEquals((-1), processarEntidadesTabela0.getAtributoSelecionado());
      assertEquals("Novo Projeto", processarEntidadesTabela0.getNomeArquivoSalvo());
      assertEquals((-1), processarEntidadesTabela0.getEntidadeSelecionada());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      assertEquals("Novo Projeto", processarEntidadesTabela0.getNomeArquivoSalvo());
      
      processarEntidadesTabela0.setNomeArquivoSalvo((String) null);
      processarEntidadesTabela0.getNomeArquivoSalvo();
      assertEquals((-1), processarEntidadesTabela0.getAtributoSelecionado());
      assertEquals((-1), processarEntidadesTabela0.getEntidadeSelecionada());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      Stack<Entidade> stack0 = new Stack<Entidade>();
      processarEntidadesTabela0.setEntidades(stack0);
      Entidade entidade0 = new Entidade();
      stack0.add(entidade0);
      processarEntidadesTabela0.getEntidades();
      assertEquals((-1), processarEntidadesTabela0.getEntidadeSelecionada());
      assertEquals("Novo Projeto", processarEntidadesTabela0.getNomeArquivoSalvo());
      assertEquals((-1), processarEntidadesTabela0.getAtributoSelecionado());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      processarEntidadesTabela0.setEntidadeSelecionada(420);
      int int0 = processarEntidadesTabela0.getEntidadeSelecionada();
      assertEquals(420, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      Atributo atributo0 = processarEntidadesTabela0.getAtributo();
      atributo0.setTamanho((-2915));
      processarEntidadesTabela0.getAtributo();
      assertEquals((-1), processarEntidadesTabela0.getEntidadeSelecionada());
      assertEquals((-1), processarEntidadesTabela0.getAtributoSelecionado());
      assertEquals("Novo Projeto", processarEntidadesTabela0.getNomeArquivoSalvo());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      LinkedList<Entidade> linkedList0 = new LinkedList<Entidade>();
      processarEntidadesTabela0.carregarEntidades(linkedList0);
      Atributo atributo0 = processarEntidadesTabela0.getAtributo();
      // Undeclared exception!
      try { 
        processarEntidadesTabela0.setAtributo(atributo0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      // Undeclared exception!
      try { 
        processarEntidadesTabela0.listarAtributos();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      // Undeclared exception!
      try { 
        processarEntidadesTabela0.carregarEntidades((List<Entidade>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      ArrayList<Entidade> arrayList0 = new ArrayList<Entidade>();
      Entidade entidade0 = new Entidade();
      arrayList0.add(entidade0);
      processarEntidadesTabela0.carregarEntidades(arrayList0);
      processarEntidadesTabela0.atualizarEntidades();
      assertEquals((-1), processarEntidadesTabela0.getEntidadeSelecionada());
      assertEquals((-1), processarEntidadesTabela0.getAtributoSelecionado());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      // Undeclared exception!
      try { 
        processarEntidadesTabela0.setEntidades((List<Entidade>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      processarEntidadesTabela0.getEntidades();
      assertEquals((-1), processarEntidadesTabela0.getAtributoSelecionado());
      assertEquals((-1), processarEntidadesTabela0.getEntidadeSelecionada());
      assertEquals("Novo Projeto", processarEntidadesTabela0.getNomeArquivoSalvo());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      processarEntidadesTabela0.removerEntidades();
      assertEquals((-1), processarEntidadesTabela0.getAtributoSelecionado());
      assertEquals("Novo Projeto", processarEntidadesTabela0.getNomeArquivoSalvo());
      assertEquals((-1), processarEntidadesTabela0.getEntidadeSelecionada());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      processarEntidadesTabela0.selecionarEntidades();
      assertEquals((-1), processarEntidadesTabela0.getEntidadeSelecionada());
      assertEquals((-1), processarEntidadesTabela0.getAtributoSelecionado());
      assertEquals("Novo Projeto", processarEntidadesTabela0.getNomeArquivoSalvo());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      processarEntidadesTabela0.setAtributoSelecionado(49);
      int int0 = processarEntidadesTabela0.getAtributoSelecionado();
      assertEquals(49, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      String string0 = processarEntidadesTabela0.getNomeArquivoSalvo();
      assertEquals((-1), processarEntidadesTabela0.getAtributoSelecionado());
      assertEquals((-1), processarEntidadesTabela0.getEntidadeSelecionada());
      assertEquals("Novo Projeto", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      LinkedList<Entidade> linkedList0 = new LinkedList<Entidade>();
      processarEntidadesTabela0.carregarEntidades(linkedList0);
      // Undeclared exception!
      try { 
        processarEntidadesTabela0.listarAtributos();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      processarEntidadesTabela0.resetAtributos();
      assertEquals((-1), processarEntidadesTabela0.getAtributoSelecionado());
      assertEquals((-1), processarEntidadesTabela0.getEntidadeSelecionada());
      assertEquals("Novo Projeto", processarEntidadesTabela0.getNomeArquivoSalvo());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      int int0 = processarEntidadesTabela0.getAtributoSelecionado();
      assertEquals((-1), int0);
      assertEquals("Novo Projeto", processarEntidadesTabela0.getNomeArquivoSalvo());
      assertEquals((-1), processarEntidadesTabela0.getEntidadeSelecionada());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      assertEquals((-1), processarEntidadesTabela0.getEntidadeSelecionada());
      
      processarEntidadesTabela0.setEntidadeSelecionada(0);
      int int0 = processarEntidadesTabela0.getEntidadeSelecionada();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      int int0 = processarEntidadesTabela0.getEntidadeSelecionada();
      assertEquals((-1), int0);
      assertEquals("Novo Projeto", processarEntidadesTabela0.getNomeArquivoSalvo());
      assertEquals((-1), processarEntidadesTabela0.getAtributoSelecionado());
  }
}
