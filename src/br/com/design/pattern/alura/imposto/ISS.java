package br.com.design.pattern.alura.imposto;

import br.com.design.pattern.alura.Orcamento;

public class ISS implements Imposto{

    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }
}
