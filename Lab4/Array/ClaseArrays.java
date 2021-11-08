package clasearrays;

import java.util.Arrays;

public class ClaseArrays {
    
    private static int arrayInt[] = {1, 2, 3, 4, 5, 6};
    private static double arrayDouble[] = {8.4, 9.3, 0.2, 7.9, 3.4};
    private static int arrayIntLleno[], copiaArrayInt[];
    
    public static void imprimirArrays() {
        System.out.print("arrayDouble: ");
        for (double valorDouble : arrayDouble) {
            System.out.printf("%.1f ", valorDouble);
        }
        System.out.print("\narrayInt: ");
        for (int valorInt : arrayInt) {
            System.out.printf("%d ", valorInt);
        }
        System.out.print("\narrayIntLleno: ");
        for (int valorInt : arrayIntLleno) {
            System.out.printf("%d ", valorInt);
        }
        System.out.print("\ncopiaArrayInt: ");
        for (int valorInt : copiaArrayInt) {
            System.out.printf("%d ", valorInt);
        }
        System.out.println("\n");
    }

    public static int buscarUnInt(int valor) {
        return Arrays.binarySearch(arrayInt, valor);
    }

    public static void imprimirIgualdad() {
        boolean b = Arrays.equals(arrayInt, copiaArrayInt);
        System.out.printf("arrayInt %s copiaArrayInt\n", (b ? "==" : "!="));
        b = Arrays.equals(arrayInt, arrayIntLleno);
        System.out.printf("arrayInt %s arrayIntLleno\n", (b ? "==" : "!="));
    }

    public static void main(String args[]) {
        
        arrayIntLleno = new int[10];
        copiaArrayInt = new int[arrayInt.length]; 
        
        Arrays.fill(arrayIntLleno, 7); //rellenando con valor 7
        
        Arrays.sort(arrayDouble); //ordenando
        
        // argumentos: vector_origen, posicionInicialCopia, vector_destino, posicionFinalCopia, longitud
        //System.arraycopy(arrayInt, 0, copiaArrayInt, 0, arrayInt.length);
        copiaArrayInt = Arrays.copyOf(arrayInt, arrayInt.length);
        
        imprimirArrays();
        
        imprimirIgualdad();
        
        int ubicacion = buscarUnInt(5);
        
        if (ubicacion >= 0) {
            System.out.printf("Se ha encontrado el 5 en el elemento %d de arrayInt\n", ubicacion);
        } else {
            System.out.println("No se ha encontrado el 5 en arrayInt");
        }
        ubicacion = buscarUnInt(8763);
        if (ubicacion >= 0) {
            System.out.printf("Se ha encontrado el 8763 en el element %d de arrayInt\n", ubicacion);
        } else {
            System.out.println("No se ha encontrado el 8763 en arrayInt");
        }
    }
}