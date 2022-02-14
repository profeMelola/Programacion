package animalesredessocialesbatiburrillo;

import animalesredesocialesbatiburrillo.redessociales.Twitter;
import animalesredessocialesbatiburrillo.model.animales.Paloma;
import animalesredessocialesbatiburrillo.model.animales.Perro;

/**
 *
 * @author melola
 */
public class AnimalesRedesSocialesBatiburrillo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("* INFORMACIÓN DE PALOMAS:");
        Paloma mensajera = new Paloma("Columba livia");
        
        mensajera.comunicarse();
        mensajera.reproducirse();
        
        
        System.out.println("* INFORMACIÓN DE PERROS:");
        Perro pastorAleman = new Perro("Pastores",60,"Canis lupus familiaris");
        pastorAleman.comunicarse();
        pastorAleman.reproducirse();
        
        
        System.out.println("***************");
        Twitter tw = new Twitter("Twitter");
        tw.comunicarse();
        
    }
    
}
