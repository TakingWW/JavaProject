package com.joao.testando.orcamento;

import java.math.BigDecimal;

public class Orcamento {

    private int quantidadeItens;
    private BigDecimal valor;

    public Orcamento(BigDecimal valor, int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return this.valor;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

}
