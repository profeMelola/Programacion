/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.daw.electrodomesticosapp.model;

public class Lavadora extends Electrodomestico{
  
    private final static int CARGA_DEF=5;
    private int carga;
  
    /**
     * Contructor por defecto
     */
    public Lavadora(){
        this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF, CARGA_DEF);
    }
  
    /**
     * Constructor con 2 parametros
     * @param precioBase
     * @param peso
     */
    public Lavadora(double precioBase, double peso){
        this(precioBase, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF, CARGA_DEF);
    }
    
    public Lavadora(double precioBase, double peso, char consumoEnergetico, String color){
        this(precioBase,peso, consumoEnergetico,color, CARGA_DEF);
        
    }
    /**
     * Constructor con 5 parametros
     * @param precioBase
     * @param peso
     * @param consumoEnergetico
     * @param color
     * @param carga
     */
    public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga){
        super(precioBase,peso, consumoEnergetico,color);
        this.carga=carga;
    }
    /**
     * Devuelve la carga de la lavadora
     * @return
     */
    public int getCarga() {
        return carga;
    }
  
    /**
     * Precio final de la lavadora
     * @return precio final de la lavadora
     */
    public double precioFinal(){
        //Invocamos el método precioFinal del método padre
        double plus=super.calculaPlus();
  
        //añadimos el código necesario
        //plus += (carga>30)? 50:0;
        if (carga>30){
            plus += 50;
            System.out.println("Carga mayor de 30. Aplicado plus de 50 euros");
        }
  
        return getPrecioBase()+plus;
    }

    @Override
    public String toString() {
        return super.toString()+" Lavadora{" + "carga=" + carga + '}';
    }
  
   
}