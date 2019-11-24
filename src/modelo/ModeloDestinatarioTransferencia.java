/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import vista.extras.PanelDestinatario;

/**
 *
 * @author adrian
 */
public class ModeloDestinatarioTransferencia {
    private static ArrayList<PanelDestinatario> destinatarios = new ArrayList<>();
    
    public static void agregarDestinatarioTransferncia(PanelDestinatario destinatario){
        destinatarios.add(destinatario);
    }

    public static ArrayList<PanelDestinatario> getDestinatarios() {
        return destinatarios;
    }
    
    
}
