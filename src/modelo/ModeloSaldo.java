/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author adrian
 */
public class ModeloSaldo {
    private static double saldo = 30000;
    
    private ModeloSaldo(){}
    
    public static boolean esPosible(double monto){
        return monto <= saldo;
    }
    
    public static void sutraerMonto(double monto){
        saldo -= monto;
    }

    public static double getSaldo() {
        return saldo;
    }
    
    
}
