
import java.util.Scanner;


/**
 *
 * @author melola
 */
public class BilletesTrenReto3 {
    public static void main(String[] args) {
        System.out.println("* BILLETES TREN RETO 3!!!!");
        
        // --------------------------------------
        // Declarando variables
        final int precioBillete = 2;
        int edad = 0;
        int precioFinalBillete = 0; //precio el billete unitario con el descuento aplicado
        
        int precioTotalBilletes = 0; //precio de los billetes de un usuario
        int numBilletes = 0;

        int contador = 1;
        int numOperaciones = 0; //numero de veces que se ejecuta la maq expendedoraa

        Scanner sc = new Scanner(System.in);
        
        int dineroRecaudado = 0;

        // --------------------------------------
        
        
        // Pidiendo el límite y controlando que sea mayor que cero
        do {
            System.out.println("[INIT] \nIntroduce cuantas veces se va a ejecutar la máquina expendedora:");
            numOperaciones = sc.nextInt();

            if (numOperaciones == 0) {
                System.out.println("Valor introducido incorrecto \nEl límite debe ser mayor que cero!!!");
            }

        } while (numOperaciones <= 0);
        //-------------------------------------------------
        
        
        // Buble de la máquina expendora
        while (contador <= numOperaciones) {

            System.out.println("***************************");
            System.out.println("*Operación número <" + contador+">");
            
            //Pedir el número de billetes
            System.out.print("Introduce el número de billetes que quieres comprar: ");
            numBilletes = sc.nextInt();            
            
            //bucle para recorrer el número de billetes
            for (int i=1;i<=numBilletes;i++){
            //Pedir la edad al usuario
                System.out.print("Billete número ("+i+")");
                System.out.print("Introduce tu edad: ");
                edad = sc.nextInt();

                /*if (contador % 5 == 0) {
                    precioFinalBillete = 0;
                    System.out.println("Qué suerte, promoción especial!!!!");
                } else {*/

                    //Comprobando condiciones para aplicar precio final al billete
                    if (edad < 8) {
                        precioFinalBillete = 0;
                    } else if (edad >= 8 && edad <= 17) {
                        precioFinalBillete = precioBillete / 2;
                    } else if (edad >= 18 && edad <= 64) {
                        precioFinalBillete = precioBillete;
                    } else if (edad > 64) {
                        precioFinalBillete = 0;
                    }
                //}
                System.out.println("El precio del billete es: " + precioFinalBillete);
                precioTotalBilletes = precioTotalBilletes + precioFinalBillete;
            }//end for
            System.out.println("El precio total de los billetes: " + precioTotalBilletes);
            dineroRecaudado = dineroRecaudado + precioTotalBilletes;
            precioTotalBilletes = 0;
            System.out.println("***************************");
            contador++;
        }
        System.out.println("[FIN] EL PRECIO TOTAL RECAUDADO: " + dineroRecaudado);
    }
    
}
