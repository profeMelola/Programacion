

package es.daw.electrodomesticosapp.model;
/**
 * 
 * @author idesadadaw
 *
 */

public abstract class Electrodomestico {

    //VALORES POR DEFECTO USANDO CONSTANTES
    protected final static String COLOR_DEF="Blanco";
    //protected final static Color COLOR_DEF=Color.BLANCO;
    //protected final static ConsumoEnergetico CONSUMO_ENERGETICO_DEF=ConsumoEnergetico.F;
    protected final static char CONSUMO_ENERGETICO_DEF='F';
    protected final static double PRECIO_BASE_DEF=100;
    protected final static double PESO_DEF=5;

    //ATRIBUTOS
    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;
    private ConsumoEnergetico ce;
    private Color c;
   
    //MÉTODO ABSTRACTO
    public abstract double precioFinal();
    
    //CONSTRUCTORES
    /**
     * Contructor por defecto
     */
    public Electrodomestico(){
        this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF);
    }
   
    /**
     * Contructor con 2 parametros
     * @param precioBase del electrodomestico
     * @param peso del electrodomestico
     */
    public Electrodomestico(double precioBase, double peso){
        this(precioBase, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF);
    }
   
    /**
     * Constructor con 4 parametros
     * @param precioBase
     * @param peso
     * @param consumoEnergetico
     * @param color
     */
    public Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color){
        this.precioBase=precioBase;
        this.peso=peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
    }
    
    // OTROS MÉTODOS
    /**
     * Comprueba el color y le asigna el color por defecto si no se encuentra dentro de la lista de enumerados
     * @param color 
     */
    private void comprobarColor(String color){
        boolean encontrado=false;
        Color[] colores = Color.values();
        int i = 0;
        
        while(!encontrado && i<colores.length){    
            if(colores[i].name().equalsIgnoreCase(color)){ 
                encontrado=true;
                this.c=colores[i];
            }
            i++;
        }
        
        if (!encontrado) this.c=Color.BLANCO;
        this.color = (encontrado)? color:COLOR_DEF;
          
    }
      
    /**
     * Comprueba el consumo energetico
     * Solo mayusculas, si es una 'a' no lo detecta como una 'A'
     * @param consumoEnergetico
     */
    private void comprobarConsumoEnergetico(char consumoEnergetico){

        // FORMA 1
        // Código ASCII: del 65 al 70 son  A,B, ...F
        /*if(consumoEnergetico>=65 && consumoEnergetico<=70){
            this.consumoEnergetico=consumoEnergetico;
        }else{
            this.consumoEnergetico=CONSUMO_ENERGETICO_DEF;
        }*/
        
        // FORMA 2
        boolean encontrado=false;
        int i = 0;
        ConsumoEnergetico[] consumos = ConsumoEnergetico.values();
        
        while(!encontrado && i<consumos.length){
            if(consumos[i].name().equalsIgnoreCase(Character.toString(consumoEnergetico))){
                encontrado=true;
                this.ce=consumos[i];
            }
            i++;
        }
        
        if (!encontrado) this.ce=ConsumoEnergetico.F;
        
        this.consumoEnergetico = (encontrado)? consumoEnergetico:CONSUMO_ENERGETICO_DEF;
    }
   
    //Métodos publicos
    /**
     * Devuelve el precio base del electrodomestico
     * @return precio base del electrodomestico
     */
    public double getPrecioBase() {
        return precioBase;
    }
    /**
     * Devuelve el color del electrodomestico
     * @return color del elesctrodomestico
     */
    public String getColor() {
        return color;
    }
   
     /**
     * Devuelve el consumo energetico del electrodomestico
     * @return consumo energetico del electrodomestico
     */
    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }
    /**
     * Devuelve el peso del electrodomestico
     * @return peso del electrodomestico
     */
    public double getPeso() {
        return peso;
    }
    /**
     * Precio final del electrodomestico
     * @return precio final del electrodomestico
     */
    public double calculaPlus(){
        
        double plus=0;
        
        /*
        // Sin tipo enumerado
        char[] clase ={'A','B','C','D','E','F'};
        int[] suplemento ={100,80,60,50,30,10};
        
        for(int i=0; i< clase.length; i++){
            if(clase.equals(consumoEnergetico))
                precioFinal=precioBase+ suplemento[i];
        }
        String clase2 ="ABCDEF";
        int pos=clase2.indexOf(consumoEnergetico);
         plus+=  suplemento[pos];
        */
        
        // Cálculo del plus al preciobase según su consumo
        String letraConsumo = this.ce.name();
        switch(letraConsumo){
            case "A":
                System.out.println("Categoría A -> Aplicado plus: "+ce.getPrecio());
                plus +=ce.getPrecio();
                break;
            case "B":
                System.out.println("Categoría B -> Aplicado plus: "+ce.getPrecio());
                plus +=ce.getPrecio();
                break;
            case "C":
                System.out.println("Categoría C -> Aplicado plus: "+ce.getPrecio());
                plus +=ce.getPrecio();
                break;
            case "D":
                System.out.println("Categoría D -> Aplicado plus: "+ce.getPrecio());
                plus +=ce.getPrecio();
                break;
            case "E":
                System.out.println("Categoría E -> Aplicado plus: "+ce.getPrecio());
                plus +=ce.getPrecio();
                break;
            case "F":
                System.out.println("Categoría F -> Aplicado plus: "+ce.getPrecio());
                plus +=ce.getPrecio();
                break;
                
        }
   
        // Cálculo del plus al precio base según su peso
        if(peso>=0 && peso<19){
            System.out.println("Peso entre 0 y 19 -> Aplicado plus de 10" );
            plus+=10;
        }else if(peso>=20 && peso<49){
            System.out.println("Peso entre 20 y 49 -> Aplicado plus de 50" );
            plus+=50;
        }else if(peso>=50 && peso<=79){
            System.out.println("Peso entre 50 y 79 -> Aplicado plus de 80" );
            plus+=80;
        }else if(peso>=80){
            System.out.println("Peso mayor de 80 -> Aplicado plus de 100" );
            plus+=100;
        }
   
        //System.out.println("Plus total aplicado "+plus);
        return plus;
    }

    @Override
    public String toString() {
        return "precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso;
    }
   
   
    
   
}