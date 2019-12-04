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
public class EstPreparacionTest {
    
    public EstPreparacionTest() {
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
     * Test of siguiente method, of class EstPreparacion.
     */
    @Test
    public void testSiguiente() throws IOException {
        System.out.println("siguiente");
        MaquinaCafe maquina = new MaquinaCafe();
        ControladorMaquinaCafe control = new ControladorMaquinaCafe(maquina);
        CafeteriaFSM instance = new CafeteriaFSM(new Cafeteria(maquina));
        instance.setEstadoActual(new EstPreparacion());
        instance.siguiente();
        if (!(instance.getEstado() instanceof EstEntrega)) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of error method, of class EstPreparacion.
     */
    @Test
    public void testError() {
        System.out.println("error");
        CafeteriaFSM fsm = null;
        EstPreparacion instance = new EstPreparacion();
    }
    
}
