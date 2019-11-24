/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;
import vista.Vista;
import vista.VistaSaldoCuenta;
import vista.VistaSevicio;

/**
 *
 * @author adrian
 */
public class ControladorVistaDatosPagoServicio implements ActionListener{
    
    private final Vista vista;

    public ControladorVistaDatosPagoServicio(Vista vista) {
        this.vista = vista;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        vista.remove(vista.getVistaDatosPagoServicio());
        vista.remove(vista.getScroll());
        vista.getVistaDatosPagoServicio().setVisible(false);
        if(e.getActionCommand().equals("")){
            vista.setVistaSaldoCuenta(new VistaSaldoCuenta(vista));
          
        }else
            
        if(e.getActionCommand().equals("Aceptar")){
            vista.getVistaDatosPagoServicio().setVisible(false);
            vista.setVistaSaldoCuenta(new VistaSaldoCuenta(vista));
        }
        vista.update();
        
    }
    
}
