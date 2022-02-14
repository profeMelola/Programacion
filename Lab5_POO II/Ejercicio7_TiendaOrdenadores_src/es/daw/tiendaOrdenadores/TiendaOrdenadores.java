package es.daw.tiendaOrdenadores;

import es.daw.tiendaOrdenadores.model.Ordenador;
import es.daw.tiendaOrdenadores.model.Portatil;
import es.daw.tiendaOrdenadores.model.Sobremesa;
import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author melola
 */
public class TiendaOrdenadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Ordenador> ordenadores = new ArrayList<>();
                
        Portatil p1 = new Portatil(1.2, 1200);
        Portatil p2 = new Portatil(1.4, 1300);
        Portatil p3 = new Portatil(1.1, 1250);
        Sobremesa s1 = new Sobremesa(Sobremesa.TipoSobremesa.VERTICAL, 800);
        Sobremesa s2 = new Sobremesa(Sobremesa.TipoSobremesa.HORIZONTAL, 600);
        Sobremesa s3 = new Sobremesa(Sobremesa.TipoSobremesa.VERTICAL, 700);
        
        // Los meto en el ArrayList descolocados
        ordenadores.add(p1);
        ordenadores.add(s1);
        ordenadores.add(p2);
        ordenadores.add(s2);
        ordenadores.add(p3);
        ordenadores.add(s3);
        
        // Mostrar todos los ordenadores
        System.out.println("* ORDENADORES DE LA TIENDA:");
        for(Ordenador o:ordenadores) System.out.println(o);
        
        
        System.out.println("* ORDENADORES EN ORDEN ASC DE CÓDIGO:");
        ordenadores.sort(Comparator.naturalOrder());
        for(Ordenador o:ordenadores) System.out.println(o);
        
        System.out.println("* ORDENADORES EN ORDEN DESC DE CÓDIGO:");
        ordenadores.sort(Comparator.reverseOrder());
        for(Ordenador o:ordenadores) {
            System.out.println(o);
            System.out.println(o.getEslogan());
            if (o instanceof  Portatil){
                Portatil p = (Portatil) o;
                p.infoBateria();
            }
            System.out.println("----------------");
        }
        
        
    }
    
}
