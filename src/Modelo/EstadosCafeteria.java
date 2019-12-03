/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 * Interface
 *
 * @author Emmanuel
 */
public interface EstadosCafeteria {

    /**
     *
     * @param fsm parametro de tipo CafteriaFSM esta va ir cambiando de acuerdo
     * al estado que se encuentre.
     */
    public void siguiente(CafeteriaFSM fsm);

    /**
     *
     * @param fsm parametro de tipo CafteriaFSM esta va ir cambiando de acuerdo
     * al tipo de error.
     */
    public void error(CafeteriaFSM fsm);
}
