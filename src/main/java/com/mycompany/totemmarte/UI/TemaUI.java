
package com.mycompany.totemmarte.UI;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;


public class TemaUI {
    public static void configurar() {

        try {

            UIManager.setLookAndFeel(
                    new FlatLightLaf()
            );

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
