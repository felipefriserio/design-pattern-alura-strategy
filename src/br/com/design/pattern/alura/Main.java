package br.com.design.pattern.alura;

import br.com.design.pattern.alura.imposto.ICMS;
import br.com.design.pattern.alura.imposto.ISS;
import br.com.design.pattern.alura.imposto.Imposto;

public class Main {
    public static void main(String[] args) {
        Imposto iss  = new ISS();
        Imposto icms = new ICMS();

        Orcamento orcamento = new Orcamento(500);

        CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();
        calculadorDeImpostos.realizaCalculo(orcamento, iss);
        calculadorDeImpostos.realizaCalculo(orcamento, icms);
    }
}
