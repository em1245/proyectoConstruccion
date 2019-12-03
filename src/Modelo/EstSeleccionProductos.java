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
public class EstSeleccionProductos implements EstadosCafeteria {

    /**
     *
     * @param fsm de tipo CafeteriaFSM para cambiar del estado seleccionar
     * producto, al estado de seleccion de ingredientes.
     */
    @Override
    public void siguiente(CafeteriaFSM fsm) {
        System.out.println("Estado ingredientes:");
        fsm.device.seleccionIngredientes();
        fsm.setEstadoActual(new EstSeleccionIngredientes());
    }

    /**
     *
     * @param fsm de tipo CafeteriaFSM lo cual es cambiar de seleccionar
     * productos a bloquaer
     */
    @Override
    public void error(CafeteriaFSM fsm) {
        System.out.println("bloqueado");
        fsm.device.bloqueado();
        fsm.setEstadoActual(new EstBloqueado());
    }

}
