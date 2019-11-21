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
public class ControladorVistaRecargaPaquete implements ActionListener{
    
    private final Vista vista;

    public ControladorVistaRecargaPaquete(Vista vista) {
        this.vista = vista;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        vista.remove(vista.getVistaRecargaPaquete());
        if(vista.getVistaRecargaPaquete().getBtnSalir() == e.getSource()){
            vista.setVistaOperaConfiguraCuenta(vista.getVistaOperaConfiguraCuenta());
        }
        vista.update();
    }
    
}
