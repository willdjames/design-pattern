package br.state;

import br.strategy.Orcamento;

public class EmAprovacao implements EstadoDeUmOrcamento {
	
	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.valor -= orcamento.getValor() * 0.05;
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Aprovado();
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Reprovado();
	}

	@Override
	public void finalza(Orcamento orcamento) {
		throw new RuntimeException("Orcamento em aprovacao não pode ser finalizado!");
	}

}
