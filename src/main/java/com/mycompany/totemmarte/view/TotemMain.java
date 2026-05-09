/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.totemmarte.view;
import com.mycompany.totemmarte.UI.TabsUI;
import com.mycompany.totemmarte.UI.Canva;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import com.mycompany.totemmarte.modelo.SessaoModelo;
import com.mycompany.totemmarte.controller.SessaoController;
import java.util.List;
import javax.swing.JButton;



public class TotemMain extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TotemMain.class.getName());
    private final SessaoController controle;
    private final AvaliacaoResumoPanel resumoPanel;

    public TotemMain() {
        initComponents();
        configurarFrame();

        //para colocar as sessoes
        controle= new SessaoController();
        resumoPanel = new AvaliacaoResumoPanel();
        configurarBotaoAvaliacao();
        configurarAbaAvaliacoes();
        carregarSessoes();

    }
    
    private void configurarFrame(){
    //configurações de janela e estilo dos tabs, faz a janela ficar centralizada e define tamanho ao abrir
        setSize(1280, 800);
        setLocationRelativeTo(null);
        TabsUI.aplicarEstilo(tabsGaleria);

        Canva canvaHeader = new Canva();

        pnlHeader.setLayout(new java.awt.BorderLayout());

        pnlHeader.add(canvaHeader, java.awt.BorderLayout.CENTER);


        Canva canvaFooter = new Canva();

        pnlFooter.setLayout(new java.awt.BorderLayout());

        pnlFooter.add(canvaFooter, java.awt.BorderLayout.CENTER);
        

    //Vai executar o setValue após a janela terminar de abrir
        addWindowListener(new java.awt.event.WindowAdapter() {

        @Override
        public void windowOpened(java.awt.event.WindowEvent e) {
            resetarScroll(spMarte);
            resetarScroll(spRoversGemeos);
            resetarScroll(spCuriosity);
            resetarScroll(spPerseverance);
        }
        });
        
    }
    // //setValue(0) faz a barra iniciar no topo independente de qualquer componente "focable"
    private void resetarScroll(javax.swing.JScrollPane scroll) {
        javax.swing.SwingUtilities.invokeLater(() ->
            scroll.getVerticalScrollBar().setValue(0)
        );
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

            atualizarPainel(pnlMarte);
            atualizarPainel(pnlS_O);
            atualizarPainel(pnlCuriosity);
            atualizarPainel(pnlPerseverance);
    }
    //metodo auxiliar
    private void atualizarPainel(javax.swing.JPanel painel) {
        painel.revalidate();
        painel.repaint();
    }

    private void configurarBotaoAvaliacao() {
        pnlFooter.removeAll();
        pnlFooter.setLayout(new FlowLayout(FlowLayout.CENTER, 16, 10));

        JButton btnAvaliacao = new JButton("Adicionar avaliação");
        btnAvaliacao.addActionListener(evt -> abrirAvaliacao());
        pnlFooter.add(btnAvaliacao);

        pnlFooter.revalidate();
        pnlFooter.repaint();
    }

    private void abrirAvaliacao() {
        FormDialog dialog = new FormDialog(this, controle, controle.listarSessoes());
        dialog.setVisible(true);
        if (dialog.isAvaliacaoEnviada()) {
            atualizarResumoAvaliacoes();
        }
    }

    private void configurarAbaAvaliacoes() {
        pnlResumoAvaliacoes.removeAll();
        pnlResumoAvaliacoes.setLayout(new BorderLayout());
        pnlResumoAvaliacoes.add(resumoPanel, BorderLayout.CENTER);
        btnAtualizarAvaliacoes.addActionListener(evt -> atualizarResumoAvaliacoes());
        atualizarResumoAvaliacoes();
    }

    private void atualizarResumoAvaliacoes() {
        resumoPanel.atualizarResumo(controle.listarAvaliacoes());
        pnlResumoAvaliacoes.revalidate();
        pnlResumoAvaliacoes.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHeader = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        pnlCorpo = new javax.swing.JPanel();
        tabsGaleria = new javax.swing.JTabbedPane();
        spMarte = new javax.swing.JScrollPane();
        pnlMarte = new javax.swing.JPanel();
        spRoversGemeos = new javax.swing.JScrollPane();
        pnlS_O = new javax.swing.JPanel();
        spCuriosity = new javax.swing.JScrollPane();
        pnlCuriosity = new javax.swing.JPanel();
        spPerseverance = new javax.swing.JScrollPane();
        pnlPerseverance = new javax.swing.JPanel();
        spAvaliacoes = new javax.swing.JScrollPane();
        pnlAvaliacoes = new javax.swing.JPanel();
        pnlAcoesAvaliacoes = new javax.swing.JPanel();
        btnAtualizarAvaliacoes = new javax.swing.JButton();
        pnlResumoAvaliacoes = new javax.swing.JPanel();
        lblResumoTitulo = new javax.swing.JLabel();
        lblTotalAvaliacoes = new javax.swing.JLabel();
        lblMediaEstrelas = new javax.swing.JLabel();
        lblDistribuicao1 = new javax.swing.JLabel();
        lblDistribuicao2 = new javax.swing.JLabel();
        lblDistribuicao3 = new javax.swing.JLabel();
        lblDistribuicao4 = new javax.swing.JLabel();
        lblDistribuicao5 = new javax.swing.JLabel();
        lblObrasMaisAvaliadas = new javax.swing.JLabel();
        pnlFooter = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlHeader.setBackground(new java.awt.Color(0, 0, 0));
        pnlHeader.setPreferredSize(new java.awt.Dimension(550, 150));
        pnlHeader.setLayout(new java.awt.BorderLayout());

        lblTitulo.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("EXPLORAÇÃO MARTE");
        lblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlHeader.add(lblTitulo, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlHeader, java.awt.BorderLayout.PAGE_START);

        pnlCorpo.setBackground(new java.awt.Color(207, 191, 164));
        pnlCorpo.setLayout(new java.awt.BorderLayout());

        tabsGaleria.setFocusable(false);

        pnlMarte.setLayout(new java.awt.GridLayout(3, 1));
        spMarte.setViewportView(pnlMarte);

        tabsGaleria.addTab("Marte", spMarte);

        pnlS_O.setLayout(new java.awt.GridLayout(3, 1));
        spRoversGemeos.setViewportView(pnlS_O);

        tabsGaleria.addTab("Gêmeos", spRoversGemeos);

        pnlCuriosity.setLayout(new java.awt.GridLayout(3, 1));
        spCuriosity.setViewportView(pnlCuriosity);

        tabsGaleria.addTab("Curiosity", spCuriosity);

        pnlPerseverance.setLayout(new java.awt.GridLayout(3, 1));
        spPerseverance.setViewportView(pnlPerseverance);

        tabsGaleria.addTab("Perseverance", spPerseverance);

        pnlAvaliacoes.setLayout(new java.awt.BorderLayout());

        pnlAcoesAvaliacoes.setBackground(new java.awt.Color(207, 191, 164));
        pnlAcoesAvaliacoes.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        btnAtualizarAvaliacoes.setText("Atualizar");
        pnlAcoesAvaliacoes.add(btnAtualizarAvaliacoes);

        pnlAvaliacoes.add(pnlAcoesAvaliacoes, java.awt.BorderLayout.PAGE_START);

        pnlResumoAvaliacoes.setBackground(new java.awt.Color(207, 191, 164));
        pnlResumoAvaliacoes.setLayout(new java.awt.GridLayout(0, 1));

        lblResumoTitulo.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lblResumoTitulo.setText("Resumo das avaliacoes");
        pnlResumoAvaliacoes.add(lblResumoTitulo);

        lblTotalAvaliacoes.setText("Total de avaliacoes: 0");
        pnlResumoAvaliacoes.add(lblTotalAvaliacoes);

        lblMediaEstrelas.setText("Media geral de estrelas: 0.0");
        pnlResumoAvaliacoes.add(lblMediaEstrelas);

        lblDistribuicao1.setText("1 estrela: 0");
        pnlResumoAvaliacoes.add(lblDistribuicao1);

        lblDistribuicao2.setText("2 estrelas: 0");
        pnlResumoAvaliacoes.add(lblDistribuicao2);

        lblDistribuicao3.setText("3 estrelas: 0");
        pnlResumoAvaliacoes.add(lblDistribuicao3);

        lblDistribuicao4.setText("4 estrelas: 0");
        pnlResumoAvaliacoes.add(lblDistribuicao4);

        lblDistribuicao5.setText("5 estrelas: 0");
        pnlResumoAvaliacoes.add(lblDistribuicao5);

        lblObrasMaisAvaliadas.setText("Obra(s) mais avaliada(s): nenhuma avaliacao");
        pnlResumoAvaliacoes.add(lblObrasMaisAvaliadas);

        pnlAvaliacoes.add(pnlResumoAvaliacoes, java.awt.BorderLayout.CENTER);

        spAvaliacoes.setViewportView(pnlAvaliacoes);

        tabsGaleria.addTab("Avaliações", spAvaliacoes);

        pnlCorpo.add(tabsGaleria, java.awt.BorderLayout.CENTER);
        tabsGaleria.getAccessibleContext().setAccessibleName("home");
        tabsGaleria.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(pnlCorpo, java.awt.BorderLayout.CENTER);

        pnlFooter.setBackground(new java.awt.Color(0, 0, 0));
        pnlFooter.setPreferredSize(new java.awt.Dimension(550, 50));
        pnlFooter.setLayout(new java.awt.BorderLayout());
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
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarAvaliacoes;
    private javax.swing.JLabel lblDistribuicao1;
    private javax.swing.JLabel lblDistribuicao2;
    private javax.swing.JLabel lblDistribuicao3;
    private javax.swing.JLabel lblDistribuicao4;
    private javax.swing.JLabel lblDistribuicao5;
    private javax.swing.JLabel lblMediaEstrelas;
    private javax.swing.JLabel lblObrasMaisAvaliadas;
    private javax.swing.JLabel lblResumoTitulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTotalAvaliacoes;
    private javax.swing.JPanel pnlAcoesAvaliacoes;
    private javax.swing.JPanel pnlAvaliacoes;
    private javax.swing.JPanel pnlCorpo;
    private javax.swing.JPanel pnlCuriosity;
    private javax.swing.JPanel pnlFooter;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlMarte;
    private javax.swing.JPanel pnlPerseverance;
    private javax.swing.JPanel pnlResumoAvaliacoes;
    private javax.swing.JPanel pnlS_O;
    private javax.swing.JScrollPane spAvaliacoes;
    private javax.swing.JScrollPane spCuriosity;
    private javax.swing.JScrollPane spMarte;
    private javax.swing.JScrollPane spPerseverance;
    private javax.swing.JScrollPane spRoversGemeos;
    private javax.swing.JTabbedPane tabsGaleria;
    // End of variables declaration//GEN-END:variables
}
