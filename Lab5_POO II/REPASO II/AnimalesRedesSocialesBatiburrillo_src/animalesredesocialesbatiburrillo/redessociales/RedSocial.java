package animalesredesocialesbatiburrillo.redessociales;

import animalesredessocialesbatiburrillo.Comunicable;

/**
 *
 * @author melola
 */
public class RedSocial implements Comunicable{
    private String categoria;

    public RedSocial(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "RedSocial{" + "categoria=" + categoria + '}';
    }

    @Override
    public void comunicarse() {
        System.out.println("Una red social se comunica de diferentes formas...");
    }
    
    
}
