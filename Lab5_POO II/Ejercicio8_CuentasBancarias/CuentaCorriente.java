/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentasbancarias;

/**
 *
 * @author idesadadaw
 */
public class CuentaCorriente extends Cuenta {
        private static final double SALDO_MINIMO = -50.0;

    public CuentaCorriente(Titular titular, Banco banco) {
        super(titular, banco);
    }
    

    @Override
    public boolean ingresar(double importe) {
        
    setSaldo(importe);
     addMovimiento(importe);
           return true; 
        }

    @Override
    public boolean retirar(double importe) {
        
        // comprobar si hay saldo suficiente 
        //saldo - importe > 50
        if(getSaldo() - importe >50){
            setSaldo(-importe);
            addMovimiento(-importe);
            return true;
        }
        return false;
    }
    
}
