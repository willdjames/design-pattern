package br.state;

import br.strategy.Orcamento;

public interface EstadoDeUmOrcamento {

	void aplicaDescontoExtra(Orcamento orcamento);
	void aprova(Orcamento orcamento);
	void reprova(Orcamento orcamento);
	void finalza(Orcamento orcamento);

}
