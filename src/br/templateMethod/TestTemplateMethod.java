package br.templateMethod;

import br.chainResponsability.Item;
import br.strategy.CalculadorDeImposto;
import br.strategy.Orcamento;

public class TestTemplateMethod {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(600.0);
		orcamento.setItens(new Item("Item 01", 110.0));
		
		ICCP iccp = new ICCP();
		IKC  ikc  = new IKC();
		
		CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();
		
		calculadorDeImposto.calculaImposto(orcamento, iccp);
		calculadorDeImposto.calculaImposto(orcamento, ikc);

	}

}
