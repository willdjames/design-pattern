package br.templateMethod;

import br.chainResponsability.Item;
import br.strategy.Orcamento;

public final class IKC extends TemplateImpostoCondicional {
	
	public IKC() {
	}
	
	private boolean temAlgumItemAcimade100ReaisNo(Orcamento orcamento) {
		for (Item i : orcamento.getItens()) {
			if(i.getValor() > 100) return true;
		}
		return false;
	}

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.12;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 499 && temAlgumItemAcimade100ReaisNo(orcamento);
	}

}
