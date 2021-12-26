package poo_concesionario;

/**
 *
 * @author melola
 */
public class Coche {
    //ATRIBUTOS
    private Concesionario concesionario;
    private String matricula;
    private int numPuertas;
    private String marca;
    private int kilometros;
    private int precio;

    //CONTRUCTORES
    public Coche(Concesionario concesionario, String matricula, int numPuertas, String marca, int kilometros, int precio) {
        this.concesionario = concesionario;
        this.matricula = matricula;
        this.numPuertas = numPuertas;
        this.marca = marca;
        this.kilometros = kilometros;
        this.precio = precio;
    }

    public Coche(Concesionario concesionario, String matricula, int precio) {
        // valores por defecto: 5 puertas, cadena vacía la marca, 0 kms
        this(concesionario,matricula,5,"",0,precio);
    }

    public Coche(Concesionario concesionario, String matricula) {
        this.concesionario = concesionario;
        this.matricula = matricula;
        this.numPuertas = 5;
        this.marca = "";
        this.kilometros = 0;
        this.precio = calcularPrecioPorDefecto(matricula);
    }
    
    // GETTERS & SETTERS

    public void setConcesionario(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Concesionario getConcesionario() {
        return concesionario;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public String getMarca() {
        return marca;
    }

    public int getKilometros() {
        return kilometros;
    }

    public int getPrecio() {
        return precio;
    }
    
    
    
    
    // OTROS MÉTODOS
    private int calcularPrecioPorDefecto(String matricula){
        // Contenga un patrón concreto BVF = 20000
        if (matricula.indexOf("BVF") != -1)
            return 20000;
        // Si la matrícula empieza por A = 10000
        else if (matricula.startsWith("A"))
            return 10000;
        //else if (matricula.charAt(0) == 'A')
        else
            return 5000;
        // else ==> 25000
    }
    
    public void aplicarDescuento(int descuento){
        this.precio -= descuento;
    }

    @Override
    public String toString() {
        return "Coche{" + "concesionario=" + concesionario.getNombre() + ", matricula=" + matricula + ", numPuertas=" + numPuertas + ", marca=" + marca + ", kilometros=" + kilometros + ", precio=" + precio + '}';
    }
    
    
     
        
}
