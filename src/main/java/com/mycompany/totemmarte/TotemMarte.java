/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.totemmarte;

import com.mycompany.totemmarte.UI.TemaUI;
import com.mycompany.totemmarte.view.TotemMain;

/**
 *
 * @author nana
 */
public class TotemMarte {

    public static void main(String[] args) {
        
        TemaUI.configurar();
        java.awt.EventQueue.invokeLater(() -> {

            TotemMain totem = new TotemMain();
            totem.setVisible(true);

        });
      
      
    }
}
