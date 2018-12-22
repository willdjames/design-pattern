package br.chainResponsability;

import br.strategy.Orcamento;

public interface IDesconto {

	double descontar(Orcamento orcamento);
	void setProximoDesconto(IDesconto desconto);
}
