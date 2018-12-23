package br.state;

import br.strategy.Orcamento;

public class TestDescontoExtra {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(500.0);
		
		orcamento.aplicaDescontoExtra();	
		System.out.println(orcamento.getValor());

		orcamento.aprova();
		orcamento.aplicaDescontoExtra();
		System.out.println(orcamento.getValor());
		
		orcamento.finaliza();
		orcamento.aplicaDescontoExtra(); // Finalizado nao pode receber desconto
		System.out.println(orcamento.getValor());
	}

}
