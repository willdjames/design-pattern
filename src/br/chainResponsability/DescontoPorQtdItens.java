package br.chainResponsability;

import br.strategy.Orcamento;

public class DescontoPorQtdItens implements IDesconto {
	
	private IDesconto proximo;

	public double descontar(Orcamento orcamento) {
		if(orcamento.getItens().size() > 4) {
			return orcamento.getValor() * 0.05;
		}else {
			return proximo.descontar(orcamento);
		}
	}

	@Override
	public void setProximoDesconto(IDesconto proximo) {
		this.proximo = proximo;
				
	}

}
