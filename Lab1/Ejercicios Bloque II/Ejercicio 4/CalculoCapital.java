/*
## Problema del banco ##

Suponga que un individuo desea invertir su capital en un banco y desea saber cuanto dinero ganara después de un mes si el banco paga a razón de 2% mensual.

**Programa:** CalculoCapital

**Entorno:**

CAP_INV, GAN

**Algoritmo:**

InicioPrograma

escribir “Introduzca el Capital Invertido”

leer CAP_INV

GAN = CAP_INV * 0.02

 escribir GAN

FinPrograma

 */
package calculocapital;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class CalculoCapital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double capitalInvertido=0.0d;
        double ganancias=0.0d;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca el capital invertido:");
        capitalInvertido=sc.nextDouble();
        
        ganancias = capitalInvertido * 0.2;
        
        System.out.println("Las ganancias obtenidas en un mes son:"+ganancias);
    }
    
}
