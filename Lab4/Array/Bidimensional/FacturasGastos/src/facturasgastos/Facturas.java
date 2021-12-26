package facturasgastos;

/**
 *
 * @author melola
 */
public class Facturas {
    
    /**
     * 
     * @param facturas 
     */
    public static void imprimeFacturas(float[][] facturas){
        System.out.println("************");
        System.out.println("primeFacturas] num facturas: "+ facturas.length);            
        
        for (int i=0; i< facturas.length; i++){
            System.out.println("** Factura ("+i+")");
            float[] gastos = facturas[i];
            System.out.println("[imprimeFacturas] num gastos: "+ gastos.length);
            for (int j=0; j < gastos.length;j++){
                System.out.println("\t * Gasto ("+j+")"+gastos[j]);
            }
        }
    }
    
    /**
     * 
     * @param factura
     * @return 
     */
    public static float obtenerImporteTotalGastosFactura(float[] factura){
        float importeTotalFactura = 0.0f;
        
        for (float gasto:factura)
            importeTotalFactura += gasto;
        
        return importeTotalFactura;
    }
    
    /**
     * 
     * @param facturas
     * @return 
     */
    public static float obtenerImporteTotalFacturas(float[][] facturas){
        float importeTotalFacturas = 0.0f;
        
        for (float[] factura:facturas){
            importeTotalFacturas += obtenerImporteTotalGastosFactura(factura);
        }
        
        return importeTotalFacturas;
        
    }
}
