/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Emmanuel
 */
public class CafeteriaFSMTest {
    
    public CafeteriaFSMTest() {
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
     * Test of getEstado method, of class CafeteriaFSM.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        EstadosCafeteria expResult = null;
        EstadosCafeteria result = CafeteriaFSM.getEstado();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getDevice method, of class CafeteriaFSM.
     */
    @Test
    public void testGetDevice() {
        System.out.println("getDevice");
        Cafeteria expResult = null;
        Cafeteria result = CafeteriaFSM.getDevice();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setEstadoActual method, of class CafeteriaFSM.
     */
    @Test
    public void testSetEstadoActual() {
        System.out.println("setEstadoActual");
        EstadosCafeteria estado = null;
        CafeteriaFSM instance = null;
        instance.setEstadoActual(estado);
      
    }

    /**
     * Test of siguiente method, of class CafeteriaFSM.
     */
    @Test
    public void testSiguiente() {
        System.out.println("siguiente");
        CafeteriaFSM instance = null;
        instance.siguiente();
     
    }

    /**
     * Test of error method, of class CafeteriaFSM.
     */
    @Test
    public void testError() {
        System.out.println("error");
        CafeteriaFSM instance = null;
        instance.error();
       
    }

    /**
     * Test of reinicarEstado method, of class CafeteriaFSM.
     */
    @Test
    public void testReinicarEstado() {
        System.out.println("reinicarEstado");
        CafeteriaFSM instance = null;
        instance.reinicarEstado();
       
    }
    
}
