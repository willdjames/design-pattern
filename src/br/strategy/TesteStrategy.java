package br.strategy;

public class TesteStrategy {

	public static void main(String[] args) {

		
		Orcamento orcamento = new Orcamento(500.0);
		
		Imposto icms = new ICMS();
		Imposto iss = new ISS();
		
		CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();
		
		calculadorDeImposto.calculaImposto(orcamento, icms);
		calculadorDeImposto.calculaImposto(orcamento, iss);
		
	}

}
