/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_concesionario;

/**
 *
 * @author melola
 */
public class POO_Concesionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("1. CREANDO LOS CONCESIONARIOS....");
        Concesionario conce1 = new Concesionario("CONCE_1", "Alcalá LowCostCar", "Alcalá de Henares", 6998541, "Pepito Grillo");
        Concesionario conce2 = new Concesionario("CONCE_2", "El más barato oiga!!!", "Alpedrete", 6666666, "Chiquito de la Calzada");        
        
        System.out.println("INFO DEL CONCESIONARIO 1:");
        System.out.println(conce1.toString());
        System.out.println("INFO DEL CONCESIONARIO 2:");
        System.out.println(conce2);
        
        System.out.println("Convenio del conce1:"+conce1.convenio);
        System.out.println("Convenio del conce2:"+conce1.convenio);
        
        conce1.convenio = "OTRO Convenio";

        System.out.println("Convenio del conce1:"+conce1.convenio);
        System.out.println("Convenio del conce2:"+conce1.convenio);
        
        System.out.println("2. CREANDO COCHES CON DIFERENTES CONTRUCTORES...");
        Coche coche0 = new Coche(conce1,"BVF 4598",5,"Fiat",22565,12500);
        Coche coche1 = new Coche(conce1, "AAB 0122"); //ver que me aplica bien el precio por defecto
        Coche coche2 = new Coche(conce2, "BVF 6554");
        Coche coche3 = new Coche(conce2, "LOM 9887");
        Coche coche4 = new Coche(conce2, "ABC 9887",6700);
        
        System.out.println("3. MOSTRANDO INFO DE LOS COCHES");
        System.out.println("Coche 0:"+coche0.toString());
        System.out.println("Coche 1:"+coche1.toString());
        System.out.println("Coche 2:"+coche2.toString());
        System.out.println("Coche 3:"+coche3.toString());
        System.out.println("Coche 4:"+coche4.toString());
        
        coche4.aplicarDescuento(700);
        System.out.println("Coche 4 tras el descuento:"+coche4.toString());
        
        
    }
    
}
