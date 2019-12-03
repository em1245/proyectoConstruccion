/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.CafeteriaFSM;
import Modelo.EstadosCafeteria;

/**
 *
 * @author everyone
 */
public class EstBloqueado implements EstadosCafeteria {

    /**
     *
     * @param fsm parametro de tipo CafeteriaFSM la cual cambia el estado actual
     * a bloqueado.
     */
    @Override
    public void siguiente(CafeteriaFSM fsm) {
        fsm.setEstadoActual(new EstBloqueado());
    }

    /**
     *
     * @param fsm parametro de tipo cafeteriaFSM la cual cambia el estado actual
     * a bloquado.
     */
    @Override
    public void error(CafeteriaFSM fsm) {
        fsm.setEstadoActual(new EstBloqueado());
    }

}
