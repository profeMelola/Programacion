package notasarray;

/**
 *
 * @author melola
 */
public class NotasArrayBorrador {

    //static double nota1,nota2,nota3,nota4,nota5,resultado;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //double nota1,nota2,nota3,nota4,nota5,resultado;
        
        double[] notas = new double[5];
        
        
        /*nota1=5;
        nota2=7;
        nota3=4.5;
        nota4=9;
        nota5=3.75;*/
        
        notas[0]=5;
        notas[1]=7;
        notas[2]=4.5;
        notas[3]=9;
        notas[4]=3.75;
        
        
        //resultado = calcularMedia(nota1,nota2,nota3,nota4,nota5);     
        resultado = calcularMedia(notas);     
        
        System.out.println("Resultado: "+resultado);
        
        
    }
    
    public static double calcularMedia(double[] notas){
    //public static double calcularMedia(){
    //public static double calcularMedia(double nota1, double nota2, double nota3, double nota4, double nota5){
        //double media = (nota1 + nota2 + nota3 +nota4 +nota5) / 5;
        
        for(int i=0; i< notas.length; i++){
            
        }
        
        return media;
    }
}
