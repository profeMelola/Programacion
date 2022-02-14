/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentasbancarias;

import java.util.HashSet;

/**
 *
 * @author idesadadaw
 */
public class CuentaDeposito extends Cuenta {
    double importeMaximo;

    public CuentaDeposito(Titular titular, Banco banco,  double importeMaximo) {
        super(titular, banco);
        this.importeMaximo = importeMaximo;
    }
    
    

    @Override
    public boolean ingresar(double importe) {
        
        if(importe != importeMaximo){
            return false;
        }
        setSaldo(importe);
        addMovimiento(importe);
        return true;
    }

    @Override
    public boolean retirar(double importe) {
         if(importe != importeMaximo){
            return false;
        }
        setSaldo(-importe);
        addMovimiento(-importe);
        return true;
    }
    
}
