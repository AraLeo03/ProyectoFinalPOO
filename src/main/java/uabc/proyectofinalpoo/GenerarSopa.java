/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.proyectofinalpoo;

import java.util.ArrayList;
import java.util.Random;

/**
 * Clase que recibe un arraylist con palabras, genera la sopa de letras y
 * regresa una matriz de 15x15 con las palabras revueltas
 *
 * @author Leonel Araujo 1182833
 */
public class GenerarSopa {

    /**
     * Metodo que devuelve un caracter aleactorio seleccionado de una cadena
     * predefinida.
     * @return 
     */
    public static char generarCaracterAleatorio() {
        String caracteresPermitidos = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ0123456789";
        Random rmd = new Random();
        return caracteresPermitidos.charAt(rmd.nextInt(caracteresPermitidos.length()));
    }

    public static char[][] llenarSopa(char sopa[][]) {
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                if(sopa[i][j] == '\0'){
                    sopa[i][j] = generarCaracterAleatorio();
                }
            }
        }

        return sopa;
    }

    /**
     * Metodo que crea y devuelve una sopa de letras y la devuelve como
     * matriz 15x15 que recibe como parametro un arraylist de palabras
     * @param palabras
     * @return 
     */
    public static char[][] generarSopa(ArrayList<String> palabras) {
        char sopa[][] = new char[15][15];
        int divisor = 0;
        for (String palabra : palabras) {
            switch (divisor) {
                case 0:
                    escribirPalabraAbajoArriba(sopa, palabra);
                    break;
                case 1:
                    escribirPalabraDerechaIzquierda(sopa, palabra);
                    break;
                default:
                    escribirPalabraDiagonalAbajoArriba(sopa, palabra);
                    divisor=0;
                    break;
            }
            divisor++;
        }
        llenarSopa(sopa);

        return sopa;
    }

    
    /**
     * Metodo que recibe una matriz de caracteres y una palabra como parametro
     * la escribe en una matriz de caracteres en sentido vertical 
     * de abajo hacia arriba comprobando si la posicion es valida
     * si no es valida busca otra posicion
     * @param matriz
     * @param palabra 
     */
    public static void escribirPalabraAbajoArriba(char[][] matriz, String palabra) {
        Random random = new Random();

        // Obtener una posición aleatoria
        int fila = random.nextInt(matriz.length);
        int columna = random.nextInt(matriz[0].length);

        // Verificar si es posible escribir la palabra desde esa posición
        if (esPosicionValida(matriz, fila, columna, palabra.length(), true)) {
            for (int i = 0; i < palabra.length(); i++) {
                matriz[fila - i][columna] = palabra.charAt(i);
            }
        } else {
            // Volver a intentar con una nueva posición
            escribirPalabraAbajoArriba(matriz, palabra);
        }
    }
    
    /**
     * Metodo que recibe una matriz de caracteres y una palabra como parametro
     * la escribe en una matriz de caracteres en sentido horizontal 
     * de derecha a izquierda comprobando si la posicion es valida
     * si no es valida busca otra posicion
     * @param matriz
     * @param palabra 
     */
    public static void escribirPalabraDerechaIzquierda(char[][] matriz, String palabra) {
        Random random = new Random();

        int fila = random.nextInt(matriz.length);
        int columna = random.nextInt(matriz[0].length);

        // Intentar encontrar una posición válida para escribir la palabra
        while (!esPosicionValidaDerechaIzquierda(matriz, fila, columna, palabra.length(),palabra)) {
            fila = random.nextInt(matriz.length);
            columna = random.nextInt(matriz[0].length);
        }

        // Escribir la palabra de derecha a izquierda en la matriz
        for (int i = 0; i < palabra.length(); i++) {
            matriz[fila][columna - i] = palabra.charAt(i);
        }
    }
    
    /**
     * Metodo que recibe una matriz de caracteres y una palabra como parametro
     * la escribe en una matriz de caracteres en sentido diagonal 
     * de abajo hacia arriba y de derecha a izquierda comprobando si la posicion
     * es valida si no es valida busca otra posicion
     * @param matriz
     * @param palabra 
     */
    public static void escribirPalabraDiagonalAbajoArriba(char[][] matriz, String palabra) {
        Random random = new Random();

        int fila = random.nextInt(matriz.length - palabra.length() + 1);
        int columna = random.nextInt(matriz[0].length - palabra.length() + 1);

        // Intentar encontrar una posición válida para escribir la palabra en diagonal
        while (!esPosicionValidaDiagonalAbajoArriba(matriz, fila, columna, palabra.length())) {
            fila = random.nextInt(matriz.length - palabra.length() + 1);
            columna = random.nextInt(matriz[0].length - palabra.length() + 1);
        }

        // Escribir la palabra en diagonal de abajo hacia arriba y de derecha a izquierda
        for (int i = 0; i < palabra.length(); i++) {
            matriz[fila + i][columna + i] = palabra.charAt(palabra.length() - 1 - i);
        }
    }
    
    /**
     * Metodo que verifica si es posible escribir una palabra
     * en sentido diagonal de abajo hacia arriba y de derecha a izquierda
     * @param matriz
     * @param fila
     * @param columna
     * @param longitud
     * @return 
     */
    public static boolean esPosicionValidaDiagonalAbajoArriba(char[][] matriz, int fila, int columna, int longitud) {
        if (fila + longitud > matriz.length || columna + longitud > matriz[0].length) {
            return false; // La palabra se sale de los límites de la matriz
        }

        // Verificar si la palabra cruza con otras
        for (int i = 0; i < longitud; i++) {
            if (matriz[fila + i][columna + i] != '\0') {
                return false; // La palabra cruza con otra
            }
        }

        return true;
    }
    
    /**
     * Metodo que verifica si es posible escribir una palabra
     * en sentido horizontal de derecha a izquierda
     * @param matriz
     * @param fila
     * @param columna
     * @param longitud
     * @param palabra
     * @return 
     */
    public static boolean esPosicionValidaDerechaIzquierda(char[][] matriz, int fila, int columna, int longitud,String palabra) {
        if (columna - longitud < 0 || columna >= matriz[0].length) {
            return false; // La palabra se sale de los límites de la matriz
        }

        // Verificar si la palabra cruza con otras
        for (int i = 0; i < longitud; i++) {
            if (matriz[fila][columna - i] != '\0' && matriz[fila][columna - i] != palabra.charAt(i)) {
                return false; // La palabra cruza con otra y no hay coincidencia de caracteres
            }
        }

        return true;
    }

    /**
     * Metodo que verifica si es posible escribir una palabra
     * en sentido vertical de abajo hacia arriba
     * @param matriz
     * @param fila
     * @param columna
     * @param longitud
     * @param haciaArriba
     * @return 
     */
    public static boolean esPosicionValida(char[][] matriz, int fila, int columna, int longitud, boolean haciaArriba) {
        if (fila - longitud < 0 || fila >= matriz.length || columna < 0 || columna >= matriz[0].length) {
            return false; // La posición está fuera de los límites de la matriz
        }

        if (haciaArriba) {
            for (int i = 0; i < longitud; i++) {
                if (matriz[fila - i][columna] != '\0') {
                    return false; // La posición ya está ocupada
                }
            }
        } else {
            for (int i = 0; i < longitud; i++) {
                if (matriz[fila + i][columna] != '\0') {
                    return false; // La posición ya está ocupada
                }
            }
        }

        return true;
    }

    /**
     * Metodo que se encarga de mostrar la matriz de caracteres
     * que recibe como parametros y la regresa como una cadena
     * @param sopa
     * @return 
     */
    public static String mostrarSopa(char sopa[][]) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < sopa.length; i++) {
            for (int k = 0; k < sopa.length; k++) {
                sb.append(" ").append(sopa[i][k]);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
