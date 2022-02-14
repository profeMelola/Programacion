package es.daw.tiendaOrdenadores.model;

/**
 *
 * @author melola
 */
public class Sobremesa extends Ordenador{

    public enum TipoSobremesa{HORIZONTAL,VERTICAL}
    
    private TipoSobremesa tipo;
    
    public Sobremesa(TipoSobremesa tipo, double precio) {
        super(precio);
        this.tipo = tipo;
    }
    
    
    @Override
    public String getEslogan() {
        return "Es el que más pesa, pero el que menos cuesta";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Sobremesa{" + "tipo=" + tipo + '}');
        return sb.toString();
    }
    
    
    
}
