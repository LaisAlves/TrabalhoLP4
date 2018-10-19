/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestesDeUnidade;

import model.Desempenho;
import model.Desempenhoteste;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LaisAlves
 */
public class TesteDesempenhoTeste {
    
    public TesteDesempenhoTeste() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    Desempenhoteste desempenhoTeste;
    Desempenho desempenho;
    @Before
    public void setUp() {
        desempenhoTeste = new Desempenhoteste();
    }
    
    @After
    public void tearDown() {
    }

@Test
    public void testHashCodeNull(){
        desempenhoTeste.setIdDesempenhoteste(null);
        int resultadoEsperado = 0;
        int resultado= desempenhoTeste.hashCode();
        assertEquals(resultadoEsperado,resultado);
        
       
   }
    @Test
      public void testHashCodeNotNull(){
       desempenhoTeste.setIdDesempenhoteste(1);
        int resultadoEsperado =1;
        int resultado= desempenhoTeste.hashCode();
        assertEquals(resultadoEsperado,resultado);
        
       
   }
      @Test 
     
    public void testEquals1(){
       boolean resultadoEsperado = false;
       boolean resultado =desempenhoTeste.equals(desempenho);
       assertEquals(resultadoEsperado,resultado);
        
       
   }
    @Test
    public void testEquals2(){
        //automovel.setIdAutomovel(null);
        Desempenhoteste other = new Desempenhoteste();
        other.setIdDesempenhoteste(1);
       boolean resultadoEsperado = false;
       boolean resultado =desempenhoTeste.equals(other);
       assertEquals(resultadoEsperado,resultado);
        
       
   }
    @Test
    public void testEquals3(){
        //automovel.setIdAutomovel(null);
        Desempenhoteste other = new Desempenhoteste();
        other.setIdDesempenhoteste(1);
       boolean resultadoEsperado = false;
       boolean resultado =desempenhoTeste.equals(other);
       assertEquals(resultadoEsperado,resultado);
        
       
   }
}
