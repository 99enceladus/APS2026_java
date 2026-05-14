package com.mycompany.keyboardmuseu;


import com.mycompany.keyboardmuseu.simpleKeyboard;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TesteTecladoSimples {

    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Teste Teclado");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(new Color(237, 231, 222));
        
        JTextField campo = new JTextField(20);
        campo.setFont(new Font("Arial", Font.PLAIN, 16));
        campo.setPreferredSize(new Dimension(300, 40));
        
        panel.add(campo);
        frame.add(panel);
        
        campo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                abrirTecladoGrande(campo);
            }
        });
        
        frame.setVisible(true);
    }
    
    private static void abrirTecladoGrande(JTextField campo) {
        JDialog dialog = new JDialog();
        dialog.setTitle("Teclado Virtual");
        dialog.setModal(false);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        
        simpleKeyboard teclado = new simpleKeyboard();
        teclado.attachToTextField(campo);
        teclado.setOnEnterCallback(() -> dialog.dispose());
        
        dialog.add(teclado);
        
        // TAMANHO MAIOR - ocupa mais da tela
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        
        // Largura: 90% da tela (antes era fixo)
        int largura = (int)(screen.width * 0.9);
        
        // Altura: 60% da tela (antes era fixo)
        int altura = (int)(screen.height * 0.6);
        
        dialog.setSize(largura, altura);
        
        // Centralizar na tela
        int x = (screen.width - largura) / 2;
        int y = screen.height - altura - 20; // 20px de margem inferior
        
        dialog.setLocation(x, y);
        dialog.setVisible(true);
    }
}