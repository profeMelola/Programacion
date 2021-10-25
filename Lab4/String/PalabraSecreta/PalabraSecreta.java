/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palabrasecreta;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class PalabraSecreta {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        // TODO code application logic here
        
        //nos vamos de tapeo
        /*String palabra1 = "jamón";
        String palabra2 = "anchoa";
        String palabra3 = "vino";
        String palabra4 = "aceitunas";*/
        
        String[] palabras = {"jamón","anchoa","vino", "aceitunas"};
        
        char[] palabraSecreta = new char[4];
        
        /*
        // solución 1 sin array de String
        palabraSecreta[0] = palabra1.charAt(0);
        palabraSecreta[1] = palabra2.charAt(0);
        palabraSecreta[2] = palabra3.charAt(0);
        palabraSecreta[3] = palabra4.charAt(0);*/
        
        /*
        // solución 2 con array de String (sin bucle)
        palabraSecreta[0] = palabras[0].charAt(0);
        palabraSecreta[1] = palabras[1].charAt(0);
        palabraSecreta[2] = palabras[2].charAt(0);
        palabraSecreta[3] = palabras[3].charAt(0);
        */
        
        // solución 3 con array de String (con bucle)
        for (int i=0;i<palabras.length;i++){
            palabraSecreta[i] = palabras[i].charAt(0);
        }
        
        String palabraSecretaString = String.valueOf(palabraSecreta);
        System.out.println("[SECRET] La palabra secreta es:"+palabraSecretaString);
        
        String palabraSecretaUsuario = "";
        
        Scanner sc = new Scanner(System.in);
        boolean acertado = false;
        
        do{
            
            System.out.println("Escribe la palabra secreta:");
            palabraSecretaUsuario = sc.nextLine();

            if (palabraSecretaString.equalsIgnoreCase(palabraSecretaUsuario) ){
                System.out.println("Has acertado!!!!");
                acertado = true;
            }
            else{
                System.out.println("Inténtalo de nuevo....");
            }
            
        }while(!acertado);
        
       
    }
        
}
