/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author flavi
 */
public class DesempenhoTest {
    
    public DesempenhoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getIdDesempenho method, of class Desempenho.
     */
    @Test
    public void testGetIdDesempenho() {
        System.out.println("getIdDesempenho");
        Desempenho instance = new Desempenho();
        Integer expResult = null;
        Integer result = instance.getIdDesempenho();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdDesempenho method, of class Desempenho.
     */
    @Test
    public void testSetIdDesempenho() {
        System.out.println("setIdDesempenho");
        Integer idDesempenho = null;
        Desempenho instance = new Desempenho();
        instance.setIdDesempenho(idDesempenho);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Desempenho.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Desempenho instance = new Desempenho();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Desempenho.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Desempenho instance = new Desempenho();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getData method, of class Desempenho.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        Desempenho instance = new Desempenho();
        String expResult = "";
        String result = instance.getData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class Desempenho.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        String data = "";
        Desempenho instance = new Desempenho();
        instance.setData(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHora method, of class Desempenho.
     */
    @Test
    public void testGetHora() {
        System.out.println("getHora");
        Desempenho instance = new Desempenho();
        String expResult = "";
        String result = instance.getHora();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHora method, of class Desempenho.
     */
    @Test
    public void testSetHora() {
        System.out.println("setHora");
        String hora = "";
        Desempenho instance = new Desempenho();
        instance.setHora(hora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAceleracaoMedia method, of class Desempenho.
     */
    @Test
    public void testGetAceleracaoMedia() {
        System.out.println("getAceleracaoMedia");
        Desempenho instance = new Desempenho();
        float expResult = 0.0F;
        float result = instance.getAceleracaoMedia();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAceleracaoMedia method, of class Desempenho.
     */
    @Test
    public void testSetAceleracaoMedia() {
        System.out.println("setAceleracaoMedia");
        float aceleracaoMedia = 0.0F;
        Desempenho instance = new Desempenho();
        instance.setAceleracaoMedia(aceleracaoMedia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVelocidadeMedia method, of class Desempenho.
     */
    @Test
    public void testGetVelocidadeMedia() {
        System.out.println("getVelocidadeMedia");
        Desempenho instance = new Desempenho();
        float expResult = 0.0F;
        float result = instance.getVelocidadeMedia();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVelocidadeMedia method, of class Desempenho.
     */
    @Test
    public void testSetVelocidadeMedia() {
        System.out.println("setVelocidadeMedia");
        float velocidadeMedia = 0.0F;
        Desempenho instance = new Desempenho();
        instance.setVelocidadeMedia(velocidadeMedia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTempoPista method, of class Desempenho.
     */
    @Test
    public void testGetTempoPista() {
        System.out.println("getTempoPista");
        Desempenho instance = new Desempenho();
        String expResult = "";
        String result = instance.getTempoPista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTempoPista method, of class Desempenho.
     */
    @Test
    public void testSetTempoPista() {
        System.out.println("setTempoPista");
        String tempoPista = "";
        Desempenho instance = new Desempenho();
        instance.setTempoPista(tempoPista);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFrenagem method, of class Desempenho.
     */
    @Test
    public void testGetFrenagem() {
        System.out.println("getFrenagem");
        Desempenho instance = new Desempenho();
        float expResult = 0.0F;
        float result = instance.getFrenagem();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFrenagem method, of class Desempenho.
     */
    @Test
    public void testSetFrenagem() {
        System.out.println("setFrenagem");
        float frenagem = 0.0F;
        Desempenho instance = new Desempenho();
        instance.setFrenagem(frenagem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFKautomovel method, of class Desempenho.
     */
    @Test
    public void testGetFKautomovel() {
        System.out.println("getFKautomovel");
        Desempenho instance = new Desempenho();
        Automovel expResult = null;
        Automovel result = instance.getFKautomovel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFKautomovel method, of class Desempenho.
     */
    @Test
    public void testSetFKautomovel() {
        System.out.println("setFKautomovel");
        Automovel fKautomovel = null;
        Desempenho instance = new Desempenho();
        instance.setFKautomovel(fKautomovel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFKmotorista method, of class Desempenho.
     */
    @Test
    public void testGetFKmotorista() {
        System.out.println("getFKmotorista");
        Desempenho instance = new Desempenho();
        Integrante expResult = null;
        Integrante result = instance.getFKmotorista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFKmotorista method, of class Desempenho.
     */
    @Test
    public void testSetFKmotorista() {
        System.out.println("setFKmotorista");
        Integrante fKmotorista = null;
        Desempenho instance = new Desempenho();
        instance.setFKmotorista(fKmotorista);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFKtipopista method, of class Desempenho.
     */
    @Test
    public void testGetFKtipopista() {
        System.out.println("getFKtipopista");
        Desempenho instance = new Desempenho();
        Tipopista expResult = null;
        Tipopista result = instance.getFKtipopista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFKtipopista method, of class Desempenho.
     */
    @Test
    public void testSetFKtipopista() {
        System.out.println("setFKtipopista");
        Tipopista fKtipopista = null;
        Desempenho instance = new Desempenho();
        instance.setFKtipopista(fKtipopista);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Desempenho.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Desempenho instance = new Desempenho();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Desempenho.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Desempenho instance = new Desempenho();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Desempenho.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Desempenho instance = new Desempenho();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
