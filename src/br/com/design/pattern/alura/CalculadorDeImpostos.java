package br.com.design.pattern.alura;

import br.com.design.pattern.alura.imposto.ICMS;
import br.com.design.pattern.alura.imposto.ISS;
import br.com.design.pattern.alura.imposto.Imposto;

public class CalculadorDeImpostos {

    public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
        double valor = imposto.calcula(orcamento);
        System.out.println(valor);

    }
}
