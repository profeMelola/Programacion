/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notasalumnosmejora3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author melola
 */
public class Notas {

    public static void crearMatrizNotas(double[][] notasAlumnos, Scanner sc) {
        for (int i = 0; i < notasAlumnos.length; i++) {
            System.out.println("\t*Indica el número de notas del alumno <" + (i + 1) + ">");
            int numNotas = sc.nextInt();
            double[] notas = new double[numNotas];
            notasAlumnos[i] = notas;
        }
    }
    
    public static void guardarNotasAlumnos(double[][] notasAlumnos, Scanner sc){
        for (int i= 0 ; i < notasAlumnos.length; i++){
            System.out.println("Notas del alumno "+ (i+1));
            for (int j=0; j < notasAlumnos[i].length;j++){
                System.out.println("\tEscribe la nota <"+(j+1)+"> :");
                notasAlumnos[i][j] = sc.nextDouble();
            }
        }
    }
    
    public static void pintaNotasAlumnos(double[][] notasAlumnos){
        int contador=1;
        for (double[] alumno: notasAlumnos){
            System.out.println("*Notas del alumno "+contador);
            System.out.println(Arrays.toString(alumno));
            contador++;
        }
    }
    
    public static double obtenerNotaMediaAlumno(double[][] notasAlumnos, Scanner sc){
        System.out.println("* Escribe el número del alumno del que quieres obtener la nota media:");
        int numAlumno = sc.nextInt();
        
        double[] notas = notasAlumnos[numAlumno - 1];
        
        return obtenerMedia(notas);
    }
    
    public static void obtenerTodasLasNotasMedias(double[][] notasAlumnos){
        //cada fila es un array con las notas de cada alumno
        for(int i=0; i< notasAlumnos.length; i++){
            double[] notasAlumno = notasAlumnos[i];
            double media = obtenerMedia(notasAlumno);
            //System.out.println("* Nota media del alumno <"+(i+1)+"> es: "+media);
            System.out.printf("* Nota media del alumno <%d> es %.2f%n ",i+1,media);
        }
    }

    public static double obtenerMedia(double[] notas){
        
        double media,suma = 0;
        //así recorro las notas de cada alumno y las sumo
        for (int i=0; i< notas.length; i++){
            suma += notas[i];
        }
        
        media = suma / notas.length;
        
        return media;
        
    }
}
