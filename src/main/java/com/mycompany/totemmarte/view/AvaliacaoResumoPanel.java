package com.mycompany.totemmarte.view;

import com.mycompany.totemmarte.modelo.AvaliacaoModelo;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AvaliacaoResumoPanel extends JPanel {

    private final JLabel lblTotalAvaliacoes = new JLabel();
    private final JLabel lblMediaEstrelas = new JLabel();
    private final JLabel lblDistribuicao1 = new JLabel();
    private final JLabel lblDistribuicao2 = new JLabel();
    private final JLabel lblDistribuicao3 = new JLabel();
    private final JLabel lblDistribuicao4 = new JLabel();
    private final JLabel lblDistribuicao5 = new JLabel();
    private final JLabel lblObrasMaisAvaliadas = new JLabel();
    private final JLabel lblApresentacaoFavorita = new JLabel();

    public AvaliacaoResumoPanel() {
        configurarLayout();
        atualizarResumo(List.of());
    }

    public void atualizarResumo(List<AvaliacaoModelo> avaliacoes) {
        int totalAvaliacoes = avaliacoes.size();
        int[] distribuicaoEstrelas = new int[6];
        int somaEstrelas = 0;
        Map<String, Integer> contagemPorObra = new HashMap<>();
        Map<String, Integer> contagemPorApresentacao = new HashMap<>();

        for (AvaliacaoModelo avaliacao : avaliacoes) {
            int estrelas = avaliacao.getEstrelas();
            if (estrelas >= 1 && estrelas <= 5) {
                distribuicaoEstrelas[estrelas]++;
                somaEstrelas += estrelas;
            }

            contagemPorObra.merge(normalizarTexto(avaliacao.getObraTitulo(), "Obra sem titulo"), 1, Integer::sum);
            contagemPorApresentacao.merge(normalizarTexto(avaliacao.getApresentacaoFavorita(), "nenhuma apresentação"), 1, Integer::sum);
        }

        double media = totalAvaliacoes == 0 ? 0.0 : (double) somaEstrelas / totalAvaliacoes;
        lblTotalAvaliacoes.setText("Total de avaliacoes: " + totalAvaliacoes);
        lblMediaEstrelas.setText(String.format(Locale.US, "Media geral de estrelas: %.1f", media));
        lblDistribuicao1.setText("1 estrela: " + distribuicaoEstrelas[1]);
        lblDistribuicao2.setText("2 estrelas: " + distribuicaoEstrelas[2]);
        lblDistribuicao3.setText("3 estrelas: " + distribuicaoEstrelas[3]);
        lblDistribuicao4.setText("4 estrelas: " + distribuicaoEstrelas[4]);
        lblDistribuicao5.setText("5 estrelas: " + distribuicaoEstrelas[5]);
        lblObrasMaisAvaliadas.setText("Obra(s) mais avaliada(s): " + montarResumoMaisCitados(contagemPorObra, "nenhuma avaliacao"));
        lblApresentacaoFavorita.setText("Apresentação(ões) favorita(s): " + montarResumoMaisCitados(contagemPorApresentacao, "nenhuma avaliacao"));
    }

    private void configurarLayout() {
        setBackground(new Color(237, 231, 222));
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createEmptyBorder(24, 24, 24, 24));

        JLabel lblTitulo = new JLabel("Resumo das avaliacoes");
        lblTitulo.setFont(new Font("SansSerif", Font.BOLD, 16));
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(0, 0, 16, 0));

        JPanel pnlConteudo = new JPanel(new GridLayout(0, 1, 0, 10));
        pnlConteudo.setBackground(new Color(237, 231, 222));
        pnlConteudo.add(lblTotalAvaliacoes);
        pnlConteudo.add(lblMediaEstrelas);
        pnlConteudo.add(lblDistribuicao1);
        pnlConteudo.add(lblDistribuicao2);
        pnlConteudo.add(lblDistribuicao3);
        pnlConteudo.add(lblDistribuicao4);
        pnlConteudo.add(lblDistribuicao5);
        pnlConteudo.add(lblObrasMaisAvaliadas);
        pnlConteudo.add(lblApresentacaoFavorita);

        add(lblTitulo, BorderLayout.PAGE_START);
        add(pnlConteudo, BorderLayout.CENTER);
    }

    private String normalizarTexto(String valor, String fallback) {
        if (valor == null || valor.isBlank()) {
            return fallback;
        }
        return valor;
    }

    private String montarResumoMaisCitados(Map<String, Integer> contagem, String fallback) {
        if (contagem.isEmpty()) {
            return fallback;
        }

        int maiorQuantidade = 0;
        for (Integer quantidade : contagem.values()) {
            if (quantidade > maiorQuantidade) {
                maiorQuantidade = quantidade;
            }
        }

        List<String> maisCitados = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : contagem.entrySet()) {
            if (entry.getValue() == maiorQuantidade) {
                maisCitados.add(entry.getKey());
            }
        }

        Collections.sort(maisCitados, String.CASE_INSENSITIVE_ORDER);
        if (maisCitados.size() == 1) {
            return maisCitados.get(0) + " (" + maiorQuantidade + ")";
        }
        return String.join(", ", maisCitados) + " (" + maiorQuantidade + " cada)";
    }
}
