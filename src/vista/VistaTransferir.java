/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorVistaTransferir;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import modelo.ModeloDestinatarioTransferencia;
import modelo.ModeloSaldo;
import vista.extras.Colores;
import vista.extras.Imagen;
import vista.extras.PanelDestinatario;

/**
 *
 * @author adrian
 */
public class VistaTransferir extends JPanel{
    
    private JLabel etiquetaCuentaOrigen,etiquetaNumeros,etiquetaTerminacion;
    private JLabel etiquetaSaldo,etiquetaTitulo,etiquetaDestinatario,
                   etiquetaNuevo,etiquetaGuardados;
    private JPanel panelArriba,panelAgregarDestinatario,panelGuardados;
    private JButton btnSalir, btnAgregarDestinatario;
    private PanelDestinatario panelDestinatario;
    private int posicionY = 30;
    private final Vista vista;
    private ControladorVistaTransferir controlador;

    public VistaTransferir(Vista vista) {
        super(null);
        this.vista = vista;
        setBounds(0,0,350,550);
        setBackground(Color.WHITE);
        inicializarComponentes();
        agregarComponentes();
    }
    
    private void inicializarComponentes(){
        
        controlador = new ControladorVistaTransferir(vista);
        
        panelArriba = new JPanel(null);
        panelAgregarDestinatario = new JPanel(null);
        panelGuardados = new JPanel(null);
        
        panelArriba.setSize(350,150);
        panelArriba.setBackground(Colores.AZUL_INTENSO);
        
        panelAgregarDestinatario.setBounds(0,160,350, 100);
        panelAgregarDestinatario.setBackground(Color.WHITE);
        
        
        
        panelGuardados.setBounds(0, 280,350, 225);
        panelGuardados.setBackground(Color.WHITE);
        
        
        //panelDestinatario.addMouseListener(controlador);
        
        btnSalir = new JButton(new Imagen().getImagen("/imagenes/tache.png",30,30));
        btnAgregarDestinatario = new JButton(new Imagen().getImagen("/imagenes/addDestinatario.jpeg",40,40));
        
        etiquetaTitulo = new JLabel("Transferir");
        etiquetaCuentaOrigen = new JLabel("CUENTA DE ORIGEN");
        etiquetaNumeros = new JLabel("0001RV74662");
        etiquetaTerminacion = new JLabel("° 74662");
        etiquetaSaldo = new JLabel("$ "+ModeloSaldo.getSaldo());
        etiquetaDestinatario = new JLabel("DESTINATARIO");
        etiquetaNuevo = new JLabel("Nuevo");
        etiquetaGuardados = new JLabel("GUARDADOS");
        
        etiquetaTitulo.setBounds(130,10, 150, 20);
        etiquetaCuentaOrigen.setBounds(20,50,150,20);
        etiquetaNumeros.setBounds(20,80,100, 20);
        etiquetaTerminacion.setBounds(20, 98,100,20);
        etiquetaSaldo.setBounds(250, 80, 100, 20);
        etiquetaDestinatario.setBounds(20, 20, 100, 20);
        etiquetaNuevo.setBounds(70, 55, 100, 20);
        etiquetaGuardados.setBounds(20,10, 100, 20);
        
        etiquetaTitulo.setForeground(Color.WHITE);
        etiquetaCuentaOrigen.setForeground(Color.WHITE);
        etiquetaNumeros.setForeground(Color.WHITE);
        etiquetaTerminacion.setForeground(Color.WHITE);
        etiquetaSaldo.setForeground(Color.WHITE);
        etiquetaDestinatario.setForeground(Color.BLACK);
        etiquetaNuevo.setForeground(Colores.AZUL_CLARO);
        
        etiquetaNuevo.setFont(new Font("Calibri", 3, 20));
        
        
        btnSalir.setBounds(10, 10, 30, 30);
        btnAgregarDestinatario.setBounds(20,50, 40, 40);
        
        btnAgregarDestinatario.addActionListener(controlador);
        
        btnSalir.addActionListener(controlador);
    }

    private void agregarComponentes(){
        
        panelArriba.add(btnSalir);
        panelArriba.add(etiquetaTitulo);
        panelArriba.add(etiquetaCuentaOrigen);
        panelArriba.add(etiquetaNumeros);
        panelArriba.add(etiquetaTerminacion);
        panelArriba.add(etiquetaSaldo);
        
        panelAgregarDestinatario.add(etiquetaDestinatario);
        panelAgregarDestinatario.add(btnAgregarDestinatario);
        panelAgregarDestinatario.add(etiquetaNuevo);
        
        panelGuardados.add(etiquetaGuardados);
        agregarDestinatarios();
        
        add(panelArriba);
        add(panelAgregarDestinatario);
        add(panelGuardados);
        
    }
    
    private void agregarDestinatarios(){
        ArrayList<PanelDestinatario> destinataros = ModeloDestinatarioTransferencia.getDestinatarios();
        for (PanelDestinatario destinataro : destinataros) {
            destinataro.setLocation(20,posicionY);
            destinataro.addMouseListener(controlador);
            panelGuardados.add(destinataro);
            posicionY += 110;
        }
        
        
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }
    
    public JButton getBtnAgregarDestinatario() {
        return btnAgregarDestinatario;
    }
    
    
    
    
}
