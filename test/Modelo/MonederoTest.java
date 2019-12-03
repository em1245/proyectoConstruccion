/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;
import java.util.Map;
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
       
    }

    /**
     * Test of ingresarCinco method, of class Monedero.
     */
    @Test
    public void testIngresarCinco() {
        System.out.println("ingresarCinco");
        Monedero instance = new Monedero();
        instance.ingresarCinco();
       
    }

    /**
     * Test of ingresarDiez method, of class Monedero.
     */
    @Test
    public void testIngresarDiez() {
        System.out.println("ingresarDiez");
        Monedero instance = new Monedero();
        instance.ingresarDiez();
        
    }

    /**
     * Test of ingresarVeinte method, of class Monedero.
     */
    @Test
    public void testIngresarVeinte() {
        System.out.println("ingresarVeinte");
        Monedero instance = new Monedero();
        instance.ingresarVeinte();
       
    }

    /**
     * Test of ingresarCincuenta method, of class Monedero.
     */
    @Test
    public void testIngresarCincuenta() {
        System.out.println("ingresarCincuenta");
        Monedero instance = new Monedero();
        instance.ingresarCincuenta();
       
    }

    /**
     * Test of getIngresado method, of class Monedero.
     */
    @Test
    public void testGetIngresado() {
        System.out.println("getIngresado");
        Monedero instance = new Monedero();
        Integer expResult = null;
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
        instance.iniciarDineroIngresado();
       
    }

    /**
     * Test of iniciarDineroDeMaquina method, of class Monedero.
     */
    @Test
    public void testIniciarDineroDeMaquina() {
        System.out.println("iniciarDineroDeMaquina");
        Monedero instance = new Monedero();
        instance.iniciarDineroDeMaquina();
        
    }

    /**
     * Test of getMonedasRestantes method, of class Monedero.
     */
    @Test
    public void testGetMonedasRestantes() {
        System.out.println("getMonedasRestantes");
        Monedero instance = new Monedero();
        Map<String, Integer> expResult = null;
        Map<String, Integer> result = instance.getMonedasRestantes();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of darCambio method, of class Monedero.
     */
    @Test
    public void testDarCambio() {
        System.out.println("darCambio");
        int precio = 0;
        int monto = 0;
        int almacen = 0;
        List<Integer> denominaciones = null;
        Monedero instance = new Monedero();
        String expResult = "";
        String result = instance.darCambio(precio, monto, almacen, denominaciones);
        assertEquals(expResult, result);
       
    }
    
}
