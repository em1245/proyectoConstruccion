/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Isaac Canche
 */
public class Monedero {

    //Dinero dentro de la maquina
    private Map<String,Integer> monedasRestantes = new HashMap<String, Integer>();


    //Dinero que ingreso el cliente
    private int uno;
    private int cinco;
    private int diez;
    private int veinte;
    private int cincuenta;

    public Monedero() {
        iniciarDineroIngresado();
        iniciarDineroDeMaquina();
    }

    public void ingresarUno() {
        uno++;
        this.monedasRestantes.put(String.valueOf(1),this.monedasRestantes.get(String.valueOf(1))+1);
    }

    public void ingresarCinco() {
        cinco++;
        this.monedasRestantes.put(String.valueOf(5),this.monedasRestantes.get(String.valueOf(5))+1);
    }

    public void ingresarDiez() {
        diez++;
        this.monedasRestantes.put(String.valueOf(10),this.monedasRestantes.get(String.valueOf(10))+1);
    }

    public void ingresarVeinte() {
        veinte++;
        this.monedasRestantes.put(String.valueOf(20),this.monedasRestantes.get(String.valueOf(20))+1);
    }

    public void ingresarCincuenta() {
        cincuenta++;
        this.monedasRestantes.put(String.valueOf(50),this.monedasRestantes.get(String.valueOf(50))+1);
    }

    public Integer getIngresado() {
        return uno + cinco * 5 + diez * 10 + veinte * 20 + cincuenta * 50;
    }
    public void iniciarDineroIngresado() {
        uno = 0;
        cinco = 0;
        diez = 0;
        veinte = 0;
        cincuenta = 0;
    }
    
    public void iniciarDineroDeMaquina(){
        this.monedasRestantes.put(String.valueOf(50),1);
        this.monedasRestantes.put(String.valueOf(20),1);
        this.monedasRestantes.put(String.valueOf(10),1);
        this.monedasRestantes.put(String.valueOf(5),1);
        this.monedasRestantes.put(String.valueOf(1),1);
    }

    public Map<String, Integer> getMonedasRestantes() {
        return monedasRestantes;
    }

    public String darCambio(int precio, int monto, int almacen, List<Integer> denominaciones) {
        int cambio = monto - precio;
        System.out.println("En almacen antes de dar cambio:" + almacen);
        Map<String, Integer> monedas = new HashMap<String, Integer>();
        int cambioaux = cambio;
        String mensajeCambio = "";
        if (almacen >= cambio) {

            for (int denominacion : denominaciones) {
                if (cambioaux >= denominacion && this.monedasRestantes.get(String.valueOf(String.valueOf(denominacion)))>0) {
                    monedas.put(String.valueOf(denominacion), cambioaux / denominacion);
                    cambioaux %= denominacion;
                    this.monedasRestantes.put(String.valueOf(denominacion),this.monedasRestantes.get(String.valueOf(denominacion))-1);

                }
            }
            mensajeCambio = "Su cambio es:" + cambio + monedas;
        } else {
            mensajeCambio = "No hay dinero suficiente";
        }
        
        System.out.println("monedas de 1: "+this.monedasRestantes.get(String.valueOf(1)));
        System.out.println("monedas de 5: "+this.monedasRestantes.get(String.valueOf(5))); 
        System.out.println("monedas de 10: "+this.monedasRestantes.get(String.valueOf(10)));
        System.out.println("monedas de 20: "+this.monedasRestantes.get(String.valueOf(20)));
        System.out.println("monedas de 50: "+this.monedasRestantes.get(String.valueOf(50)));
        return mensajeCambio;

    }
}
