/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fibonaccirecursivo;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class FibonacciIterativo {

    /*public static void main(String[] args) {
        fibonacci(9);
    }*/
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("[FIBONACCI ITERATIVO]Introduce el número de elementos a mostrar de la serie: ");
        int limite = sc.nextInt();
        sc.close();

        fibonacci(limite);

    }

    public static void fibonacci(int limite) {
        int siguiente = 1, actual = 0, temporal = 0;
        for (int x = 1; x <= limite - 1; x++) {
            System.out.print(actual + ", ");
            temporal = actual;
            actual = siguiente;
            siguiente = siguiente + temporal;
        }
        // Si no quieres imprimirla, comenta la siguiente línea:
        System.out.println(actual);
    }
}
