package br.chainResponsability;

import br.strategy.Orcamento;

public class DescontoPorValorOrcamento implements IDesconto {

	private IDesconto proximo;

	@Override
	public double descontar(Orcamento orcamento) {
		if(orcamento.getValor() > 499.0) {
			return orcamento.getValor() * 0.1;
		}else {			
			return proximo.descontar(orcamento);
		}
	}

	@Override
	public void setProximoDesconto(IDesconto proximo) {
		this.proximo = proximo;
	}

}
