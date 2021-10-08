package billetetrenfuncionfecha;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author melola
 */
public class BilleteTrenConFuncionFecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                // Declarando variables
        final int precioBillete = 2; //precio sin descuento de un billete
        int edad = 0; 
        int precioFinalBillete = 0; //precio final de un billete
                
        int contador = 1; //contador del primer bucle (número de operaciones)
        int limite = 0; //límite de operaciones a realizar por la máquina
        
        int numBilletes = 0; 
        int precioTotalBilletes = 0;
                
        Scanner sc= new Scanner(System.in);
        
        String fecha = "";
        // ----------------------------------------------------------------
        // Pidiendo el límite y controlando que sea mayor que cero
        do{
            fecha = dameFecha();
            System.out.println("["+fecha+"][EXPENDEDORA DE BILLETES: Reto 3]Introduce el límite de operaciones a realizar por la máquina: ");
            limite = sc.nextInt();

            if (limite == 0) 
                System.out.println("Valor introducido incorrecto");
            
        }while (limite <= 0);
        // ----------------------------------------------------------------
        
        // Buble de la venta de billetes
        while ( contador <= limite){
        
            System.out.println("***************************");
            System.out.println("*Operación número <"+contador+">");
            
            //Pedir número de billetes
            System.out.println("*Indica el número de billetes que quieres comprar (no puedes comprar más de 5): ");
            numBilletes=sc.nextInt();
            
            if (numBilletes > 0 && numBilletes < 5){
                for (int i=1;i<=numBilletes;i++){
                    //Pedir la edad al usuario
                    System.out.print("*Introduce la edad para el billete ("+i+"):");
                    edad=sc.nextInt();

                    if (contador % 5 == 0){
                        precioFinalBillete = 0;
                        System.out.println("Qué suerte, promoción especial!!!!");
                    }
                    else{

                        //Comprobando condiciones para aplicar precio final al billete
                        if (edad < 8) {
                            precioFinalBillete = 0;
                        }
                        else if (edad >= 8 && edad <=17){
                            precioFinalBillete = precioBillete / 2;
                        }
                        else if (edad >=18 && edad <=64){
                            precioFinalBillete = precioBillete;
                        }
                        else if (edad > 64) {
                            precioFinalBillete = 0;
                        }
                    }
                    System.out.println("El precio de tu billete es: "+precioFinalBillete);
                    precioTotalBilletes = precioTotalBilletes + precioFinalBillete;
                    
                   
                }
                System.out.println("El precio total de todos los billetes es: "+precioTotalBilletes);
                precioTotalBilletes=0;
                contador++;
            }
            else
                System.out.println("Por lo menos debes comprar un billete!!!!");
        }
        
        if (contador > limite){
            fecha = dameFecha();
            System.out.println("["+fecha+"]>>>>>>>>>> LA MÁQUINA EXPENDEDORA DE BILLETES HA LLEGADO A SU FIN!!!!");
        }
    }    
    
    /**
     * Función que devuelve la fecha
     * @return 
     */
    public static String dameFecha(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        return dtf.format(LocalDateTime.now());        
    }
    
}
