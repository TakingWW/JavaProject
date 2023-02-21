package com.joao.testando.imposto;

import java.math.BigDecimal;

import com.joao.testando.orcamento.Orcamento;

public class CalculadoraDeImpostos {
    public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto) {
        return tipoImposto.calcular(orcamento);
    }
}
