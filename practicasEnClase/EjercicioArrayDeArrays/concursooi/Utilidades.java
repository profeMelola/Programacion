/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concursooi;

import java.util.Arrays;

/**
 *
 * @author melola
 */
public class Utilidades {

    /**
     * Método para meter notas de todos los concursantes
     *
     * @param notasConcursantes
     */
    public static void registrarNotasConcursantes(float[][] notasConcursantes) {
        //Inicializo con notas (no pido por consola, me lo ahorro, pero los alumnos sí)
        //Concursantes nivel bajo
        notasConcursantes[0][0] = 3;
        notasConcursantes[0][1] = 4;
        notasConcursantes[0][2] = 5.7f;

        //Concursantes nivel medio
        notasConcursantes[1][0] = 3.5f;
        notasConcursantes[1][1] = 8;
        notasConcursantes[1][2] = 5;
        notasConcursantes[1][3] = 7;

        //Concursantes nivel alto
        notasConcursantes[2][0] = 3.5f;
        notasConcursantes[2][1] = 2.8f;
        notasConcursantes[2][2] = 5;
        notasConcursantes[2][3] = 7;
        notasConcursantes[2][4] = 9;

    }

    /**
     * Método para ordenar notas por nivel y mostrarlas por pantalla en orden
     * descendente
     *
     * @param notasConcursantes
     */
    public static void mostrarNotasTodosNivelesOrdDesc(float[][] notasConcursantes) {
        for (int i = 0; i < notasConcursantes.length; i++) {
            if (i == 0) {
                System.out.println("Notas de concursantes de nivel bajo:");
            } else if (i == 1) {
                System.out.println("Notas de concursantes de nivel medio:");
            } else if (i == 2) {
                System.out.println("Notas de concursantes de nivel alto:");
            }

            //float[] notas = new float[notasConcursantes[i].length];
            float [] notas = notasConcursantes[i].clone();
            Arrays.sort(notas);
            System.out.println("\t Notas en orden ascendente (por defecto):" + Arrays.toString(notas));

            ordenarPorNotasDesc(notas);
            System.out.println("\t Notas en orden descendente" + Arrays.toString(notas));
        }
    }

    /**
     * ordenarPorNotasDesc: Se que el array que recibe como parámetro está ordenado de forma ascendente. Hago copia y voy machacando valores
     * @param notas
     */
    public static void ordenarPorNotasDesc(float[] notas) {
        float[] aux = Arrays.copyOf(notas, notas.length); //en vez de clonar hago un copyOf (otra forma)
        
        int i = 0;
        for (int j = aux.length - 1; j >= 0; j--) {
            notas[i] = aux[j];
            i++;
        }
        
    }

    /**
     * obtenerMejorNotaTodosNiveles
     * @param notasConcursantes 
     */
    public static void obtenerMejorNotaTodosNiveles(float[][] notasConcursantes) {
        for (int i = 0; i < notasConcursantes.length; i++) {

            float[] notas = new float[notasConcursantes[i].length];
            notas = notasConcursantes[i].clone();
            Arrays.sort(notas);
            ordenarPorNotasDesc(notas);
            
            if (i == 0) {
                System.out.println("Mejor nota del nivel bajo:"+notas[0]);
            } else if (i == 1) {
                System.out.println("Mejor nota del nivel medio:"+notas[0]);
            } else if (i == 2) {
                System.out.println("Mejor nota del nivel alto:"+notas[0]);
            }
            
        }
    }
}
