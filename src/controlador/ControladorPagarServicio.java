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
public class ControladorPagarServicio implements ActionListener{
    private Vista vista;

    public ControladorPagarServicio(Vista vista) {
        this.vista = vista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        vista.remove(vista.getVistaPagarSevicio());
        if(vista.getVistaPagarSevicio().getBtnSalir() == e.getSource()){
            vista.setVistaSaldoCuenta(vista.getVistaSaldoCuenta());
        }
        vista.update();
    }
    
}
