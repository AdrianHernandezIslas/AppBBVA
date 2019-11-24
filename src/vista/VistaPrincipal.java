/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import vista.extras.Imagen;
import vista.extras.Colores;
import controlador.ControladorVistaPrincipal;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import modelo.ModeloSaldo;

/**
 *
 * @author adrian
 */
public class VistaPrincipal extends JPanel{
    private JButton btnTransferir,btnPagarServicio,btnRetiroSinTarjetas;
    private JButton btnFlecha;
    private JPanel panelArriba,panelCentro;
    private JLabel etiquetaCuentaPesos,etiquetaSaludo,etiquetaNumeros,
                   etiquetaSaldo,etiquetaMsjSaldoD,etiquetaTerminacion;
    private JLabel etiquetaIconoNombre,etiquetaFooter;
    private ControladorVistaPrincipal controlador;
    private Vista vista;
    
    public VistaPrincipal(Vista vista) {
        super();
        this.vista = vista;
        setLayout(null);
        setBounds(0,0,350,550);
        //setBackground(Colores.AZUL_CLARO);
        inicializarComponentes();
        agregarComponentes();
        
    }
    
    
    private void inicializarComponentes(){
        controlador = new ControladorVistaPrincipal(vista);
        
        panelArriba = new JPanel(null);
        panelCentro = new JPanel(null);
        
        
        panelArriba.setBounds(0,0,350,300);
        panelArriba.setBackground(Colores.AZUL_CLARO);
        
        panelCentro.setBounds(10,220,330,100);
        panelCentro.setBackground(Color.WHITE);
        panelCentro.addMouseListener(controlador);
        
        btnTransferir = new JButton(new Imagen().getImagen("/imagenes/transferir.jpeg",80,80));
        btnPagarServicio = new JButton(new Imagen().getImagen("/imagenes/oportunidades.jpeg",80,80));
        btnRetiroSinTarjetas = new JButton(new Imagen().getImagen("/imagenes/retiro.jpeg",90,90));
        btnFlecha = new JButton(new Imagen().getImagen("/imagenes/flecha.jpeg",40,30));
        
        btnTransferir.setBounds(38,90,80,80);
        btnPagarServicio.setBounds(128,90,80,80);
        btnRetiroSinTarjetas.setBounds(218,90,80,90);
        btnFlecha.setBounds(148,180,40,30);
        
        //btnTransferir.addActionListener(controlador);
        //btnOportunidades.addActionListener(controlador);
        //btnRetiroSinTarjetas.addActionListener(controlador);
        
        etiquetaIconoNombre = new JLabel(new Imagen().getImagen("/imagenes/circle.png",40,40));
        etiquetaCuentaPesos = new JLabel("CUENTA EN PESOS");
        etiquetaSaludo = new JLabel("Buenos dias, ROBERTO");
        etiquetaNumeros = new JLabel("0001RV74662");
        etiquetaSaldo = new JLabel("$ "+ModeloSaldo.getSaldo());
        etiquetaMsjSaldoD = new JLabel("Saldo disponible");
        etiquetaTerminacion = new JLabel("° 74662");
        etiquetaFooter = new JLabel(new Imagen().getImagen("/imagenes/footerr.jpeg",350,35));
        
        etiquetaSaludo.setBounds(110,50,135,20);
        etiquetaCuentaPesos.setBounds(10,10,135,20);
        etiquetaNumeros.setBounds(10,50,100,20);
        etiquetaSaldo.setBounds(250,50, 100, 20);
        etiquetaMsjSaldoD.setBounds(210, 70, 100, 20);
        etiquetaTerminacion.setBounds(10,70, 100, 20);
        etiquetaIconoNombre.setBounds(150,10,40,40);
        etiquetaFooter.setBounds(0,485, 350,30);
        
        etiquetaSaludo.setForeground(Color.WHITE);
        etiquetaNumeros.setForeground(Colores.AZUL_CLARO);
        etiquetaMsjSaldoD.setForeground(Color.GRAY);
        
        btnTransferir.setBackground(Colores.AZUL_CLARO);
        btnTransferir.setBorder(null);
        
        btnPagarServicio.setBackground(Colores.AZUL_CLARO);
        btnPagarServicio.setBorder(null);
        
        btnRetiroSinTarjetas.setBackground(Colores.AZUL_CLARO);
        btnPagarServicio.setBorder(null);
    }
    
    private void agregarComponentes(){
        
        panelArriba.add(etiquetaIconoNombre);
        panelArriba.add(etiquetaSaludo);
        panelArriba.add(btnTransferir);
        panelArriba.add(btnPagarServicio);
        panelArriba.add(btnRetiroSinTarjetas);
        panelArriba.add(btnFlecha);
        
        panelCentro.add(etiquetaCuentaPesos);
        panelCentro.add(etiquetaNumeros);
        panelCentro.add(etiquetaSaldo);
        panelCentro.add(etiquetaMsjSaldoD);
        panelCentro.add(etiquetaTerminacion);
        
        
        add(panelCentro);
        add(panelArriba);
        add(etiquetaFooter);
       
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
    
    
    
}
