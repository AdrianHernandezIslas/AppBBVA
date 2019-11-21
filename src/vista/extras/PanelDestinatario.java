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
public class PanelDestinatario extends JPanel{
    private String alias,nombre,tipoReferencia,referencia;
    private JLabel etiquetaAlias,etiquetaNombre,etiquetaTipoReferencia,
                   etiquetaReferencia,etiquetaLetra;

    public PanelDestinatario(String alias, String nombre, String tipoReferencia, String referencia) {
        super(null);
        this.alias = alias;
        this.nombre = nombre;
        this.tipoReferencia = tipoReferencia;
        this.referencia = referencia;
        setBackground(Color.WHITE);
        setSize(205, 100);
        inicializarComponentes();
        agregarElementos();
    }
    
    private void inicializarComponentes(){
        etiquetaAlias = new JLabel(alias);
        etiquetaNombre = new JLabel(nombre);
        etiquetaTipoReferencia = new JLabel(tipoReferencia);
        etiquetaReferencia = new JLabel(referencia);
        etiquetaLetra = new JLabel(String.valueOf(nombre.charAt(0)).toUpperCase());
        
        etiquetaAlias.setBounds(80,10,100,20);
        etiquetaNombre.setBounds(80,30, 200, 20);
        etiquetaTipoReferencia.setBounds(80, 50, 200, 20);
        etiquetaReferencia.setBounds(80, 70, 200, 20);
        etiquetaLetra.setBounds(20,25,50,50);
        
        etiquetaAlias.setFont(new Font("Calibri", 3, 20));
        etiquetaLetra.setFont(new Font("Calibri", 3, 55));
        etiquetaLetra.setForeground(Colores.AZUL_CLARO);
        
    }
    
    private void agregarElementos(){
        add(etiquetaLetra);
        add(etiquetaAlias);
        add(etiquetaNombre);
        add(etiquetaTipoReferencia);
        add(etiquetaReferencia);
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoReferencia() {
        return tipoReferencia;
    }

    public String getReferencia() {
        return referencia;
    }
    
    
    
    
}
