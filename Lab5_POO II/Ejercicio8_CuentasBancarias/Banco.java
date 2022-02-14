package cuentasbancarias;

public class Banco {

    private String nEntidad;
    private String nombreEntidad;
    private String direccionCompleta;
    private String nSucursal;

    public Banco(String nEntidad, String nombreEntidad, String nSucursal, String direccionCompleta) {

        this.nEntidad = nEntidad;
        this.nombreEntidad = nombreEntidad;
        this.direccionCompleta = direccionCompleta;
        this.nSucursal = nSucursal;

    }

    public String getnEntidad() {
        return nEntidad;
    }

    public String getNombreEntidad() {
        return nombreEntidad;
    }

    public String getDireccionCompleta() {
        return direccionCompleta;
    }

    public String getnSucursal() {
        return nSucursal;
    }
    
    // Métodos adicionales 
    public boolean TRANSFERENCIA(CuentaCorriente origen, CuentaCorriente destino, double importe) {
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

    public boolean TRASPASO(CuentaCorriente origen, CuentaCorriente destino, double importe) {

        // comprobar que origen y destino pertenecen al mismo banco
        if (origen.getBanco().equals(destino.getBanco())) {
            TRANSFERENCIA(origen, destino, importe);
            return true;
        }
        return false;

    }
    
    public boolean MOVIMIENTOS(Cuenta origen, Cuenta destino, double importe) {

        if (origen.retirar(importe)) {
            if (!destino.ingresar(importe)) {
                origen.ingresar(importe);
                return false;
            }
            return true;
        }
        return false;
    }

}
