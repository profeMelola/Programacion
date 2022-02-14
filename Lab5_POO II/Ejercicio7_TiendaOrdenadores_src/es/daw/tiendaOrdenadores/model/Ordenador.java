package es.daw.tiendaOrdenadores.model;

/**
 *
 * @author melola
 */
public abstract class Ordenador implements Comparable<Ordenador>{
    private int codigo;
    private double precio;
    
    private static int contador=1;
    //private static int codigo=0;

    public Ordenador(double precio) {
        this.precio = precio;
        this.codigo=contador++;
        //this.codigo++;
        
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public abstract String getEslogan();

    @Override
    public String toString() {
        return "Ordenador{ codigo="+codigo+ ", precio=" + precio + '}';
    }

    @Override
    public int compareTo(Ordenador otro){
        
        //Quiero que se ordene por código
        // PRIMERA FORMA
        /*Integer cod1 = Integer.valueOf(codigo);
        Integer cod2 = Integer.valueOf(otro.getCodigo());
        return cod1.compareTo(cod2);*/
        
        // SEGUNDA FORMA
        /*if (codigo == otro.getCodigo()) return 0;
        else if (codigo < otro.getCodigo()) return -1;
        else return 1;*/
        
        // TERCERA FORMA
        return codigo - otro.getCodigo();
        
        
        
    }
    
    
    
}
