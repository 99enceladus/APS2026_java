package com.mycompany.totemmarte.UI;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Canva extends JPanel {

    private final Image background;

    public Canva() {

        background = new ImageIcon(
                getClass().getResource("/1_home/imgbckground.jpeg")
        ).getImage();

        setLayout(null);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(background, 0, 0,
                getWidth(), getHeight(), this);
    }
}