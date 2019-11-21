/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import vista.extras.JPanelBackgroundImage;
import vista.extras.Imagen;
import vista.extras.Colores;
import controlador.ControladorInicioSesion;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Julio
 */
public class Vista extends JFrame{
    
    private JPanel panelCentro,panelAbajo;
    private JPanelBackgroundImage panelArribba;
    private JLabel etiquetaHola,etiquetaNombre,etiquetaCambiarUsu,
                   etiquetaOlvidePass,etiquetaTitulo,etiquetaLinea,
                   etiquetaMensaje;
    private JPasswordField campoContrasenia;
    private JButton btnEntrar;
    private JScrollPane scroll;
    private ControladorInicioSesion controlador;
    private VistaPrincipal vistaPrincipal;
    private VistaSaldoCuenta vistaSaldoCuenta;
    private VistaRetiro vistaRetiro;
    private VistaTransferir vistaTransferir;
    private VistaPagarSevicio vistaPagarSevicio;
    private VistaOperaConfiguraCuenta vistaOperaConfiguraCuenta;
    private VistaRecargaPaquete vistaRecargaPaquete;
    private VistaDatosTransferencia vistaDatosTransferencia;

    public Vista() {
        super("App");
        setBounds(400,100,350,550);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        inicializarComponntes();
        agregarComponentes();
        setVisible(true);
    }
    
    public void inicializarComponntes(){
        controlador = new ControladorInicioSesion(this);
        
        panelArribba = new JPanelBackgroundImage(new GridLayout(10,10));
        panelCentro = new JPanel(null);
        panelAbajo = new JPanel(new GridLayout(0,1));
        
        panelArribba.setOpaque(false);
        panelArribba.setBackground("/imagenes/imga.jpg");
        
        panelCentro.setBackground(Colores.AZUL_OBSCURO);
        panelAbajo.setBackground(Colores.AZUL_OBSCURO);
        
        etiquetaHola = new JLabel("Hola");
        etiquetaNombre = new JLabel("Roberto");
        etiquetaCambiarUsu = new JLabel("Cambiar usuario");
        etiquetaOlvidePass = new JLabel("Olvide mi contraseña");
        etiquetaTitulo = new JLabel("BBVA");
        etiquetaLinea = new JLabel("__________________________________");
        etiquetaMensaje = new JLabel("¡Datos introducidos incorrectos!");
        etiquetaLinea.setForeground(Color.WHITE);
        
        etiquetaTitulo.setHorizontalAlignment(JLabel.CENTER);
        
        etiquetaTitulo.setFont(new Font("Calibri", 3, 15));
        etiquetaTitulo.setForeground(Color.WHITE);
        etiquetaHola.setForeground(Color.WHITE);
        etiquetaHola.setFont(new Font("Calibri", 3, 35));
        etiquetaNombre.setForeground(Color.WHITE);
        etiquetaCambiarUsu.setForeground(Color.WHITE);
        etiquetaOlvidePass.setForeground(Color.WHITE);
        
        campoContrasenia = new JPasswordField();
        campoContrasenia.setColumns(10);
        campoContrasenia.setBorder(BorderFactory.createEmptyBorder());
        campoContrasenia.setBackground(Colores.AZUL_OBSCURO);
        campoContrasenia.setForeground(Color.WHITE);
        
        btnEntrar = new JButton("Entrar");
        
        btnEntrar.setBackground(Colores.AZUL_INTENSO);
        btnEntrar.setForeground(Color.WHITE);
        btnEntrar.setBorder(BorderFactory.createEmptyBorder());
        
        btnEntrar.addActionListener(controlador);
        etiquetaOlvidePass.addMouseListener(controlador);
        
        etiquetaHola.setBounds(140,40, 100, 30);
        etiquetaNombre.setBounds(153,75,50,10);
        etiquetaCambiarUsu.setBounds(130, 100, 150, 10);
        campoContrasenia.setBounds(80, 120, 200, 20);
        etiquetaLinea.setBounds(80, 120, 200, 30);
        etiquetaOlvidePass.setBounds(120,145, 150, 30);
        etiquetaMensaje.setBounds(80, 15, 200, 20);
        btnEntrar.setBounds(140,180,70,30);
        
        etiquetaMensaje.setForeground(Color.WHITE);
        etiquetaMensaje.setVisible(false);
        
    
    }
    
    private void agregarComponentes(){
        panelArribba.add(etiquetaTitulo);
        
        panelCentro.add(etiquetaHola);
        panelCentro.add(etiquetaNombre);
        panelCentro.add(etiquetaCambiarUsu);
        panelCentro.add(campoContrasenia);
        panelCentro.add(etiquetaLinea);
        panelCentro.add(etiquetaOlvidePass);
        panelCentro.add(btnEntrar);
        panelCentro.add(etiquetaMensaje);
        
       
        
        panelAbajo.add(new JLabel(new Imagen().getImagen("/imagenes/footer.jpeg",350,124)));
        
        add(panelArribba,BorderLayout.NORTH);
        add(panelCentro,BorderLayout.CENTER);
        add(panelAbajo,BorderLayout.SOUTH);
    }
    
    public void limpiarInicio(){
        remove(panelArribba);
        remove(panelCentro);
        remove(panelAbajo);
        SwingUtilities.updateComponentTreeUI(this);
    }

    public JPanel getPanelCentro() {
        return panelCentro;
    }

    public JPanel getPanelAbajo() {
        return panelAbajo;
    }

    public JPanelBackgroundImage getPanelArribba() {
        return panelArribba;
    }

    public JPasswordField getCampoContrasenia() {
        return campoContrasenia;
    }

    public VistaPrincipal getVistaPrincipal() {
        return vistaPrincipal;
    }

    public void setVistaPrincipal(VistaPrincipal vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
        add(this.vistaPrincipal);
    }

    public VistaSaldoCuenta getVistaSaldoCuenta() {
        return vistaSaldoCuenta;
    }

    public void setVistaSaldoCuenta(VistaSaldoCuenta vistaSaldoCuenta) {
        this.vistaSaldoCuenta = vistaSaldoCuenta;
        //add(this.vistaSaldoCuenta);
        add(addScroll(this.vistaSaldoCuenta));
    }

    public VistaRetiro getVistaRetiro() {
        return vistaRetiro;
    }

    public void setVistaRetiro(VistaRetiro vistaRetiro) {
        this.vistaRetiro = vistaRetiro;
        add(this.vistaRetiro);
    }

    public VistaTransferir getVistaTransferir() {
        return vistaTransferir;
    }

    public void setVistaTransferir(VistaTransferir vistaTransferir) {
        this.vistaTransferir = vistaTransferir;
        add(addScroll(this.vistaTransferir));
        //add(this.vistaTransferir);
    }

    public JScrollPane getScroll() {
        return scroll;
    }
    
    public void update(){
        SwingUtilities.updateComponentTreeUI(this);
        //SwingUtilities.updateComponentTreeUI(scroll);
    }

    public VistaPagarSevicio getVistaPagarSevicio() {
        return vistaPagarSevicio;
    }

    public void setVistaPagarSevicio(VistaPagarSevicio vistaPagarSevicio) {
        this.vistaPagarSevicio = vistaPagarSevicio;
        add(this.vistaPagarSevicio);
    }

    public VistaOperaConfiguraCuenta getVistaOperaConfiguraCuenta() {
        return vistaOperaConfiguraCuenta;
    }

    public void setVistaOperaConfiguraCuenta(VistaOperaConfiguraCuenta vistaOperaConfiguraCuenta) {
        this.vistaOperaConfiguraCuenta = vistaOperaConfiguraCuenta;
        add(this.vistaOperaConfiguraCuenta);
    }

    public VistaRecargaPaquete getVistaRecargaPaquete() {
        return vistaRecargaPaquete;
    }

    public void setVistaRecargaPaquete(VistaRecargaPaquete vistaRecargaPaquete) {
        this.vistaRecargaPaquete = vistaRecargaPaquete;
        add(this.vistaRecargaPaquete);
    }

    public VistaDatosTransferencia getVistaDatosTransferencia() {
        return vistaDatosTransferencia;
    }

    public void setVistaDatosTransferencia(VistaDatosTransferencia vistaDatosTransferencia) {
        this.vistaDatosTransferencia = vistaDatosTransferencia;
        add(addScroll(this.vistaDatosTransferencia));
    }
    
    public JLabel getEtiquetaMensaje() {
        return etiquetaMensaje;
    }
       
    
    private JScrollPane addScroll(JPanel vista){
        scroll = new JScrollPane();
        scroll.setBounds(0,0,350,550);
        scroll.getHorizontalScrollBar().setEnabled(false);
        vista.setPreferredSize(new Dimension(vista.getWidth(),vista.getHeight()+300));
        scroll.setViewportView(vista);
        return scroll;
    }
}
