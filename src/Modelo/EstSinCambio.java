/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author everyone
 */
public class EstSinCambio implements EstadosCafeteria {

    /**
     *
     * @param fsm de tipo CafeteriaFSM, lo cual es cambiar del estado actual, es
     * decir, del estado sin cambio de dinero, a la seleccion de ingredientes
     */
    @Override
    public void siguiente(CafeteriaFSM fsm) {
        System.out.println("Seleccion ingredientes");
        fsm.setEstadoActual(new EstSeleccionIngredientes());
    }

    /**
     *
     * @param fsm de estadp actual al estado de bloqueado.
     */
    @Override
    public void error(CafeteriaFSM fsm) {
        System.out.println("bloqueado");
        fsm.setEstadoActual(new EstBloqueado());
    }

}
