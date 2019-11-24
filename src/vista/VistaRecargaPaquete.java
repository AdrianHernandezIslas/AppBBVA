/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorVistaRecargaPaquete;
import java.awt.Color;
import java.awt.Font;
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
public class VistaRecargaPaquete extends JPanel{
    private JLabel etiquetaCuentaOrigen,etiquetaNumeros,etiquetaTerminacion;
    private JLabel etiquetaSaldo,etiquetaTitulo,etiquetaDestinatario,
                   etiquetaNuevo,etiquetaGuardados,
                   etiquetaMiNumero,etiquetaNumeroTelefono;
    private JLabel etiquetaTelefono,etiquetaCompania,etiquetaMonto;
    private JPanel panelArriba,panelAgregarServicio,panelGuardados;
    private JButton btnSalir, btnRecargar,btnIconoTelefono;
    private JTextField campoNumero;
    private JComboBox listaCompanias,listaMonto;
    private ControladorVistaRecargaPaquete controlador;
    private final Vista vista;

    public VistaRecargaPaquete(Vista vista) {
        super(null);
        this.vista = vista;
        setBounds(0,0,350,550);
        setBackground(Color.WHITE);
        inicializarComponentes();
        agregarComponentes();
    }

    private void inicializarComponentes() {
        
        controlador = new ControladorVistaRecargaPaquete(vista);
        
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
        btnIconoTelefono = new JButton(new Imagen().getImagen("/imagenes/telefono.jpeg",22,37));
        btnRecargar = new JButton("Recargar");
        
        btnSalir.addActionListener(controlador);
        btnIconoTelefono.addActionListener(controlador);
        btnRecargar.addActionListener(controlador);
        
        listaCompanias = new JComboBox(new String[]{"Telcel","Movistar","At&t","UNEFON"});
        listaMonto = new JComboBox(new String[]{"30","50","100","200"});
        
        etiquetaTitulo = new JLabel("Recarga y paquetes");
        etiquetaCuentaOrigen = new JLabel("CUENTA DE RETIRO");
        etiquetaNumeros = new JLabel("0001RV74662");
        etiquetaTerminacion = new JLabel("° 74662");
        etiquetaSaldo = new JLabel("$ 1000.5");
        etiquetaDestinatario = new JLabel("PARA");
        etiquetaMiNumero = new JLabel("Mi numero");
        etiquetaNumeroTelefono = new JLabel("9581065616");
        etiquetaNuevo = new JLabel("Nuevo");
        etiquetaGuardados = new JLabel("OTRO NUMERO");
        etiquetaTelefono = new JLabel("Numero");
        etiquetaCompania = new JLabel("Compañia");
        etiquetaMonto = new JLabel("Monto");
        
        campoNumero = new JTextField(10);
        
        etiquetaTitulo.setForeground(Color.WHITE);
        etiquetaCuentaOrigen.setForeground(Color.WHITE);
        etiquetaNumeros.setForeground(Color.WHITE);
        etiquetaTerminacion.setForeground(Color.WHITE);
        etiquetaSaldo.setForeground(Color.WHITE);
        etiquetaNuevo.setForeground(Colores.AZUL_CLARO);
        
        etiquetaTitulo.setBounds(130,10, 150, 20);
        etiquetaCuentaOrigen.setBounds(20,50,150,20);
        etiquetaNumeros.setBounds(20,80,100, 20);
        etiquetaTerminacion.setBounds(20, 98,100,20);
        etiquetaSaldo.setBounds(250, 80, 100, 20);
        etiquetaDestinatario.setBounds(20, 20, 100, 20);
        etiquetaMiNumero.setBounds(70, 55, 100, 20);
        etiquetaNumeroTelefono.setBounds(70, 75, 100, 20);
        //etiquetaNuevo.setBounds(70, 55, 100, 20);
        etiquetaGuardados.setBounds(20,10, 100, 20);
        etiquetaTelefono.setBounds(30, 40, 100, 20);
        etiquetaCompania.setBounds(150, 40, 100, 20);
        etiquetaMonto.setBounds(250, 40, 100, 20);
        
        
        campoNumero.setBounds(30,70 ,90, 30);
        
        etiquetaTitulo.setForeground(Color.WHITE);
        etiquetaCuentaOrigen.setForeground(Color.WHITE);
        etiquetaNumeros.setForeground(Color.WHITE);
        etiquetaTerminacion.setForeground(Color.WHITE);
        etiquetaSaldo.setForeground(Color.WHITE);
        etiquetaDestinatario.setForeground(Color.BLACK);
        etiquetaNuevo.setForeground(Colores.AZUL_CLARO);
        
        etiquetaNuevo.setFont(new Font("Calibri", 3, 20));
        
        etiquetaMiNumero.setForeground(Colores.AZUL_CLARO);
        
        
        btnSalir.setBounds(10, 10, 30, 30);
        btnIconoTelefono.setBounds(30, 60, 20, 35);
        btnRecargar.setBounds(130, 130, 90, 40);
        
        listaCompanias.setBounds(150, 70, 90, 30);
        listaMonto.setBounds(250, 70, 50, 30);
        
        btnRecargar.setBorder(BorderFactory.createEmptyBorder());
        btnRecargar.setForeground(Color.WHITE);
        btnRecargar.setBackground(Colores.AZUL_CLARO);
    }

    private void agregarComponentes() {
        
        panelArriba.add(btnSalir);
        panelArriba.add(etiquetaTitulo);
        panelArriba.add(etiquetaCuentaOrigen);
        panelArriba.add(etiquetaNumeros);
        panelArriba.add(etiquetaTerminacion);
        panelArriba.add(etiquetaSaldo);
        
        panelAgregarServicio.add(etiquetaDestinatario);
        
        panelAgregarServicio.add(btnIconoTelefono);
        panelAgregarServicio.add(etiquetaMiNumero);
        panelAgregarServicio.add(etiquetaNumeroTelefono);
        
        
        panelGuardados.add(etiquetaGuardados);
        panelGuardados.add(etiquetaTelefono);
        panelGuardados.add(campoNumero);
        panelGuardados.add(etiquetaCompania);
        panelGuardados.add(listaCompanias);
        panelGuardados.add(etiquetaMonto);
        panelGuardados.add(listaMonto);
        panelGuardados.add(btnRecargar);
        
        add(panelArriba);
        add(panelAgregarServicio);
        add(panelGuardados);
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public JButton getBtnRecargar() {
        return btnRecargar;
    }

    public JButton getBtnIconoTelefono() {
        return btnIconoTelefono;
    }

    public JTextField getCampoNumero() {
        return campoNumero;
    }

    public JComboBox getListaCompanias() {
        return listaCompanias;
    }

    public JComboBox getListaMonto() {
        return listaMonto;
    }

    public JLabel getEtiquetaNumeroTelefono() {
        return etiquetaNumeroTelefono;
    }

    
    
    
}
