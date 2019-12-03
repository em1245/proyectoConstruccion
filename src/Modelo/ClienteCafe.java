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
     * En esta clase ClienteCafe se habla acerca de los precios de los cafes
     * Se le asigan los precios correspondientes de acuerdo 
     * al tipo de cafe que se solicite.
     * 
     * Se tienen los metodos para obtener o restablecer los precios de los cafes
     * Se tienen los metodos para obtener el nivel de cafe, leche y azucar.
     * Se tiene el metodo para restablecer ingredientes.
     * Se tiene metodo para la introduccion de leche y cafe y de azucar.
     * 
     */
    private int cucharada = 5;
    
    private int cafeNegro = 35;
    private int cafeCapuccino = 45;
    private int cafeDescafeinado = 30;
    
    private int nivelCafe;
    private int nivelLeche;
    private int nivelAzucar;

    public ClienteCafe() {
        this.nivelCafe = 100;
        this.nivelLeche = 100;
        this.nivelAzucar = 100;
    }
    

    public int precioCafeNegro() {
        return cafeNegro;
    }

    public int precioCafeCapuccino() {
        return cafeCapuccino;
    }

    public int precioCafeDescafeinado() {
        return cafeDescafeinado;
    }

    public int getNivelCafe() {
        return nivelCafe;
    }

    public int getNivelLeche() {
        return nivelLeche;
    }

    public int getNivelAzucar() {
        return nivelAzucar;
    }

    public void cucharadaCafe() {
        nivelCafe -= cucharada*2;
    }

    public void cucharadaLeche() {
        nivelLeche -= cucharada;
    }

    public void cucharadaAzucar() {
        nivelAzucar -= cucharada;
    }

    public void rellenarIngredientes() {
        this.nivelCafe = 100;
        this.nivelLeche = 100;
        this.nivelAzucar = 100;
    }
}
