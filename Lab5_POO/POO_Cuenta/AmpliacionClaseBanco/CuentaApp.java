/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentaapp;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class CuentaApp {
 
    public static void main(String[] args) {
         
        Banco banco = new Banco("CaixaMari DAW");
        int numClientes = 0;
                
        System.out.println("* Indica el número de clientes que tendrá el banco:");
        Scanner sc = new Scanner(System.in);
        numClientes = sc.nextInt();
        
        if (numClientes > 0 ){
            banco.setNumClientes(numClientes);
            banco.setCuentas(new Cuenta[numClientes]);
        }
        
        // -------------------------------
        Cuenta cuenta_1 = new Cuenta("DAW1A");
        Cuenta cuenta_2 = new Cuenta("Fernando", 300);
        
        Cuenta[] cuentas = banco.getCuentas();
        cuentas[0] = cuenta_1;
        cuentas[1] = cuenta_2;        
        
        //Ingresa dinero en las cuentas
        cuenta_1.ingresar(300);
        cuenta_2.ingresar(400);
         
        //Retiramos dinero en las cuentas
        //cuenta_1.retirar(500);
        //cuenta_2.retirar(100);
         
        //Muestro la informacion de las cuentas
        System.out.println(cuenta_1); // 0 euros
        System.out.println(cuenta_2); // 600 euros
        // ----------------------------
        
        //Mostrar cuentas usando el array
        System.out.println("***************** BANCO ******************");
        int contador = 1;
        System.out.println("BANCO: "+banco.toString());
        for (Cuenta cuenta: cuentas){
            if (cuenta != null)
                System.out.printf("CUENTA <%d>: %s%n",contador,cuenta.toString());
        }
        
        
        
         
    }
     
}
