/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebacontrol1;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class PruebaControl1_v2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumatorioPositivos = 0;
        int num2Dig = 0;
        int num = 0;

        do {
            System.out.println("Introduce un número:");
            num = sc.nextInt();

            if (num > 0) {
                sumatorioPositivos += num;

                if (num >= 10 && num <= 99) {
                    num2Dig++;
                }
            }

        } while (num > 0);
        
        System.out.println("El sumatorio de positivos es:"+sumatorioPositivos);
        System.out.println("La cantidad de dos dígitos es:"+num2Dig);
    }
}
