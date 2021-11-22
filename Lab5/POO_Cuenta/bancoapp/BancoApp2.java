/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancoapp;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author melola
 */
public class BancoApp2 {

    public static void main(String args[]) {
        Banco banco = new Banco("BBVA_DAW");
        int numClientes = 0;

        String numCli = JOptionPane.showInputDialog("Indica el número de clientes del banco:");
        numClientes = Integer.parseInt(numCli);
        
        Scanner sc = new Scanner(System.in);

        if (numClientes > 0) {
            
            banco.setNumClientes(numClientes);
            Cuenta[] cuentas = new Cuenta[numClientes];
            
            for (int i = 0; i < numClientes; i++){
                
                System.out.println("* Dime el titular de la cuenta:");
                String titular = sc.nextLine();
                System.out.println("* Dame el importe incial de la cuenta:");
                double importe = sc.nextDouble();
                sc.nextLine();
                Cuenta cuenta = new Cuenta(titular, importe);
                cuentas[i] = cuenta;
            }
            
            //yo ya tengo mi array de cuentas relleno
            banco.setCuentas(cuentas);
            
        }

        System.out.println("********* BANCO **********");
        System.out.println("INFORMACIÓN: " + banco.toString());

    }
}
