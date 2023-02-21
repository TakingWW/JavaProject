package com.joao.testando;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.joao.testando.desconto.CalculadoraDeDescontos;
import com.joao.testando.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescountTest {

    CalculadoraDeDescontos calculadoraDescontos = new CalculadoraDeDescontos();

    @Test
    public void descontoMenosDeCincoItems() {
        int quantidadeItens = 1;
        BigDecimal valorOrcamento = new BigDecimal("100");
        Orcamento orcamento = new Orcamento(valorOrcamento, quantidadeItens);
        BigDecimal desconto = calculadoraDescontos.calcular(orcamento);
        BigDecimal descontoEsperado = valorOrcamento.multiply(BigDecimal.ZERO);
        assertEquals(descontoEsperado, desconto);
    }

    @Test
    public void descontoCincoItems() {
        int quantidadeItens = 5;
        BigDecimal valorOrcamento = new BigDecimal("100");
        Orcamento orcamento = new Orcamento(valorOrcamento, quantidadeItens);
        BigDecimal desconto = calculadoraDescontos.calcular(orcamento);
        BigDecimal descontoEsperado = valorOrcamento.multiply(BigDecimal.ZERO);
        assertEquals(descontoEsperado, desconto);
    }

    @Test
    public void descontoMaisDeCincoItems() {
        int quantidadeItens = 6;
        BigDecimal valorOrcamento = new BigDecimal("100");
        Orcamento orcamento = new Orcamento(valorOrcamento, quantidadeItens);
        BigDecimal desconto = calculadoraDescontos.calcular(orcamento);
        BigDecimal descontoEsperado = valorOrcamento.multiply(new BigDecimal("0.1"));
        assertEquals(descontoEsperado, desconto);
    }
}
