public class UsosArrays2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] vector = {1,2,3,4,5};       
        int[][] matriz = {{1,2},{3,4},{5,6}};
        
        int[][] matrizCopia = new int[matriz.length][matriz[0].length];
        matrizCopia = matriz.clone();
        
        int[] vectorCopia = new int[vector.length];
        vectorCopia = vector.clone();
        
             
        System.out.println("vector:");
        System.out.println(Arrays.toString(vector));
        System.out.println("vector copia:");
        System.out.println(Arrays.toString(vectorCopia));   
        System.out.println("Equals sin cambio: "+Arrays.equals(vector, vectorCopia));
        System.out.println("Compare sin cambio: "+Arrays.compare(vector, vectorCopia));
        
        vectorCopia[0] = 666;
        System.out.println("vector copia modificado:");
        System.out.println(Arrays.toString(vectorCopia));      
        System.out.println("Equals con cambio: "+Arrays.equals(vector, vectorCopia));
        System.out.println("Compare con cambio: "+Arrays.compare(vector, vectorCopia));
        
        System.out.println("matriz (forma 1):");
        System.out.println(Arrays.toString(matriz));
        System.out.println("matriz (forma 2):");
        for(int[] i:matriz){
            System.out.println(Arrays.toString(i));
        }
        
        System.out.println("Equals sin cambio, son idénticas:"+Arrays.equals(matriz,matrizCopia));
        
        matrizCopia[0][0]=666;
        System.out.println("Equals con cambio:"+Arrays.equals(matriz,matrizCopia)); //Mal!!!!!! No compara matrices
        
        //System.out.println("Equals:"+Arrays.compare(matriz,matrizCopia));
        
        
        
    }
    
    
}
