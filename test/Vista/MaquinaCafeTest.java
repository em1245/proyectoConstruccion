/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
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
public class MaquinaCafeTest {
    
    public MaquinaCafeTest() {
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
     * Test of getPrecio method, of class MaquinaCafe.
     */
    @Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        MaquinaCafe instance = new MaquinaCafe();
        JTextField expResult = null;
        JTextField result = instance.getPrecio();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getAzucar method, of class MaquinaCafe.
     */
    @Test
    public void testGetAzucar() {
        System.out.println("getAzucar");
        MaquinaCafe instance = new MaquinaCafe();
        JButton expResult = null;
        JButton result = instance.getAzucar();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getDineroIngresado method, of class MaquinaCafe.
     */
    @Test
    public void testGetDineroIngresado() {
        System.out.println("getDineroIngresado");
        MaquinaCafe instance = new MaquinaCafe();
        JTextField expResult = null;
        JTextField result = instance.getDineroIngresado();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getJbtCinco method, of class MaquinaCafe.
     */
    @Test
    public void testGetJbtCinco() {
        System.out.println("getJbtCinco");
        MaquinaCafe instance = new MaquinaCafe();
        JButton expResult = null;
        JButton result = instance.getJbtCinco();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getJbtCincuenta method, of class MaquinaCafe.
     */
    @Test
    public void testGetJbtCincuenta() {
        System.out.println("getJbtCincuenta");
        MaquinaCafe instance = new MaquinaCafe();
        JButton expResult = null;
        JButton result = instance.getJbtCincuenta();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getJbtDiez method, of class MaquinaCafe.
     */
    @Test
    public void testGetJbtDiez() {
        System.out.println("getJbtDiez");
        MaquinaCafe instance = new MaquinaCafe();
        JButton expResult = null;
        JButton result = instance.getJbtDiez();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getJbtUno method, of class MaquinaCafe.
     */
    @Test
    public void testGetJbtUno() {
        System.out.println("getJbtUno");
        MaquinaCafe instance = new MaquinaCafe();
        JButton expResult = null;
        JButton result = instance.getJbtUno();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of getJbtVeinte method, of class MaquinaCafe.
     */
    @Test
    public void testGetJbtVeinte() {
        System.out.println("getJbtVeinte");
        MaquinaCafe instance = new MaquinaCafe();
        JButton expResult = null;
        JButton result = instance.getJbtVeinte();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of getLeche method, of class MaquinaCafe.
     */
    @Test
    public void testGetLeche() {
        System.out.println("getLeche");
        MaquinaCafe instance = new MaquinaCafe();
        JButton expResult = null;
        JButton result = instance.getLeche();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of getPbarCafe method, of class MaquinaCafe.
     */
    @Test
    public void testGetPbarCafe() {
        System.out.println("getPbarCafe");
        MaquinaCafe instance = new MaquinaCafe();
        JProgressBar expResult = null;
        JProgressBar result = instance.getPbarCafe();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getPbarLeche method, of class MaquinaCafe.
     */
    @Test
    public void testGetPbarLeche() {
        System.out.println("getPbarLeche");
        MaquinaCafe instance = new MaquinaCafe();
        JProgressBar expResult = null;
        JProgressBar result = instance.getPbarLeche();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getPbarAzucar method, of class MaquinaCafe.
     */
    @Test
    public void testGetPbarAzucar() {
        System.out.println("getPbarAzucar");
        MaquinaCafe instance = new MaquinaCafe();
        JProgressBar expResult = null;
        JProgressBar result = instance.getPbarAzucar();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getTgbCapuccino method, of class MaquinaCafe.
     */
    @Test
    public void testGetTgbCapuccino() {
        System.out.println("getTgbCapuccino");
        MaquinaCafe instance = new MaquinaCafe();
        JToggleButton expResult = null;
        JToggleButton result = instance.getTgbCapuccino();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getTgbDescafeinado method, of class MaquinaCafe.
     */
    @Test
    public void testGetTgbDescafeinado() {
        System.out.println("getTgbDescafeinado");
        MaquinaCafe instance = new MaquinaCafe();
        JToggleButton expResult = null;
        JToggleButton result = instance.getTgbDescafeinado();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of getTgbNegro method, of class MaquinaCafe.
     */
    @Test
    public void testGetTgbNegro() {
        System.out.println("getTgbNegro");
        MaquinaCafe instance = new MaquinaCafe();
        JToggleButton expResult = null;
        JToggleButton result = instance.getTgbNegro();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getJbtAceptar method, of class MaquinaCafe.
     */
    @Test
    public void testGetJbtAceptar() {
        System.out.println("getJbtAceptar");
        MaquinaCafe instance = new MaquinaCafe();
        JButton expResult = null;
        JButton result = instance.getJbtAceptar();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of getPedido method, of class MaquinaCafe.
     */
    @Test
    public void testGetPedido() {
        System.out.println("getPedido");
        MaquinaCafe instance = new MaquinaCafe();
        JLabel expResult = null;
        JLabel result = instance.getPedido();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of getCambio method, of class MaquinaCafe.
     */
    @Test
    public void testGetCambio() {
        System.out.println("getCambio");
        MaquinaCafe instance = new MaquinaCafe();
        JTextField expResult = null;
        JTextField result = instance.getCambio();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getEntrega method, of class MaquinaCafe.
     */
    @Test
    public void testGetEntrega() {
        System.out.println("getEntrega");
        MaquinaCafe instance = new MaquinaCafe();
        JLabel expResult = null;
        JLabel result = instance.getEntrega();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getSelectIngredientes method, of class MaquinaCafe.
     */
    @Test
    public void testGetSelectIngredientes() {
        System.out.println("getSelectIngredientes");
        MaquinaCafe instance = new MaquinaCafe();
        JLabel expResult = null;
        JLabel result = instance.getSelectIngredientes();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getSelectProducto method, of class MaquinaCafe.
     */
    @Test
    public void testGetSelectProducto() {
        System.out.println("getSelectProducto");
        MaquinaCafe instance = new MaquinaCafe();
        JLabel expResult = null;
        JLabel result = instance.getSelectProducto();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getPreparando method, of class MaquinaCafe.
     */
    @Test
    public void testGetPreparando() {
        System.out.println("getPreparando");
        MaquinaCafe instance = new MaquinaCafe();
        JLabel expResult = null;
        JLabel result = instance.getPreparando();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getJbtNuevaCompra method, of class MaquinaCafe.
     */
    @Test
    public void testGetJbtNuevaCompra() {
        System.out.println("getJbtNuevaCompra");
        MaquinaCafe instance = new MaquinaCafe();
        JButton expResult = null;
        JButton result = instance.getJbtNuevaCompra();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getMenu method, of class MaquinaCafe.
     */
    @Test
    public void testGetMenu() {
        System.out.println("getMenu");
        MaquinaCafe instance = new MaquinaCafe();
        JMenuBar expResult = null;
        JMenuBar result = instance.getMenu();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of configBotonGrupo method, of class MaquinaCafe.
     */
    @Test
    public void testConfigBotonGrupo() {
        System.out.println("configBotonGrupo");
        ButtonGroup botonGrupo = null;
        MaquinaCafe instance = new MaquinaCafe();
        instance.configBotonGrupo(botonGrupo);
     
    }

    /**
     * Test of getjbtRellenarIng method, of class MaquinaCafe.
     */
    @Test
    public void testGetjbtRellenarIng() {
        System.out.println("getjbtRellenarIng");
        MaquinaCafe instance = new MaquinaCafe();
        JButton expResult = null;
        JButton result = instance.getjbtRellenarIng();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getError method, of class MaquinaCafe.
     */
    @Test
    public void testGetError() {
        System.out.println("getError");
        MaquinaCafe instance = new MaquinaCafe();
        JLabel expResult = null;
        JLabel result = instance.getError();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of getCancelar method, of class MaquinaCafe.
     */
    @Test
    public void testGetCancelar() {
        System.out.println("getCancelar");
        MaquinaCafe instance = new MaquinaCafe();
        JButton expResult = null;
        JButton result = instance.getCancelar();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of configBotonImagen method, of class MaquinaCafe.
     */
    @Test
    public void testConfigBotonImagen() {
        System.out.println("configBotonImagen");
        MaquinaCafe instance = new MaquinaCafe();
        instance.configBotonImagen();
       
    }

    /**
     * Test of configDinero method, of class MaquinaCafe.
     */
    @Test
    public void testConfigDinero() {
        System.out.println("configDinero");
        MaquinaCafe instance = new MaquinaCafe();
        instance.configDinero();
       
    }

    /**
     * Test of configEstados method, of class MaquinaCafe.
     */
    @Test
    public void testConfigEstados() {
        System.out.println("configEstados");
        MaquinaCafe instance = new MaquinaCafe();
        instance.configEstados();
       
    }

    /**
     * Test of main method, of class MaquinaCafe.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MaquinaCafe.main(args);
       
    }
    
}
