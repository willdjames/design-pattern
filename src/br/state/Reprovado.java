package br.state;

import br.strategy.Orcamento;

public class Reprovado implements EstadoDeUmOrcamento {
	
	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orcamento reprovado n�o pode receber desconto extra!");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento j� foi reprovado!");
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento reprovado n�o pode receber desconto extra!");
		
	}

	@Override
	public void finalza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
		
	}

}
