import java.util.Scanner;
public class Main {
   public static void CalculaEdadProxYear(String[] args) {
      int edad; 
      Scanner sc = new Scanner(System.in);
      System.out.print("Escriba su edad: ");
      edad = sc.nextInt();
      edad = edad + 1; 
      System.out.println("El próximo año su edad será: " + edad + " años");
   }
}
