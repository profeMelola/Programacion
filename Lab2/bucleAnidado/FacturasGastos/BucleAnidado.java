/*
 * PROGRAMA QUE CALCULA EL IMPORTE TOTAL DE TODAS LAS FACTURAS Y SUS GASTOS ASOCIADOS
 *
 * REQUISITOS:
 * - Debe pedir el número de facturas del cliente.
 * - Por cada factura debe pedir el número de gastos que tiene la factura.
 * - Debe mostrar el importe total de gastos de cada factura.
 * - Finalmente debe mostrar el importe total de todas las facturas del usuario
 *
 * EJEMPLO DE FACTURAS:
 * Factura número 1:
 *      - Gasto 1: 100 euros
 *      - Gasto 2: 23 euros
 *      - Gasto 3: 12,5 euros
 * Factura número 2:
 *      - Gasto 1: 34,68 euros
 *      - Gasto 2: 2 euros
 *
 *  RESULTADO OBTENIDO POR EL PROGRAMA:
 *      Factura 1, total importe: 135,5 euros
 *      Factura 2, total importe: 36 euros
 *      Importe total: 171,5 euros
 */

package bucleanidado;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author melola
 */
public class BucleAnidado {

    public static String EURO = "\u20ac";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numFacturas = 0;
        int indiceFacturas = 0;
        float totalFacturas = 0.0f; //sumatorio de todas del importe de todas las facturas
        
        int numGastos = 0;
        int indiceGastos = 0;
        float totalGastos = 0.0f; //sumatorio del importe de todos los gastos
        
        System.out.println("** Indica el número de facturas que vas introducir:");
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        numFacturas = sc.nextInt();
        
        // Primer bucle. Se ejecutará tantas veces como FACTURAS introduzca el usuario
        for (indiceFacturas=1; indiceFacturas <= numFacturas; indiceFacturas++){
            
            //Por cada factura hay que preguntar por los gastos de dicha factura
            System.out.println("* Indica el número de gastos de la factura ("+indiceFacturas+")");
            numGastos = sc.nextInt();
            
            //Segundo bucle. Se ejecutará tantas veces como GASTOS tenga la factura
            for (indiceGastos=1; indiceGastos <= numGastos; indiceGastos++){
                System.out.println("\t Indica el importe del gasto ("+indiceGastos+")");
                float gasto = 0.0f;
                gasto = sc.nextFloat();
                
                //totalGastos = totalGastos + gasto;
                totalGastos += gasto;
            }
            //Una vez que acaba el segundo bucle muestro por pantalla el importe totat
            //de los gastos de una factura concreta.
            System.out.println("** Factura ("+indiceFacturas+"), total importe: "+totalGastos);
            
            // Se realiza el sumatorio del importe total de las facturas
            //totalFacturas = totalFacturas + totalGastos;
            totalFacturas += totalGastos;
            totalGastos=0.0f;
        }
                
        //private String totalFacturas;
        System.out.println("*********************************************************");
        System.out.println("**** Importe total de todas las facturas: "+totalFacturas);
        System.out.println("*********************************************************");
        
    }
    //Una vez que acaba el primer bucle muestro por pantalla el importe total de todas las facturas
    
    
}
