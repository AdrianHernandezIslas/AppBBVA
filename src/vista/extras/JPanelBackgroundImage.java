/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.extras;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.LayoutManager;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author adrian
 */
public class JPanelBackgroundImage extends JPanel {
 
	// Atributo que guardara la imagen de Background que le pasemos.
	private Image background;

    public JPanelBackgroundImage(LayoutManager layout) {
        super(layout);
    }
        
        
 
	// Metodo que es llamado automaticamente por la maquina virtual Java cada vez que repinta
        @Override
	public void paintComponent(Graphics g) {
 
		/* Obtenemos el tamaño del panel para hacer que se ajuste a este
		cada vez que redimensionemos la ventana y se lo pasamos al drawImage */
		int width = this.getSize().width;
		int height = this.getSize().height;
 
		// Mandamos que pinte la imagen en el panel
		if (this.background != null) {
			g.drawImage(this.background, 0, 0, width, height, null);
		}
 
		super.paintComponent(g);
	}
 
	// Metodo donde le pasaremos la dirección de la imagen a cargar.
	public void setBackground(String imagePath) {
		
		// Construimos la imagen y se la asignamos al atributo background.
		this.setOpaque(false);
		this.background = new ImageIcon(getClass().getResource(imagePath)).getImage();
		repaint();
	}
 
}