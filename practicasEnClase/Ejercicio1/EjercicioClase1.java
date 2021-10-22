package ejercicioclase1;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class EjercicioClase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int A,B;
        int contadorPares = 0;
                
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe el número A:");
        A = sc.nextInt();
        
        do{
            System.out.println("Escribe el número B:");
            B = sc.nextInt();
        }while( B <= A );
        
        System.out.println("* Los números desde A a B son:");
        for(int i=A; i <= B; i++){
            System.out.println(i);
            //controlar si el número es par
            if ( i % 2 == 0){
                //contadorPares = contadorPares + 1;
                contadorPares++;
            }
        }
        System.out.println("* El número de números pares es:"+contadorPares);
        
    }
    
}
