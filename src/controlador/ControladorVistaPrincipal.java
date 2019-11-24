/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import vista.Vista;
import vista.VistaSaldoCuenta;

/**
 *
 * @author adrian
 */
public class ControladorVistaPrincipal extends MouseAdapter{
    
    private final Vista vista;
    

    public ControladorVistaPrincipal(Vista vista) {
        this.vista = vista;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
         vista.remove(vista.getVistaPrincipal());
         vista.setVistaSaldoCuenta(new VistaSaldoCuenta(vista));
         vista.update();
    }

    
    
}
