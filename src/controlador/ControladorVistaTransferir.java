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
import vista.VistaNuevoDestinatarioTranseferencia;
import vista.VistaSaldoCuenta;
import vista.extras.PanelDestinatario;
import vista.extras.PanelMovimiento;

/**
 *
 * @author adrian
 */
public class ControladorVistaTransferir extends MouseAdapter implements ActionListener{
    
    private final Vista vista;
    private VistaDatosTransferencia vistaDatosTransferencia;

    public ControladorVistaTransferir(Vista vista) {
        this.vista = vista;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        vista.remove(vista.getScroll());
        if(vista.getVistaTransferir().getBtnSalir() == e.getSource()){
            vista.remove(vista.getVistaTransferir());
            vista.setVistaSaldoCuenta(new VistaSaldoCuenta(vista));
            
        }else
        
        if(vista.getVistaDatosTransferencia() != null && vista.getVistaDatosTransferencia().getBtnAtras() == e.getSource()){
            vista.remove(vista.getVistaDatosTransferencia());
            vista.setVistaSaldoCuenta(new VistaSaldoCuenta(vista));
            
        }else
        
        if(vista.getVistaDatosTransferencia() != null && vista.getVistaDatosTransferencia().getBtnTranseferir() == e.getSource()){
            procesarTransferencia();
            vista.remove(vista.getVistaDatosTransferencia());
            vista.setVistaSaldoCuenta(new VistaSaldoCuenta(vista));
        }else
           
        if(vista.getVistaTransferir().getBtnAgregarDestinatario() == e.getSource()){
            vista.setVistaNuevoDestinatarioTranseferencia(new VistaNuevoDestinatarioTranseferencia(vista));
        }
        
        
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
        
        if(ModeloSaldo.esPosible(cantidad)){
            ModeloSaldo.sutraerMonto(cantidad);
            ModeloMovimiento.agregarMovimiento(new PanelMovimiento("PAGO CUENTA","Transeferencia",String.valueOf(-cantidad))); 
        }       
        
    }
    
    
    
}
