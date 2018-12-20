package br.strategy;

public class CalculadorDeImposto {
	

	public void calculaImposto(Orcamento orcamento, Imposto imposto) {
		double result = imposto.calcula(orcamento);
		System.out.println(result);
	}
}
