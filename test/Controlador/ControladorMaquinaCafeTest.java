/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.event.ActionEvent;
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
public class ControladorMaquinaCafeTest {
    
    public ControladorMaquinaCafeTest() {
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
     * Test of actionPerformed method, of class ControladorMaquinaCafe.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent e = null;
        ControladorMaquinaCafe instance = null;
        instance.actionPerformed(e);
 
        fail("error");
    }

    /**
     * Test of activarProductos method, of class ControladorMaquinaCafe.
     */
    @Test
    public void testActivarProductos() {
        System.out.println("activarProductos");
        ControladorMaquinaCafe instance = null;
        instance.activarProductos();
  
         fail("error");
    }

    /**
     * Test of llenarIngredientes method, of class ControladorMaquinaCafe.
     */
    @Test
    public void testLlenarIngredientes() {
        System.out.println("llenarIngredientes");
        ControladorMaquinaCafe instance = null;
        instance.llenarIngredientes();
  
         fail("error");
    }

    /**
     * Test of orden method, of class ControladorMaquinaCafe.
     */
    @Test
    public void testOrden() {
        System.out.println("orden");
        ControladorMaquinaCafe instance = null;
        instance.orden();
     
       fail("error");
    }

    /**
     * Test of vaciarCampos method, of class ControladorMaquinaCafe.
     */
    @Test
    public void testVaciarCampos() {
        System.out.println("vaciarCampos");
        ControladorMaquinaCafe instance = null;
        instance.vaciarCampos();
      
        fail("error");
    }

    /**
     * Test of iniciarIngresado method, of class ControladorMaquinaCafe.
     */
    @Test
    public void testIniciarIngresado() {
        System.out.println("iniciarIngresado");
        ControladorMaquinaCafe instance = null;
        instance.iniciarIngresado();
       
         fail("error");
    }

    /**
     * Test of conteoDeMonedas method, of class ControladorMaquinaCafe.
     */
    @Test
    public void testConteoDeMonedas() {
        System.out.println("conteoDeMonedas");
        ControladorMaquinaCafe instance = null;
        int expResult = 0;
        int result = instance.conteoDeMonedas();
        assertEquals(expResult, result);
         fail("error");
    }
    
}
