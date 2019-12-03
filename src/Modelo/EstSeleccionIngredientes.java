/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author @everyone
 */
public class EstSeleccionIngredientes implements EstadosCafeteria {

    /**
     *
     * @param fsm de tipo CafeteriaFSM lo cual cambia el estado actual que es
     * seleccion de ingredientes al estado de preparacion
     */
    @Override
    public void siguiente(CafeteriaFSM fsm) {
        System.out.println("Estado preparacion:");
        fsm.setEstadoActual(new EstPreparacion());
        fsm.device.preparacion();
    }

    /**
     *
     * @param fsm de tipo CafteriaFSM lo cual cambia su estado actual el de
     * seleccionar ingredientes a el estado de que no hay ingredientes.
     */
    @Override
    public void error(CafeteriaFSM fsm) {
        System.out.println("Sin Ingredients");
        fsm.setEstadoActual(new EstSinIngredientes());
    }

}
