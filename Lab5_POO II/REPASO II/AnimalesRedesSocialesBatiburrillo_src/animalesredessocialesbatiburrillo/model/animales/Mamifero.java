package animalesredessocialesbatiburrillo.model.animales;

/**
 *
 * @author melola
 */
public class Mamifero extends Animal{
    private int periodoGestacion; //número días

    public Mamifero(int periodoGestacion, String nombre) {
        super(nombre);
        this.periodoGestacion = periodoGestacion;
    }

    public int getPeriodoGestacion() {
        return periodoGestacion;
    }

    public void setPeriodoGestacion(int periodoGestacion) {
        this.periodoGestacion = periodoGestacion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Mamifero{" + "periodoGestacion=" + periodoGestacion + '}');
        return sb.toString();
    }

    @Override
    public void reproducirse() {
        System.out.println("[MAMIFERO] SON VIVÍPAROS (la mayoría)");
    }
    
    @Override
    public void comunicarse(){
        System.out.println("[MAMIFERO] Emiten diferentes sonidos, cada uno con un nombre.");
    }    
    
    
}
