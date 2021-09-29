/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanneravanzado;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author melola
 */
public class ScannerPro {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        
        System.out.println("Lector inicializado.....escribe algo por consola! \nSi pulsas enter el programa terminará de ejecutarse!!!!\n>>");
        String readString = "";
        System.out.println("Pulse ENTER para iniciar la aplicación!");
        
        while(readString!=null) {
                
            int i = 0;
            float f = 0.0f;    

            
            readString = scanner.nextLine();
            if (readString.isEmpty()) {
            
                // Verificando que es un número entero
                System.out.println("Ingrese un número entero:");
                if (scanner.hasNextInt()) {
                    i = scanner.nextInt();
                    System.out.println("El entero de entrada es:" + i);
                } else {
                    System.out.println("¡Datos incorrectos! No es un entero!!!!");
                    break;
                }    
                // Verificando que es un número decimal
                System.out.println("Ingrese un número decimal:");
                if (scanner.hasNextFloat()) {
                    f = scanner.nextFloat();
                    System.out.println("La entrada decimal es:" + f);
                } else {
                    System.out.println("¡Datos incorrectos! No es un decimal!!!!");
                    readString = null;
                }
                if (readString != null){
                    System.out.println("Si quieres salir escribe un 0:");
                    if (scanner.nextInt() == 0)
                        readString = null;
                }
            }
            else readString = null;
        }
    }
}
