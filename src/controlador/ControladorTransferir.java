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
import modelo.ModeloMovimiento;
import modelo.ModeloSaldo;
import vista.Vista;
import vista.VistaDatosTransferencia;
import vista.VistaSaldoCuenta;
import vista.extras.PanelDestinatario;
import vista.extras.PanelMovimiento;

/**
 *
 * @author adrian
 */
public class ControladorTransferir extends MouseAdapter implements ActionListener{
    
    private final Vista vista;
    private VistaDatosTransferencia vistaDatosTransferencia;

    public ControladorTransferir(Vista vista) {
        this.vista = vista;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        vista.remove(vista.getScroll());
        if(vista.getVistaTransferir().getBtnSalir() == e.getSource()){
            vista.remove(vista.getVistaTransferir());
            
        }else
        
        if(vista.getVistaDatosTransferencia().getBtnAtras() == e.getSource()){
            vista.remove(vista.getVistaDatosTransferencia());
            
        }else
        
        if(vista.getVistaDatosTransferencia().getBtnTranseferir() == e.getSource()){
            procesarTransferencia();
            vista.remove(vista.getVistaDatosTransferencia());
        }
        
        vista.setVistaSaldoCuenta(new VistaSaldoCuenta(vista));
        vista.update();
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        vista.remove(vista.getVistaTransferir());
        vista.remove(vista.getScroll());
        if(vistaDatosTransferencia == null) vistaDatosTransferencia = new VistaDatosTransferencia(this);
        vistaDatosTransferencia.setPanelDestinatario((PanelDestinatario)e.getSource());
        vista.setVistaDatosTransferencia(vistaDatosTransferencia);
        vista.update();
    }
    
    private void procesarTransferencia(){
        double cantidad = Double.parseDouble(vista.getVistaDatosTransferencia().getCampoCantidad().getText());
        PanelDestinatario destinatario = vista.getVistaDatosTransferencia().getPanelDestinatario();
        if(ModeloSaldo.esPosible(cantidad)){
            ModeloSaldo.sutraerMonto(cantidad);
            ModeloMovimiento.agregarMovimiento(new PanelMovimiento("PAGO CUENTA","Transeferencia",String.valueOf(-cantidad))); 
        }       
        
    }
    
    
    
}
