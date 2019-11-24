/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorVistaNuevoDestinatarioTransferencia;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import vista.extras.Colores;
import vista.extras.Imagen;

/**
 *
 * @author adrian
 */
public class VistaNuevoDestinatarioTranseferencia extends JPanel{
    private JPanel panelCabecera;
    private JButton btnAtras,btnTranseferir;
    private JLabel etiquetaReferencia,etiquetaTipoReferencia,etiquetaMensaje,
                   etiquetaAlias,etiquetaNombre,etiquetaTitulo;
    private JTextField campoReferencia,campoAlias,campoNombre;
    private JComboBox listaTipoRefenrecia;
    private ControladorVistaNuevoDestinatarioTransferencia controlador;
    private Vista vista;

    public VistaNuevoDestinatarioTranseferencia(Vista vista) {
        super(null);
        this.vista = vista;
        setBounds(0,0,350,550);
        setBackground(Color.WHITE);
        inicializarComponentes();
        agregarComponentes();
    }

    private void inicializarComponentes() {
        
        controlador = new ControladorVistaNuevoDestinatarioTransferencia(vista);
        
        panelCabecera = new JPanel(null);
        
        
        panelCabecera.setBounds(0,0,350,40);
        
        panelCabecera.setBackground(Colores.AZUL_INTENSO);
        
        btnAtras = new JButton(new Imagen().getImagen("/imagenes/back.jpeg",20,20));
        btnAtras.setBounds(10,10,20,20);
        
        //btnAtras.addActionListener(controlador);
        
        
        listaTipoRefenrecia = new JComboBox(new String[]{"Cuenta","Tarjeta Credito","Tarjeta debito"});
        
        campoReferencia = new JTextField();
        campoAlias = new JTextField();
        campoNombre = new JTextField();
        
        campoAlias.setBounds(80, 70, 180, 40);
        campoNombre.setBounds(80, 150, 180, 40);
        listaTipoRefenrecia.setBounds(80,220,180,40);
        campoReferencia.setBounds(80,300,180,40);
        
        etiquetaTitulo = new JLabel("Nuevo contacto");
        etiquetaAlias = new JLabel("Alias");
        etiquetaNombre = new JLabel("Nombre");
        etiquetaTipoReferencia = new JLabel("Tipo referencia");
        etiquetaReferencia = new JLabel("Referencia");
        etiquetaMensaje = new JLabel("Saldo Insuficiente");
        
        etiquetaTitulo.setBounds(130,10, 150, 20);
        etiquetaAlias.setBounds(80, 50, 100, 20);
        etiquetaNombre.setBounds(80, 130, 100, 20);
        etiquetaTipoReferencia.setBounds(80, 200, 100, 20);
        etiquetaReferencia.setBounds(80, 280, 100, 20);
        etiquetaMensaje.setBounds(120, 440,200, 20);
        
        etiquetaTitulo.setForeground(Color.WHITE); 
        
        etiquetaMensaje.setVisible(false);
        
        btnTranseferir = new JButton("Aceptar");
        btnTranseferir.setBackground(Colores.AZUL_CLARO);
        btnTranseferir.setForeground(Color.WHITE);
        btnTranseferir.setBorder(BorderFactory.createEmptyBorder());
        
        btnTranseferir.setBounds(120,370, 100, 40);
        
        btnAtras.addActionListener(controlador);
        btnTranseferir.addActionListener(controlador);
        
        //btnTranseferir.addActionListener(controlador);
        
        
    }
    
    private void agregarComponentes(){
        
        panelCabecera.add(etiquetaTitulo);
        panelCabecera.add(btnAtras);
        
        
        add(panelCabecera);
        
        add(etiquetaAlias);
        add(campoAlias);
        add(etiquetaNombre);
        add(campoNombre);
        add(etiquetaTipoReferencia);
        add(listaTipoRefenrecia);
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

    public JTextField getCampoAlias() {
        return campoAlias;
    }

    public JTextField getCampoNombre() {
        return campoNombre;
    }

    public JComboBox getListaTipoRefenrecia() {
        return listaTipoRefenrecia;
    }
    
    
    
}
