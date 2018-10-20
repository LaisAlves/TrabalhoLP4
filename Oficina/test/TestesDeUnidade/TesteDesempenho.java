/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestesDeUnidade;

import model.Automovel;
import model.Desempenho;
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
public class TesteDesempenho {
    
    public TesteDesempenho() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    Desempenho desempenho;
    Automovel automovel;
    @Before
    public void setUp() {
        desempenho = new Desempenho();
    }
    
    @After
    public void tearDown() {
    }

@Test
    public void testHashCodeNull(){
        desempenho.setIdDesempenho(null);
        int resultadoEsperado = 0;
        int resultado= desempenho.hashCode();
        assertEquals(resultadoEsperado,resultado);
        
       
   }
    @Test
      public void testHashCodeNotNull(){
       desempenho.setIdDesempenho(1);
        int resultadoEsperado =1;
        int resultado= desempenho.hashCode();
        assertEquals(resultadoEsperado,resultado);
        
       
   }
      
      @Test 
     
    public void testEquals1(){
       boolean resultadoEsperado = false;
       boolean resultado =desempenho.equals(automovel);
       assertEquals(resultadoEsperado,resultado);
        
       
   }
    @Test
    public void testEquals2(){
        desempenho.setIdDesempenho(null);
        Desempenho other = new Desempenho();
        other.setIdDesempenho(1);
       boolean resultadoEsperado = false;
       boolean resultado =desempenho.equals(other);
       assertEquals(resultadoEsperado,resultado);
        
       
   }
    @Test
    public void testEquals3(){
        desempenho.setIdDesempenho(1);
        Desempenho other = new Desempenho();
        other.setIdDesempenho(2);
       boolean resultadoEsperado = false;
       boolean resultado =desempenho.equals(other);
       assertEquals(resultadoEsperado,resultado);
        
       
   }
    @Test
    public void testEquals4(){
        desempenho.setIdDesempenho(null);
        Desempenho other = new Desempenho();
        other.setIdDesempenho(null);
       boolean resultadoEsperado = true;
       boolean resultado =desempenho.equals(desempenho);
       assertEquals(resultadoEsperado,resultado);
        
        
       
   }
}
