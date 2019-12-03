/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cafeteria;
import Modelo.CafeteriaFSM;
import Modelo.ClienteCafe;
import Modelo.FReader;
import Modelo.Monedero;
import Vista.MaquinaCafe;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author emmanuel.rivero
 */
public class ControladorMaquinaCafe implements ActionListener {

    private MaquinaCafe maquina;
    private Monedero monedero;
    private CafeteriaFSM fsm;
    private ClienteCafe cliente;
    private FReader fReader;
    private List<Integer> denominaciones;
    private int almacen;

    public ControladorMaquinaCafe(MaquinaCafe maquina) throws IOException {
        this.maquina = maquina;
        this.maquina.getJbtUno().addActionListener(this);
        this.maquina.getJbtCinco().addActionListener(this);
        this.maquina.getJbtDiez().addActionListener(this);
        this.maquina.getJbtVeinte().addActionListener(this);
        this.maquina.getJbtCincuenta().addActionListener(this);
        this.maquina.getJbtAceptar().addActionListener(this);
        this.maquina.getCancelar().addActionListener(this);
        this.maquina.getTgbCapuccino().addActionListener(this);
        this.maquina.getTgbNegro().addActionListener(this);
        this.maquina.getTgbDescafeinado().addActionListener(this);
        this.maquina.getLeche().addActionListener(this);
        this.maquina.getAzucar().addActionListener(this);
        this.maquina.getJbtNuevaCompra().addActionListener(this);
        this.maquina.getjbtRellenarIng().addActionListener(this);

        JMenu Ayuda = new JMenu("Ayuda");
        JMenuItem bloquear = new JMenuItem("Bloquear Maquina");
        bloquear.addActionListener(this);
        Ayuda.add(bloquear);
        this.maquina.getMenu().add(Ayuda);

        Cafeteria cafe = new Cafeteria(maquina);
        this.fsm = new CafeteriaFSM(cafe);
        this.monedero = new Monedero();
        this.cliente = new ClienteCafe();
        this.fReader = new FReader();
        this.llenarIngredientes();
        fReader.crearArchivo("Bitacora");
        
        fReader.crearArchivo("BitacoraIngredientes");

        fReader.crearArchivo("BitacoraClientes");
        
        denominaciones = Arrays.asList(50, 20, 10, 5, 1);

        almacen = this.conteoDeMonedas();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.maquina.getJbtUno() == e.getSource()) {
            monedero.ingresarUno();
            this.maquina.getDineroIngresado().setText(monedero.getIngresado().toString());
           
            activarProductos();
        }
        if (this.maquina.getJbtCinco() == e.getSource()) {
            monedero.ingresarCinco();
            this.maquina.getDineroIngresado().setText(monedero.getIngresado().toString());
           
            activarProductos();
        }
        if (this.maquina.getJbtDiez() == e.getSource()) {
            monedero.ingresarDiez();
            this.maquina.getDineroIngresado().setText(monedero.getIngresado().toString());
          
            activarProductos();
        }
        if (this.maquina.getJbtVeinte() == e.getSource()) {
            monedero.ingresarVeinte();
            this.maquina.getDineroIngresado().setText(monedero.getIngresado().toString());
           
            activarProductos();
        }
        if (this.maquina.getJbtCincuenta() == e.getSource()) {
            monedero.ingresarCincuenta();
            this.maquina.getDineroIngresado().setText(monedero.getIngresado().toString());
         
            activarProductos();
        }
        if (this.maquina.getLeche() == e.getSource()) {
            this.cliente.cucharadaLeche();
            this.maquina.getPbarLeche().setValue(this.cliente.getNivelLeche());
        }
        if (this.maquina.getAzucar() == e.getSource()) {
            this.cliente.cucharadaAzucar();
            this.maquina.getPbarAzucar().setValue(this.cliente.getNivelAzucar());
        }
        if (this.maquina.getTgbNegro() == e.getSource()) {
            this.maquina.getPedido().setText("Café Negro");
            this.maquina.getPrecio().setText(String.valueOf(cliente.precioCafeNegro()));
            this.cliente.cucharadaCafe();
            this.maquina.getPbarCafe().setValue(this.cliente.getNivelCafe());
            this.fsm.siguiente();
        }
        if (this.maquina.getTgbDescafeinado() == e.getSource()) {
            this.maquina.getPedido().setText("Café Descafeinado");
            this.maquina.getPrecio().setText(String.valueOf(cliente.precioCafeDescafeinado()));
            this.cliente.cucharadaCafe();
            this.maquina.getPbarCafe().setValue(this.cliente.getNivelCafe());
            this.fsm.siguiente();
        }
        if (this.maquina.getTgbCapuccino() == e.getSource()) {
            this.maquina.getPedido().setText("Café Capuccino");
            this.maquina.getPrecio().setText(String.valueOf(cliente.precioCafeCapuccino()));
            this.cliente.cucharadaCafe();
            this.maquina.getPbarCafe().setValue(this.cliente.getNivelCafe());
            this.fsm.siguiente();
        }
        if (this.maquina.getJbtNuevaCompra() == e.getSource()) {
            boolean conIngredientes = this.cliente.getNivelAzucar() > 0
                    && this.cliente.getNivelCafe() > 0
                    && this.cliente.getNivelLeche() > 0;
            vaciarCampos();
            iniciarIngresado();
            if (conIngredientes) {
                this.fsm.siguiente();
            } else {
                this.fsm.error();
            }
        }
        if (this.maquina.getjbtRellenarIng() == e.getSource()) {
            this.cliente.rellenarIngredientes();
            this.llenarIngredientes();
            this.fsm.siguiente();
        }

        if (this.maquina.getJbtAceptar() == e.getSource()) {

            orden();
       
        }

        if (this.maquina.getMenu().getMenu(0).getItem(0) == e.getSource()) {
            this.fsm.error();
        }
        if (this.maquina.getCancelar() == e.getSource()) {
            this.fsm.reinicarEstado();
            JOptionPane.showMessageDialog(null, "Tu cambio es " + this.maquina.dineroIngresado.getText());
            this.maquina.getDineroIngresado().setText("0");
            this.maquina.getPrecio().setText("0");
        }
    }

    public void activarProductos() {

        if (cliente.precioCafeNegro() <= monedero.getIngresado()) {
            this.maquina.getTgbNegro().setEnabled(true);
        }
        if (cliente.precioCafeCapuccino() <= monedero.getIngresado()) {
            this.maquina.getTgbCapuccino().setEnabled(true);
        }
        if (cliente.precioCafeDescafeinado() <= monedero.getIngresado()) {
            this.maquina.getTgbDescafeinado().setEnabled(true);
        }

    }

    public void llenarIngredientes() {
        this.maquina.getPbarCafe().setValue(100);
        this.maquina.getPbarAzucar().setValue(100);
        this.maquina.getPbarLeche().setValue(100);
    }

    public void orden() {

        ExecutorService executor = Executors.newFixedThreadPool(2);
        CompletableFuture<Void> preparacion = CompletableFuture.runAsync(() -> {
            try {
                System.out.println("Preparando cafe...(ES)");
                this.fsm.siguiente();
                Thread.sleep(2000);
                System.out.println("Café terminado!(ES)");
            } catch (InterruptedException ex) {
                Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
            }
        }, executor);

        CompletableFuture<Void> orden = CompletableFuture.runAsync(() -> {
            try {
                System.out.println("Comenzando orden...(ES)");
                Thread.sleep(4000);
                this.fsm.siguiente();
                String bitacora = new Date().toString() + " "
                        + this.maquina.getPedido().getText() + " $"
                        + this.maquina.getPrecio().getText() + "\n";
                
                try {
                    this.fReader.escribirArchivo(bitacora, "Bitacora");
                } catch (IOException ex) {
                    Logger.getLogger(ControladorMaquinaCafe.class.getName()).log(Level.SEVERE, null, ex);
                }

              
                int precio = Integer.parseInt(this.maquina.precio.getText());
                int monto = Integer.parseInt(this.maquina.dineroIngresado.getText());
                almacen += monto;
                String bitacoraIngredientes = new Date().toString() + " Nivel de cafe: "+this.cliente.getNivelCafe()+" Nivel de leche: "+this.cliente.getNivelLeche()+" Nivel de Azucar: "+this.cliente.getNivelAzucar()+"\n";
                String bitacoraCliente = new Date().toString() + " Dinero ingresado por cliente $"+this.maquina.dineroIngresado.getText() + " Cambio $"+(monto-precio)+"\n";
                try {
                    this.fReader.escribirArchivo(bitacoraIngredientes,"BitacoraIngredientes");
                    this.fReader.escribirArchivo(bitacoraCliente, "BitacoraClientes");
                } catch (IOException ex) {
                    Logger.getLogger(ControladorMaquinaCafe.class.getName()).log(Level.SEVERE, null, ex);
                }
                String mensajeCambio = this.monedero.darCambio(precio, monto, almacen, denominaciones);
                almacen -= precio;
                String despuesCambio = "Hay en almacen despues de dar el cambio: " + almacen;
                System.out.println(despuesCambio);
                JOptionPane.showMessageDialog(null, mensajeCambio, "Gracias Por su compra", JOptionPane.NO_OPTION);
               
                System.out.println("Orden terminada!(ES)");
            } catch (InterruptedException ex) {
                Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
            }
        }, executor);

   
    }

    

    
    public void vaciarCampos() {
        this.maquina.cambio.setText("0");
        this.maquina.getDineroIngresado().setText("0");
        this.maquina.getPrecio().setText("0");
    }

    public void iniciarIngresado() {
        this.monedero.iniciarDineroIngresado();
    }
    
    public int conteoDeMonedas(){
        int total = 0;
        
        total = total + (this.monedero.getMonedasRestantes().get(String.valueOf(1)));
        total = total + (5*(this.monedero.getMonedasRestantes().get(String.valueOf(5))));
        total = total + (10*(this.monedero.getMonedasRestantes().get(String.valueOf(10))));
        total = total + (20*(this.monedero.getMonedasRestantes().get(String.valueOf(20))));
        total = total + (50*(this.monedero.getMonedasRestantes().get(String.valueOf(50))));

        return total;
    }
}
