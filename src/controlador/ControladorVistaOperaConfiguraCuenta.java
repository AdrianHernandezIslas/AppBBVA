/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Vista;
import vista.VistaPagarSevicio;
import vista.VistaRecargaPaquete;
import vista.VistaRetiro;
import vista.VistaTransferir;

/**
 *
 * @author adrian
 */
public class ControladorVistaOperaConfiguraCuenta implements ActionListener{
    
    private final Vista vista;

    public ControladorVistaOperaConfiguraCuenta(Vista vista) {
        this.vista = vista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        vista.remove(vista.getVistaOperaConfiguraCuenta());
        if(vista.getVistaOperaConfiguraCuenta().getBtnSalir() == e.getSource()){
            vista.setVistaSaldoCuenta(vista.getVistaSaldoCuenta());
        }else
        
        if(vista.getVistaOperaConfiguraCuenta().getBtnTransferir() == e.getSource()){
             vista.setVistaTransferir(new VistaTransferir(vista));
        }else
        
        if(vista.getVistaOperaConfiguraCuenta().getBtnRetiroSinTarjetas() == e.getSource() ){
             vista.setVistaRetiro(new VistaRetiro(vista));
        }else
        
        if(vista.getVistaOperaConfiguraCuenta().getBtnPagarServicio() == e.getSource()){
             vista.setVistaPagarSevicio(new VistaPagarSevicio(vista));
        }else
        
        if(vista.getVistaOperaConfiguraCuenta().getBtnRecargas() == e.getSource()){
            vista.setVistaRecargaPaquete(new VistaRecargaPaquete(vista));
        }
        
        vista.update();
    }
    
}
