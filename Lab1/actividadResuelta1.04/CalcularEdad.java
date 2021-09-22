/**
 * Programa que calcula la edad en función del año de nacimiento y el año actual
 * Pedirá dos datos: el año de nacimiento y el año actual (ambos de tipo entero)
 * Devolverá la edad por consola
 */
import java.util.Scanner;
public class CalcularEdad2 {
   public static void main(String[] args) {
      int aActual;
      int aNacimiento;
      int edad;
      Scanner sc = new Scanner(System.in);
      System.out.print("Año de nacimiento: ");
      aNacimiento = sc.nextInt();
      System.out.print("Año actual: ");
      aActual = sc.nextInt();
      edad = aActual - aNacimiento;
      System.out.println("Su edad es: " + edad + " años.");
   }
}
