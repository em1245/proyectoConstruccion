/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.ControladorMaquinaCafe;
import Vista.MaquinaCafe;
import java.io.IOException;
/**
 *
 * @author Ariel May
 * @author Julio Cabrera
 * @author Emmanuel Rivero
 * @author Isaac Canche
 * @author Jose Suarez
 * 
 * Clase principal para la ejecucion del proyecto.
 */
public class cafe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, IOException {
        MaquinaCafe maquinaCafe = new MaquinaCafe();
        ControladorMaquinaCafe controlador = new ControladorMaquinaCafe(maquinaCafe);
    }
    
}
