/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aleatorios.random;

import java.util.Iterator;
import java.util.Random;
import java.util.stream.IntStream;

/**
 *
 * @author melol
 */
public class Aleatorio04 {

    public static void main(String args[]) {

        // ---------------------------------------------------
        // PRIMERA FORMA
        // Instanciar clase Random
        Random random = new Random();

        // Obtener IntStream. El IntStream tendrá 10 números aleatorios
        // entre 1 y 7, excluido el 7
        IntStream intStream = random.ints(10, 1, 7);

        // Iterador para ir obteniendo los números
        Iterator iterator = intStream.iterator();

        // Sacamos los números aleatorios por pantalla, en un bucle.
        System.out.println("* Primera Forma:");
        while (iterator.hasNext()) {
            System.out.println("Random Number " + iterator.next());
        }

        // --------------------------------------------------------
        // SEGUNDA FORMA
        Random random2 = new Random();
        intStream = random2.ints(10, 1, 7);

        System.out.println("* Segunda Forma:");
        intStream.forEach(value -> System.out.println("Random Number " + value));
        // --------------------------------------------------------
        
        // --------------------------------------------------------
        // TERCER EJEMPLO
        Random random3 = new Random();
        intStream = random2.ints(10, 2, 5);

        System.out.println("* Aleatorios entre 2 y 4 (ambos incluidos):");
        intStream.forEach(value -> System.out.println("Random Number " + value));
        // --------------------------------------------------------
        
    }
}
