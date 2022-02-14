package cuentasbancarias;

import static java.lang.Math.abs;
import java.util.ArrayList;


public abstract class Cuenta {

    private Titular titular;
    
    private Banco banco;

    public Banco getBanco() {
        return banco;
    }
    
    private double saldo;
    private static int contador;
    private String nCuenta;
   

    private static final double NOTIFICAR = 3000.0;
    private ArrayList<Double> movimientos;
    

    public Cuenta(Titular titular, Banco banco) {
        this.titular=titular;
        this.saldo=0;
        this.banco=banco;
        movimientos = new ArrayList();
        nCuenta = construirNcuenta();
        
     

    }
    public abstract boolean ingresar(double importe);
    public abstract boolean retirar(double importe);
    
    public String mostrarDatos(){
        
        return "Número de cuenta" + nCuenta + titular.toString() + "Saldo:  "+ saldo;
    }
    public String mostrarCuenta(){
        return "Número de cuenta "+ nCuenta;
    }
     public String mostrarSaldo(){
         return "Saldo " + saldo;
     }
     
    private String construirNcuenta() {

        StringBuilder cuenta = new StringBuilder(Integer.toString(contador));
        int longitud = 8 - cuenta.length();  // a longitud de ncuenta debe ser 16 digitos
        // añadimos 16 - longitud  para completar

        for (int i = 0; i < longitud; i++) {
            cuenta.insert(0, '0');
        }
        cuenta.insert(0, banco.getnSucursal().toCharArray());
        cuenta.insert(0, banco.getnEntidad().toCharArray());
        
        contador++;

        return cuenta.toString();

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        
        this.saldo += saldo;
    }
    public int addMovimiento(double importe){
        movimientos.add(importe);
        
        return movimientos.size();
    }
 
     public String mostrarMovimientos(){
         StringBuilder s = new StringBuilder();
         for(Double i: movimientos){
             s.append(i);
             s.append("\n");
             
         }
         return s.toString();
     }
   
}
   