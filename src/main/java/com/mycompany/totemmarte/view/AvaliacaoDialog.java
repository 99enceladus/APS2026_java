package com.mycompany.totemmarte.view;

import com.mycompany.totemmarte.controller.SessaoController;
import com.mycompany.totemmarte.modelo.AvaliacaoModelo;
import com.mycompany.totemmarte.modelo.SessaoModelo;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AvaliacaoDialog extends JDialog {

    private final SessaoController controller;
    private final JComboBox<SessaoItem> cmbObra;
    private final JComboBox<String> cmbFaixaEtaria;
    private final JComboBox<Integer> cmbEstrelas;
    private final JTextArea txaMotivo;

    public AvaliacaoDialog(Frame parent, SessaoController controller, List<SessaoModelo> sessoes) {
        super(parent, true);
        this.controller = controller;
        this.cmbObra = new JComboBox<>();
        this.cmbFaixaEtaria = new JComboBox<>(new String[]{
            "Selecione",
            "Até 12 anos",
            "13 a 17 anos",
            "18 a 25 anos",
            "26 a 40 anos",
            "41 a 60 anos",
            "61+"
        });
        this.cmbEstrelas = new JComboBox<>(new Integer[]{1, 2, 3, 4, 5});
        this.txaMotivo = new JTextArea(5, 20);

        setTitle("Avaliar visita");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        montarLayout(sessoes);
        pack();
        setLocationRelativeTo(parent);
    }

    private void montarLayout(List<SessaoModelo> sessoes) {
        JPanel painelCampos = new JPanel(new GridLayout(0, 1, 0, 8));
        painelCampos.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));

        cmbObra.addItem(new SessaoItem("", "Selecione"));
        for (SessaoModelo sessao : sessoes) {
            cmbObra.addItem(new SessaoItem(sessao.getId(), sessao.getTitulo().trim()));
        }

        txaMotivo.setLineWrap(true);
        txaMotivo.setWrapStyleWord(true);

        painelCampos.add(new JLabel("Obra favorita"));
        painelCampos.add(cmbObra);
        painelCampos.add(new JLabel("Faixa etária"));
        painelCampos.add(cmbFaixaEtaria);
        painelCampos.add(new JLabel("Nota (1 a 5 estrelas)"));
        painelCampos.add(cmbEstrelas);
        painelCampos.add(new JLabel("Por que gostou? (opcional)"));
        painelCampos.add(new JScrollPane(txaMotivo));

        JButton btnEnviar = new JButton("Enviar avaliação");
        btnEnviar.addActionListener(evt -> salvarAvaliacao());

        JPanel painelAcoes = new JPanel();
        painelAcoes.add(btnEnviar);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(painelCampos, BorderLayout.CENTER);
        getContentPane().add(painelAcoes, BorderLayout.PAGE_END);
    }

    private void salvarAvaliacao() {
        SessaoItem item = (SessaoItem) cmbObra.getSelectedItem();
        String faixaEtaria = (String) cmbFaixaEtaria.getSelectedItem();
        Integer estrelas = (Integer) cmbEstrelas.getSelectedItem();
        String motivo = txaMotivo.getText().trim();

        if (item == null || item.id().isBlank()) {
            JOptionPane.showMessageDialog(this, "Selecione a obra favorita.");
            return;
        }

        if (faixaEtaria == null || faixaEtaria.equals("Selecione")) {
            JOptionPane.showMessageDialog(this, "Selecione a faixa etária.");
            return;
        }

        try {
            controller.salvarAvaliacao(new AvaliacaoModelo(
                    item.id(),
                    item.titulo(),
                    faixaEtaria,
                    motivo,
                    estrelas
            ));
            JOptionPane.showMessageDialog(this, "Avaliação enviada com sucesso.");
            dispose();
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private record SessaoItem(String id, String titulo) {
        @Override
        public String toString() {
            return titulo;
        }
    }
}
