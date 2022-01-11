package aleatorios.math;
/**
 * Generación de números aleatorios.
 *
 */
public class Aleatorio05 {
  public static void main(String[] args) {

    System.out.println("\n20 números aleatorios entre 50 y 60 (con decimales):");
    
    for (int i = 1; i <= 20; i++) {
      System.out.print(Math.random()*(60 - 50+1)+50 +"  ");
    }
    
    System.out.println("20 números aleatorios entre 50 y 60 (sin decimales I):");
    
    for (int i = 1; i <= 20; i++) {
      System.out.print(Math.floor(Math.random()*(60 - 50+1)+50) +"  ");
    }
    
    System.out.println("\n20 números aleatorios entre 50 y 60 (sin decimales II):");
    
    for (int i = 1; i <= 20; i++) {
      System.out.print((int)(Math.random()*(60 - 50+1)+50) +"  ");
    }

    System.out.println();
  }
}
