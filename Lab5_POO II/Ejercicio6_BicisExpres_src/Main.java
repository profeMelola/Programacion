package aplicacion8.pkg13;

//probamos la clase CajaCarton
public class Main {

   public static void main(String[] args) {
      Caja a = new CajaCarton(100, 200, 200);
      a.etiqueta = "Dirección envío"; 
      System.out.println(a);
      System.out.println("Volumen: " + a.getVolumen());
      
      CajaCarton b = new CajaCarton(50.6, 75.5, 100);
      b.etiqueta = 23; 
      System.out.println(b);
      System.out.println("Volumen: " + b.getVolumen());
   }
}
