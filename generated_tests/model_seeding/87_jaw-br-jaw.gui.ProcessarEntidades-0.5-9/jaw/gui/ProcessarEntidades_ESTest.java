/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 21:44:12 GMT 2019
 */

package jaw.gui;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import java.util.Vector;
import jaw.gui.ProcessarEntidadesTabela;
import jaw.gui.ProcessarEntidadesTree;
import jaw.metamodelo.Atributo;
import jaw.metamodelo.Entidade;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ProcessarEntidades_ESTest extends ProcessarEntidades_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ProcessarEntidadesTree processarEntidadesTree0 = new ProcessarEntidadesTree();
      // Undeclared exception!
      try { 
        processarEntidadesTree0.setNomeArquivoSalvo("Texto_para_teste_de_conversao_a_toa");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported yet.
         //
         verifyException("jaw.gui.ProcessarEntidadesTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ProcessarEntidadesTree processarEntidadesTree0 = new ProcessarEntidadesTree();
      // Undeclared exception!
      try { 
        processarEntidadesTree0.setEntidades((List<Entidade>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaw.gui.ProcessarEntidadesTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ProcessarEntidadesTree processarEntidadesTree0 = new ProcessarEntidadesTree();
      // Undeclared exception!
      try { 
        processarEntidadesTree0.setEntidadeSelecionada(0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported yet.
         //
         verifyException("jaw.gui.ProcessarEntidadesTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ProcessarEntidadesTree processarEntidadesTree0 = new ProcessarEntidadesTree();
      // Undeclared exception!
      try { 
        processarEntidadesTree0.setAtributoSelecionado(0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported yet.
         //
         verifyException("jaw.gui.ProcessarEntidadesTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ProcessarEntidadesTree processarEntidadesTree0 = new ProcessarEntidadesTree();
      Atributo atributo0 = new Atributo();
      // Undeclared exception!
      try { 
        processarEntidadesTree0.setAtributo(atributo0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported yet.
         //
         verifyException("jaw.gui.ProcessarEntidadesTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ProcessarEntidadesTabela processarEntidadesTabela0 = new ProcessarEntidadesTabela();
      Atributo atributo0 = new Atributo();
      // Undeclared exception!
      try { 
        processarEntidadesTabela0.setAtributo(atributo0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ProcessarEntidadesTree processarEntidadesTree0 = new ProcessarEntidadesTree();
      // Undeclared exception!
      try { 
        processarEntidadesTree0.selecionarEntidades();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported yet.
         //
         verifyException("jaw.gui.ProcessarEntidadesTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ProcessarEntidadesTree processarEntidadesTree0 = new ProcessarEntidadesTree();
      // Undeclared exception!
      try { 
        processarEntidadesTree0.resetAtributos();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported yet.
         //
         verifyException("jaw.gui.ProcessarEntidadesTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ProcessarEntidadesTree processarEntidadesTree0 = new ProcessarEntidadesTree();
      // Undeclared exception!
      try { 
        processarEntidadesTree0.removerEntidades();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported yet.
         //
         verifyException("jaw.gui.ProcessarEntidadesTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ProcessarEntidadesTree processarEntidadesTree0 = new ProcessarEntidadesTree();
      // Undeclared exception!
      try { 
        processarEntidadesTree0.listarAtributos();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported yet.
         //
         verifyException("jaw.gui.ProcessarEntidadesTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
      ProcessarEntidadesTree processarEntidadesTree0 = new ProcessarEntidadesTree();
      // Undeclared exception!
      try { 
        processarEntidadesTree0.getEntidadeSelecionada();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported yet.
         //
         verifyException("jaw.gui.ProcessarEntidadesTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ProcessarEntidadesTree processarEntidadesTree0 = new ProcessarEntidadesTree();
      // Undeclared exception!
      try { 
        processarEntidadesTree0.getAtributoSelecionado();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported yet.
         //
         verifyException("jaw.gui.ProcessarEntidadesTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ProcessarEntidadesTree processarEntidadesTree0 = new ProcessarEntidadesTree();
      // Undeclared exception!
      try { 
        processarEntidadesTree0.getAtributo();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported yet.
         //
         verifyException("jaw.gui.ProcessarEntidadesTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ProcessarEntidadesTree processarEntidadesTree0 = new ProcessarEntidadesTree();
      Vector<Entidade> vector0 = new Vector<Entidade>();
      // Undeclared exception!
      try { 
        processarEntidadesTree0.carregarEntidades(vector0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported yet.
         //
         verifyException("jaw.gui.ProcessarEntidadesTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ProcessarEntidadesTree processarEntidadesTree0 = new ProcessarEntidadesTree();
      // Undeclared exception!
      try { 
        processarEntidadesTree0.atualizarEntidades();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported yet.
         //
         verifyException("jaw.gui.ProcessarEntidadesTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
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
}
