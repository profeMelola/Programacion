package areas;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class Circulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radio, area, circunferencia;
        
        /*
        //También se podría haber declarado así:
        double radio;
        double area;
        double circunferencia;
        */
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce el radio: ");
        
        radio = entrada.nextDouble();
        
        //Usando la clase Math
        area = Math.PI * Math.pow(radio, 2);
        circunferencia = 2 * Math.PI * radio;
        
        System.out.println("El área es "+area);
        System.out.println("La circunferencia es "+circunferencia);
        
        
    }
    
}
