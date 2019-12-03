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
public class ClienteCafeTest {
    
    public ClienteCafeTest() {
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
     * Test of precioCafeNegro method, of class ClienteCafe.
     */
    @Test
    public void testPrecioCafeNegro() {
        System.out.println("precioCafeNegro");
        ClienteCafe instance = new ClienteCafe();
        int expResult = 0;
        int result = instance.precioCafeNegro();
        assertEquals(expResult, result);
    
    }

    /**
     * Test of precioCafeCapuccino method, of class ClienteCafe.
     */
    @Test
    public void testPrecioCafeCapuccino() {
        System.out.println("precioCafeCapuccino");
        ClienteCafe instance = new ClienteCafe();
        int expResult = 0;
        int result = instance.precioCafeCapuccino();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of precioCafeDescafeinado method, of class ClienteCafe.
     */
    @Test
    public void testPrecioCafeDescafeinado() {
        System.out.println("precioCafeDescafeinado");
        ClienteCafe instance = new ClienteCafe();
        int expResult = 0;
        int result = instance.precioCafeDescafeinado();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getNivelCafe method, of class ClienteCafe.
     */
    @Test
    public void testGetNivelCafe() {
        System.out.println("getNivelCafe");
        ClienteCafe instance = new ClienteCafe();
        int expResult = 0;
        int result = instance.getNivelCafe();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getNivelLeche method, of class ClienteCafe.
     */
    @Test
    public void testGetNivelLeche() {
        System.out.println("getNivelLeche");
        ClienteCafe instance = new ClienteCafe();
        int expResult = 0;
        int result = instance.getNivelLeche();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of getNivelAzucar method, of class ClienteCafe.
     */
    @Test
    public void testGetNivelAzucar() {
        System.out.println("getNivelAzucar");
        ClienteCafe instance = new ClienteCafe();
        int expResult = 0;
        int result = instance.getNivelAzucar();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of cucharadaCafe method, of class ClienteCafe.
     */
    @Test
    public void testCucharadaCafe() {
        System.out.println("cucharadaCafe");
        ClienteCafe instance = new ClienteCafe();
        instance.cucharadaCafe();
       
    }

    /**
     * Test of cucharadaLeche method, of class ClienteCafe.
     */
    @Test
    public void testCucharadaLeche() {
        System.out.println("cucharadaLeche");
        ClienteCafe instance = new ClienteCafe();
        instance.cucharadaLeche();
        
    }

    /**
     * Test of cucharadaAzucar method, of class ClienteCafe.
     */
    @Test
    public void testCucharadaAzucar() {
        System.out.println("cucharadaAzucar");
        ClienteCafe instance = new ClienteCafe();
        instance.cucharadaAzucar();
       
    }

    /**
     * Test of rellenarIngredientes method, of class ClienteCafe.
     */
    @Test
    public void testRellenarIngredientes() {
        System.out.println("rellenarIngredientes");
        ClienteCafe instance = new ClienteCafe();
        instance.rellenarIngredientes();
       
    }
    
}
