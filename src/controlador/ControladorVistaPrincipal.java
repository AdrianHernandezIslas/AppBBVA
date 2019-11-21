/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;
import vista.Vista;
import vista.VistaRetiro;
import vista.VistaSaldoCuenta;

/**
 *
 * @author adrian
 */
public class ControladorVistaPrincipal extends MouseAdapter implements ActionListener{
    
    private final Vista vista;
    

    public ControladorVistaPrincipal(Vista vista) {
        this.vista = vista;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
         vista.remove(vista.getVistaPrincipal());
         vista.setVistaSaldoCuenta(new VistaSaldoCuenta(vista));
         SwingUtilities.updateComponentTreeUI(vista);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
         vista.remove(vista.getVistaPrincipal());
         
         if(e.getSource() == vista.getVistaPrincipal().getBtnRetiroSinTarjetas()){
             
             vista.add(new VistaRetiro(vista));
         }
         
         vista.update();
    }
    
}
