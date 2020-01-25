/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 25 21:06:06 GMT 2020
 */

package br.com.teste.gft.dialogo;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import br.com.teste.gft.cardapio.OpcoaoCardapio;
import br.com.teste.gft.dialogo.ConstroiDialogo;
import br.com.teste.gft.enuns.PeriodoEnum;
import br.com.teste.gft.enuns.TipoDePratoEnum;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConstroiDialogo_ESTest extends ConstroiDialogo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ConstroiDialogo constroiDialogo0 = new ConstroiDialogo();
      LinkedList<OpcoaoCardapio> linkedList0 = new LinkedList<OpcoaoCardapio>();
      PeriodoEnum periodoEnum0 = PeriodoEnum.MANHA;
      try { 
        constroiDialogo0.verificaOpcoesSelecionadas(linkedList0, "[1GyeB,^XfS_z7{2n", periodoEnum0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"[1GyeB\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ConstroiDialogo constroiDialogo0 = new ConstroiDialogo();
      LinkedList<OpcoaoCardapio> linkedList0 = new LinkedList<OpcoaoCardapio>();
      PeriodoEnum periodoEnum0 = PeriodoEnum.MANHA;
      try { 
        constroiDialogo0.verificaOpcoesSelecionadas(linkedList0, (String) null, periodoEnum0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("br.com.teste.gft.dialogo.ConstroiDialogo", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ConstroiDialogo constroiDialogo0 = new ConstroiDialogo();
      PeriodoEnum periodoEnum0 = PeriodoEnum.MANHA;
      try { 
        constroiDialogo0.verificaItensDuplicados((List<OpcoaoCardapio>) null, periodoEnum0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("br.com.teste.gft.dialogo.ConstroiDialogo", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ConstroiDialogo constroiDialogo0 = new ConstroiDialogo();
      PeriodoEnum periodoEnum0 = PeriodoEnum.MANHA;
      try { 
        constroiDialogo0.verificaItemNaoAplicavel((List<OpcoaoCardapio>) null, periodoEnum0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("br.com.teste.gft.dialogo.ConstroiDialogo", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ConstroiDialogo constroiDialogo0 = new ConstroiDialogo();
      LinkedList<OpcoaoCardapio> linkedList0 = new LinkedList<OpcoaoCardapio>();
      OpcoaoCardapio opcoaoCardapio0 = new OpcoaoCardapio();
      TipoDePratoEnum tipoDePratoEnum0 = TipoDePratoEnum.SOBREMESA;
      opcoaoCardapio0.setTipoDePrato(tipoDePratoEnum0);
      linkedList0.add(opcoaoCardapio0);
      PeriodoEnum periodoEnum0 = PeriodoEnum.MANHA;
      try { 
        constroiDialogo0.verificaItemNaoAplicavel(linkedList0, periodoEnum0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Item n\u00E3o aplicavel
         //
         verifyException("br.com.teste.gft.dialogo.ConstroiDialogo", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ConstroiDialogo constroiDialogo0 = new ConstroiDialogo();
      LinkedList<OpcoaoCardapio> linkedList0 = new LinkedList<OpcoaoCardapio>();
      PeriodoEnum periodoEnum0 = PeriodoEnum.MANHA;
      constroiDialogo0.verificaItemNaoAplicavel(linkedList0, periodoEnum0);
      assertEquals(0, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ConstroiDialogo constroiDialogo0 = new ConstroiDialogo();
      LinkedList<OpcoaoCardapio> linkedList0 = new LinkedList<OpcoaoCardapio>();
      PeriodoEnum periodoEnum0 = PeriodoEnum.NOITE;
      constroiDialogo0.verificaItemNaoAplicavel(linkedList0, periodoEnum0);
      assertEquals(0, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ConstroiDialogo constroiDialogo0 = new ConstroiDialogo();
      LinkedList<OpcoaoCardapio> linkedList0 = new LinkedList<OpcoaoCardapio>();
      TipoDePratoEnum tipoDePratoEnum0 = TipoDePratoEnum.LADO;
      PeriodoEnum periodoEnum0 = PeriodoEnum.NOITE;
      OpcoaoCardapio opcoaoCardapio0 = new OpcoaoCardapio();
      opcoaoCardapio0.setTipoDePrato(tipoDePratoEnum0);
      linkedList0.add(opcoaoCardapio0);
      linkedList0.add(opcoaoCardapio0);
      constroiDialogo0.verificaItensDuplicados(linkedList0, periodoEnum0);
      assertEquals(2, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ConstroiDialogo constroiDialogo0 = new ConstroiDialogo();
      LinkedList<OpcoaoCardapio> linkedList0 = new LinkedList<OpcoaoCardapio>();
      PeriodoEnum periodoEnum0 = PeriodoEnum.NOITE;
      OpcoaoCardapio opcoaoCardapio0 = new OpcoaoCardapio();
      linkedList0.add(opcoaoCardapio0);
      linkedList0.add(opcoaoCardapio0);
      try { 
        constroiDialogo0.verificaItensDuplicados(linkedList0, periodoEnum0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Item n\u00E3o pode ser duplicado
         //
         verifyException("br.com.teste.gft.dialogo.ConstroiDialogo", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ConstroiDialogo constroiDialogo0 = new ConstroiDialogo();
      LinkedList<OpcoaoCardapio> linkedList0 = new LinkedList<OpcoaoCardapio>();
      OpcoaoCardapio opcoaoCardapio0 = new OpcoaoCardapio();
      TipoDePratoEnum tipoDePratoEnum0 = TipoDePratoEnum.BEBIDA;
      linkedList0.add(opcoaoCardapio0);
      opcoaoCardapio0.setTipoDePrato(tipoDePratoEnum0);
      linkedList0.addFirst(opcoaoCardapio0);
      PeriodoEnum periodoEnum0 = PeriodoEnum.MANHA;
      constroiDialogo0.verificaItensDuplicados(linkedList0, periodoEnum0);
      assertEquals(2, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ConstroiDialogo constroiDialogo0 = new ConstroiDialogo();
      LinkedList<OpcoaoCardapio> linkedList0 = new LinkedList<OpcoaoCardapio>();
      OpcoaoCardapio opcoaoCardapio0 = new OpcoaoCardapio();
      linkedList0.add(opcoaoCardapio0);
      linkedList0.addFirst(opcoaoCardapio0);
      PeriodoEnum periodoEnum0 = PeriodoEnum.MANHA;
      try { 
        constroiDialogo0.verificaItensDuplicados(linkedList0, periodoEnum0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Item n\u00E3o pode ser duplicado
         //
         verifyException("br.com.teste.gft.dialogo.ConstroiDialogo", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ConstroiDialogo constroiDialogo0 = new ConstroiDialogo();
      LinkedList<OpcoaoCardapio> linkedList0 = new LinkedList<OpcoaoCardapio>();
      OpcoaoCardapio opcoaoCardapio0 = new OpcoaoCardapio();
      linkedList0.add(opcoaoCardapio0);
      constroiDialogo0.verificaItensDuplicados(linkedList0, (PeriodoEnum) null);
      assertEquals(1, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<OpcoaoCardapio> linkedList0 = new LinkedList<OpcoaoCardapio>();
      ConstroiDialogo constroiDialogo0 = new ConstroiDialogo();
      PeriodoEnum periodoEnum0 = PeriodoEnum.NOITE;
      try { 
        constroiDialogo0.verificaOpcoesSelecionadas(linkedList0, "9", periodoEnum0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Item n\u00E3o encontrado
         //
         verifyException("br.com.teste.gft.dialogo.ConstroiDialogo", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ConstroiDialogo constroiDialogo0 = new ConstroiDialogo();
      PeriodoEnum periodoEnum0 = constroiDialogo0.verificaPeriodoSelecionado("manha");
      LinkedList<OpcoaoCardapio> linkedList0 = new LinkedList<OpcoaoCardapio>();
      try { 
        constroiDialogo0.verificaOpcoesSelecionadas(linkedList0, "Jv`YeS", periodoEnum0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"Jv`YeS\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<OpcoaoCardapio> linkedList0 = new LinkedList<OpcoaoCardapio>();
      PeriodoEnum periodoEnum0 = PeriodoEnum.NOITE;
      ConstroiDialogo constroiDialogo0 = new ConstroiDialogo();
      List<OpcoaoCardapio> list0 = constroiDialogo0.verificaOpcoesSelecionadas(linkedList0, ",", periodoEnum0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ConstroiDialogo constroiDialogo0 = new ConstroiDialogo();
      try { 
        constroiDialogo0.verificaPeriodoSelecionado(":i9-0#");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Periodo: :i9-0#, n\uFFFDo aplicavel
         //
         verifyException("br.com.teste.gft.enuns.PeriodoEnum", e);
      }
  }
}