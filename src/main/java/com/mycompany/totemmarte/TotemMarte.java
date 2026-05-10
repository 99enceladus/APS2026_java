/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.totemmarte;

import com.mycompany.totemmarte.UI.TemaUI;
import com.mycompany.totemmarte.view.TelaCarregamento;
import com.mycompany.totemmarte.view.TotemMain;

public class TotemMarte {

    public static void main(String[] args) {
        
        TemaUI.configurar();
        java.awt.EventQueue.invokeLater(() -> {
            TotemMain totem = new TotemMain();
            totem.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
            totem.setVisible(true);
            
            TelaCarregamento telaLoading = new TelaCarregamento(totem);
            telaLoading.setVisible(true);
        });
    }
}