/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.DAO;
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
public class AutomovelTest {
    
    public AutomovelTest() {
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
     * Test of getIdAutomovel method, of class Automovel.
     */
    @Test
    public void testGetIdAutomovel() {
        System.out.println("getIdAutomovel");
        Automovel instance = new Automovel();
        Integer expResult = null;
        Integer result = instance.getIdAutomovel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdAutomovel method, of class Automovel.
     */
    @Test
    public void testSetIdAutomovel() {
        System.out.println("setIdAutomovel");
        Integer idAutomovel = null;
        Automovel instance = new Automovel();
        instance.setIdAutomovel(idAutomovel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCor method, of class Automovel.
     */
    @Test
    public void testGetCor() {
        System.out.println("getCor");
        Automovel instance = new Automovel();
        String expResult = "";
        String result = instance.getCor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCor method, of class Automovel.
     */
    @Test
    public void testSetCor() {
        System.out.println("setCor");
        String cor = "";
        Automovel instance = new Automovel();
        instance.setCor(cor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Automovel.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Automovel instance = new Automovel();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Automovel.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Automovel instance = new Automovel();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataTerminoProjeto method, of class Automovel.
     */
    @Test
    public void testGetDataTerminoProjeto() {
        System.out.println("getDataTerminoProjeto");
        Automovel instance = new Automovel();
        String expResult = "";
        String result = instance.getDataTerminoProjeto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataTerminoProjeto method, of class Automovel.
     */
    @Test
    public void testSetDataTerminoProjeto() {
        System.out.println("setDataTerminoProjeto");
        String dataTerminoProjeto = "";
        Automovel instance = new Automovel();
        instance.setDataTerminoProjeto(dataTerminoProjeto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPesoCarro method, of class Automovel.
     */
    @Test
    public void testGetPesoCarro() {
        System.out.println("getPesoCarro");
        Automovel instance = new Automovel();
        float expResult = 0.0F;
        float result = instance.getPesoCarro();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPesoCarro method, of class Automovel.
     */
    @Test
    public void testSetPesoCarro() {
        System.out.println("setPesoCarro");
        float pesoCarro = 0.0F;
        Automovel instance = new Automovel();
        instance.setPesoCarro(pesoCarro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPesoChassi method, of class Automovel.
     */
    @Test
    public void testGetPesoChassi() {
        System.out.println("getPesoChassi");
        Automovel instance = new Automovel();
        float expResult = 0.0F;
        float result = instance.getPesoChassi();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPesoChassi method, of class Automovel.
     */
    @Test
    public void testSetPesoChassi() {
        System.out.println("setPesoChassi");
        float pesoChassi = 0.0F;
        Automovel instance = new Automovel();
        instance.setPesoChassi(pesoChassi);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustoTotal method, of class Automovel.
     */
    @Test
    public void testGetCustoTotal() {
        System.out.println("getCustoTotal");
        Automovel instance = new Automovel();
        float expResult = 0.0F;
        float result = instance.getCustoTotal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustoTotal method, of class Automovel.
     */
    @Test
    public void testSetCustoTotal() {
        System.out.println("setCustoTotal");
        float custoTotal = 0.0F;
        Automovel instance = new Automovel();
        instance.setCustoTotal(custoTotal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Automovel.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Automovel instance = new Automovel();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Automovel.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Automovel instance = new Automovel();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Automovel.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Automovel instance = new Automovel();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCategoria method, of class Automovel.
     */
    @Test
    public void testGetCategoria() {
        System.out.println("getCategoria");
        Automovel instance = new Automovel();
        String expResult = "";
        String result = instance.getCategoria();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of salvar method, of class Automovel.
     */
    @Test
    public void testSalvar() {
        System.out.println("salvar");
        DAO automovelDAO = null;
        Automovel instance = new Automovel();
        boolean expResult = false;
        boolean result = instance.salvar(automovelDAO);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
