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
 * @author Ariel May
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Modelo.EstPreparacionTest.class, Modelo.EstSinCambioTest.class, Modelo.EstEntregaTest.class, Modelo.FReaderTest.class, Modelo.CafeteriaFSMTest.class, Modelo.EstSeleccionProductosTest.class, Modelo.EstBloqueadoTest.class, Modelo.EstSeleccionIngredientesTest.class, Modelo.MonederoTest.class, Modelo.ClienteCafeTest.class, Modelo.EstSinIngredientesTest.class})
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
