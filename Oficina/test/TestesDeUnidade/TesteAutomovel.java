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
/*
public class TesteAutomovel {
    
    public TesteAutomovel() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    Automovel automovel;
    Desempenho desempenho;
    @Before
    public void setUp() {
        automovel = new Automovel();
    }
    
    @After
    public void tearDown() {
    }
@Test
    public void testHashCodeNull(){
        automovel.setIdAutomovel(null);
        int resultadoEsperado = 0;
        int resultado= automovel.hashCode();
        assertEquals(resultadoEsperado,resultado);
        
       
   }
    @Test
      public void testHashCodeNotNull(){
       automovel.setIdAutomovel(1);
        int resultadoEsperado =1;
        int resultado= automovel.hashCode();
        assertEquals(resultadoEsperado,resultado);
        
       
   }
      
     @Test 
     
    public void testEquals1(){
       boolean resultadoEsperado = false;
       boolean resultado =automovel.equals(desempenho);
       assertEquals(resultadoEsperado,resultado);
        
       
   }
    @Test
    public void testEquals2(){
        automovel.setIdAutomovel(null);
        Automovel other = new Automovel();
        other.setIdAutomovel(1);
       boolean resultadoEsperado = false;
       boolean resultado =automovel.equals(other);
       assertEquals(resultadoEsperado,resultado);
        
       
   }
    @Test
    public void testEquals3(){
        automovel.setIdAutomovel(1);
        Automovel other = new Automovel();
        other.setIdAutomovel(2);
       boolean resultadoEsperado = false;
       boolean resultado =automovel.equals(other);
       assertEquals(resultadoEsperado,resultado);
        
       
   }
    @Test
    public void testEquals4(){
        automovel.setIdAutomovel(null);
        Automovel other = new Automovel();
        other.setIdAutomovel(null);
       boolean resultadoEsperado = true;
       boolean resultado =automovel.equals(automovel);
       assertEquals(resultadoEsperado,resultado);
        
        
       
   }
    @Test
    public void testCarroAmador(){
        automovel.setPesoCarro(100);
        automovel.setCustoTotal(50);
        String resultadoEsperado = "Carro - Amador";
        String resultado = automovel.getCategoria();
        assertEquals(resultadoEsperado,resultado);
    }
    @Test
    public void testCarroIntermediario(){
        automovel.setPesoCarro(100);
        automovel.setCustoTotal(99);
        String resultadoEsperado = "Carro - Intermediário";
        String resultado = automovel.getCategoria();
        assertEquals(resultadoEsperado,resultado);
    }
    @Test
    public void testCarroProfissional(){
        automovel.setPesoCarro(100);
        automovel.setCustoTotal(150);
        String resultadoEsperado = "Carro - Profissional";
        String resultado = automovel.getCategoria();
        assertEquals(resultadoEsperado,resultado);
    }
    @Test
    public void testCarroSemCategoria1(){
        automovel.setPesoCarro(100);
        automovel.setCustoTotal(151);
        String resultadoEsperado = "Sem Categoria";
        String resultado = automovel.getCategoria();
        assertEquals(resultadoEsperado,resultado);
    }
    @Test
    public void testAmador(){
        automovel.setPesoCarro(299);
        automovel.setCustoTotal(50);
        String resultadoEsperado = " Amador";
        String resultado = automovel.getCategoria();
        assertEquals(resultadoEsperado,resultado);
    }
    @Test
    public void testIntermediario(){
        automovel.setPesoCarro(299);
        automovel.setCustoTotal(99);
        String resultadoEsperado = "  Intermediário";
        String resultado = automovel.getCategoria();
        assertEquals(resultadoEsperado,resultado);
    }
    @Test
    public void testProfissional(){
        automovel.setPesoCarro(299);
        automovel.setCustoTotal(149);
        String resultadoEsperado = " Profissional";
        String resultado = automovel.getCategoria();
        assertEquals(resultadoEsperado,resultado);
    }
    @Test
    public void testSemCategoria2(){
        automovel.setPesoCarro(299);
        automovel.setCustoTotal(151);
        String resultadoEsperado = "Sem Categoria";
        String resultado = automovel.getCategoria();
        assertEquals(resultadoEsperado,resultado);
    }
    @Test
    public void testBugreAmador(){
        automovel.setPesoCarro(500);
        automovel.setCustoTotal(50);
        String resultadoEsperado = "Bugre - Amador";
        String resultado = automovel.getCategoria();
        assertEquals(resultadoEsperado,resultado);
    }
    @Test
    public void testBugreIntermediario(){
        automovel.setPesoCarro(500);
        automovel.setCustoTotal(99);
        String resultadoEsperado = "Bugre - Intermediário";
        String resultado = automovel.getCategoria();
        assertEquals(resultadoEsperado,resultado);
    }
    @Test
    public void testBugreProfissional(){
        automovel.setPesoCarro(500);
        automovel.setCustoTotal(150);
        String resultadoEsperado = "Bugre - Profissional";
        String resultado = automovel.getCategoria();
        assertEquals(resultadoEsperado,resultado);
    }
     public void testSemCategoria3(){
        automovel.setPesoCarro(501);
        //automovel.setCustoTotal(150);
        String resultadoEsperado = "Sem Categoria";
        String resultado = automovel.getCategoria();
        assertEquals(resultadoEsperado,resultado);
    }
}
*/