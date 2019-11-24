/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.extras;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author adrian
 */
public class PanelServicio extends JPanel{
    private final String titulo,tipo,referencia,monto;
    private JLabel etiquetaTitulo,etiquetaTipo,etiquetaMonto,etiquetaReferencia,
                   etiquetaLetra;

    public PanelServicio(String titulo, String tipo,String referencia ,String monto) {
        super(null);
        this.titulo = titulo;
        this.tipo = tipo;
        this.monto = monto;
        this.referencia = referencia;
        setBackground(Color.WHITE);
        setSize(255, 80);
        inicializarComponentes();
        agregarComponentes();
    }
    
    //Voy a crear el panel servicio :)

    private void inicializarComponentes(){
        etiquetaTitulo = new JLabel(titulo);
        etiquetaTipo = new JLabel(tipo);
        etiquetaMonto = new JLabel('$'+monto);
        etiquetaReferencia = new JLabel(referencia);
        etiquetaLetra = new JLabel(String.valueOf(titulo.charAt(0)));
        
        etiquetaLetra.setBounds(0, 0, 50, 50);
        etiquetaTitulo.setBounds(50,0,100,20);
        etiquetaTipo.setBounds(50,20,150,20);
        etiquetaMonto.setBounds(200,0,100,20);
        etiquetaReferencia.setBounds(50,40, 100, 20);
        
        etiquetaLetra.setForeground(Color.GRAY);
        etiquetaTipo.setForeground(Color.GRAY);
        etiquetaLetra.setFont(new Font("Calibri", 3, 50));
    }
    
    private void agregarComponentes(){
        add(etiquetaLetra);
        add(etiquetaTitulo);
        add(etiquetaTipo);
        add(etiquetaMonto);
        add(etiquetaReferencia);
    }

    public String getMonto() {
        return monto;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getReferencia() {
        return referencia;
    }
    
    
}
