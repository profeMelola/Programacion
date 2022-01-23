/*
 * ¿Cúal es la sumatoria de los múltiplos de 3 o de 5 menores que 1000?
 */
package reto1;

/**
 *
 * @author melola
 */
public class Reto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int sumatorio = 0;
        for (int i=0; i< 1000;i++){
            if (i%3 == 0 || i% 5 == 0)
                sumatorio += i;
        }
        
        // Otra solución con for con incrementos de 3 y 5
        //for (int i=3; i<1000; i+= 3)
        //for (int i=5; i<1000; i+= 5)
        
        
        System.out.println("Resultado de la sumatorio de múltiplos de 3 y 5 de los 1000 primeros números:"+sumatorio);
    }
    
}
