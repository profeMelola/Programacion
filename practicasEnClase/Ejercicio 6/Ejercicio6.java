/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author melola
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ------------------------------------------------------
        // CASO 1
        //int cont = 0;
        
        //Primera forma
        /*for (int i=0; i<=100; i += 7){
            if ( i != 0){
                System.out.print(i+" ");
                cont++;
            }
        }
        System.out.println("\n");
        System.out.println("Número de múltiplos de 7: "+cont);
        */
        
        /*System.out.println("\n");
        //Primera forma
        for (int i=0; i<=100; i += 5){
            if ( i != 0)
                System.out.print(i+" ");
        }        
        
        System.out.println("\n");
        //segunda forma
        for (int i=0; i<=100; i++){
           
            if ( i % 7 == 0)
                System.out.print(i +" ");
        }*/
        // ------------------------------------------------------
        
        // ------------------------------------------------------
        // CASO 2
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el múltiplo que quieres usar: ");
        int multiplo = sc.nextInt();
        
        System.out.println("Escribe el límite: ");
        int limit = sc.nextInt();
        
        int numMulti = contarMulti(multiplo,limit);
        
        System.out.println("El número de múltiplos de "+multiplo+" entre 0 y "+limit+" es: "+numMulti);*/
        // ------------------------------------------------------
        // CASO 3
        String multiploCadena = JOptionPane.showInputDialog("Escribe el múltiplo que quieres usar: ");
        
        String limiteCadena = JOptionPane.showInputDialog("Escribe el límite:");
        
        int multiplo = Integer.parseInt(multiploCadena);
        int limit = Integer.parseInt(limiteCadena);
        
        int numMulti = contarMulti(multiplo,limit);
        JOptionPane.showMessageDialog(null,"El número de múltiplos de "+multiplo+" entre 0 y "+limit+" es: "+numMulti);
        
        
        
    }
    
    /**
     * 
     * @param multi
     * @param limite
     * @return 
     */
    public static int contarMulti(int multi, int limite){
        int cont = 0;
        for (int i=0; i<=limite; i += multi){
            if ( i != 0){
                //System.out.print(i+" ");
                cont++;
            }
        }
        return cont;
    }
    
    
    
}
