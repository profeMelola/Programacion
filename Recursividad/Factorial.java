/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class Factorial {

    public static void main(String[] args) {
        
        int numero = leerNumero();
        
        while (numero > -1) {
            mostrarFactorial(numero);
            numero = leerNumero();
        }
        
        System.out.println("\nFin del programa");
    }

    /**
     * mostrarFactorial
     *
     * @param num
     */
    private static void mostrarFactorial(int num) {
        System.out.printf("%n%d! = ", num);
        int fact = 1;
        if (num != 0) {
            for (int i = num; i > 0; i--) {
                fact *= i;
                System.out.print(i);
                if (i > 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" = ");
                }
            }
        }
        System.out.println(fact + "\n");
    }

    /**
     * leerNumero
     *
     * @return
     */
    private static int leerNumero() {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número (negativo para terminar): ");
        num = sc.nextInt();
        return num;
    }
    
}
