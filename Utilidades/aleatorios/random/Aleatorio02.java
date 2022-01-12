/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aleatorios.random;

import java.util.Random;

/**
 *
 * @author melol
 */
public class Aleatorio02 {
    
    public static void main(String args[]){
        Random r1 = new Random();
        int aleatorio = 0;
        
        for (int i = 0; i < 20; i++){
            aleatorio = r1.nextInt(6);
            System.out.println("Aleatorio entre 0 y 5:"+aleatorio);

        }
        
        System.out.println("**************");

        for (int i = 0; i < 20; i++){
            aleatorio = r1.nextInt(6)+1;
            System.out.println("Aleatorio entre 1 y 6:"+aleatorio);
        }
        
    }
}
