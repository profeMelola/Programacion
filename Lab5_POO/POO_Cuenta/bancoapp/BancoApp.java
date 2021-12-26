/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bancoapp;

import javax.swing.JOptionPane;

/**
 *
 * @author melola
 */
public class BancoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Banco banco = new Banco("CaixaMari DAW");
        int numClientes = 0;
        
        String numCli = JOptionPane.showInputDialog("* Indica el número de clientes del banco:");
        numClientes = Integer.parseInt(numCli);
        
        if (numClientes > 0){
            banco.setNumClientes(numClientes);
            //banco.setCuentas(new Cuenta[numClientes]);
        }
        
        Cuenta cuenta_1 = new Cuenta("Pepito");
        Cuenta cuenta_2 = new Cuenta("Menganito",300);
        
        //Cuenta[] cuentas = banco.getCuentas();
        Cuenta[] cuentas = new Cuenta[numClientes];
        cuentas[0] = cuenta_1;
        cuentas[1] = cuenta_2;
        banco.setCuentas(cuentas);
        
        /*System.out.println("*** INFORMACIÓN CUENTAS *****");
        System.out.println(cuenta_1.toString());
        System.out.println(cuenta_2.toString());*/
        
        System.out.println("********* BANCO **********");
        System.out.println("INFORMACIÓN: "+banco.toString());

        cuentas[0].ingresar(3450);
        System.out.println("Cuenta con ingreso:"+cuentas[0].toString());
        
        System.out.println("INFORMACIÓN ACTUALIZADA DEL BANCO: \n"+banco.toString());
        
    }
    
}
