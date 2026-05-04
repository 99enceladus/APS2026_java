
package com.mycompany.totemmarte.modelo;

import java.util.List;

public class SessaoRepositorio {

    private final FakeSessaoDatabase banco;
    private final FakeAvaliacaoDatabase bancoAvaliacao;

    public SessaoRepositorio() {
        this(new FakeSessaoDatabase(), new FakeAvaliacaoDatabase());
    }

    public SessaoRepositorio(FakeSessaoDatabase banco, FakeAvaliacaoDatabase bancoAvaliacao) {
        this.banco = banco;
        this.bancoAvaliacao = bancoAvaliacao;
    }

    public List<SessaoModelo> listarSessoes() {
        return banco.listarSessoes();
    }

    public void salvarAvaliacao(AvaliacaoModelo avaliacao) {
        bancoAvaliacao.salvar(avaliacao);
    }

    public List<AvaliacaoModelo> listarAvaliacoes() {
        return bancoAvaliacao.listarAvaliacoes();
    }
}
