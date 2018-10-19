/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestesDeUnidade;

import model.Desempenho;
import model.Pessoa;
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
public class TestePessoa {
    
    public TestePessoa() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    Pessoa pessoa;
    Desempenho desempenho;
    @Before
    public void setUp() {
        pessoa = new Pessoa();
    }
    
    @After
    public void tearDown() {
    }
@Test
    public void testHashCodeNull(){
        pessoa.setIdPessoa(null);
        int resultadoEsperado = 0;
        int resultado= pessoa.hashCode();
        assertEquals(resultadoEsperado,resultado);
        
       
   }
    @Test
      public void testHashCodeNotNull(){
       pessoa.setIdPessoa(1);
        int resultadoEsperado =1;
        int resultado= pessoa.hashCode();
        assertEquals(resultadoEsperado,resultado);
        
       
   }
      
      @Test 
     
    public void testEquals1(){
       boolean resultadoEsperado = false;
       boolean resultado =pessoa.equals(desempenho);
       assertEquals(resultadoEsperado,resultado);
        
       
   }
    @Test
    public void testEquals2(){
        //automovel.setIdAutomovel(null);
        Pessoa other = new Pessoa();
        other.setIdPessoa(1);
       boolean resultadoEsperado = false;
       boolean resultado =pessoa.equals(other);
       assertEquals(resultadoEsperado,resultado);
        
       
   }
    @Test
    public void testEquals3(){
        //automovel.setIdAutomovel(null);
        Pessoa other = new Pessoa();
        other.setIdPessoa(1);
       boolean resultadoEsperado = false;
       boolean resultado =pessoa.equals(other);
       assertEquals(resultadoEsperado,resultado);
        
       
   }
}
