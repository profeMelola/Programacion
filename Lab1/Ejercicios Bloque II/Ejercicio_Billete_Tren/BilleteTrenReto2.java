/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billetetren;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class BilleteTrenReto2 {
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarando variables
        final int precioBillete = 2;
        int edad = 0;
        int precioFinalBillete = 0;
        
        int contador = 1;
        int limite = 0;
        
        Scanner sc= new Scanner(System.in);
        
        // Pidiendo el límite y controlando que sea mayor que cero
        do{
            System.out.println("Introduce el límite de ventas de billetes: ");
            limite = sc.nextInt();

            if (limite == 0) 
                System.out.println("Valor introducido incorrecto");
            
        }while (limite <= 0);
        
        // Buble de la venta de billetes
        while ( contador <= limite){
        
            System.out.println("***************************");
            System.out.println("*Billete numero "+contador);
            //Pedir la edad al usuario
            System.out.print("Introduce tu edad: ");
            edad=sc.nextInt();

            if (contador % 5 == 0){
                precioFinalBillete = 0;
                System.out.println("Qué suerte, promoción especial!!!!");
            }
            else{
                
                //Comprobando condiciones para aplicar precio final al billete
                if (edad < 8) {
                    precioFinalBillete = 0;
                }
                else if (edad >= 8 && edad <=17){
                    precioFinalBillete = precioBillete / 2;
                }
                else if (edad >=18 && edad <=64){
                    precioFinalBillete = precioBillete;
                }
                else if (edad > 64) {
                    precioFinalBillete = 0;
                }
            }
            System.out.println("El precio final de tu billete es: "+precioFinalBillete);
            System.out.println("***************************");
            contador++;
        }
    }    
}
