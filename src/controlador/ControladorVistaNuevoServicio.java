/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ModeloServicio;
import vista.Vista;
import vista.VistaSevicio;
import vista.extras.PanelServicio;

/**
 *
 * @author adrian
 */
public class ControladorVistaNuevoServicio implements ActionListener{
    private final Vista vista;

    public ControladorVistaNuevoServicio(Vista vista) {
        this.vista = vista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        vista.remove(vista.getVistaNuevoServicio());
        if(vista.getVistaNuevoServicio().getBtnAtras() == e.getSource()){
            vista.setVistaSevicio(new VistaSevicio(vista));//
        }else
        
        if(vista.getVistaNuevoServicio().getBtnRegistar() == e.getSource()){
            registar();
            vista.setVistaSevicio(new VistaSevicio(vista));
        }
        vista.update();
    }
    
    private void registar(){
        String servicio = vista.getVistaNuevoServicio().getListaTipoRefenrecia().getSelectedItem().toString();
        String refererencia = vista.getVistaNuevoServicio().getCampoReferencia().getText();
        String alias = vista.getVistaNuevoServicio().getCampoAlias().getText();
        String importe = vista.getVistaNuevoServicio().getCampoImporte().getText();
        
        ModeloServicio.agregarServicio(new PanelServicio(alias,servicio, refererencia, importe));
    }
    
}
