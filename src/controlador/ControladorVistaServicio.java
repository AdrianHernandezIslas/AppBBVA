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
import vista.VistaDatosPagoServicio;
import vista.VistaNuevoServicio;
import vista.VistaSaldoCuenta;
import vista.extras.PanelMovimiento;
import vista.extras.PanelServicio;

/**
 *
 * @author adrian
 */
public class ControladorVistaServicio extends MouseAdapter implements ActionListener{
    private Vista vista;
    private VistaDatosPagoServicio vistaDatosPagoServicio;

    public ControladorVistaServicio(Vista vista) {
        this.vista = vista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            
        if(vista.getVistaSevicio().getBtnSalir() == e.getSource()){
            vista.remove(vista.getVistaSevicio());
            vista.setVistaSaldoCuenta(vista.getVistaSaldoCuenta());
        }else 
         
        if( vista.getVistaSevicio().getBtnAgregarServicio() == e.getSource()){
           vista.remove(vista.getVistaSevicio());
           vista.setVistaNuevoServicio(new VistaNuevoServicio(vista));
        }
        
        vista.update();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        PanelServicio panelServicio =(PanelServicio) e.getSource();
        double monto = Double.parseDouble(panelServicio.getMonto());
        if(ModeloSaldo.esPosible(monto)){
            ModeloSaldo.sutraerMonto(monto);
            ModeloMovimiento.agregarMovimiento(new PanelMovimiento(panelServicio.getTitulo(),"Pago servico", panelServicio.getMonto()));
            vista.remove(vista.getVistaSevicio());
            vista.setVistaSaldoCuenta(new VistaSaldoCuenta(vista));
            vista.update();
            
        }
        
    }
    
   
    
    
}
