import java.util.Scanner;

public class Main {

   public static void Modulo(String[] args) {
      Scanner sc;
      sc = new Scanner(System.in);
      System.out.println("Escriba una cantidad de segundos: ");
      int segundos = sc.nextInt();
      int minutos = segundos / 60;
      segundos %= 60;
     //es lo mismo que ==> segundos = segundos % 60;
      
      int horas = minutos / 60;
      minutos %= 60;
      
      System.out.println("Horas: " + horas);
      System.out.println("Minutos: " + minutos);
      System.out.println("Segundos: " + segundos);
   }
}
