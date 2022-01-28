/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Retos;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class Reto2 {
    
    public static void main(String[] args) {
        int contador3 = 0;
        int contador2 = 0;
        int sumatorio = 0;
        int consecutivo = 1;
        int valorIni = 0;
        int numero = 0;
        boolean primeraVez = true;
        
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("* Escribe un valor entero: ");
            numero = sc.nextInt();
            
            //controlar 2 y 3
            if (numero == 2)
                contador2++;
            else if (numero == 3)
                contador3++;
            
            // controlar consecutivos
            if (primeraVez){
                valorIni = numero;
                primeraVez=false;
                consecutivo++;
            }
            else if (valorIni == numero)
                consecutivo++;
            else{
                consecutivo = 1;
                valorIni = numero;
            }
            
            // siempre sumo
            sumatorio+=numero;
                      
        }while ( !(contador3 == 3 || contador2 == 2 || sumatorio > 100 || consecutivo == 8) );
        
        System.out.println("FIN!!!!");
    }
    
}