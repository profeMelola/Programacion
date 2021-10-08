package geometricas;

/**
 *
 * @author melola
 */
public class Geometricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Datos fijos sin preguntar al usuario
        int base = 6;
        int altura = 4;

        dibujaRectangulo(base, altura);
        System.out.println("\n");
        dibujaTrianguloRectangulo(base);

    }

    /**
     * dibujaRectangulo
     *
     * @param base
     * @param altura
     */
    public static void dibujaRectangulo(int base, int altura) {
        System.out.println("RECTÁNGULO de base " + base + " y altura " + altura);
        System.out.println("Solución 1:");

        for (int i = 0; i < altura; i++) {
            String fila = "";

            for (int j = 0; j < base; j++) {
                fila += "* ";
            }
            System.out.println(fila);
        }

        System.out.println("Solución 2:");
        for (int i=0; i< altura; i++){
            for (int j=0; j < base; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }


    }

    /**
     * dibujaTriangulo
     *
     * @param lado
     */
    public static void dibujaTrianguloRectangulo(int lado) {

        System.out.println("TRIÁNGULO de lado " + lado + " : primera forma");
        for (int x = 1; x <= lado; x++) {
            for (int i = 1; i <= x; i++) {
                System.out.print("* ");
            }

            System.out.println("");
        }

        System.out.println("TRIÁNGULO de lado " + lado + " : segunda forma");
        for (int x = 1; x <= lado; x++) {
            for (int i = x; i <= lado; i++) {
                System.out.print("* ");
            }

            System.out.println("");
        }

    }

}
