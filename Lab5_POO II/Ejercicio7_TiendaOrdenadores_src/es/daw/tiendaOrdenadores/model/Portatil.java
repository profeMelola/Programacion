package es.daw.tiendaOrdenadores.model;

/**
 *
 * @author melola
 */
public class Portatil extends Ordenador{

    private double peso;
    
    //private static final String eslogan="Eslogan del portatil";

    public Portatil(double peso, double precio) {
        super(precio);
        this.peso = peso;
    }


    public double getPeso() {
        return peso;
    }

    public void infoBateria(){
        System.out.println("La bateria dura muy poco!!!");
    }
    
    @Override
    public String getEslogan() {
        return "Ideal para sus viajes";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Portatil{" + "peso=" + peso + '}');
        return sb.toString();
    }
    
    
}
