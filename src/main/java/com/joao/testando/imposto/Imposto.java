package com.joao.testando.imposto;

import java.math.BigDecimal;

import com.joao.testando.orcamento.Orcamento;

public interface Imposto {

    BigDecimal calcular(Orcamento orcamento);
}
