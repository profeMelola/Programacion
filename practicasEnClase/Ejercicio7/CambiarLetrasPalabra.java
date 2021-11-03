/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cambiarletraspalabra;

import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author melola
 */
public class CambiarLetrasPalabra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //JOptionPane.showMessageDialog(null,"INIT");
        
        String palabra = JOptionPane.showInputDialog("Introduce la palabra:");
        
        //convierto el String a un array de char
        char[] letras = palabra.toCharArray();

        //Muestro por pantalla la palabra original (usando el array de char)
        System.out.println("La palabra original es: "+Arrays.toString(letras));
        //System.out.println("La palabra original es (posición memoria): "+letras); //CUIDADÍN!!!! devuelve posición de memoria
        //pintaArrayDeChars(letras); //otra forma para pintar el contenido del array a la forma clásica
        
        //llamo al método para cambiar las letras
        cambiaLetras(letras);
        
        //Muestro por pantalla la palabra cambiada
        JOptionPane.showMessageDialog(null,"La palabra con las letras cambiadas es: "+Arrays.toString(letras));
        System.out.println("La palabra original es: "+Arrays.toString(letras));
    }
    
    /**
     * 
     * @param array 
     */
    public static void pintaArrayDeChars(char[] array){
        for (int i=0; i<array.length;i++)
            System.out.print(array[i]);
        
        System.out.println("\n");
    }
    
    /**
     * 
     * @param letras 
     */
    public static void cambiaLetras(char[] letras){
        
        //calculo las dos posiciones a cambiar de forma aleatoria
        Random aleatorio = new Random();
        int n1 = aleatorio.nextInt(letras.length);
        int n2 = aleatorio.nextInt(letras.length);
        while (n1 == n2)
            n2 = aleatorio.nextInt(letras.length);
        
        //PENDIENTE!!! Hacer comprobación para que los dos caracteres sean diferentes
        //Por ejemplo la palabra CURRO y las posiciones 2 y 3: el intercambio daría la misma palabra
        
        
        //cambio las letras
        JOptionPane.showMessageDialog(null,"Cambiando la posición "+n1+" por "+n2);
        System.out.println("Cambiando la posición "+n1+" por "+n2);
        char letraAux = letras[n1];
        letras[n1] = letras[n2];
        letras[n2] = letraAux;
        
    }
    
    
}