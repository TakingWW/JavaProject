package com.joao.testando.imposto;

import java.math.BigDecimal;

import com.joao.testando.orcamento.Orcamento;

public enum TipoImposto implements Imposto {
    ICMS((Orcamento orcamento) -> {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }),
    ISS((Orcamento orcamento) -> {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    });

    private final Imposto taxa;

    TipoImposto(Imposto imposto) {
        this.taxa = imposto;
    }

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return this.taxa.calcular(orcamento);
    }
}