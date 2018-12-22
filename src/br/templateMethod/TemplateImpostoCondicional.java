package br.templateMethod;

import br.strategy.Imposto;
import br.strategy.Orcamento;

public abstract class TemplateImpostoCondicional implements Imposto {

	
	/**
	 * Aplicacao da logica qe sera herdada na classe filha
	 */
	@Override
	public final double calcula(Orcamento orcamento) {
		
		if(deveUsarMaximaTaxacao(orcamento)) {
			System.out.println("Maior(>) imposto aplicado");
			return maximaTaxacao(orcamento);
		}else {
			System.out.println("Menor(<) imposto aplicado");
			return minimaTaxacao(orcamento);
		}
	}

	protected abstract double minimaTaxacao(Orcamento orcamento);

	protected abstract double maximaTaxacao(Orcamento orcamento);

	protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
