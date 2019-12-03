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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Emmanuel
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Modelo.EstSeleccionProductosTest.class, Modelo.CafeteriaTest.class, Modelo.EstPreparacionTest.class, Modelo.EstSinIngredientesTest.class, Modelo.EstSeleccionIngredientesTest.class, Modelo.EstadosCafeteriaTest.class, Modelo.ClienteCafeTest.class, Modelo.EstSinCambioTest.class, Modelo.EstBloqueadoTest.class, Modelo.FReaderTest.class, Modelo.cafeTest.class, Modelo.EstEntregaTest.class, Modelo.MonederoTest.class, Modelo.CafeteriaFSMTest.class})
public class ModeloSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
