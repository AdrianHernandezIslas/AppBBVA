/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.extras;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author adrian
 */
public class Imagen {
    
    public ImageIcon getImagen(String url,int largo, int ancho){
        return new ImageIcon(new ImageIcon(getClass().getResource(url))
                                                    .getImage().getScaledInstance(largo,ancho, Image.SCALE_SMOOTH));
    }
}
