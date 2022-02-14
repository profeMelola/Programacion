package animalesredessocialesbatiburrillo.model.animales;

/**
 *
 * @author melola
 */
public class Paloma extends Ave{

    public Paloma(boolean carnivora, String nombre, boolean vuela) {
        super(carnivora, nombre, vuela);
    }
    
    public Paloma(String nombre) {
        super(false,nombre,true);
    }

    @Override
    public void comunicarse() {
        super.comunicarse();
        System.out.println("[PALOMA] Concretamente las palomas arrullan");
    }
    
    
}
