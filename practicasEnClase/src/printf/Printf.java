/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printf;

/**
 *
 * @author melola
 */
public class Printf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ejemplo 1
        double n = 1.25036;
        System.out.printf("Decimal %.3f %n", n);

        //ejemplo 2
        n = 1.25036;
        int x = 10;
        
        System.out.printf("n = %.2f x = %d %n", n, x);
        System.out.printf("n = %.2f x = %d \n", n, x);
        
        System.out.println("n = "+n+" x = "+x);
        
        //ejemplo 3
        System.out.printf("%-10s", "Total:");        
        n = 1.25036;
        System.out.printf("Decimal %.3f %n", n);        
    }

}
