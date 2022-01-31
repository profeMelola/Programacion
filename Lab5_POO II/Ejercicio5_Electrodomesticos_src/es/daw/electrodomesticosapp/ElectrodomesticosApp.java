package es.daw.electrodomesticosapp;

import es.daw.electrodomesticosapp.model.*;
/**
 *
 * @author melol
 */
public class ElectrodomesticosApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos un array de Electrodomesticos
        Electrodomestico listaElectrodomesticos[]=new Electrodomestico[10];
   
        //Asignamos cada una de las posiciones como queramos
        
        //Lavadora: precioBase, peso, consumoEnergetico, color, carga;
        //TV: precioBase, peso, consumoEnergetico, color, resolucion, sintonizadorTDT
                
                
        listaElectrodomesticos[0]=new Lavadora(200, 60, 'C', "Verde"); //color mal
        listaElectrodomesticos[1]=new Lavadora(150, 30);
        listaElectrodomesticos[2]=new Television(500, 80, 'E', "Negro", 42, false);
        listaElectrodomesticos[3]=new Lavadora();
        listaElectrodomesticos[4]=new Lavadora(600, 20, 'D', "gris");
        listaElectrodomesticos[5]=new Lavadora(300, 40, 'Z', "blanco", 40); //letra mal
        listaElectrodomesticos[6]=new Television(250, 70);
        listaElectrodomesticos[7]=new Lavadora(400, 100, 'A', "verde", 15); //Color mal
        listaElectrodomesticos[8]=new Television(200, 60, 'C', "naranja", 30, true); //Color mal
        listaElectrodomesticos[9]=new Television(50, 10);
   
        //Creamos las variables que usaremos para almacenar la suma de los precios
        double sumaElectrodomesticos=0;
        double sumaTelevisiones=0;
        double sumaLavadoras=0;
   
        double precioFinalElectro=0;
        //Recorremos el array invocando el metodo precioFinal
        for(int i=0;i<listaElectrodomesticos.length;i++){
            /*
             * Cuando una Television o una Lavadora este en la posicion del array actual,
             * pasara por su clase y por la de electrodomestico, ya que una television es un electrodomestico.
             * Ejecutamos en cada uno su propia version del metodo precioFinal
             */
   
            // Es necesario controlar con instanceof?????? Sí, para controlar el sumatorio según el tpo de objeto
            // Por el primer if pasarán tanto lavadoras con televisiones
            /*if(listaElectrodomesticos[i] instanceof Electrodomestico){
                //System.out.println("* Electrodoméstico ["+i+"]"+listaElectrodomesticos[i].toString());
                //System.out.println("\t precio final: "+listaElectrodomesticos[i].precioFinal());
                sumaElectrodomesticos+=listaElectrodomesticos[i].precioFinal();
            }*/
            if(listaElectrodomesticos[i] instanceof Lavadora){
                System.out.println("* Lavadora ["+i+"] "+listaElectrodomesticos[i].toString());
                precioFinalElectro=listaElectrodomesticos[i].precioFinal();
                System.out.println("\t precio final: "+precioFinalElectro);
                
                sumaLavadoras+=precioFinalElectro;
            }
            if(listaElectrodomesticos[i] instanceof Television){
                System.out.println("* TV ["+i+"] "+listaElectrodomesticos[i].toString());
                precioFinalElectro=listaElectrodomesticos[i].precioFinal();
                System.out.println("\t precio final: "+precioFinalElectro);
                    
                sumaTelevisiones+=precioFinalElectro;
            }
            System.out.println("***************************************");
        }
   
        //Mostramos los resultados
        System.out.println("La suma del precio de los electrodomesticos es de "+(sumaLavadoras + sumaTelevisiones));
        System.out.println("La suma del precio de las lavadoras es de "+sumaLavadoras);
        System.out.println("La suma del precio de las televisiones es de "+sumaTelevisiones);
        
    }
    
}
