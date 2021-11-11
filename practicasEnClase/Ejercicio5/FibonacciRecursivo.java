/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonaccirecursivo;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class FibonacciRecursivo {
	
	public static void main(String[] args) {
		 
        Scanner sc = new Scanner(System.in);
        System.out.print("[FIBONACCI RECURSIVO] Introduce el número de elementos a mostrar de la serie: ");
        int limite = sc.nextInt();
        sc.close();

        for(int i = 0; i<limite; i++){
             System.out.print(funcionFibonacci(i) + ", ");
        }
   }

   private static int funcionFibonacci(int num){
        if(num == 0 || num==1)
             return num;
        else
             return funcionFibonacci(num-1) + funcionFibonacci(num-2);
   }
}