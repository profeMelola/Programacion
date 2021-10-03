/*
## Calcular la media de dos notas ##

Realizar el pseudocódigo que permita al usuario introducir por teclado dos notas, calculando la media arimética. 

**Programa:** CalcularMediaNotas

**Entorno:**

SUMA, PRODUCTO, NOTA1, NOTA2 son numéricas enteras

**Algoritmo:**

InicioPrograma

escribir “Introduzca la nota primera, y la nota segunda respectivamente”

leer NOTA1, NOTA2

SUMA= NOTA1+NOTA2

MEDIA= SUMA/2

escribir “la suma de los números es: ”  MEDIA

FinPrograma
 */
package medianotas;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class CalcularMediaNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum, media, nota1, nota2;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la primera nota: ");
        nota1 = sc.nextInt();
        
        System.out.println("Introduce la segund nota: ");
        nota2 = sc.nextInt();
        
        sum = nota1 + nota2;
        
        media = sum / 2;
        
        System.out.println("La media es: "+media);
        
    }
    
}
