/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicasarrays;

/**
 * Ejemplos vistos en clase (15/10/2021)
 * @author melola
 */
public class PracticasArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // --------------- PRIMERA FORMA DE INICIALIZACIÓN -----------------
        //CREACIÓN E INICIALIZACIÓN ELEMENTO A ELEMENTO
	/*int[] unArray = new int[10];
		
        unArray[0] = 100;
        unArray[1] = 200;
        unArray[2] = 300;
        unArray[3] = 400;
        unArray[4] = 500;
        unArray[5] = 600;
        unArray[6] = 700;
        unArray[7] = 800;
        unArray[8] = 900;
        unArray[9] = 1000;
        
        //RECORRIDO DE TODOS LOS VALORES DE UN ARRAY
        for(int i = 0; i < unArray.length; i++) {
        	System.out.println(unArray[i]);
        }*/
	
        // -------------- SEGUNDA FORMA DE INICIALIZACIÓN
        int[] unArray2 = { 
			    100, 200, 300,
			    400, 500, 600, 
			    700, 800, 900, 1000
			};

        int[] unArray3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        
        //unArray3 = unArray2; //NO ES UNA COPIA!!!!!
        //COPIANDO DE LA PRIMERA FORMA
        /*for(int i=0; i< unArray2.length; i++){
            System.out.println("indice ("+i+")");
            unArray3[i]=unArray2[i];
        }*/
        
        //COPIANDO DE LA SEGUNDA FORMA
        //System.arraycopy(unArray2,0,unArray3,0, unArray2.length);
        System.arraycopy(unArray2,4,unArray3,3, 6);

        //RECORRIDO DE TODOS LOS VALORES DE UN ARRAY
	//CON EL BUCLE FOR MEJORADO (FOR EACH)
        
        //unArray2[0]=0;
        
        System.out.println("* unArray2 ***********");
        for(int valor : unArray2) {
        	System.out.println(valor);
        }        
        System.out.println("* unArray3 ***********");
        for(int valor : unArray3) {
        	System.out.println(valor);
        }        
        
        
        /*//ARRAY DE CADENAS
        System.out.println("******** ARRAY DE CADENAS!!!! ***********");
        String[] valores = {"uno","dos","tres"};
        int i=1;
        for(String valor: valores) {
            System.out.println("Valor:"+valor);
            System.out.println("índice:"+i);
            i++;
            
        }*/
        
            
                
    }
    
}
