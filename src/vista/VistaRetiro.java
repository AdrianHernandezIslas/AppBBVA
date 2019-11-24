/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorVistaRetiro;
import vista.extras.Colores;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import modelo.ModeloSaldo;
import vista.extras.Imagen;

/**
 *
 * @author adrian
 */
public class VistaRetiro extends JPanel{
    private JPanel panelArriba,panelDatosRetiro;
    private JLabel etiquetaCuentaRetiro,etiquetaNumeros,etiquetaTerminacion;
    private JLabel etiquetaSaldo,etiquetaTitulo,etiquetaImporte,
                   etiquetaClaveRetiro,etiquetaCodigoSeguridad;
    private JFormattedTextField campoImporte;
    private JTextField campoA, campoB, campoC, campoClave;
    private JButton btnRetirar, btnSalir;
    private ControladorVistaRetiro controlador;
    private final Vista vista;

    public VistaRetiro(Vista vista) {
        super(null);
        this.vista = vista;
        setBounds(0,0,350,550);
        inicializarComponentes();
        agregarComponentes();
    }
    
    private void inicializarComponentes(){
        
        controlador = new ControladorVistaRetiro(vista);
        
        panelArriba = new JPanel(null);
        panelDatosRetiro = new JPanel(null);
        
        panelDatosRetiro.setBounds(0,350,350,170);
        panelDatosRetiro.setBackground(Colores.AZUL_OBSCURO);
        
        panelArriba.setSize(350,150);
        panelArriba.setBackground(Colores.AZUL_INTENSO);
        
        etiquetaTitulo = new JLabel("Retiro sin Tarjeta");
        etiquetaCuentaRetiro = new JLabel("CUENTA DE RETIRO");
        etiquetaNumeros = new JLabel("0001RV74662");
        etiquetaTerminacion = new JLabel("° 74662");
        etiquetaSaldo = new JLabel("$ "+ModeloSaldo.getSaldo());
        etiquetaImporte = new JLabel("IMPORTE");
        etiquetaClaveRetiro = new JLabel("Clave de retiro (12 digitos)");
        etiquetaCodigoSeguridad = new JLabel("Codigo seguridad (4 digitos)");
        
        campoImporte = new JFormattedTextField(new Double("0.0"));
        
        campoA = new JTextField();
        campoB = new JTextField();
        campoC = new JTextField();
        campoClave = new JTextField();
        
        btnRetirar = new JButton("Retirar");
        btnSalir = new JButton(new Imagen().getImagen("/imagenes/tache.png",30,30));
        
   
        etiquetaTitulo.setBounds(130,10, 150, 20);
        etiquetaCuentaRetiro.setBounds(20,50,150,20);
        etiquetaNumeros.setBounds(20,80,100, 20);
        etiquetaTerminacion.setBounds(20, 98,100,20);
        etiquetaSaldo.setBounds(250, 80, 100, 20);
        etiquetaImporte.setBounds(15,200,100,20);
        etiquetaClaveRetiro.setBounds(100,5,150,20);
        etiquetaCodigoSeguridad.setBounds(100,70,190,20);
        
        btnRetirar.setBounds(120, 300, 100, 30);
        btnSalir.setBounds(10, 10, 30, 30);
        
        btnSalir.addActionListener(controlador);
        
        btnRetirar.setBorder(BorderFactory.createEmptyBorder());
        
        campoImporte.setBounds(100,230,150,40);
        campoImporte.setBorder(BorderFactory.createEmptyBorder());
        campoImporte.setFont(new Font("Calibri", 3, 35));
        
        campoA.setBounds(70,30,50,35);
        campoB.setBounds(150,30,50,35);
        campoC.setBounds(230,30,50,35);
        campoClave.setBounds(150,95,50,35);
        
        
        campoA.setBorder(BorderFactory.createEmptyBorder());
        campoA.setForeground(Colores.AZUL_CLARO);
        campoA.setFont(new Font("Calibri", 3, 22));
        campoA.setEditable(false);
        campoA.setText("1234");
        
        campoB.setBorder(BorderFactory.createEmptyBorder());
        campoB.setForeground(Colores.AZUL_CLARO);
        campoB.setFont(new Font("Calibri", 3, 22));
        campoB.setEditable(false);
        campoB.setText("5678");
        
        campoC.setBorder(BorderFactory.createEmptyBorder());
        campoC.setForeground(Colores.AZUL_CLARO);
        campoC.setFont(new Font("Calibri", 3, 22));
        campoC.setEditable(false);
        campoC.setText("4524");
        
        campoClave.setBorder(BorderFactory.createEmptyBorder());
        campoClave.setForeground(Colores.AZUL_CLARO);
        campoClave.setFont(new Font("Calibri", 3, 22));
        campoClave.setEditable(false);
        campoClave.setText("4524");
        
        
        
        etiquetaTitulo.setForeground(Color.WHITE);
        etiquetaCuentaRetiro.setForeground(Color.WHITE);
        etiquetaNumeros.setForeground(Color.WHITE);
        etiquetaTerminacion.setForeground(Color.WHITE);
        etiquetaSaldo.setForeground(Color.WHITE);
        etiquetaClaveRetiro.setForeground(Color.WHITE);
        etiquetaCodigoSeguridad.setForeground(Color.WHITE);
        
        btnRetirar.setForeground(Color.WHITE);
        btnRetirar.setBackground(Colores.AZUL_OBSCURO); 
        
    }
    
    
    private void agregarComponentes(){
        panelArriba.add(btnSalir);
        panelArriba.add(etiquetaTitulo);
        panelArriba.add(etiquetaCuentaRetiro);
        panelArriba.add(etiquetaNumeros);
        panelArriba.add(etiquetaTerminacion);
        panelArriba.add(etiquetaSaldo);
        
        panelDatosRetiro.add(etiquetaClaveRetiro);
        panelDatosRetiro.add(campoA);
        panelDatosRetiro.add(campoB);
        panelDatosRetiro.add(campoC);
        panelDatosRetiro.add(etiquetaCodigoSeguridad);
        panelDatosRetiro.add(campoClave);
        
        add(panelArriba);
        add(etiquetaImporte);
        add(campoImporte);
        add(btnRetirar);
        add(panelDatosRetiro);
    }

    public JButton getBtnRetirar() {
        return btnRetirar;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }
    
}
