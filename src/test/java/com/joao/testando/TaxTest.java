package com.joao.testando;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import com.joao.testando.imposto.CalculadoraDeImpostos;
import com.joao.testando.imposto.TipoImposto;
import com.joao.testando.orcamento.Orcamento;

import java.math.BigDecimal;

public class TaxTest {

    CalculadoraDeImpostos calculadoraImpostos = new CalculadoraDeImpostos();

    @Test
    public void issTax() {
        int quantidadeItens = 1;
        BigDecimal valorOrcamento = new BigDecimal("100");
        Orcamento orcamento = new Orcamento(valorOrcamento, quantidadeItens);
        BigDecimal calculaISS = calculadoraImpostos.calcular(orcamento, TipoImposto.ISS);
        BigDecimal valorEsperado = valorOrcamento.multiply(new BigDecimal("0.06"));
        assertEquals(calculaISS, valorEsperado);
    }

    @Test
    public void icmsTax() {
        int quantidadeItens = 1;
        BigDecimal valorOrcamento = new BigDecimal("100");
        Orcamento orcamento = new Orcamento(valorOrcamento, quantidadeItens);
        BigDecimal calculaICMS = calculadoraImpostos.calcular(orcamento, TipoImposto.ICMS);
        BigDecimal valorEsperado = valorOrcamento.multiply(new BigDecimal("0.1"));
        assertEquals(calculaICMS, valorEsperado);
    }

}
