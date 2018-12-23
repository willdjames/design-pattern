package br.state;

import br.strategy.Orcamento;

public class Finalizado implements EstadoDeUmOrcamento {
	
	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orcamento finalizado n�o pode receber desconto extra!");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento j� foi finalizado!");
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento j� foi finalizado!");
		
	}

	@Override
	public void finalza(Orcamento orcamento) {
		throw new RuntimeException("Orcamento j� foi finalizado!");
		
	}

}
