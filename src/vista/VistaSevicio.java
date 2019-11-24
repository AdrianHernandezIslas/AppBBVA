/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorVistaServicio;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import modelo.ModeloSaldo;
import modelo.ModeloServicio;
import vista.extras.Colores;
import vista.extras.Imagen;
import vista.extras.PanelServicio;

/**
 *
 * @author adrian
 */
public class VistaSevicio extends JPanel{
    private JLabel etiquetaCuentaOrigen,etiquetaNumeros,etiquetaTerminacion;
    private JLabel etiquetaSaldo,etiquetaTitulo,etiquetaDestinatario,
                   etiquetaNuevo,etiquetaGuardados;
    private JButton btnSalir, btnAgregarServicio;
    private JPanel panelArriba,panelAgregarServicio,panelGuardados;
    private ControladorVistaServicio controlador;
    private int posicionY = 30;
    private final Vista vista;

    public VistaSevicio(Vista vista) {
        super(null);
        this.vista = vista;
        setBounds(0,0,350,550);
        setBackground(Color.WHITE);
        inicializarComponentes();
        agregarComponentes();
    }
    
    private void inicializarComponentes() {
        controlador = new ControladorVistaServicio(vista);
        
        panelArriba = new JPanel(null);
        panelAgregarServicio = new JPanel(null);
        panelGuardados = new JPanel(null);
        
        panelArriba.setSize(350,150);
        panelArriba.setBackground(Colores.AZUL_INTENSO);
        
        panelAgregarServicio.setBounds(0,160,350, 100);
        panelAgregarServicio.setBackground(Color.WHITE);
        
        panelGuardados.setBounds(0, 280,350, 225);
        panelGuardados.setBackground(Color.WHITE);
        
        btnSalir = new JButton(new Imagen().getImagen("/imagenes/tache.png",30,30));
        btnAgregarServicio = new JButton(new Imagen().getImagen("/imagenes/addDestinatario.jpeg",40,40));
        
        etiquetaTitulo = new JLabel("Pagar servicio");
        etiquetaCuentaOrigen = new JLabel("CUENTA DE RETIRO");
        etiquetaNumeros = new JLabel("0001RV74662");
        etiquetaTerminacion = new JLabel("° 74662");
        etiquetaSaldo = new JLabel("$ "+ModeloSaldo.getSaldo());
        etiquetaDestinatario = new JLabel("SERVICIO");
        etiquetaNuevo = new JLabel("Nuevo servicio");
        etiquetaGuardados = new JLabel("GUARDADOS");
        
        etiquetaTitulo.setBounds(130,10, 150, 20);
        etiquetaCuentaOrigen.setBounds(20,50,150,20);
        etiquetaNumeros.setBounds(20,80,100, 20);
        etiquetaTerminacion.setBounds(20, 98,100,20);
        etiquetaSaldo.setBounds(250, 80, 100, 20);
        etiquetaDestinatario.setBounds(20, 20, 100, 20);
        etiquetaNuevo.setBounds(70, 55, 150, 20);
        etiquetaGuardados.setBounds(20,10, 100, 20);
        
        etiquetaTitulo.setForeground(Color.WHITE);
        etiquetaCuentaOrigen.setForeground(Color.WHITE);
        etiquetaNumeros.setForeground(Color.WHITE);
        etiquetaTerminacion.setForeground(Color.WHITE);
        etiquetaSaldo.setForeground(Color.WHITE);
        etiquetaNuevo.setForeground(Colores.AZUL_CLARO);
        
        etiquetaNuevo.setFont(new Font("Calibri", 3, 20));
        
        btnSalir.setBounds(10, 10, 30, 30);
        btnAgregarServicio.setBounds(20,50, 40, 40);
        
        btnSalir.addActionListener(controlador);
        btnAgregarServicio.addActionListener(controlador);
        
    }

    private void agregarComponentes() {
        
        panelArriba.add(btnSalir);
        panelArriba.add(etiquetaTitulo);
        panelArriba.add(etiquetaCuentaOrigen);
        panelArriba.add(etiquetaNumeros);
        panelArriba.add(etiquetaTerminacion);
        panelArriba.add(etiquetaSaldo);
        
        panelAgregarServicio.add(etiquetaDestinatario);
        panelAgregarServicio.add(btnAgregarServicio);
        panelAgregarServicio.add(etiquetaNuevo);
        
        panelGuardados.add(etiquetaGuardados);
        agregarContactos();
        
        add(panelArriba);
        add(panelAgregarServicio);
        add(panelGuardados);
    }
    
    private void agregarContactos(){
        ArrayList<PanelServicio> servicios = ModeloServicio.getServicios();
        for (PanelServicio servicio : servicios) {
            servicio.setLocation(30, posicionY);
            servicio.addMouseListener(controlador);
            panelGuardados.add(servicio);
            posicionY += 80;
        }
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public JButton getBtnAgregarServicio() {
        return btnAgregarServicio;
    } 
    
}
