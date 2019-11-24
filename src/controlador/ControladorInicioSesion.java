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
import vista.Vista;
import vista.VistaPrincipal;

/**
 *
 * @author Julio
 */
public class ControladorInicioSesion extends MouseAdapter implements ActionListener{
    
    private Vista vistaInicio;
    private final String contrasenia = "12345";
    private int contador;

    public ControladorInicioSesion(Vista vistaInicio) {
        this.vistaInicio = vistaInicio;
    }
   

    @Override
    public void actionPerformed(ActionEvent e) {
         String contraseniaUsuario = vistaInicio.getCampoContrasenia().getText();
         if(contrasenia.equals(contraseniaUsuario)){
            vistaInicio.limpiarInicio();
            vistaInicio.setLayout(null);
            vistaInicio.setVistaPrincipal(new VistaPrincipal(vistaInicio));
            
         }else if(contador<3){
             contador++;
             vistaInicio.getEtiquetaMensaje().setText("¡Datos introducidos incorrectos!");
             vistaInicio.getEtiquetaMensaje().setVisible(true);
         }
         if(contador > 2){
             vistaInicio.getEtiquetaMensaje().setText("Intentos permitidos alcanzados");
             System.exit(0);
         }
         
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        vistaInicio.getEtiquetaMensaje().setText("Contraseña: "+contrasenia);
        vistaInicio.getEtiquetaMensaje().setVisible(true);
    }

    
}
