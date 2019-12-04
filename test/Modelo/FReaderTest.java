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
public class FReaderTest {
    
    public FReaderTest() {
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
     * Test of crearArchivo method, of class FReader.
     */
    @Test
    public void testCrearArchivo() throws Exception {
        System.out.println("crearArchivo");
        String nombre = "";
        FReader instance = new FReader();
        instance.crearArchivo(nombre);
    }

    /**
     * Test of getAbsolutPath method, of class FReader.
     */
    @Test
    public void testGetAbsolutPath() {
        System.out.println("getAbsolutPath");
        FReader instance = new FReader();
        String expResult = "";
        String result = instance.getAbsolutPath();
        assertEquals(expResult, result);
    }

    /**
     * Test of escribirArchivo method, of class FReader.
     */
    @Test
    public void testEscribirArchivo() throws Exception {
        System.out.println("escribirArchivo");
        String cadena = "";
        String nombre = "";
        FReader instance = new FReader();
        instance.escribirArchivo(cadena, nombre);
    }
    
}
