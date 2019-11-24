/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorVistaTransferir;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import vista.extras.Colores;
import vista.extras.Imagen;
import vista.extras.PanelDestinatario;

/**
 *
 * @author adrian
 */
public class VistaDatosTransferencia extends JPanel{
    
    private JPanel panelCabecera;
    private PanelDestinatario panelDestinatario;
    private JButton btnAtras,btnTranseferir;
    private JLabel etiquetaReferencia,etiquetaCantidad,etiquetaMensaje;
    private JTextField campoReferencia;
    private JTextField campoCantidad;
    private final ControladorVistaTransferir controlador;

    public VistaDatosTransferencia(ControladorVistaTransferir controlador) {
        super(null);
        this.controlador = controlador;
        
        setBounds(0,0,350,550);
        setBackground(Color.WHITE);
        inicializarComponentes();
        
    }
    
    
    private void inicializarComponentes(){
        panelCabecera = new JPanel(null);
        
        
        panelCabecera.setBounds(0,0,350,40);
        
        panelCabecera.setBackground(Colores.AZUL_INTENSO);
        
        btnAtras = new JButton(new Imagen().getImagen("/imagenes/back.jpeg",20,20));
        btnAtras.setBounds(10,10,20,20);
        
        btnAtras.addActionListener(controlador);
        
        campoCantidad = new JTextField();
        campoReferencia = new JTextField();
        
        campoCantidad.setBounds(80,200,180,40);
        campoReferencia.setBounds(80,280,180,40);
        
        
        etiquetaCantidad = new JLabel("Monto");
        etiquetaReferencia = new JLabel("Referencia");
        etiquetaMensaje = new JLabel("Saldo Insuficiente");
        
        etiquetaCantidad.setBounds(80, 180, 100, 20);
        etiquetaReferencia.setBounds(80, 260, 100, 20);
        etiquetaMensaje.setBounds(120, 420,200, 20);
        
        etiquetaMensaje.setVisible(false);
        
        btnTranseferir = new JButton("Aceptar");
        btnTranseferir.setBackground(Colores.AZUL_CLARO);
        btnTranseferir.setForeground(Color.WHITE);
        btnTranseferir.setBorder(BorderFactory.createEmptyBorder());
        
        btnTranseferir.setBounds(120,350, 100, 40);
        
        btnTranseferir.addActionListener(controlador);
        
        etiquetaReferencia.setVisible(false);
        campoReferencia.setVisible(false);
 
        
    }
    
    private void agregarComponentes(){
        
        panelCabecera.add(btnAtras);
        
        
        add(panelCabecera);
        add(panelDestinatario);
        add(etiquetaCantidad);
        add(campoCantidad);
        add(etiquetaReferencia);
        add(campoReferencia);
        add(btnTranseferir);
        add(etiquetaMensaje);
    }

    public JButton getBtnAtras() {
        return btnAtras;
    }

    public JButton getBtnTranseferir() {
        return btnTranseferir;
    }

    public JTextField getCampoReferencia() {
        return campoReferencia;
    }

    public JTextField getCampoCantidad() {
        return campoCantidad;
    }

    public PanelDestinatario getPanelDestinatario() {
        return panelDestinatario;
    }

    public void setPanelDestinatario(PanelDestinatario panelDestinatario) {
        this.panelDestinatario = panelDestinatario;
        panelDestinatario.setLocation(60,60);
        agregarComponentes();
    }

    public JLabel getEtiquetaMensaje() {
        return etiquetaMensaje;
    }
    
    
    
}
