/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aleatorios.random;

import java.util.Random;

/**
 *
 * @author melol
 */
public class Aleatorio03 {

    public static void main(String args[]) {
        // Crear el código de un programa que genera tres números enteros aleatorios a, b, c, 
        // comprendidos entre 65 y 90, ambos inclusive.
        int a, b, c;
        Random rnd = new Random();
        
        //FÓRMULA: rnd.nextInt( (max - min) + 1 ) + min
        a = (rnd.nextInt(26) + 65);
        b = (rnd.nextInt(26) + 65);
        c = (rnd.nextInt(26) + 65);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
