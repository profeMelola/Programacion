package animalesredessocialesbatiburrillo.model.animales;

/**
 *
 * @author melola
 */
public class Ave extends Animal{
    private boolean carnivora;

    public Ave(boolean carnivora, String nombre, boolean vuela) {
        super(nombre, vuela);
        this.carnivora = carnivora;
    }

    
    @Override
    public void reproducirse() {
        System.out.println("[AVE] SON OVÍPAROS (la mayoría)");
    }
    
    @Override
    public void comunicarse(){
        System.out.println("[AVE] Las aves cantan");
    }
    
}
