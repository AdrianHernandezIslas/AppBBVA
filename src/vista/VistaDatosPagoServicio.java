/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorVistaDatosPagoServicio;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import vista.extras.Colores;
import vista.extras.Imagen;
import vista.extras.PanelServicio;

/**
 *
 * @author adrian
 */
public class VistaDatosPagoServicio extends JPanel {
    private JPanel panelCabecera;
    private final PanelServicio panelServicio;
    private JButton btnAtras, btnPagar;
    private JTextField campoCantidad;
    private JLabel etiquetaCantidad;
    private ControladorVistaDatosPagoServicio controlador;
    private final Vista vista;

    public VistaDatosPagoServicio(Vista vista,PanelServicio panelServicio) {
        super(null);
        this.vista = vista;
        this.panelServicio = panelServicio;
        setBounds(0,0,350,550);
        setBackground(Color.WHITE);
        inicializarComponetes();
        agregarComponentes();
    }

    private void inicializarComponetes() {
        
         controlador = new ControladorVistaDatosPagoServicio(vista);
         
         panelCabecera = new JPanel(null);
         panelServicio.setLocation(60,60);
         
         panelCabecera.setBounds(0,0,350,40);
        
         panelCabecera.setBackground(Colores.AZUL_INTENSO);
         
         btnAtras = new JButton(new Imagen().getImagen("/imagenes/back.jpeg",20,20));
         btnAtras.setBounds(10,10,20,20);
         
         campoCantidad = new JTextField();
         campoCantidad.setBounds(80,200,180,40);
         
         etiquetaCantidad = new JLabel("Monto");
         
         etiquetaCantidad.setBounds(80, 180, 100, 20);
         
         btnAtras.addActionListener(controlador);
         
         btnPagar = new JButton("Aceptar");
         btnPagar.setBackground(Colores.AZUL_CLARO);
         btnPagar.setForeground(Color.WHITE);
         btnPagar.setBorder(BorderFactory.createEmptyBorder());
        
         btnPagar.setBounds(120,350, 100, 40);
        
         btnPagar.addActionListener(controlador);
    }
    
    private void agregarComponentes(){
        
        panelCabecera.add(btnAtras);
        
        
        add(panelCabecera);
        add(panelServicio);
        add(etiquetaCantidad);
        add(campoCantidad);
        add(btnPagar);
    }
    
    
}
