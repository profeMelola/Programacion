package animalesredessocialesbatiburrillo.model.animales;

/**
 *
 * @author melola
 */
public class Perro extends Mamifero{
    private String grupo;

    public Perro(String grupo, int periodoGestacion, String nombre) {
        super(periodoGestacion, nombre);
        this.grupo = grupo;
    }

    @Override
    public void comunicarse() {
        super.comunicarse();
        System.out.println("[PERRO] Los perros ladran");
    }
    
    
    
    
}
