/**
 * Para revisar inicialización de booleanos y operaciones lógicas
 *
 */
public class Booleanos {
   public static void main(String[] args) {
      boolean llueve, finalizadoTareas, irBiblioteca;
      Scanner sc = new Scanner(System.in);
      System.out.println("¿Está lluviendo? (true/false)");
      llueve = sc.nextBoolean();
      System.out.println("¿Has finalizado tus tareas? (true/false)");
      finalizadoTareas = sc.nextBoolean();
      System.out.println("¿Tienes que salir a la biblioteca? (true/false)");
      irBiblioteca = sc.nextBoolean();
      boolean salir = !llueve && finalizadoTareas || irBiblioteca;
      System.out.println("Puedes salir: " + salir);
   }   
}
