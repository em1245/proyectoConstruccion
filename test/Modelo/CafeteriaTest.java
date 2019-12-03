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
public class CafeteriaTest {
    
    public CafeteriaTest() {
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
     * Test of seleccionProductos method, of class Cafeteria.
     */
    @Test
    public void testSeleccionProductos() {
        System.out.println("seleccionProductos");
        Cafeteria instance = null;
        instance.seleccionProductos();
      
    }

    /**
     * Test of seleccionIngredientes method, of class Cafeteria.
     */
    @Test
    public void testSeleccionIngredientes() {
        System.out.println("seleccionIngredientes");
        Cafeteria instance = null;
        instance.seleccionIngredientes();
      
    }

    /**
     * Test of preparacion method, of class Cafeteria.
     */
    @Test
    public void testPreparacion() {
        System.out.println("preparacion");
        Cafeteria instance = null;
        instance.preparacion();
      
    }

    /**
     * Test of entrega method, of class Cafeteria.
     */
    @Test
    public void testEntrega() {
        System.out.println("entrega");
        Cafeteria instance = null;
        instance.entrega();
      
    }

    /**
     * Test of SinIngredientes method, of class Cafeteria.
     */
    @Test
    public void testSinIngredientes() {
        System.out.println("SinIngredientes");
        Cafeteria instance = null;
        instance.SinIngredientes();
      
    }

    /**
     * Test of bloqueado method, of class Cafeteria.
     */
    @Test
    public void testBloqueado() {
        System.out.println("bloqueado");
        Cafeteria instance = null;
        instance.bloqueado();
      
    }
    
}
