/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ModeloMovimiento;
import modelo.ModeloSaldo;
import vista.Vista;
import vista.VistaSaldoCuenta;
import vista.extras.PanelMovimiento;

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
        
        if(vista.getVistaRecargaPaquete().getBtnSalir() == e.getSource()){
            vista.remove(vista.getVistaRecargaPaquete());
            vista.setVistaOperaConfiguraCuenta(vista.getVistaOperaConfiguraCuenta());
        }else
        if(vista.getVistaRecargaPaquete().getBtnIconoTelefono() == e.getSource()){
            
            recargarNumeroPersonal();
        }else 
        if(vista.getVistaRecargaPaquete().getBtnRecargar() == e.getSource()){
            recargar();
        }
        vista.update();
    }
    
    private void recargarNumeroPersonal(){
       vista.getVistaRecargaPaquete().getCampoNumero().setText(vista.getVistaRecargaPaquete().getEtiquetaNumeroTelefono().getText());
    }
    
    private void recargar(){
        String numero = vista.getVistaRecargaPaquete().getCampoNumero().getText();
        String compania = vista.getVistaRecargaPaquete().getListaCompanias().getSelectedItem().toString();
        String monto = vista.getVistaRecargaPaquete().getListaMonto().getSelectedItem().toString();
        double cantidad = Double.parseDouble(monto);
        if(ModeloSaldo.esPosible(cantidad)){
            ModeloSaldo.sutraerMonto(cantidad);
            ModeloMovimiento.agregarMovimiento(new PanelMovimiento("Recarga","Recarga "+compania, monto));
            vista.remove(vista.getVistaRecargaPaquete());
            vista.setVistaSaldoCuenta(new VistaSaldoCuenta(vista));
            vista.update();
        }
    }
    
}
