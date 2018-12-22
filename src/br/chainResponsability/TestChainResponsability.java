package br.chainResponsability;

import br.strategy.Orcamento;

public class TestChainResponsability {
	
	public static void main(String[] args) {
		
		CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();
		
		
		Orcamento orcamento = new Orcamento(500.0);
		
		orcamento.setItens(new Item("Item 1", 200.0));
		orcamento.setItens(new Item("Item 2", 200.0));
		orcamento.setItens(new Item("Item 2", 200.0));
		orcamento.setItens(new Item("Item 2", 200.0));
		orcamento.setItens(new Item("Item 2", 200.0));
		
		double descontoFinal = calculadora.calcula(orcamento);
		
		System.out.println(descontoFinal);
	}

}
