/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import vista.extras.PanelServicio;

/**
 *
 * @author adrian
 */
public class ModeloServicio {
    private static final ArrayList<PanelServicio> servicios = new ArrayList<>();
    
    private ModeloServicio(){}
    
    public static void agregarServicio(PanelServicio panel){
        servicios.add(panel);
    }

    public static ArrayList<PanelServicio> getServicios() {
        return servicios;
    }
    
}
