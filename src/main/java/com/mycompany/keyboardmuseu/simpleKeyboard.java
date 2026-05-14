package com.mycompany.keyboardmuseu;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import java.awt.event.*;

public class simpleKeyboard extends JPanel {
    private JTextField targetTextField;
    private JPanel keyboardPanel;
    private boolean isUpperCase = false;
    private boolean shiftPressed = false;
    private Runnable onEnterCallback;
    
    // Cores
    private final Color MARS_BACKGROUND = new Color(235, 210, 190);
    private final Color MARS_KEY_DEFAULT = new Color(210, 180, 155);
    private final Color MARS_KEY_PRESSED = new Color(180, 150, 125);
    private final Color MARS_SPECIAL_KEY = new Color(195, 165, 140);
    private final Color MARS_ENTER_KEY = new Color(140, 180, 140);
    private final Color MARS_DELETE_KEY = new Color(200, 155, 155);
    private final Color MARS_SHIFT_ACTIVE = new Color(205, 155, 105);
    private final Color MARS_BORDER = new Color(150, 120, 100);
    private final Color MARS_TEXT = new Color(50, 35, 25);
    
    public simpleKeyboard() {
        setLayout(new BorderLayout());
        setBackground(MARS_BACKGROUND);
        setBorder(new EmptyBorder(10, 10, 10, 10));
        
        keyboardPanel = new JPanel(new GridBagLayout());
        keyboardPanel.setBackground(MARS_BACKGROUND);
        
        createKeyboard();
        add(keyboardPanel, BorderLayout.CENTER);
    }
    
    public void setOnEnterCallback(Runnable callback) {
        this.onEnterCallback = callback;
    }
    
    public void attachToTextField(JTextField textField) {
        this.targetTextField = textField;
    }
    
    private void createKeyboard() {
        keyboardPanel.removeAll();
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        
        // Linha 1 - Números
        gbc.gridy = 0;
        gbc.gridheight = 1;
        
        String[] row1 = {"`", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "-", "=", "Backspace"};
        for (int i = 0; i < row1.length; i++) {
            gbc.gridx = i;
            if (row1[i].equals("Backspace")) {
                gbc.gridwidth = 2;
            } else {
                gbc.gridwidth = 1;
            }
            keyboardPanel.add(createButton(row1[i]), gbc);
        }
        
        // Linha 2 - QWERTY
        gbc.gridy = 1;
        String[] row2 = {"Tab", "Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "[", "]", "\\"};
        for (int i = 0; i < row2.length; i++) {
            gbc.gridx = i;
            if (row2[i].equals("Tab")) {
                gbc.gridwidth = 2;
            } else {
                gbc.gridwidth = 1;
            }
            keyboardPanel.add(createButton(row2[i]), gbc);
        }
        
        // Linha 3 - ASDF
        gbc.gridy = 2;
        String[] row3 = {"Caps", "A", "S", "D", "F", "G", "H", "J", "K", "L", ";", "'", "Enter"};
        for (int i = 0; i < row3.length; i++) {
            gbc.gridx = i;
            if (row3[i].equals("Caps")) {
                gbc.gridwidth = 2;
            } else if (row3[i].equals("Enter")) {
                gbc.gridwidth = 2;
            } else {
                gbc.gridwidth = 1;
            }
            keyboardPanel.add(createButton(row3[i]), gbc);
        }
        
        // Linha 4 - ZXCV
        gbc.gridy = 3;
        String[] row4 = {"Shift", "Z", "X", "C", "V", "B", "N", "M", ",", ".", "/", "Shift"};
        for (int i = 0; i < row4.length; i++) {
            gbc.gridx = i;
            if (row4[i].equals("Shift") && i == 0) {
                gbc.gridwidth = 2;
            } else if (row4[i].equals("Shift") && i == row4.length - 1) {
                gbc.gridwidth = 3;
            } else {
                gbc.gridwidth = 1;
            }
            keyboardPanel.add(createButton(row4[i]), gbc);
        }
        
        // Linha 5 - Espaço
        gbc.gridy = 4;
        gbc.gridx = 0;
        gbc.gridwidth = 15;
        keyboardPanel.add(createButton("Space"), gbc);
        
        keyboardPanel.revalidate();
        keyboardPanel.repaint();
    }
    
    private JButton createButton(String text) {
        JButton button = new JButton(text) {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                
                int arcSize = 15;
                if (getModel().isPressed()) {
                    g2.setColor(MARS_KEY_PRESSED);
                } else {
                    if (text.equals("Shift") || text.equals("Caps") || text.equals("Tab")) {
                        g2.setColor(shiftPressed ? MARS_SHIFT_ACTIVE : MARS_SPECIAL_KEY);
                    } else if (text.equals("Enter")) {
                        g2.setColor(MARS_ENTER_KEY);
                    } else if (text.equals("Backspace")) {
                        g2.setColor(MARS_DELETE_KEY);
                    } else if (text.equals("Space")) {
                        g2.setColor(MARS_SPECIAL_KEY);
                    } else {
                        g2.setColor(MARS_KEY_DEFAULT);
                    }
                }
                
                g2.fill(new RoundRectangle2D.Float(3, 3, getWidth() - 6, getHeight() - 6, arcSize, arcSize));
                g2.setColor(MARS_BORDER);
                g2.draw(new RoundRectangle2D.Float(3, 3, getWidth() - 7, getHeight() - 7, arcSize, arcSize));
                
                g2.dispose();
                super.paintComponent(g);
            }
            
            @Override
            public Dimension getPreferredSize() {
                Dimension d = super.getPreferredSize();
                d.height = 70;
                if (text.equals("Space")) {
                    d.width = 350;
                } else if (text.equals("Backspace") || text.equals("Enter")) {
                    d.width = 110;
                } else if (text.equals("Shift") || text.equals("Caps") || text.equals("Tab")) {
                    d.width = 100;
                } else {
                    d.width = 70;
                }
                return d;
            }
        };
        
        // Configurar fonte
        if (text.equals("Backspace") || text.equals("Enter") || text.equals("Shift") || text.equals("Caps") || text.equals("Tab")) {
            button.setFont(new Font("Segoe UI", Font.BOLD, 14));
        } else if (text.equals("Space")) {
            button.setFont(new Font("Segoe UI", Font.BOLD, 16));
        } else {
            button.setFont(new Font("Segoe UI", Font.BOLD, 20));
        }
        
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);
        button.setOpaque(false);
        button.setForeground(MARS_TEXT);
        
        button.addActionListener(e -> handleKeyPress(text));
        
        return button;
    }
    
    private void handleKeyPress(String key) {
        if (targetTextField == null) return;
        
        String currentText = targetTextField.getText();
        
        switch (key) {
            case "Backspace":
                if (currentText.length() > 0) {
                    targetTextField.setText(currentText.substring(0, currentText.length() - 1));
                }
                break;
            case "Space":
                targetTextField.setText(currentText + " ");
                break;
            case "Enter":
                if (onEnterCallback != null) {
                    onEnterCallback.run();
                }
                targetTextField.transferFocus();
                break;
            case "Shift":
                shiftPressed = !shiftPressed;
                isUpperCase = shiftPressed;
                createKeyboard();
                break;
            case "Caps":
                isUpperCase = !isUpperCase;
                createKeyboard();
                break;
            case "Tab":
                targetTextField.transferFocus();
                break;
            default:
                if (key.length() == 1) {
                    if (shiftPressed || isUpperCase) {
                        targetTextField.setText(currentText + getShiftedChar(key));
                    } else {
                        targetTextField.setText(currentText + key.toLowerCase());
                    }
                } else {
                    targetTextField.setText(currentText + key);
                }
                
                if (shiftPressed && !isUpperCase) {
                    shiftPressed = false;
                    createKeyboard();
                }
                break;
        }
        
        targetTextField.setCaretPosition(targetTextField.getText().length());
    }
    
    private String getShiftedChar(String key) {
        switch(key) {
            case "`": return "~";
            case "1": return "!";
            case "2": return "@";
            case "3": return "#";
            case "4": return "$";
            case "5": return "%";
            case "6": return "^";
            case "7": return "&";
            case "8": return "*";
            case "9": return "(";
            case "0": return ")";
            case "-": return "_";
            case "=": return "+";
            case "[": return "{";
            case "]": return "}";
            case "\\": return "|";
            case ";": return ":";
            case "'": return "\"";
            case ",": return "<";
            case ".": return ">";
            case "/": return "?";
            default: return key.toUpperCase();
        }
    }
    
    public void resetKeyboard() {
        shiftPressed = false;
        isUpperCase = false;
        createKeyboard();
    }
}