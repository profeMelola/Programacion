package poo_1;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class POO_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Coche coche0 = new Coche("BVF 4598", 5, "Fiat Bravo", 26512, 12530);
        
        Coche cocheDefault = new Coche();
        
        Coche coche1 = new Coche("LOM 9887");
        Coche coche2 = new Coche("BVF 9855");
        Coche coche3 = new Coche("AAB 0122");
        
        coche1.setKilometros(55625);
        coche1.setMarca("Renault");
        coche1.setNumPuertas(5);
        coche1.setPrecio(10000);
        
        coche2.setNumPuertas(3);
        
        System.out.println("Mi coche 0:"+coche0);
        System.out.println("Mi coche 1:"+coche1);
        System.out.println("Mi coche 2:"+coche2);
        System.out.println("Mi coche 3:"+coche3);
        
        // -----------------------------------
        //Aplicar descuento al coche 1
        //Caso 1
        int precioFinalCoche1 = coche1.obtenerPrecioFinal(300);
        System.out.println("precioFinalCoche1: "+precioFinalCoche1);
        
        //Caso 2
        coche1.aplicarDescuento(300);
        System.out.println("precioFinalCoche1:"+coche1.getPrecio());
        // -----------------------------------
        
        
    }
    
}
