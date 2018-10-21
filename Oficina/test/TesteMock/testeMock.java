/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteMock;

import dao.AutomovelDAO;
import dao.DAO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.TestCase;
import model.Automovel;
import junit.framework.TestCase;
import model.IAutomovel;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;

/**
 *
 * @author LaisAlves
 */
public class testeMock extends TestCase{
    
   
public void testSalvarAutomovelDAO() {
        Automovel automovel = new Automovel();
        DAO automovelDAO = AutomovelDAO.getInstance();

        assertTrue(automovel.salvar(automovelDAO));
    }

    public void testSalvarAutomovelDAOMock() {
        Automovel automovel = new Automovel();
        DAO automovelDAOMock = createMock(DAO.class);
        expect(automovelDAOMock.salvar(automovel)).andReturn(true);
        replay(automovelDAOMock);

        assertTrue(automovel.salvar(automovelDAOMock));
    }
     public void testHashCodeNull() {
        IAutomovel automovelMock = createMock(IAutomovel.class);
        
        expect(automovelMock.idAutomovel()).andReturn(null);
        
        replay(automovelMock);
        Automovel automovel = new Automovel();
        assertEquals(0, automovel.hashCode(automovelMock));
    }
 public void testHashCodeNotNull() {
        IAutomovel automovelMock = createMock(IAutomovel.class);
        
        expect(automovelMock.idAutomovel()).andReturn(1);
        
        replay(automovelMock);
        Automovel automovel = new Automovel();
        assertEquals(1, automovel.hashCode(automovelMock));
    }


   
}
