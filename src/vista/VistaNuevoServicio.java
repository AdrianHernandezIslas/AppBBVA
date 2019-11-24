/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorVistaNuevoServicio;
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
public class VistaNuevoServicio extends JPanel{
    private JPanel panelCabecera;
    private JButton btnAtras,btnRegistrar;
    private JLabel etiquetaReferencia,etiquetaTipoReferencia,etiquetaMensaje,
                   etiquetaAlias,etiquetaImporte,etiquetaTitulo;
    private JTextField campoReferencia,campoAlias,campoImporte;
    private JComboBox listaTipoRefenrecia;
    private ControladorVistaNuevoServicio controlador;
    private final Vista vista;

    public VistaNuevoServicio(Vista vista) {
        super(null);
        this.vista = vista;
        setBounds(0,0,350,550);
        setBackground(Color.WHITE);
        inicializarComponentes();
        agregarComponentes();
    }

    private void inicializarComponentes() {
        
        controlador = new ControladorVistaNuevoServicio(vista);
        
        panelCabecera = new JPanel(null);
        
        
        panelCabecera.setBounds(0,0,350,40);
        
        panelCabecera.setBackground(Colores.AZUL_INTENSO);
        
        btnAtras = new JButton(new Imagen().getImagen("/imagenes/tache.png",20,20));
        btnAtras.setBounds(10,10,20,20);
        btnAtras.addActionListener(controlador);
       
        
        listaTipoRefenrecia = new JComboBox(new String[]{"CFE","IZZI","TELMEX","TELCEL","SKY","MOVISTAR",
                                                         "MERCADO LIBRE","TOYOTA","INVEX"});
        
        campoReferencia = new JTextField();
        campoAlias = new JTextField();
        campoImporte = new JTextField();
        
        listaTipoRefenrecia.setBounds(80, 70, 180, 40);
        campoReferencia.setBounds(80, 150, 180, 40);
        campoImporte.setBounds(80,220,180,40);
        campoAlias.setBounds(80,300,180,40);
        
        etiquetaTitulo = new JLabel("Nuevo servicio");
        etiquetaAlias = new JLabel("Alias");
        etiquetaImporte = new JLabel("Importe");
        etiquetaTipoReferencia = new JLabel("Tipo referencia");
        etiquetaReferencia = new JLabel("Referencia");
        etiquetaMensaje = new JLabel("Saldo Insuficiente");
        
        etiquetaTitulo.setBounds(130,10, 150, 20);
        etiquetaTipoReferencia.setBounds(80, 50, 100, 20);
        etiquetaReferencia.setBounds(80, 130, 100, 20);
        etiquetaImporte.setBounds(80, 200, 100, 20);
        etiquetaAlias.setBounds(80, 280, 100, 20);
        etiquetaMensaje.setBounds(120, 440,200, 20);
        
        etiquetaTitulo.setForeground(Color.WHITE); 
        
        etiquetaMensaje.setVisible(false);
        
        btnRegistrar = new JButton("Aceptar");
        btnRegistrar.setBackground(Colores.AZUL_CLARO);
        btnRegistrar.setForeground(Color.WHITE);
        btnRegistrar.setBorder(BorderFactory.createEmptyBorder());
        
        btnRegistrar.setBounds(120,370, 100, 40);
        //ps.setLocation(50, 400);
        
        btnRegistrar.addActionListener(controlador);
        //add(ps);
        //btnTranseferir.addActionListener(controlador);
        
        
    }
    
    private void agregarComponentes(){
        
        panelCabecera.add(etiquetaTitulo);
        panelCabecera.add(btnAtras);
        
        
        add(panelCabecera);
        
        add(etiquetaAlias);
        add(campoAlias);
        add(etiquetaImporte);
        add(campoImporte);
        add(etiquetaTipoReferencia);
        add(listaTipoRefenrecia);
        add(etiquetaReferencia);
        add(campoReferencia);
        add(btnRegistrar);
        add(etiquetaMensaje);
        
    }

    public JButton getBtnAtras() {
        return btnAtras;
    }

    public JButton getBtnRegistar() {
        return btnRegistrar;
    }

    public JTextField getCampoReferencia() {
        return campoReferencia;
    }

    public JTextField getCampoAlias() {
        return campoAlias;
    }

    public JTextField getCampoImporte() {
        return campoImporte;
    }

    public JComboBox getListaTipoRefenrecia() {
        return listaTipoRefenrecia;
    }
}
