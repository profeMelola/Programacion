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
public class Aleatorio01 {
    
    public static void main(String args[]){
        Random r1 = new Random();
        System.out.println("r1:"+r1.nextInt());
        
        Random r2 = new Random(4234); //Usando la misma semilla
        System.out.println("r2:"+r2.nextInt());
        Random r3 = new Random(4234); // r2 y r3 darán la misma secuencia.        
        System.out.println("r3:"+r3.nextInt());
    }
}
