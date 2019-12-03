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
public class EstSeleccionIngredientesTest {
    
    public EstSeleccionIngredientesTest() {
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
     * Test of siguiente method, of class EstSeleccionIngredientes.
     */
    @Test
    public void testSiguiente() {
        System.out.println("siguiente");
        CafeteriaFSM fsm = null;
        EstSeleccionIngredientes instance = new EstSeleccionIngredientes();
        instance.siguiente(fsm);
        
    }

    /**
     * Test of error method, of class EstSeleccionIngredientes.
     */
    @Test
    public void testError() {
        System.out.println("error");
        CafeteriaFSM fsm = null;
        EstSeleccionIngredientes instance = new EstSeleccionIngredientes();
        instance.error(fsm);
      
    }
    
}
