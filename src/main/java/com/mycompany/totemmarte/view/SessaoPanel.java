
package com.mycompany.totemmarte.view;
import com.mycompany.totemmarte.modelo.SessaoModelo;
import javax.swing.ImageIcon;

        
public class SessaoPanel extends javax.swing.JPanel {
    
    private SessaoModelo modelo;
    
    public SessaoPanel() {
        initComponents();
        
        configurarClique();
    }

    public void configurar(SessaoModelo modelo) {
        this.modelo = modelo;
        // título
        lblTitulo.setText(modelo.getTitulo());
        alinhamento();

        // texto
        txDescricao.setText(modelo.getDescricao());
        
        // 🔥 imagem
        ImageIcon icon = new ImageIcon(getClass().getResource(modelo.getCaminhoImagem()));
        lblImagem.setIcon(icon);
        posicionar();

        revalidate();
        repaint();
    }
    
    private void configurarClique() {

    lblImagem.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            abrirDialog(); // 🔥 chama outro método da mesma classe
        }
    });
    }
    
    private void abrirDialog() {

    java.awt.Frame frame = (java.awt.Frame)
        javax.swing.SwingUtilities.getWindowAncestor(this);

    ImagensDialog dialog = new ImagensDialog(frame, true);

    dialog.configurar(modelo);

    dialog.pack();
    dialog.setLocationRelativeTo(this);
    dialog.setVisible(true);
    }
   private void alinhamento() {

        switch (modelo.getAlinhamentoTitulo()) {

            case ESQUERDA:
                lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                break;

            case DIREITA:
                lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                break;
        }
    }
   
    private void posicionar() {

        remove(pnlImagem); // remove posição antiga

        switch (modelo.getPosicaoImagem()) {

            case ESQUERDA:
                add(pnlImagem, java.awt.BorderLayout.LINE_START);
                break;

            case DIREITA:
                add(pnlImagem, java.awt.BorderLayout.LINE_END);
                break;
        }

        revalidate();
        repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        pnlImagem = new javax.swing.JPanel();
        lblImagem = new javax.swing.JLabel();
        pnlDescricao = new javax.swing.JPanel();
        txDescricao = new javax.swing.JTextPane();

        setBackground(new java.awt.Color(237, 231, 222));
        setPreferredSize(new java.awt.Dimension(1200, 500));
        setLayout(new java.awt.BorderLayout());

        lblTitulo.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        lblTitulo.setText("titulo");
        lblTitulo.setMaximumSize(new java.awt.Dimension(60, 26));
        lblTitulo.setPreferredSize(new java.awt.Dimension(42, 70));
        add(lblTitulo, java.awt.BorderLayout.PAGE_START);

        pnlImagem.setBackground(new java.awt.Color(0, 0, 0));
        pnlImagem.setPreferredSize(new java.awt.Dimension(500, 500));
        pnlImagem.setLayout(new java.awt.BorderLayout());
        pnlImagem.add(lblImagem, java.awt.BorderLayout.CENTER);

        add(pnlImagem, java.awt.BorderLayout.LINE_END);

        pnlDescricao.setBackground(new java.awt.Color(237, 231, 222));
        pnlDescricao.setLayout(new java.awt.BorderLayout());

        txDescricao.setEditable(false);
        txDescricao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 231, 222), 10));
        txDescricao.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        txDescricao.setOpaque(false);
        pnlDescricao.add(txDescricao, java.awt.BorderLayout.CENTER);

        add(pnlDescricao, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlDescricao;
    private javax.swing.JPanel pnlImagem;
    private javax.swing.JTextPane txDescricao;
    // End of variables declaration//GEN-END:variables
}
