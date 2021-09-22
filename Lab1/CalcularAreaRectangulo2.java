/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculararearectangulo2;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class CalcularAreaRectangulo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int base;
        int altura;
        int area;
                
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Dame la base del rectángulo: ");
        base = lector.nextInt();
        
        System.out.print("Dame la altura del rectángulo: ");
        altura = lector.nextInt();
        
        area = base * altura;
        
        System.out.println("El area calculada: "+area);
        
    }
    
}
