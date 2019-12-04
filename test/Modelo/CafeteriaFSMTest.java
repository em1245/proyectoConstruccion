/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.ControladorMaquinaCafe;
import Vista.MaquinaCafe;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ariel May
 */
public class CafeteriaFSMTest {
    
    public CafeteriaFSMTest() {
    }
    
    @BeforeClass
    public static void setUpClass() throws IOException {
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
        EstadosCafeteria result = CafeteriaFSM.getEstado();
       if(!(result instanceof EstadosCafeteria)){
       fail("The test case is a prototype.");
       }
    }

    /**
     * Test of getDevice method, of class CafeteriaFSM.
     */
    @Test
    public void testGetDevice() {
        System.out.println("getDevice");
        Cafeteria result = CafeteriaFSM.getDevice();
        if (!(result instanceof Cafeteria)) {
            fail("The test case is a prototype.");
        }
    }        
    /**
     * Test of setEstadoActual method, of class CafeteriaFSM.
     */
    @Test
    public void testSetEstadoActual() {
        System.out.println("setEstadoActual");
        Cafeteria result = CafeteriaFSM.getDevice();
        if (!(result instanceof Cafeteria)) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of siguiente method, of class CafeteriaFSM.
     */
    @Test
    public void testSiguiente() throws IOException {
        System.out.println("siguiente");
        MaquinaCafe maquina = new MaquinaCafe();
        ControladorMaquinaCafe control = new ControladorMaquinaCafe(maquina);
        CafeteriaFSM instance = new CafeteriaFSM(new Cafeteria(maquina));
        instance.siguiente();
        if (!(instance.getEstado() instanceof EstadosCafeteria)) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of error method, of class CafeteriaFSM.
     */
    @Test
    public void testError() {
        System.out.println("error");
        CafeteriaFSM instance = null;
        if(!(instance.getEstado() instanceof EstadosCafeteria)){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of reinciarEstados method, of class CafeteriaFSM.
     */
    @Test
    public void testReinciarEstados() {
        System.out.println("reinciarEstados");
        CafeteriaFSM instance = null;
        if(!(instance.getEstado() instanceof EstadosCafeteria)){
            fail("The test case is a prototype.");
        }
    }
    
}
