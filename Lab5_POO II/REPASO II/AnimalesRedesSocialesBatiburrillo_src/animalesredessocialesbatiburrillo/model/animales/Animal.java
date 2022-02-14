package animalesredessocialesbatiburrillo.model.animales;

import animalesredessocialesbatiburrillo.Comunicable;

/**
 *
 * @author melola
 */
public abstract class Animal implements Comunicable{
    private String nombre;
    private boolean vuela;

    public Animal(String nombre) {
        //this.nombre = nombre;
        this(nombre,false); //considero que por defecto la mayoría no vuela
    }

    public Animal(String nombre, boolean vuela) {
        this.nombre = nombre;
        this.vuela = vuela;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setVuela(boolean vuela){
        this.vuela = vuela;
    }
    
    public boolean getVuela(){
        return vuela;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + '}';
    }
    
    public abstract void reproducirse();
    
    //public abstract void comunicarse();
    
}
