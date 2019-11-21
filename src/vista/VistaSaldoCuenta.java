/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorVistaSaldoCuenta;
import vista.extras.PanelMovimiento;
import vista.extras.Imagen;
import vista.extras.Colores;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import modelo.ModeloMovimiento;
import modelo.ModeloSaldo;

/**
 *
 * @author adrian
 */
public class VistaSaldoCuenta extends JPanel{
    
    private JPanel  panelCabecera, panelSaldo,panelInformativo,
                    panelOperaciones, panelMovimientos;
    private JLabel  etiquetaCuenta, etiquetaNumerosCuenta,etiquetaSaldo,
                    etiquetaMensajeSaldoD,etiquetaDetalleCuenta,
                    etiquetaComienza,etiquetaCrearApar,etiquetaUltimosMovi,
                    etiquetaVerTodos, etiquetaIcono;
    private JButton btnTransferir,btnPagarServicio,btnRetiroSinTarjetas,
                    btnVerMas, btnAtras;
    private ControladorVistaSaldoCuenta controlador;
    private final Vista vista;
    private int posicionY;

    public VistaSaldoCuenta(Vista vista) {
        super(null);
        this.vista = vista;
        setBounds(0,0,350,550);
        posicionY = 40;
        inicializarComponentes();
        agregarComponetes();
        
        
    }
    
    private void inicializarComponentes(){
        
        controlador = new ControladorVistaSaldoCuenta(vista);
        
        panelCabecera = new JPanel(null);
        panelSaldo = new JPanel(null);
        panelInformativo = new JPanel(null);
        panelOperaciones = new JPanel(null);
        panelMovimientos = new JPanel(null);
        //panelMovimiento = new PanelMovimiento("CFE CONTIGO MU","MOVIMIENTO BBVA","-435.0");
    
        
        panelCabecera.setBounds(0,0,350,40);
        panelSaldo.setBounds(10,50,330,170);
        panelInformativo.setBounds(10, 230, 330,80);
        panelOperaciones.setBounds(0,320, 350, 90);
        panelMovimientos.setBounds(0, 410,350, 500);
        
        //panelMovimiento.setLocation(20,40);
        
        panelCabecera.setBackground(Colores.AZUL_INTENSO);
        panelSaldo.setBackground(Color.WHITE);
        panelInformativo.setBackground(Color.WHITE);
        panelOperaciones.setBackground(Colores.AZUL_CLARO);
        panelMovimientos.setBackground(Color.WHITE);
        
        etiquetaCuenta = new JLabel("CUENTA ° 1234");
        etiquetaNumerosCuenta = new JLabel("0001RV4662");
        etiquetaSaldo = new JLabel("$ "+ModeloSaldo.getSaldo());
        etiquetaMensajeSaldoD = new JLabel("Saldo disponible");
        etiquetaDetalleCuenta = new JLabel("Detalle de cuenta");
        etiquetaComienza = new JLabel("Comienza a organizar tu dinero");
        etiquetaCrearApar = new JLabel("Crear apartado");
        etiquetaUltimosMovi = new JLabel("ULTIMOS MOVIMIENTOS");
        etiquetaVerTodos = new JLabel("Ver todos");
        etiquetaIcono = new JLabel(new Imagen().getImagen("/imagenes/icono.jpeg",20,20));
        
        etiquetaCuenta.setBounds(120, 10, 100, 20);
        etiquetaNumerosCuenta.setBounds(100,20, 170, 20);
        etiquetaSaldo.setBounds(120,50, 200, 28);
        etiquetaMensajeSaldoD.setBounds(120,80, 100, 20);
        etiquetaDetalleCuenta.setBounds(120,140,100, 20);
        etiquetaComienza.setBounds(80,20,300,20);
        etiquetaCrearApar.setBounds(110,50, 100, 20);
        etiquetaUltimosMovi.setBounds(20,10,150,20);
        etiquetaVerTodos.setBounds(270,10, 130, 20);
        etiquetaIcono.setBounds(50, 15, 30, 30);
        
        etiquetaCuenta.setForeground(Color.WHITE);
        etiquetaDetalleCuenta.setForeground(Colores.AZUL_CLARO);
        etiquetaCrearApar.setForeground(Colores.AZUL_CLARO);
        etiquetaVerTodos.setForeground(Colores.AZUL_CLARO);
        
        
        etiquetaNumerosCuenta.setFont(new Font("Calibri", 3, 25));
        etiquetaSaldo.setFont(new Font("Calibri", 3, 28));
        
        btnTransferir = new JButton(new Imagen().getImagen("/imagenes/transferir.jpeg",80,80));
        btnPagarServicio = new JButton(new Imagen().getImagen("/imagenes/pagar_sevicios.jpeg",80,90));
        btnRetiroSinTarjetas = new JButton(new Imagen().getImagen("/imagenes/retiro.jpeg",90,90));
        btnVerMas = new JButton(new Imagen().getImagen("/imagenes/mas.jpeg",80,80));
        btnAtras = new JButton(new Imagen().getImagen("/imagenes/back.jpeg",20,20));
        
        btnAtras.addActionListener(controlador);
        btnTransferir.addActionListener(controlador);
        btnPagarServicio.addActionListener(controlador);
        btnRetiroSinTarjetas.addActionListener(controlador);
        btnVerMas.addActionListener(controlador);
        
        
        
        btnTransferir.setBounds(10,0,80,80);
        btnPagarServicio.setBounds(90,0,80,90);
        btnRetiroSinTarjetas.setBounds(170,0,80,90);
        btnVerMas.setBounds(250,0, 80, 80);
        btnAtras.setBounds(10,10,20,20);
        
    }
    
    private void agregarComponetes(){
        panelCabecera.add(btnAtras);
        panelCabecera.add(etiquetaCuenta);
        
        panelSaldo.add(etiquetaNumerosCuenta);
        panelSaldo.add(etiquetaSaldo);
        panelSaldo.add(etiquetaMensajeSaldoD);
        panelSaldo.add(etiquetaDetalleCuenta);
        
        panelInformativo.add(etiquetaIcono);
        panelInformativo.add(etiquetaComienza);
        panelInformativo.add(etiquetaCrearApar);
        
        panelOperaciones.add(btnTransferir);
        panelOperaciones.add(btnPagarServicio);
        panelOperaciones.add(btnRetiroSinTarjetas);
        panelOperaciones.add(btnVerMas);
      
        
        panelMovimientos.add(etiquetaUltimosMovi);
        panelMovimientos.add(etiquetaVerTodos);
        //panelMovimientos.add(panelMovimiento);
        cargarMovimientos();
        
        add(panelCabecera);
        add(panelSaldo);
        add(panelInformativo);
        add(panelOperaciones);
        add(panelMovimientos);
        
    }
    
    private void cargarMovimientos(){
        ArrayList<JPanel> movimientos = ModeloMovimiento.getMovimientos();
        for (JPanel movimiento : movimientos) {
            movimiento.setLocation(20, posicionY);
            panelMovimientos.add(movimiento);
            posicionY += 60;
        }
    }

    public JButton getBtnAtras() {
        return btnAtras;
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

    public JButton getBtnVerMas() {
        return btnVerMas;
    }
    
    
    
}
