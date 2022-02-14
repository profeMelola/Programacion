package cuentasbancarias;

public class TestMain {

    public static void main(String[] args) {

        //	public Titular(String nombre, String apellidos, String dNI, String direccion, String telefono) {
        Titular titular = new Titular("nombre", "apellido1 apellido 2", "00000000x", "direccion", "telefono");
        Titular titular2 = new Titular("nombre2", "apellido1 apellido 2", "00000000y", "direccion�n", "telefono");
        Titular titular3 = new Titular("nombre3", "apellido1 apellido 2", "00000000z", "direccion�n", "telefono");
        //	public Banco(String nEntidad, String nombreEntidad, String nSucursal, String direccionCompleta) {

        Banco banco = new Banco("0049", "Banco Santander", "0023", "direccion");
        Banco banco2 = new Banco("0038", "Bankia", "0045", "");
        CuentaCorriente cuentaC1 = new CuentaCorriente(titular, banco);
        CuentaCorriente cuentaC2 = new CuentaCorriente(titular, banco2);
        cuentaC1.ingresar(4000);
        CuentaDeposito cuentaD1 = new CuentaDeposito(titular, banco, 3000);
        System.out.println("RESULTADO DE INGRESAR: " + cuentaD1.ingresar(25));
        System.out.println("RESULTADO DE INGRESAR 3000 " + cuentaD1.ingresar(3000));
        System.out.println("RESULTADO DE RETIRAR   75" + cuentaD1.retirar(75));
        System.out.println("RESULTADO DE RETIRAR 3000 " + cuentaD1.retirar(3000));
        System.out.println("SALDO DE LA CUENTA CORRIENTE : " + cuentaC1.mostrarSaldo());
        System.out.println("SALDO DE LA CUENTA DEPOSITO : " + cuentaD1.mostrarSaldo());
        System.out.println("MOVIMIENTOS DE LA CUENTA DEPOSITO: " + cuentaD1.mostrarMovimientos());

        //System.out.println(" RESULTADO TRASPASO " + Logica.TRASPASO(cuentaC1, cuentaC2, 200));
        System.out.println(" RESULTADO TRASPASO " + banco.TRASPASO(cuentaC1, cuentaC2, 200));
        //System.out.println(" RESULTADO TRANSFERENCIA " + Logica.TRANSFERENCIA(cuentaC1, cuentaC2, 200));
        System.out.println(" RESULTADO TRANSFERENCIA " + banco.TRANSFERENCIA(cuentaC1, cuentaC2, 200));
        System.out.println("SALDO DE LA CUENTA CORRIENTE ORIGEN : " + cuentaC1.mostrarSaldo());
        System.out.println("SALDO DE LA CUENTA CORRIENTE DESTINO : " + cuentaC2.mostrarSaldo());

        ///System.out.println(" RESULTADO MOVIMIENTO A DEPOSITO  " + Logica.MOVIMIENTOS(cuentaC1, cuentaD1, 200));
        System.out.println(" RESULTADO MOVIMIENTO A DEPOSITO  " + banco.MOVIMIENTOS(cuentaC1, cuentaD1, 200));
        System.out.println("SALDO DE LA CUENTA CORRIENTE ORIGEN : " + cuentaC1.mostrarSaldo());
        System.out.println("SALDO DE LA CUENTA CORRIENTE DESTINO : " + cuentaD1.mostrarSaldo());

        //System.out.println(" RESULTADO MOVIMIENTO A DEPOSITO " + Logica.MOVIMIENTOS(cuentaC1, cuentaD1, 3000));
        System.out.println(" RESULTADO MOVIMIENTO A DEPOSITO " + banco.MOVIMIENTOS(cuentaC1, cuentaD1, 3000));
        System.out.println("SALDO DE LA CUENTA CORRIENTE ORIGEN : " + cuentaC1.mostrarSaldo());
        System.out.println("SALDO DE LA CUENTA CORRIENTE DESTINO : " + cuentaD1.mostrarSaldo());
        
        
        
         System.out.println(" RESULTADO MOVIMIENTO A CC  " + Logica.MOVIMIENTOS(cuentaD1, cuentaC1, 200));
        System.out.println("SALDO DE LA CUENTA CORRIENTE ORIGEN : " + cuentaC1.mostrarSaldo());
        System.out.println("SALDO DE LA CUENTA CORRIENTE DESTINO : " + cuentaD1.mostrarSaldo());

        System.out.println(" RESULTADO MOVIMIENTO A CC " + Logica.MOVIMIENTOS(cuentaD1, cuentaC1, 3000));
        System.out.println("SALDO DE LA CUENTA CORRIENTE ORIGEN : " + cuentaC1.mostrarSaldo());
        System.out.println("SALDO DE LA CUENTA CORRIENTE DESTINO : " + cuentaD1.mostrarSaldo());
        
        

    }

}
