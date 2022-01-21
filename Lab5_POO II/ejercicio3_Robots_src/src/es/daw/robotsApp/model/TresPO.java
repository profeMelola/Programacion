package es.daw.robotsApp.model;

/**
 *
 * @author melola
 */
public class TresPO extends Robot{
    private String idioma;
    
    public TresPO(String nombre, String color, String idioma){
        super(nombre,color);
        this.idioma = idioma;
    }
    /*
   @Override
    
   public void mover(){
        System.out.println("TresPO se mueve despacio");
    }
    */
    public void traducir(){
        System.out.println("TresPO traduce al idioma "+idioma);
    }
   
   public void mover(){
        System.out.println("TresPO se mueve despacio");
    }
    
    public void hablar(){
        System.out.println("TresPO no dice ni mú");
    }
    
}
