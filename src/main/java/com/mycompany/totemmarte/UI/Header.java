/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.totemmarte.UI;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;


/**
 *
 * @author nana
 */
public class Header extends javax.swing.JPanel {
    private Image imagem;
    
    public Header() {
        initComponents();
        imagem = new ImageIcon(
            getClass().getResource("/1_home/imgbckground.jpeg")
        ).getImage();
    }
    @Override
    protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    g.drawImage(imagem,
            0,
            0,
            getWidth(),
            getHeight(),
            this);
}
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new java.awt.BorderLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
