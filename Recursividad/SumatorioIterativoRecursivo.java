/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumatorioiterativorecursivo;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class SumatorioIterativoRecursivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num = leerDatoEntero(teclado, "Introduce un número entero:");
        //leerOtroDato(teclado);

        int suma = 0;

        // Sumatorio iterativo
        suma = sumatorioIterativo(num);
        System.out.println("\nEl sumatorio iterativo de 1 a " + num + " es " + suma);

        // Sumatorio recursivo (caso 1)
        suma = sumatorioRecursivo(num);
        System.out.printf("%nEl sumatorio recursivo de 1 a %d es %d%n", num, suma);

        // Sumatorio recursivo (caso 2)
        suma = sumatorioRecursivo2(num);
        System.out.printf("%nEl sumatorio recursivo (2) de 1 a %d es %d%n", num, suma);

        teclado.close();

    }

    /**
     * sumatorioRecursivo Caso 1: condición de parada (num == 1)
     *
     * @param num
     * @return
     */
    private static int sumatorioRecursivo(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + sumatorioRecursivo(num - 1);
        }
    }

    /**
     * sumatorioRecursivo2
     * Caso 2: condición de parada (al estilo del ejercicio de la multiplicación recursiva)
     * @param num
     * @return 
     */
    private static int sumatorioRecursivo2(int num) {

        if (num >= 0) {
            return num + sumatorioRecursivo(num - 1);
        }else return 1;

        // Así también funcionaría igual
        /*if (num >= 0) {
            return num + sumatorioRecursivo(num - 1);
        }
        return 1;*/
        
    }

    /**
     * sumatorioIterativo
     *
     * @param num
     * @return
     */
    private static int sumatorioIterativo(int num) {
        int sumatorio = 0;
        for (int i = 1; i <= num; i++) {
            sumatorio += i;
        }

        return sumatorio;
    }

    /**
     * leerDatoEntero
     *
     * @param teclado
     * @return
     */
    private static int leerDatoEntero(Scanner teclado) {
        //Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número entero, majete:");

        return teclado.nextInt();
        //teclado.close();  
    }

    /**
     * leerDatoEntero
     *
     * @param teclado
     * @param mensaje
     * @return
     */
    private static int leerDatoEntero(Scanner teclado, String mensaje) {
        //Scanner teclado = new Scanner(System.in);
        System.out.println(mensaje);

        return teclado.nextInt();
        //teclado.close();  
    }

    /**
     * leerOtroDato
     *
     * @param teclado
     */
    private static void leerOtroDato(Scanner teclado) {
        //Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número entero dos:");
        int num = teclado.nextInt();

    }

}
