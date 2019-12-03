/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author emmanuel.rivero
 */
public class EstSinIngredientes implements EstadosCafeteria {

    /**
     *
     * @param fsm parametro que sirve para cambiar el estado actual es decir el
     * estado sin ingredientes al estado de seleccion de productos es decir, al
     * inicio.
     */
    @Override
    public void siguiente(CafeteriaFSM fsm) {
        System.out.println("Return inicio");
        fsm.device.seleccionProductos();
        fsm.setEstadoActual(new EstSeleccionProductos());
    }

    /**
     *
     * @param fsm parametro que sirve para cambiar el estado actual a marcar un
     * error
     */
    @Override
    public void error(CafeteriaFSM fsm) {
        JOptionPane.showMessageDialog(null, "error");
    }

}
