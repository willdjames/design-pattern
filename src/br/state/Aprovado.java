package br.state;

import br.strategy.Orcamento;

public class Aprovado implements EstadoDeUmOrcamento {
	
	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.valor -= orcamento.getValor() * 0.02;
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento ja foi aprovado!");
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento ja foi aprovado!");
		
	}

	@Override
	public void finalza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
		
	}

}
