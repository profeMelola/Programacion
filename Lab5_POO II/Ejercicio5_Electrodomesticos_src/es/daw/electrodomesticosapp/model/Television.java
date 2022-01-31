/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.daw.electrodomesticosapp.model;

public class Television extends Electrodomestico{

    private final static int RESOLUCION_DEF=20;

    private int resolucion;
    private boolean sintonizadorTDT;
  
    //Métodos publicos
  
    /**
     * Precio final de la television
     * @return precio final de la television
     */
    public double precioFinal(){
        //Invocamos el método precioFinal del método padre
        double plus=super.calculaPlus();
  
        //Añadimos el codigo necesario
        if (resolucion>40){
            plus+=getPrecioBase()*0.3;
            System.out.println("Aplicado plus del 30%: "+getPrecioBase()*0.3);
        }
        if (sintonizadorTDT){
            plus+=50;
            System.out.println("Aplicado plus de 50 euros");
        }
  
        return getPrecioBase()+plus;
    }
  
    //Constructor
  
    /**
     * Constructor por defecto
     */
    public Television(){
        this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF, RESOLUCION_DEF, false);
    }
  
    /**
     * Constructor con 2 parametros
     * @param precioBase
     * @param peso
     */
    public Television(double precioBase, double peso){
        this(precioBase, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF, RESOLUCION_DEF, false);
    }
  
    /**
     * Contructor con 6 parametros
     * @param precioBase
     * @param peso
     * @param consumoEnergetico
     * @param color
     * @param resolucion
     * @param sintonizadorTDT
     */
    public Television(double precioBase, double peso, char consumoEnergetico, String color, int resolucion, boolean sintonizadorTDT){
        super(precioBase, peso, consumoEnergetico, color);
        this.resolucion=resolucion;
        this.sintonizadorTDT=sintonizadorTDT;
    }

    @Override
    public String toString() {
        return super.toString()+" Television{" + "resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT + '}';
    }
    
}