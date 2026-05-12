package com.mycompany.totemmarte.view;

import java.awt.Color;
import java.awt.Frame;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import com.mycompany.totemmarte.controller.SessaoController;
import com.mycompany.totemmarte.modelo.AvaliacaoModelo;
import com.mycompany.totemmarte.modelo.SessaoModelo;

public class FormDialog extends javax.swing.JDialog {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormDialog.class.getName());
    private static final String OPCAO_PADRAO = "Selecione";
    private static final String[] FAIXAS_ETARIAS = {
        OPCAO_PADRAO,
        "Até 12 anos",
        "13 a 17 anos",
        "18 a 25 anos",
        "26 a 40 anos",
        "41 a 60 anos",
        "61+"
    };

    private final SessaoController controller;
    private final List<SessaoModelo> sessoes;
    private final List<SessaoModelo.Grupo> grupos;
    private boolean avaliacaoEnviada;

    /**
     * Creates new form FormDialog
     */
    public FormDialog(java.awt.Frame parent, boolean modal) {
        this(parent, criarControllerPadrao());
    }

    private static SessaoController criarControllerPadrao() {
        return new SessaoController();
    }

    private FormDialog(Frame parent, SessaoController controller) {
        this(parent, controller, controller.listarSessoes(), controller.listarGrupos());
    }

    public FormDialog(Frame parent, SessaoController controller, List<SessaoModelo> sessoes, List<SessaoModelo.Grupo> grupos) {
        super(parent, true);
        this.controller = controller;
        this.sessoes = List.copyOf(sessoes);
        this.grupos = List.copyOf(grupos);
        initComponents();
        configurarTela(parent);
        carregarCombos();
        registrarEventos();
    }

    public boolean isAvaliacaoEnviada() {
        return avaliacaoEnviada;
    }

    private void configurarTela(Frame parent) {
        setTitle("Avaliar visita");
        getContentPane().setBackground(new Color(237, 231, 222));
        pnlCorpo.setBackground(new Color(237, 231, 222));
        pnlFooter.setBackground(new Color(237, 231, 222));
        btnEnviar.setText("Enviar avaliação");
        txaMotivo.setLineWrap(true);
        txaMotivo.setWrapStyleWord(true);
        setLocationRelativeTo(parent);
    }

    private void carregarCombos() {
        cmbFxEtaria.setModel(new DefaultComboBoxModel<>(FAIXAS_ETARIAS));
        cmbNota.setModel(new DefaultComboBoxModel<>(new String[]{OPCAO_PADRAO, "1", "2", "3", "4", "5"}));
        cmbSessao.setModel(new DefaultComboBoxModel<>(this.montarGrupos()));
        cmbApresentacao.setModel(new DefaultComboBoxModel<>(montarOpcoesSessoes()));
    }

    private String[] montarGrupos() {
        String[] grupos = new String[this.grupos.size() + 1];
        grupos[0] = OPCAO_PADRAO;
        for (int i = 0; i < this.grupos.size(); i++) {
            grupos[i + 1] = this.grupos.get(i).name();
        }
        
        return grupos;
    }
    
    private String[] montarOpcoesSessoes() {
        String[] opcoes = new String[sessoes.size() + 1];
        opcoes[0] = OPCAO_PADRAO;
        for (int i = 0; i < sessoes.size(); i++) {
            opcoes[i + 1] = sessoes.get(i).getTitulo().trim();
        }
        return opcoes;
    }

    private void registrarEventos() {
        btnEnviar.addActionListener(evt -> salvarFormulario());
    }

    private void salvarFormulario() {
        SessaoModelo sessaoSelecionada = obterSessaoSelecionada(cmbSessao.getSelectedIndex());
        String faixaEtaria = (String) cmbFxEtaria.getSelectedItem();
        String apresentacaoFavorita = obterTituloSelecionado(cmbApresentacao);
        Integer nota = obterNotaSelecionada();
        String motivo = txaMotivo.getText().trim();

        if (sessaoSelecionada == null) {
            JOptionPane.showMessageDialog(this, "Selecione uma sessão da galeria.");
            return;
        }

        if (faixaEtaria == null || OPCAO_PADRAO.equals(faixaEtaria)) {
            JOptionPane.showMessageDialog(this, "Selecione a faixa etária.");
            return;
        }

        if (apresentacaoFavorita == null) {
            JOptionPane.showMessageDialog(this, "Selecione a apresentação favorita.");
            return;
        }

        if (nota == null) {
            JOptionPane.showMessageDialog(this, "Selecione a nota da avaliação.");
            return;
        }

        try {
            controller.salvarAvaliacao(new AvaliacaoModelo(
                    sessaoSelecionada.getId(),
                    sessaoSelecionada.getTitulo().trim(),
                    faixaEtaria,
                    apresentacaoFavorita,
                    motivo,
                    nota
            ));
            avaliacaoEnviada = true;
            JOptionPane.showMessageDialog(this, "Avaliação enviada com sucesso.");
            dispose();
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private SessaoModelo obterSessaoSelecionada(int selectedIndex) {
        if (selectedIndex <= 0) {
            return null;
        }
        return sessoes.get(selectedIndex - 1);
    }

    private String obterTituloSelecionado(javax.swing.JComboBox<String> comboBox) {
        Object selectedItem = comboBox.getSelectedItem();
        if (!(selectedItem instanceof String titulo) || OPCAO_PADRAO.equals(titulo)) {
            return null;
        }
        return titulo;
    }

    private Integer obterNotaSelecionada() {
        String notaSelecionada = obterTituloSelecionado(cmbNota);
        if (notaSelecionada == null) {
            return null;
        }
        return Integer.valueOf(notaSelecionada);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHeader = new javax.swing.JPanel();
        pnlFooter = new javax.swing.JPanel();
        btnEnviar = new javax.swing.JButton();
        pnlCorpo = new javax.swing.JPanel();
        lblPergunta1 = new javax.swing.JLabel();
        cmbSessao = new javax.swing.JComboBox<>();
        lblPergunta2 = new javax.swing.JLabel();
        cmbFxEtaria = new javax.swing.JComboBox<>();
        lblPergunta3 = new javax.swing.JLabel();
        cmbApresentacao = new javax.swing.JComboBox<>();
        lblPergunta4 = new javax.swing.JLabel();
        cmbNota = new javax.swing.JComboBox<>();
        lblPergunta5 = new javax.swing.JLabel();
        scpMotivo = new javax.swing.JScrollPane();
        txaMotivo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(237, 231, 222));
        setPreferredSize(new java.awt.Dimension(756, 800));

        pnlHeader.setBackground(new java.awt.Color(0, 0, 0));
        pnlHeader.setPreferredSize(new java.awt.Dimension(580, 50));

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 756, Short.MAX_VALUE)
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(pnlHeader, java.awt.BorderLayout.PAGE_START);

        pnlFooter.setPreferredSize(new java.awt.Dimension(756, 60));

        btnEnviar.setText("Enviar");

        javax.swing.GroupLayout pnlFooterLayout = new javax.swing.GroupLayout(pnlFooter);
        pnlFooter.setLayout(pnlFooterLayout);
        pnlFooterLayout.setHorizontalGroup(
            pnlFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFooterLayout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(btnEnviar)
                .addContainerGap(385, Short.MAX_VALUE))
        );
        pnlFooterLayout.setVerticalGroup(
            pnlFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFooterLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnEnviar)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(pnlFooter, java.awt.BorderLayout.PAGE_END);

        pnlCorpo.setLayout(new java.awt.GridLayout(10, 1));

        lblPergunta1.setText("Escolha uma sessão da galeria");
        pnlCorpo.add(lblPergunta1);

        cmbSessao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pnlCorpo.add(cmbSessao);

        lblPergunta2.setText("Informe a faixa etária");
        pnlCorpo.add(lblPergunta2);

        cmbFxEtaria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pnlCorpo.add(cmbFxEtaria);

        lblPergunta3.setText("Escolha a apresentação favorita");
        pnlCorpo.add(lblPergunta3);

        cmbApresentacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pnlCorpo.add(cmbApresentacao);

        lblPergunta4.setText("Nota (1 a 5 estrelas)");
        pnlCorpo.add(lblPergunta4);

        cmbNota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pnlCorpo.add(cmbNota);

        lblPergunta5.setText("Por que gostou?");
        pnlCorpo.add(lblPergunta5);

        txaMotivo.setColumns(20);
        txaMotivo.setRows(5);
        scpMotivo.setViewportView(txaMotivo);

        pnlCorpo.add(scpMotivo);

        getContentPane().add(pnlCorpo, java.awt.BorderLayout.CENTER);

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

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                FormDialog dialog = new FormDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JComboBox<String> cmbApresentacao;
    private javax.swing.JComboBox<String> cmbFxEtaria;
    private javax.swing.JComboBox<String> cmbNota;
    private javax.swing.JComboBox<String> cmbSessao;
    private javax.swing.JLabel lblPergunta1;
    private javax.swing.JLabel lblPergunta2;
    private javax.swing.JLabel lblPergunta3;
    private javax.swing.JLabel lblPergunta4;
    private javax.swing.JLabel lblPergunta5;
    private javax.swing.JPanel pnlCorpo;
    private javax.swing.JPanel pnlFooter;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JScrollPane scpMotivo;
    private javax.swing.JTextArea txaMotivo;
    // End of variables declaration//GEN-END:variables
}