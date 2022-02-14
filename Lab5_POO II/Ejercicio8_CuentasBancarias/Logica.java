package cuentasbancarias;

public class Logica {

    public static boolean TRANSFERENCIA(CuentaCorriente origen, CuentaCorriente destino, double importe) {
        boolean success = false;
        double saldoOrigen = origen.getSaldo();
        double saldoDestino = destino.getSaldo();

        if (origen.retirar(importe)) {
            destino.ingresar(importe);
            return true;
        } else {
            return false;
        }

    }

    public static boolean TRASPASO(CuentaCorriente origen, CuentaCorriente destino, double importe) {

        // comprobar que origen y destino pertenecen al mismo banco
        if (origen.getBanco().equals(destino.getBanco())) {
            TRANSFERENCIA(origen, destino, importe);
            return true;
        }
        return false;

    }
    
    public static boolean MOVIMIENTOS(Cuenta origen, Cuenta destino, double importe) {

        if (origen.retirar(importe)) {
            if (!destino.ingresar(importe)) {
                origen.ingresar(importe);
                return false;
            }
            return true;
        }
        return false;
    }
    
/*
    public static boolean MOVIMIENTOS(CuentaCorriente origen, CuentaDeposito destino, double importe) {
        // movimiento de ingreso en cuenta deposito

        if (origen.retirar(importe)) {
            if (!destino.ingresar(importe)) {
                origen.ingresar(importe);
                return false;
            }
            return true;
        }
        return false;

    }

    public static boolean MOVIMIENTOS(CuentaDeposito origen, CuentaCorriente destino, double importe) {
        
     if (origen.retirar(importe)) {
            if (!destino.ingresar(importe)) {
                origen.ingresar(importe);
                return false;
            }
            return true;
        }
        return false;
    }
     */

}
