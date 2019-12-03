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
public class CafeteriaFSM {

    private static EstadosCafeteria estadoActual = new EstSeleccionProductos();
    static Cafeteria device;

    /**
     * Constructor de la clase CafeteriaFSM
     *
     * @param cafeteria parametro de tipo Cafeteria la cual habilita o
     * deshabilita estados
     */
    public CafeteriaFSM(Cafeteria cafeteria) {
        device = cafeteria;
        device.seleccionProductos();
    }

    /**
     * Retorna el estado actual la cual se encuentra el producto a vender.
     *
     * @return
     */
    public static EstadosCafeteria getEstado() {
        return estadoActual;
    }

    /**
     * Retorna el dispositivo a usar
     *
     * @return
     */
    public static Cafeteria getDevice() {
        return device;
    }

    /**
     * Metodo para el cambio del estado actual
     *
     * @param estado recibe parametro de tipo EstadosCafeteria lo cual son
     * estados del proceso del cafe
     */
    public void setEstadoActual(EstadosCafeteria estado) {
        estadoActual = estado;
    }

    /**
     * sirve para cambiar el estado actual al estado siguiente.
     */
    public void siguiente() {
        estadoActual.siguiente(this);
    }

    /**
     * metodo cuando ocurre un error.
     */
    public void error() {
        estadoActual.error(this);
    }

    /**
     * Meotodo para reiniciar desde el inicio los estados, para una nueva venta
     * de producto
     */
    public void reinicarEstado() {
        System.out.println("Estado Seleccion Productos");
        device.seleccionProductos();
        estadoActual = new EstSeleccionProductos();
    }

}
