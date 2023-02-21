package com.joao.testando.desconto;

import java.math.BigDecimal;

import com.joao.testando.orcamento.Orcamento;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {

        if (orcamento.getQuantidadeItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        } else if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }

        return BigDecimal.ZERO;
    }
}
