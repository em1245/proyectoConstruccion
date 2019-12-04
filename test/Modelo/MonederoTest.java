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
 * @author Ariel May
 */
public class MonederoTest {
    
    public MonederoTest() {
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
     * Test of ingresarUno method, of class Monedero.
     */
    @Test
    public void testIngresarUno() {
        System.out.println("ingresarUno");
        Monedero instance = new Monedero();
        instance.ingresarUno();
        if(instance.getIngresado() != 1){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of ingresarCinco method, of class Monedero.
     */
    @Test
    public void testIngresarCinco() {
        System.out.println("ingresarCinco");
        Monedero instance = new Monedero();
        instance.ingresarCinco();
        if(instance.getIngresado() != 5){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of ingresarDiez method, of class Monedero.
     */
    @Test
    public void testIngresarDiez() {
        System.out.println("ingresarDiez");
        Monedero instance = new Monedero();
        instance.ingresarDiez();
        if(instance.getIngresado() != 10){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of ingresarVeinte method, of class Monedero.
     */
    @Test
    public void testIngresarVeinte() {
        System.out.println("ingresarVeinte");
        Monedero instance = new Monedero();
        instance.ingresarVeinte();
        if(instance.getIngresado() != 20){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of ingresarCincuenta method, of class Monedero.
     */
    @Test
    public void testIngresarCincuenta() {
        System.out.println("ingresarCincuenta");
        Monedero instance = new Monedero();
        instance.ingresarCincuenta();
        if(instance.getIngresado() != 50){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getIngresado method, of class Monedero.
     */
    @Test
    public void testGetIngresado() {
        System.out.println("getIngresado");
        Monedero instance = new Monedero();
        Integer expResult = 100;
        instance.ingresarCincuenta();
        instance.ingresarCincuenta();
        Integer result = instance.getIngresado();
        assertEquals(expResult, result);
    }

    /**
     * Test of iniciarDineroIngresado method, of class Monedero.
     */
    @Test
    public void testIniciarDineroIngresado() {
        System.out.println("iniciarDineroIngresado");
        Monedero instance = new Monedero();
        instance.ingresarCinco();
        instance.iniciarDineroIngresado();
        if(instance.getIngresado() != 0){
            
        }
    }
    
}
