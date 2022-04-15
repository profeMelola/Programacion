
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;


/**
 * Implementar una aplicación que pida por consola números enteros no negativos hasta que se introduce -1.
 * Los números se irán insertando en una colección, pudiéndose repetir. Al terminar se mostrará la colección por pantalla.
 * A continuación, se mostrarán los valores pares.
 * Por último se eliminarán todos los múltiplos de 3 y se mostrará por pantalla la colección resultante.
 * 
 * @author melol
 */
public class GH_Lab8_Ej1 {

    public static void main(String[] args) {
        
        // Como se pueden repetir los elementos, decidimos usar un ArrayList
        Collection<Integer> numeros = new ArrayList<>();
        
        // 1. Pedimos por consola hasta que se intruduzca un -1
        System.out.print("Introducir entero: ");
        Integer n = new Scanner(System.in).nextInt();
        
        while (n >= 0) {
            numeros.add(n);
            System.out.print("Introducir entero: ");
            n = new Scanner(System.in).nextInt();
        }
        
        System.out.println("Lista completa: " + numeros);
        
        //2 . Mostrar solo los números pares
        System.out.print("Pares: ");
        for (Integer a : numeros) {
            if (a % 2 == 0) {
                System.out.print(a + " ");
            }
        }
        
        // 3. Eliminar los números múltiplos de 3
        System.out.println("");
        Iterator<Integer> it = numeros.iterator();
        while (it.hasNext()){
        //for (Iterator<Integer> it = numeros.iterator(); it.hasNext();) {
            n = it.next();
            if (n % 3 == 0) {
                it.remove();
            }
        }
        // Mostrar la lista sin los múltiplos de 3
        System.out.println("No múltiplos de 3: " + numeros);
        
    }
}
