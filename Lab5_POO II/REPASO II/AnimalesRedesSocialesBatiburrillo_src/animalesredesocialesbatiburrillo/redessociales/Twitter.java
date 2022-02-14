package animalesredesocialesbatiburrillo.redessociales;

/**
 *
 * @author melola
 */
public class Twitter extends RedSocial{
    
    private static final int LONGITUD_TWEET = 280;

    public Twitter(String categoria) {
        super(categoria);
    }

    @Override
    public void comunicarse() {
        super.comunicarse();
        System.out.println("La gente que usa Twitter se comunica a través de tweets");
    }
    
    
    
}
