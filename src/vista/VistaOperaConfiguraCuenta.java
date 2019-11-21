/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorVistaOperaConfiguraCuenta;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import vista.extras.Colores;
import vista.extras.Imagen;

/**
 *
 * @author adrian
 */
public class VistaOperaConfiguraCuenta extends JPanel{
    private JButton btnTransferir,btnPagarServicio,btnRetiroSinTarjetas,
                    btnSalir,btnRecargas,btnEstadoCuenta,btnOperacionQR;
    private JPanel  panelOperar,panelConfigurar;
    private JLabel  etiquetaIconosInformativos,etiquetaOperarCuenta,
                    etiquetaConfigurarCuenta;
    private final Vista vista;
    private ControladorVistaOperaConfiguraCuenta controlador;

    public VistaOperaConfiguraCuenta(Vista vista) {
        super(null);
        this.vista = vista;
        setBounds(0,0,350,550);
        //setBackground(Colores.AZUL_CLARO);
        inicializarComponentes();
        agregarComponentes();
    }

    private void inicializarComponentes() {
        
        controlador = new ControladorVistaOperaConfiguraCuenta(vista);
        
        panelOperar = new JPanel(null);
        panelConfigurar = new JPanel(null);
        
        panelOperar.setBounds(0,0,350,300);
        panelOperar.setBackground(Colores.AZUL_CLARO);
        
        panelConfigurar.setBounds(0,300,350,220);
        panelConfigurar.setBackground(Colores.AZUL_obscuro);
        
        btnSalir = new JButton(new Imagen().getImagen("/imagenes/tacheAzul.png",30,30));
        btnTransferir = new JButton(new Imagen().getImagen("/imagenes/transferir.jpeg",80,80));
        btnPagarServicio = new JButton(new Imagen().getImagen("/imagenes/pagar_sevicios.jpeg",80,80));
        btnRetiroSinTarjetas = new JButton(new Imagen().getImagen("/imagenes/retiro.jpeg",90,90));
        btnRecargas = new JButton(new Imagen().getImagen("/imagenes/recargas.jpeg",80,90));
        btnEstadoCuenta = new JButton(new Imagen().getImagen("/imagenes/estadoCuenta.jpeg",80,90));
        btnOperacionQR = new JButton(new Imagen().getImagen("/imagenes/operacionesQR.jpeg",80,90));
        
        btnSalir.addActionListener(controlador);
        btnTransferir.addActionListener(controlador);
        btnPagarServicio.addActionListener(controlador);
        btnRetiroSinTarjetas.addActionListener(controlador);
        btnRecargas.addActionListener(controlador);
        btnEstadoCuenta.addActionListener(controlador);
        
        btnSalir.setBounds(20, 20, 30, 30);
        btnTransferir.setBounds(38,90,80,80);
        btnPagarServicio.setBounds(128,90,80,80);
        btnRetiroSinTarjetas.setBounds(218,90,80,90);
        btnRecargas.setBounds(38, 190, 80, 90);
        btnEstadoCuenta.setBounds(128,190, 80, 90);
        btnOperacionQR.setBounds(218, 190, 80, 90);
        
        etiquetaIconosInformativos = new JLabel(new Imagen().getImagen("/imagenes/funcionesInfo.jpeg",290,90));
        etiquetaOperarCuenta = new JLabel("OPERAR CUENTA");
        etiquetaConfigurarCuenta = new JLabel("CONFIGURAR CUENTA");
        
        etiquetaIconosInformativos.setBounds(20,50, 300, 90);
        etiquetaConfigurarCuenta.setBounds(20,10,150, 20);
        etiquetaOperarCuenta.setBounds(20, 50, 150, 20);
        
        etiquetaConfigurarCuenta.setForeground(Color.WHITE);
        etiquetaOperarCuenta.setForeground(Color.WHITE);
        
        
        
    }

    private void agregarComponentes() {
        
        panelOperar.add(btnSalir);
        panelOperar.add(etiquetaOperarCuenta);
        panelOperar.add(btnTransferir);
        panelOperar.add(btnPagarServicio);
        panelOperar.add(btnRetiroSinTarjetas);
        panelOperar.add(btnRecargas);
        panelOperar.add(btnEstadoCuenta);
        panelOperar.add(btnOperacionQR);
        
        panelConfigurar.add(etiquetaConfigurarCuenta);
        panelConfigurar.add(etiquetaIconosInformativos);
        
        add(panelOperar);
        add(panelConfigurar);
    }

    public JButton getBtnTransferir() {
        return btnTransferir;
    }

    public JButton getBtnPagarServicio() {
        return btnPagarServicio;
    }

    public JButton getBtnRetiroSinTarjetas() {
        return btnRetiroSinTarjetas;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public JButton getBtnRecargas() {
        return btnRecargas;
    }

    public JButton getBtnEstadoCuenta() {
        return btnEstadoCuenta;
    }

    public JButton getBtnOperacionQR() {
        return btnOperacionQR;
    }
    
}
