/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.MaquinaCafe;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author @everyone
 */
public class Cafeteria {

    private MaquinaCafe maquina;

    public Cafeteria(MaquinaCafe maquina) {
        this.maquina = maquina;
    }

    /**
     * Metodo para habilitar o desabilitar los estados de la seleccion de
     * productos
     */
    public void seleccionProductos() {
        maquina.getAzucar().setEnabled(false);
        maquina.getLeche().setEnabled(false);
        maquina.getTgbNegro().setEnabled(false);
        maquina.getTgbCapuccino().setEnabled(false);
        maquina.getTgbDescafeinado().setEnabled(false);
        maquina.getJbtAceptar().setVisible(false);
        maquina.getSelectProducto().setEnabled(true);
        maquina.getSelectIngredientes().setEnabled(false);
        maquina.getPreparando().setEnabled(false);
        maquina.getEntrega().setEnabled(false);
        maquina.getJbtNuevaCompra().setVisible(false);
        maquina.getJbtUno().setEnabled(true);
        maquina.getJbtCinco().setEnabled(true);
        maquina.getJbtDiez().setEnabled(true);
        maquina.getJbtVeinte().setEnabled(true);
        maquina.getJbtCincuenta().setEnabled(true);
        maquina.getjbtRellenarIng().setVisible(false);
        maquina.getError().setVisible(false);
        maquina.getMenu().getMenu(0).getItem(0).setEnabled(true);
        maquina.getCancelar().setVisible(false);
    }

    /**
     * Metodo para habilitar o desabilitar los estados de la seleccion de
     * ingredientes
     */

    public void seleccionIngredientes() {
        maquina.getSelectIngredientes().setEnabled(true);
        maquina.getTgbNegro().setEnabled(false);
        maquina.getTgbCapuccino().setEnabled(false);
        maquina.getTgbDescafeinado().setEnabled(false);
        maquina.getPedido().setEnabled(true);
        maquina.getAzucar().setEnabled(true);
        maquina.getLeche().setEnabled(true);
        maquina.getJbtAceptar().setVisible(true);
        maquina.getMenu().getMenu(0).getItem(0).setEnabled(false);
        maquina.getJbtUno().setEnabled(false);
        maquina.getJbtCinco().setEnabled(false);
        maquina.getJbtDiez().setEnabled(false);
        maquina.getJbtVeinte().setEnabled(false);
        maquina.getJbtCincuenta().setEnabled(false);
        maquina.getCancelar().setVisible(true);
    }

    /**
     * Metodo para activar el estado de preparacion
     */
    public void preparacion() {
        maquina.getPreparando().setEnabled(true);
        maquina.getJbtAceptar().setVisible(false);
        maquina.getAzucar().setEnabled(false);
        maquina.getLeche().setEnabled(false);
        maquina.getCancelar().setVisible(false);
    }

    /**
     * Metodo para activar el estado de entrega y de una nueva compra si se
     * desea
     */
    public void entrega() {
        maquina.getEntrega().setEnabled(true);
        maquina.getJbtNuevaCompra().setVisible(true);
        maquina.getJbtUno().setEnabled(false);
        maquina.getJbtCinco().setEnabled(false);
        maquina.getJbtDiez().setEnabled(false);
        maquina.getJbtVeinte().setEnabled(false);
        maquina.getJbtCincuenta().setEnabled(false);
    }

    /**
     * Metodo para habilitar el estado de sin ingredientes
     */
    public void SinIngredientes() {
        maquina.getjbtRellenarIng().setVisible(true);
        maquina.getError().setVisible(true);
        maquina.getJbtNuevaCompra().setVisible(false);
    }

    /**
     * metodo para bloquar los botones por si hubo algun problema o porque no
     * corresponde que esten activados en el estado actual.
     */

    public void bloqueado() {
        maquina.getJbtUno().setEnabled(false);
        maquina.getJbtCinco().setEnabled(false);
        maquina.getJbtDiez().setEnabled(false);
        maquina.getJbtVeinte().setEnabled(false);
        maquina.getJbtCincuenta().setEnabled(false);
        maquina.getError().setVisible(true);
        maquina.getError().setText("Maquina bloqueada");
    }
}
