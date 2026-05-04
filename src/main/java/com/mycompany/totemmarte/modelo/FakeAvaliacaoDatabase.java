package com.mycompany.totemmarte.modelo;

import java.util.ArrayList;
import java.util.List;

public class FakeAvaliacaoDatabase {

    private final List<AvaliacaoModelo> avaliacoes = new ArrayList<>();

    public void salvar(AvaliacaoModelo avaliacao) {
        avaliacoes.add(avaliacao);
    }

    public List<AvaliacaoModelo> listarAvaliacoes() {
        return new ArrayList<>(avaliacoes);
    }
}
