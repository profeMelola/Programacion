/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lineacomandosapp;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author melol
 */
public class OrdenarNumsConsola {

    static final int NUMEROS = 3;

    public static void main(String args[]) {

        //Integer[] numeros = new Integer[NUMEROS];
        int[] numeros = new int[NUMEROS];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < NUMEROS; i++) {
            System.out.format("Introduce el número %d\n", i + 1);
            numeros[i] = scan.nextInt();

        }

        scan.close();

        //Arrays.sort(numeros, Collections.reverseOrder());
        int[] numeros2 = Arrays.copyOf(numeros, numeros.length);
        Arrays.sort(numeros2);
        
        for (int i = 0; i < numeros2.length; i++) {
            System.out.format("Número %d\n", numeros2[i]);
        }

    }
}
