/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.totemmarte.view;
import com.mycompany.totemmarte.modelo.SessaoModelo;
import com.mycompany.totemmarte.controller.SessaoController;
import java.util.List;
import javax.swing.JButton;


public class TotemMain extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TotemMain.class.getName());
    private SessaoController controle;
   
    public TotemMain() {
        initComponents();
        configurarJanela();
        //para colocar as sessoes
        controle= new SessaoController();
        configurarBotaoAvaliacao();
        carregarSessoes();

    }

    private void carregarSessoes() {

        List<SessaoModelo> dados = controle.listarSessoes();

        distribuirSessoes(dados);
    }

    private void distribuirSessoes(List<SessaoModelo> sessoes) {

    // 🔥 limpa os paineis antigos
    pnlMarte.removeAll();
    pnlS_O.removeAll();
    pnlCuriosity.removeAll();
    pnlPerseverance.removeAll();

        for (SessaoModelo sessao : sessoes) {
            SessaoPanel painel = new SessaoPanel();
            painel.configurar(sessao);

            switch (sessao.getGrupo()) {
                case MARTE -> pnlMarte.add(painel);
                case GEMEOS -> pnlS_O.add(painel);
                case CURIOSITY -> pnlCuriosity.add(painel);
                case PERSEVERANCE -> pnlPerseverance.add(painel);
            }
        }

        revalidate();
        repaint();
    }

    private void configurarBotaoAvaliacao() {
        JButton btnAvaliacao = new JButton("Avaliar visita");
        btnAvaliacao.addActionListener(evt -> abrirAvaliacao());
        pnlFooter.add(btnAvaliacao);
    }

    private void abrirAvaliacao() {
        AvaliacaoDialog dialog = new AvaliacaoDialog(this, controle, controle.listarSessoes());
        dialog.setVisible(true);
    }
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHeader = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        pnlCorpo = new javax.swing.JPanel();
        TabsGaleria = new javax.swing.JTabbedPane();
        spMarte = new javax.swing.JScrollPane();
        pnlMarte = new javax.swing.JPanel();
        spRoversGemeos = new javax.swing.JScrollPane();
        pnlS_O = new javax.swing.JPanel();
        spCuriosity = new javax.swing.JScrollPane();
        pnlCuriosity = new javax.swing.JPanel();
        spPerseverance = new javax.swing.JScrollPane();
        pnlPerseverance = new javax.swing.JPanel();
        pnlFooter = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlHeader.setBackground(new java.awt.Color(0, 0, 0));
        pnlHeader.setPreferredSize(new java.awt.Dimension(550, 150));

        lblTitulo.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("EXPLORAÇÃO MARTE");

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(lblTitulo)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeaderLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(46, 46, 46))
        );

        getContentPane().add(pnlHeader, java.awt.BorderLayout.PAGE_START);

        pnlCorpo.setBackground(new java.awt.Color(207, 191, 164));
        pnlCorpo.setLayout(new java.awt.BorderLayout());

        pnlMarte.setLayout(new java.awt.GridLayout(3, 1));
        spMarte.setViewportView(pnlMarte);

        TabsGaleria.addTab("Marte", spMarte);

        pnlS_O.setLayout(new java.awt.GridLayout(3, 1));
        spRoversGemeos.setViewportView(pnlS_O);

        TabsGaleria.addTab("Gêmeos", spRoversGemeos);

        pnlCuriosity.setLayout(new java.awt.GridLayout(3, 1));
        spCuriosity.setViewportView(pnlCuriosity);

        TabsGaleria.addTab("Curiosity", spCuriosity);

        pnlPerseverance.setLayout(new java.awt.GridLayout(3, 1));
        spPerseverance.setViewportView(pnlPerseverance);

        TabsGaleria.addTab("Perseverance", spPerseverance);

        pnlCorpo.add(TabsGaleria, java.awt.BorderLayout.CENTER);
        TabsGaleria.getAccessibleContext().setAccessibleName("home");
        TabsGaleria.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(pnlCorpo, java.awt.BorderLayout.CENTER);

        pnlFooter.setBackground(new java.awt.Color(0, 0, 0));
        pnlFooter.setPreferredSize(new java.awt.Dimension(550, 50));

        javax.swing.GroupLayout pnlFooterLayout = new javax.swing.GroupLayout(pnlFooter);
        pnlFooter.setLayout(pnlFooterLayout);
        pnlFooterLayout.setHorizontalGroup(
            pnlFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        pnlFooterLayout.setVerticalGroup(
            pnlFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(pnlFooter, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new TotemMain().setVisible(true));
    }
    
    private void configurarJanela (){
        setSize(550, 777);
        setLocationRelativeTo(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TabsGaleria;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlCorpo;
    private javax.swing.JPanel pnlCuriosity;
    private javax.swing.JPanel pnlFooter;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlMarte;
    private javax.swing.JPanel pnlPerseverance;
    private javax.swing.JPanel pnlS_O;
    private javax.swing.JScrollPane spCuriosity;
    private javax.swing.JScrollPane spMarte;
    private javax.swing.JScrollPane spPerseverance;
    private javax.swing.JScrollPane spRoversGemeos;
    // End of variables declaration//GEN-END:variables
}
