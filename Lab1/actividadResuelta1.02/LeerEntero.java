import java.util.Scanner;
public class LeerEntero{
   public static void main(String[] args) {
      int num; 
      System.out.print("Escriba un número: "); 
      Scanner sc = new Scanner(System.in);
      num = sc.nextInt(); 
      System.out.println("Valor introducido: " + num); 
   }
}
