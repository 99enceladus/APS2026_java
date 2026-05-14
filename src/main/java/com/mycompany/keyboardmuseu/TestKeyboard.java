/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.keyboardmuseu;


import javax.swing.*;
import java.awt.*;

public class TestKeyboard {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Museum Keyboard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        
        // painel de texto
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBackground(new Color(235, 210, 190));
        topPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 20, 30));
        
        JLabel label = new JLabel("Clique para digitar:");
        label.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        label.setForeground(new Color(50, 35, 25));
        label.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
        
        JTextField textField = new JTextField();
        textField.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        textField.setMargin(new Insets(15, 15, 15, 15));
        textField.setBackground(new Color(250, 240, 230));
        textField.setForeground(new Color(50, 35, 25));
        
        topPanel.add(label, BorderLayout.NORTH);
        topPanel.add(textField, BorderLayout.CENTER);
        
        // teclado
        simpleKeyboard keyboard = new simpleKeyboard();
        keyboard.attachToTextField(textField);
        
        // painel inferior
        JPanel bottomPanel = new JPanel();
        bottomPanel.setBackground(new Color(235, 210, 190));
        JLabel infoLabel = new JLabel("Shift key for uppercase | Caps Lock to toggle");
        infoLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        infoLabel.setForeground(new Color(100, 75, 60));
        bottomPanel.add(infoLabel);
        
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(keyboard, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);
        
        frame.setSize(1200, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
