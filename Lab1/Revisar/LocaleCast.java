/**
 * Revisar el uso de Locale en Scanner
 * Revisar el Type Casting (https://www.educative.io/edpresso/how-to-convert-a-double-to-int-in-java)
 */
import java.util.Locale;
import java.util.Scanner;

public class LocaleCast {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in).useLocale(Locale.US);
      System.out.println("Longitud del lanzamiento (en metros con 3 decimales): ");
      double metros = sc.nextDouble();
      int centimetros = (int) (metros * 100);
      System.out.println("En centímetros enteros: " + centimetros);
   }
}
