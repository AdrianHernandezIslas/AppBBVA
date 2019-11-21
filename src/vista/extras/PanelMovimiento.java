/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.extras;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author adrian
 */
public class PanelMovimiento extends JPanel{
    private String titulo,tipo,monto;
    private JLabel etiquetaTitulo,etiquetaTipo,etiquetaMonto;

    public PanelMovimiento(String titulo, String tipo, String monto) {
        super(null);
        this.titulo = titulo;
        this.tipo = tipo;
        this.monto = monto;
        setBackground(Color.WHITE);
        setSize(305, 50);
        inicializarComponentes();
        agregarComponentes();
    }

    private void inicializarComponentes(){
        etiquetaTitulo = new JLabel(titulo);
        etiquetaTipo = new JLabel(tipo);
        etiquetaMonto = new JLabel('$'+monto);
        
        etiquetaTitulo.setBounds(0,0,100,20);
        etiquetaTipo.setBounds(0,30,150,20);
        etiquetaMonto.setBounds(250,0,100,20);
        
        etiquetaTipo.setForeground(Color.GRAY);
    }
    
    private void agregarComponentes(){
        add(etiquetaTitulo);
        add(etiquetaTipo);
        add(etiquetaMonto);
    }
    
    
}
