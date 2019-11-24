/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ModeloDestinatarioTransferencia;
import vista.Vista;
import vista.VistaTransferir;
import vista.extras.PanelDestinatario;

/**
 *
 * @author adrian
 */
public class ControladorVistaNuevoDestinatarioTransferencia implements ActionListener{
    
    private final Vista vista;

    public ControladorVistaNuevoDestinatarioTransferencia(Vista vista) {
        this.vista = vista;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        vista.remove(vista.getVistaNuevoDestinatarioTranseferencia());
        if(vista.getVistaNuevoDestinatarioTranseferencia().getBtnAtras() == e.getSource()){
            
            vista.setVistaTransferir(new VistaTransferir(vista));
            
        }else{
            registrar();
            vista.setVistaTransferir(new VistaTransferir(vista));
        }
        
        vista.update();
    }
    
    private void registrar(){
       String alias =  vista.getVistaNuevoDestinatarioTranseferencia().getCampoAlias().getText();
       String nombre = vista.getVistaNuevoDestinatarioTranseferencia().getCampoNombre().getText();
       String tipoReferencia = vista.getVistaNuevoDestinatarioTranseferencia().getListaTipoRefenrecia().getSelectedItem().toString();
       String referencia = vista.getVistaNuevoDestinatarioTranseferencia().getCampoReferencia().getText();
       
       ModeloDestinatarioTransferencia.agregarDestinatarioTransferncia(new PanelDestinatario(alias, nombre, tipoReferencia, referencia));
    }
    
}
