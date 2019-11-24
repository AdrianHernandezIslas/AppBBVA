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
import vista.VistaPrincipal;
import vista.VistaSevicio;
import vista.VistaRetiro;
import vista.VistaTransferir;

/**
 *
 * @author adrian
 */
public class ControladorVistaSaldoCuenta implements ActionListener{
    
    private final Vista vista;

    public ControladorVistaSaldoCuenta(Vista vista) {
        this.vista = vista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        vista.remove(vista.getVistaSaldoCuenta());
        vista.remove(vista.getScroll());
        
        if(vista.getVistaSaldoCuenta().getBtnAtras() == e.getSource()){
            vista.setVistaPrincipal(new VistaPrincipal(vista));
        }else
        
        if(vista.getVistaSaldoCuenta().getBtnRetiroSinTarjetas() == e.getSource()){
           vista.setVistaRetiro(new VistaRetiro(vista));
        }else
        
        if(vista.getVistaSaldoCuenta().getBtnTransferir() == e.getSource()){
            
            vista.setVistaTransferir(new VistaTransferir(vista));
        }else
             
        if(vista.getVistaSaldoCuenta().getBtnPagarServicio() == e.getSource()){
            
            vista.setVistaSevicio(new VistaSevicio(vista));
        }else
        
        if(vista.getVistaSaldoCuenta().getBtnVerMas() == e.getSource()){
            vista.setVistaOperaConfiguraCuenta(new VistaOperaConfiguraCuenta(vista));
        }
        
        vista.update();
        
    }
    
}
