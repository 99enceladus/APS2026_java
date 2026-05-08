package com.mycompany.totemmarte.UI;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;

import javax.swing.JTabbedPane;
import javax.swing.plaf.basic.BasicTabbedPaneUI;

public class TabsUI {

    /*
    
        CORES
    
    */

    // cor do corpo principal
    private static final Color COR_CORPO =
            new Color(207, 191, 167); // #CFBFA7

    // tab selecionada
    private static final Color COR_TAB_SELECIONADA =
            new Color(237, 231, 222); // #EDE7DE

    // tab não selecionada
    private static final Color COR_TAB_NORMAL =
            new Color(153, 141, 123); // #998D7B

    // texto da tab selecionada
    private static final Color TEXTO_ESCURO =
            new Color(45, 45, 45);

    // texto das tabs não selecionadas
    private static final Color TEXTO_CLARO =
            new Color(245, 245, 245);

    /*
    
        MÉTODO PRINCIPAL
    
    */

    public static void aplicarEstilo(JTabbedPane tabbedPane) {

        /*
        
            CONFIGURAÇÕES GERAIS
        
        */

        tabbedPane.setFont(
                new Font("SansSerif", Font.BOLD, 20)
        );

        tabbedPane.setFocusable(false);

        tabbedPane.setOpaque(false);

        tabbedPane.setBackground(COR_CORPO);

        /*
        
            UI PERSONALIZADA
        
        */

        tabbedPane.setUI(new BasicTabbedPaneUI() {

            /*
            
                REMOVE ESPAÇAMENTO
                ENTRE TAB E CONTEÚDO
            
            */

            @Override
            protected Insets getContentBorderInsets(
                    int tabPlacement
            ) {

                return new Insets(0, 0, 0, 0);

            }

            /*
            
                REMOVE BORDA DO CONTEÚDO
            
            */

            @Override
            protected void paintContentBorder(
                    Graphics g,
                    int tabPlacement,
                    int selectedIndex
            ) {

            }

            /*
            
                REMOVE FOCO
            
            */

            @Override
            protected void paintFocusIndicator(
                    Graphics g,
                    int tabPlacement,
                    Rectangle[] rects,
                    int tabIndex,
                    Rectangle iconRect,
                    Rectangle textRect,
                    boolean isSelected
            ) {

            }

            /*
            
                REMOVE BORDA DAS TABS
            
            */

            @Override
            protected void paintTabBorder(
                    Graphics g,
                    int tabPlacement,
                    int tabIndex,
                    int x,
                    int y,
                    int w,
                    int h,
                    boolean isSelected
            ) {

            }

            /*
            
                ALTURA DAS TABS
            
            */

            @Override
            protected int calculateTabHeight(
                    int tabPlacement,
                    int tabIndex,
                    int fontHeight
            ) {

                return 50;

            }

            /*
            
                LARGURA DAS TABS
            
            */

            @Override
            protected int calculateTabWidth(
                    int tabPlacement,
                    int tabIndex,
                    FontMetrics metrics
            ) {

                return 220;

            }

            /*
            
                ESPAÇO ENTRE AS TABS
            
            */

            @Override
            protected int getTabRunIndent(
                    int tabPlacement,
                    int run
            ) {

                return 8;

            }

            /*
            
                FUNDO DAS TABS
            
            */

            @Override
            protected void paintTabBackground(
                    Graphics g,
                    int tabPlacement,
                    int tabIndex,
                    int x,
                    int y,
                    int w,
                    int h,
                    boolean isSelected
            ) {

                /*
                
                    TAB SELECIONADA
                
                */

                if (isSelected) {

                    g.setColor(COR_TAB_SELECIONADA);

                } else {

                    /*
                    
                        TAB NÃO SELECIONADA
                    
                    */

                    g.setColor(COR_TAB_NORMAL);

                }

                /*
                
                    TAB RETANGULAR
                
                */

                g.fillRect(
                        x + 2,
                        y,
                        w - 4,
                        h + 6
                );

            }

            /*
            
                TEXTO DAS TABS
            
            */

            @Override
            protected void paintText(
                    Graphics g,
                    int tabPlacement,
                    Font font,
                    FontMetrics metrics,
                    int tabIndex,
                    String title,
                    Rectangle textRect,
                    boolean isSelected
            ) {

                g.setFont(font);

                if (isSelected) {

                    g.setColor(TEXTO_ESCURO);

                } else {

                    g.setColor(TEXTO_CLARO);

                }

                g.drawString(
                        title,
                        textRect.x,
                        textRect.y + metrics.getAscent()
                );

            }

        });

    }

}