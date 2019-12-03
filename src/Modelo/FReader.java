package Modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Ariel May
 * @author Julio Cabrera
 * @author Emmanuel Rivero
 * @author Isaac Canche
 * @author Jose Suarez Clase para leer los archivos. Esta clase contiene tres
 * metodos. 1. Para crear el archivo, si este no existiera. 2. Regresa la ruta
 * del archivo. 3. Escribe en el archivo.
 */
public class FReader {

    /**
     *
     * @param nombre parametro lo cual es el nombre que llevara el archivo
     * @throws IOException exception de entrada y salida
     */
    public void crearArchivo(String nombre) throws IOException {
        File archivo = new File(this.getAbsolutPath() + "\\src\\" + nombre + ".txt");
        if (!archivo.exists()) {
            archivo.createNewFile();
        }
    }

    /**
     * metodo para otorgar la direccion
     *
     * @return una cadena con la direccion
     */
    public String getAbsolutPath() {
        return System.getProperty("user.dir");
    }

    /**
     *
     * @param cadena el parametro es lo que va a ir dentro del archivo, es decir
     * es la informacion
     * @param nombre es el nombre que se le va a dar al archivo
     * @throws IOException excepcion de tipo entrada y salida
     */
    public void escribirArchivo(String cadena, String nombre) throws IOException {
        FileWriter file = new FileWriter(this.getAbsolutPath() + "\\src\\" + nombre + ".txt", true);
        PrintWriter pw = new PrintWriter(file);
        pw.write(cadena);
        pw.close();
    }
}
