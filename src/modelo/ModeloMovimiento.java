/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author adrian
 */
public class ModeloMovimiento {
    
    private static final ArrayList<JPanel> movimientos = new ArrayList<>();

    private ModeloMovimiento() {
    }
    
    public static void agregarMovimiento(JPanel movimiento){
        movimientos.add(movimiento);
    }

    public static ArrayList<JPanel> getMovimientos() {
        return movimientos;
    }
}
