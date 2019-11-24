/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Vista;
import vista.VistaOperaConfiguraCuenta;

/**
 *
 * @author adrian
 */
public class ControladorVistaEstadoDeCuenta implements ActionListener{
    private final Vista vista;

    public ControladorVistaEstadoDeCuenta(Vista vista) {
        this.vista = vista;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        vista.remove(vista.getVistaEstadoDeCuenta());
        vista.setVistaOperaConfiguraCuenta(new VistaOperaConfiguraCuenta(vista));
        vista.update();
    }
    
}
