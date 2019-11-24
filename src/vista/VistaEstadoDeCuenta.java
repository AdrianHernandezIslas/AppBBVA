/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorVistaEstadoDeCuenta;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;
import modelo.ModeloMovimiento;
import vista.extras.Colores;
import vista.extras.Imagen;
import vista.extras.PanelMovimiento;

/**
 *
 * @author adrian
 */
public class VistaEstadoDeCuenta extends JPanel{
    private JPanel  panelCabecera;
    private JButton btnAtras;
    private int posicionY = 50;
    private ControladorVistaEstadoDeCuenta controlador;
    private final Vista vista;

    public VistaEstadoDeCuenta(Vista vista) {
        super(null);
        this.vista = vista;
        setBounds(0,0,350,550);
        setBackground(Color.WHITE);
        inicalizarComponetes();
        agregarComponetes();
    }
    
    private void inicalizarComponetes(){
        controlador = new ControladorVistaEstadoDeCuenta(vista);
        
        panelCabecera = new JPanel(null);
        
        panelCabecera.setBounds(0,0,350,40);
        
        panelCabecera.setBackground(Colores.AZUL_INTENSO);
        
        btnAtras = new JButton(new Imagen().getImagen("/imagenes/back.jpeg",20,20));
        
        btnAtras.addActionListener(controlador);
        
        btnAtras.setBounds(10,10,20,20);
    }
    
    private void agregarComponetes(){
        panelCabecera.add(btnAtras);
        
        add(panelCabecera);
        agregarMovimientos();
    }
    
    private void agregarMovimientos(){
        ArrayList<JPanel> movimientos = ModeloMovimiento.getMovimientos();
        
        for (JPanel movimiento : movimientos) {
            movimiento.setLocation(20,posicionY);
            add(movimiento);
            posicionY +=70;
        }
    }
   
    
}
