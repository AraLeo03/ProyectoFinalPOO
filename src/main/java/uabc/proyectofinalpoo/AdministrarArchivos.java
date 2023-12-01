/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.proyectofinalpoo;

import java.io.*;
import java.util.ArrayList;

/**
 *  Clase que crea, lee y escribe(modificar o sobreescribir) archivos de texto plano.
 * @author Leonel Araujo 1182833
 */
public class AdministrarArchivos {

    /**
     * Metodo que recibe un nombre de archivo como parametro
     * trata de crearlo con ese nombre, verifica si ya existe el archivo
     * y maneja posibles errores.
     * @param nombreArchivo 
     */
    public static void crearArchivo(String nombreArchivo) {
        try {
            File archivo = new File(nombreArchivo);
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + nombreArchivo);
            } else {
                System.out.println("El archivo ya existe.");
            }
        } catch (IOException e) {
            System.err.println("Error al crear el archivo: " + e.getMessage());
        }
    }

    /**
     * Metodo que recibe un nombre de archivo como parametro
     * lee el contenido de un archivo linea por linea
     * construye una cadena con todas las lineas y la devuelve.
     * @param nombreArchivo
     * @return 
     */
    public static String leerArchivo(String nombreArchivo) {
        StringBuilder contenido = new StringBuilder();
        try {
            FileReader reader = new FileReader(nombreArchivo);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                contenido.append(linea).append("\n");
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        return contenido.toString();
    }
    
    /**
     * Metodo que que recibe el nombre de un archivo, el texto de un archivo
     * y la opcion de sobreescribir o añadir el texto en un archivo como parametros.
     * @param nombreArchivo
     * @param textoArchivo
     * @param agregarContenido 
     */
    public static void escribirArchivo(String nombreArchivo, ArrayList<String> textoArchivo, boolean agregarContenido) {
        try {
            FileWriter writer = new FileWriter(nombreArchivo, agregarContenido);
            try (BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
                for (String linea : textoArchivo) {
                    bufferedWriter.write(linea);
                    bufferedWriter.newLine();
                }
            }
            System.out.println("Archivo actualizado correctamente.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}

