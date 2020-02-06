package br.com.design.pattern.alura.imposto;

import br.com.design.pattern.alura.Orcamento;

public class ICMS implements Imposto{

    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.1;
    }

}
