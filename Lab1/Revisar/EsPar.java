/**
 * Revisar el uso del método de Sccanner directamente en la instanciación
 * Revisar inicialización de boolean sin el if
 */
import java.util.*;
public class EsPar {
   public static void main(String[] args) {
      int numero;
      System.out.print("Escriba un número: ");
      numero = new Scanner(System.in).nextInt();
      boolean esPar = (numero % 2) == 0; 
      System.out.println("Es par: " + esPar);
   }
}
