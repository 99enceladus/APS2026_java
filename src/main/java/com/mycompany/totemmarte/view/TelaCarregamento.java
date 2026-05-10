/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.totemmarte.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCarregamento extends JWindow {
    
    private TotemMain totem;
    private int pontinhos = 0;
    private Timer timerAnimacao;
    private float opacidade = 1.0f;
    
    public TelaCarregamento(TotemMain totem) {
        this.totem = totem;
        configurarJanela();
        iniciarAnimacaoTexto();
        iniciarFadeOutApos5Segundos();
    }
    
    private void configurarJanela() {
        JPanel painel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                desenharFundoEstrelado(g);
                desenharTextoLoading(g);
            }
        };
        
        painel.setBackground(Color.BLACK);
        painel.setLayout(null);
        setContentPane(painel);
        
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        
        // Tornar a janela transparente para o fade
        setBackground(new Color(0, 0, 0, 0));
        ((JPanel) getContentPane()).setOpaque(false);
    }
    
    private void desenharFundoEstrelado(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        
        // Aplicar transparência global
        AlphaComposite alpha = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opacidade);
        g2.setComposite(alpha);
        
        // Fundo preto
        g2.setColor(Color.BLACK);
        g2.fillRect(0, 0, getWidth(), getHeight());
        
        // Gradiente sutil
        int largura = getWidth();
        int altura = getHeight();
        
        GradientPaint gradiente = new GradientPaint(
            largura/2, 0, new Color(10, 5, 20),
            largura/2, altura, new Color(0, 0, 0)
        );
        g2.setPaint(gradiente);
        g2.fillRect(0, 0, largura, altura);
        
        // Estrelas pequenas (camada de fundo)
        g2.setColor(new Color(80, 80, 120));
        for (int i = 0; i < 250; i++) {
            int x = (int) (Math.random() * getWidth());
            int y = (int) (Math.random() * getHeight());
            g2.fillOval(x, y, 1, 1);
        }
        
        // Estrelas médias (brancas)
        g2.setColor(Color.WHITE);
        for (int i = 0; i < 120; i++) {
            int x = (int) (Math.random() * getWidth());
            int y = (int) (Math.random() * getHeight());
            g2.fillOval(x, y, 1, 1);
        }
        
        // Estrelas brilhantes com glow
        for (int i = 0; i < 35; i++) {
            int x = (int) (Math.random() * getWidth());
            int y = (int) (Math.random() * getHeight());
            
            // Glow
            g2.setColor(new Color(255, 200, 100, 80));
            g2.fillOval(x - 2, y - 2, 6, 6);
            
            // Centro
            g2.setColor(new Color(255, 220, 150));
            g2.fillOval(x, y, 2, 2);
        }
    }
    
    private void desenharTextoLoading(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        
        // Aplicar a mesma transparência
        AlphaComposite alpha = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opacidade);
        g2.setComposite(alpha);
        
        // Fonte suave e elegante
        Font fonteSuave = new Font("Segoe UI", Font.PLAIN, 28);
        Font fonteTitulo = new Font("Segoe UI Light", Font.PLAIN, 22);
        
        // Tentar usar fontes mais elegantes se disponíveis
        String[] fontesBonitas = {"Segoe UI", "Roboto", "Open Sans", "Arial", "Helvetica"};
        for (String nomeFonte : fontesBonitas) {
            Font testFont = new Font(nomeFonte, Font.PLAIN, 28);
            if (testFont.getFamily().equals(nomeFonte) || testFont.getFontName().contains(nomeFonte)) {
                fonteSuave = testFont;
                fonteTitulo = testFont.deriveFont(Font.PLAIN, 22);
                break;
            }
        }
        
        // Texto principal "Bem-vindo à exposição"
        g2.setFont(fonteTitulo);
        String textoSubtitulo = "Bem-vindo à exposição";
        FontMetrics fmSubtitulo = g2.getFontMetrics();
        int xSubtitulo = (getWidth() - fmSubtitulo.stringWidth(textoSubtitulo)) / 2;
        int ySubtitulo = getHeight() / 2 - 50;
        
        // Sombra do subtítulo
        g2.setColor(new Color(100, 100, 120, 100));
        g2.drawString(textoSubtitulo, xSubtitulo + 2, ySubtitulo + 2);
        
        // Subtítulo em cinza claro
        g2.setColor(new Color(180, 180, 200));
        g2.drawString(textoSubtitulo, xSubtitulo, ySubtitulo);
        
        // Texto principal "MARTE E SEUS ROVERS"
        g2.setFont(fonteSuave.deriveFont(Font.BOLD, 42));
        String textoPrincipal = "A EXPLORAÇÃO DE MARTE";
        FontMetrics fmPrincipal = g2.getFontMetrics();
        int xPrincipal = (getWidth() - fmPrincipal.stringWidth(textoPrincipal)) / 2;
        int yPrincipal = getHeight() / 2 + 10;
        
        // Sombra do título principal
        g2.setColor(new Color(80, 40, 20, 150));
        g2.drawString(textoPrincipal, xPrincipal + 3, yPrincipal + 3);
        
        // Título principal em vermelho/marte
        g2.setColor(new Color(220, 100, 50));
        g2.drawString(textoPrincipal, xPrincipal, yPrincipal);
        
        // Texto "CARREGANDO" com animação
        g2.setFont(fonteSuave.deriveFont(Font.PLAIN, 24));
        String textoLoading = "CARREGANDO";
        String pontosString = ".".repeat(pontinhos);
        String textoCompleto = textoLoading + pontosString;
        
        FontMetrics fmLoading = g2.getFontMetrics();
        int xLoading = (getWidth() - fmLoading.stringWidth(textoCompleto)) / 2;
        int yLoading = getHeight() / 2 + 80;
        
        // Sombra do CARREGANDO
        g2.setColor(new Color(60, 60, 70, 120));
        g2.drawString(textoCompleto, xLoading + 2, yLoading + 2);
        
        // CARREGANDO em branco suave
        g2.setColor(new Color(200, 200, 210));
        g2.drawString(textoCompleto, xLoading, yLoading);
        
        // Barra de progresso estilizada
        desenharBarraProgresso(g2);
        
        // Mensagem decorativa no rodapé
        g2.setFont(new Font("Segoe UI", Font.ITALIC, 13));
        g2.setColor(new Color(120, 100, 80));
        String mensagemRodape = "✦  Uma jornada pelo Planeta Vermelho  ✦";
        FontMetrics fmFooter = g2.getFontMetrics();
        int xFooter = (getWidth() - fmFooter.stringWidth(mensagemRodape)) / 2;
        g2.drawString(mensagemRodape, xFooter, getHeight() - 40);
    }
    
    private void desenharBarraProgresso(Graphics2D g2) {
        int barraX = getWidth() / 2 - 180;
        int barraY = getHeight() / 2 + 115;
        int barraWidth = 360;
        int barraHeight = 3;
        
        // Fundo da barra (sutil)
        g2.setColor(new Color(50, 40, 35));
        g2.fillRoundRect(barraX, barraY, barraWidth, barraHeight, 10, 10);
        
        // Progresso animado
        long tempoDecorrido = System.currentTimeMillis() - tempoInicio;
        int progresso = (int) ((tempoDecorrido % 5000) * barraWidth / 5000);
        
        // Barra de progresso em vermelho suave
        GradientPaint gradProgresso = new GradientPaint(
            barraX, barraY, new Color(200, 80, 50),
            barraX + barraWidth, barraY, new Color(230, 120, 70)
        );
        g2.setPaint(gradProgresso);
        g2.fillRoundRect(barraX, barraY, progresso, barraHeight, 10, 10);
        
        // Pequeno brilho na barra
        g2.setColor(new Color(255, 160, 100, 100));
        g2.fillRoundRect(barraX, barraY - 1, progresso, barraHeight + 1, 10, 10);
    }
    
    private long tempoInicio;
    
    private void iniciarAnimacaoTexto() {
        tempoInicio = System.currentTimeMillis();
        
        timerAnimacao = new Timer(350, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pontinhos = (pontinhos % 3) + 1;
                repaint();
            }
        });
        timerAnimacao.start();
    }
    
    private void iniciarFadeOutApos5Segundos() {
        // Primeiro timer: espera 5 segundos
        Timer timerEspera = new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Depois de 5 segundos, inicia o fade
                iniciarFadeOut();
            }
        });
        timerEspera.setRepeats(false);
        timerEspera.start();
    }
    
    private void iniciarFadeOut() {
        Timer fadeTimer = new Timer(20, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Reduz a opacidade gradualmente
                opacidade -= 0.05f;
                
                if (opacidade <= 0) {
                    // Quando totalmente transparente, para o timer e fecha
                    ((Timer) e.getSource()).stop();
                    timerAnimacao.stop();
                    setVisible(false);
                    dispose();
                } else {
                    // Redesenha com a nova opacidade
                    repaint();
                }
            }
        });
        fadeTimer.start();
    }
    

}
