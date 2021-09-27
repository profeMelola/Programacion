/**
 * Revisar operador ternario y -=
 */
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      final double PRECIO_INFANTIL = 15;
      final double PRECIO_ADULTO = 20;
      int numEntradasInfantiles;
      int numEntradasAdulto;
      Scanner sc = new Scanner(System.in);
      System.out.println("Cantidad de entradas infantiles: ");
      numEntradasInfantiles = sc.nextInt();
      System.out.println("Cantidad de entradas adulto: ");
      numEntradasAdulto = sc.nextInt();
      double importeTotal = numEntradasInfantiles * PRECIO_INFANTIL +
                            numEntradasAdulto     * PRECIO_ADULTO;
      System.out.println("Importe entradas: " + importeTotal);
      double descuento = importeTotal >= 100 ? importeTotal*5.0/100.0: 0;
      System.out.println("Descuento: " + descuento);
      importeTotal -= descuento;
      System.out.println("Importe final: " + importeTotal);
   }
}
