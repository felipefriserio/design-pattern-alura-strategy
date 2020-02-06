package br.com.design.pattern.alura;

import br.com.design.pattern.alura.imposto.Imposto;

public class Orcamento {
    private final double valor;

    public Orcamento(double valor){
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
