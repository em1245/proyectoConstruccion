/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Ariel May
 * @author Julio Cabrera
 * @author Emmanuel Rivero
 * @author Isaac Canche
 * @author Jose Suarez
 *
 */
public class ClienteCafe {

    /**
     * En esta clase ClienteCafe se habla acerca de los precios de los cafes Se
     * le asigan los precios correspondientes de acuerdo al tipo de cafe que se
     * solicite.
     *
     * Se tienen los metodos para obtener o restablecer los precios de los cafes
     * Se tienen los metodos para obtener el nivel de cafe, leche y azucar. Se
     * tiene el metodo para restablecer ingredientes. Se tiene metodo para la
     * introduccion de leche y cafe y de azucar.
     *
     */
    private int cucharada = 5;

    private int cafeNegro = 35;
    private int cafeCapuccino = 45;
    private int cafeDescafeinado = 30;

    private int nivelCafe;
    private int nivelLeche;
    private int nivelAzucar;

    /**
     * Constructor de la clase Clientecafe se inicializa el nivel de cafe al
     * 100%
     */
    public ClienteCafe() {
        this.nivelCafe = 100;
        this.nivelLeche = 100;
        this.nivelAzucar = 100;
    }

    /**
     *
     * @return cafenegro, retorna el precio del cafe negro.
     */
    public int precioCafeNegro() {
        return cafeNegro;
    }

    /**
     *
     * @return cafeCapuccino, retorna el precio del cafe capuccino.
     */
    public int precioCafeCapuccino() {
        return cafeCapuccino;
    }

    /**
     *
     * @return precioCafeDescafeinado, retorna el precio del cafe descafeinado,
     */
    public int precioCafeDescafeinado() {
        return cafeDescafeinado;
    }

    /**
     *
     * @return nivelCafe retorna el nivel de cafe que este tiene.
     */
    public int getNivelCafe() {
        return nivelCafe;
    }

    /**
     *
     * @return nivelLeche, retorna el nivel de leche que este tiene.
     */
    public int getNivelLeche() {
        return nivelLeche;
    }

    /**
     *
     * @return nivelAzucar, retorna el nivel de azucar que este tiene.
     */
    public int getNivelAzucar() {
        return nivelAzucar;
    }

    /**
     * metodo para asignar el nivel de cafe de acuerdo al nivel de cucharadas
     */
    public void cucharadaCafe() {
        nivelCafe -= cucharada * 2;
    }

    /**
     * metodo para asignar nivel de leche de acuerdo a la cucharada.
     */
    public void cucharadaLeche() {
        nivelLeche -= cucharada;
    }

    /**
     * metodo para asignar nivel de azucar de acuerdo a la cucharada
     * introducida.
     */
    public void cucharadaAzucar() {
        nivelAzucar -= cucharada;
    }

    /**
     * Metodo para restablecer lops ingredientes al 100%
     */
    public void rellenarIngredientes() {
        this.nivelCafe = 100;
        this.nivelLeche = 100;
        this.nivelAzucar = 100;
    }
}
