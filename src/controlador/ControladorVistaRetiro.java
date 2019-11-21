/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Vista;

/**
 *
 * @author adrian
 */
public class ControladorVistaRetiro implements ActionListener{
    
    private final Vista vista;

    public ControladorVistaRetiro(Vista vista) {
        this.vista = vista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        vista.remove(vista.getVistaRetiro());
        if(vista.getVistaRetiro().getBtnSalir() == e.getSource()){
            vista.setVistaSaldoCuenta(vista.getVistaSaldoCuenta());
        }
        
        vista.update();
    }
    
}
