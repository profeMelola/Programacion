/**
 * Ejemplo más complejo que nos permite utilizar
 *
 *  - Variables numéricas
 *  - Operadores
 *  - Expresiones
 *  - Estructuras de decisión
 *  - Estructuras de repetición
 *
 */
package calculadora;

import java.util.Scanner;

public class CalculadoraConFunciones {

    static Scanner sc;
    
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {

        //Variable donde almacenamos el valor seleccionado
        //del menú
        int opcion = 0;
        //Por ahora, es normal si no se comprenden estas dos
        //líneas de código.
        sc = new Scanner(System.in);

        do {
            mostrarMenu();

            //opcion = Integer.parseInt(sc.nextLine());
            opcion = sc.nextInt();
            
            if (opcion < 0 || opcion > 5) {
                System.out.println("Opción no válida. Vuelva a escoger");
                //Si la opcion es diferente a cero, solicitamos los 
                //dos operandos
            } else if (opcion != 0) {
                float operando1, operando2;

                operando1 = escribirOperando();
                operando2 = escribirOperando();
                
                float resultado;
                
                switch (opcion) {

                    case 1: //Suma
                        //resultado = operando1 + operando2;
                        resultado = sumar(operando1,operando2);
                        System.out.println("El resultado de la suma es " + resultado);
                        break;
                    case 2: //Resta
                        resultado = operando1 - operando2;
                        System.out.println("El resultado de la resta es " + resultado);
                        break;
                    case 3: //Multiplicación
                        resultado = operando1 * operando2;
                        System.out.println("El resultado de la multiplicación es " + resultado);
                        break;
                    case 4: //División
                        resultado = operando1 / operando2;
                        System.out.println("El resultado de la división es " + resultado);
                        break;
                    case 5: //Resto
                        resultado = operando1 % operando2;
                        System.out.println("El resto de dividir " + operando1 + " entre " + operando2 + " es " + resultado);
                        break;
                }
            }

        } while (opcion != 0); //opcion == 0 implicar salir del programa

        //Indicamos que no vamos a leer ningún valor más por teclado.
        //sc.close();
        System.out.println("Finalizando la ejecución de la calculadora");

    }
    
    /**
     * 
     */
    public static void mostrarMenu(){
        System.out.println("\n"); //Este caracter especial nos permite imprimir una línea en blanco
        System.out.println("***** CALCULADORA *****");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Resto");
        System.out.println("0. Salir del programa");
        System.out.print("Introduzca una opción válida: ");        
    }

    /**
     * 
     * @return 
     */
    public static float escribirOperando(){
        System.out.println("Introzca el operando: ");
        
        float operando = sc.nextFloat();        
        return operando;
    }
    
    /**
     * 
     * @param operando1
     * @param operando2
     * @return 
     */
    public static float sumar(float operando1, float operando2){
        float resultado = operando1 + operando2;
        return resultado;
    }
    
    /*public static float restar(float operando1, float operando2){
        
    }
    
    public static float multiplicar(float operando1, float operando2){    
        
    }
    
    public static float dividir(float operando1, float operando2){    
        
    }
    
    public static float resto(float operando1, float operando2){
        
    }*/
    
}
