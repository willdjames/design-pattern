package br.chainResponsability;

import br.strategy.Orcamento;

public class DescontoZero implements IDesconto {

	@Override
	public double descontar(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximoDesconto(IDesconto desconto) {

	}

}
