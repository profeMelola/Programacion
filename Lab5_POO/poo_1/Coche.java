package poo_1;

/**
 *
 * @author melola
 */
public class Coche {
    
    private String matricula;
    private int numPuertas;
    private String marca;
    private int kilometros;
    private int precio;

    // CONSTRUCTORES .....
    public Coche(String matricula, int numPuertas, String marca, int kilometros, int precio) {
        //this.matricula = matricula;
        //this.precio = precio;
        this(matricula,precio);
        this.numPuertas = numPuertas;
        this.marca = marca;
        this.kilometros = kilometros;
    }

    public Coche(String matricula, int precio) {
        this.matricula = matricula;
        this.precio = precio;
    }
    
    public Coche(String matricula) {
        this.matricula = matricula;
    }
    
    public Coche(){
        //valores por defecto (según el enunciado del programa....)
        //matricula, numPuertas, marca, kilometros, precio
        this("NINGUNA", 5, "NI IFRS",0,10000);
    }

    // Métodos Getters & Setters

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    // Métodos propios
    public int obtenerPrecioFinal(int descuento){
        //aplicar el descuento y cambiar el precio
        precio -= descuento;
        
        return precio;

    }
    
    public void aplicarDescuento(int descuento){
        precio -= descuento;
    }
    
    
    @Override
    public String toString() {
        return "Coche{" + "matricula=" + matricula + ", numPuertas=" + numPuertas + ", marca=" + marca + ", kilometros=" + kilometros + ", precio=" + precio + '}';
    }
    
    
    
}
