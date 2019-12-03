/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Ariel May
 */
public class EstEntrega implements EstadosCafeteria {

    /**
     *
     * @param fsm de tipo CafeteriaFSM lo cual el estado actual cambia a estado
     * de seleccion de productos, es decir al estado inicial.
     */
    @Override
    public void siguiente(CafeteriaFSM fsm) {
        System.out.println("Estado seleccion:");
        fsm.device.seleccionProductos();
        fsm.setEstadoActual(new EstSeleccionProductos());
    }

    /**
     *
     * @param fsm de tipo CafeteriaFSM, el estado actual cambia a el estado sin
     * ingredientes.
     */
    @Override
    public void error(CafeteriaFSM fsm) {
        System.out.println("Estado sin ingredientes");
        fsm.device.SinIngredientes();
        fsm.setEstadoActual(new EstSinIngredientes());
    }

}
