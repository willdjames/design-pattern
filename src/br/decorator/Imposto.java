package br.decorator;

import br.strategy.Orcamento;

public abstract class Imposto {
	
	protected Imposto outroImposto;
	
	protected abstract double calcula(Orcamento orcamento);
	
	protected Imposto() {}
	
	protected Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}
	
	/**
	 * Outro imposto da super classe
	 */
	protected double calculaOutroImposto(Orcamento orcamento) {
		if(outroImposto == null) return 0;
		return outroImposto.calcula(orcamento);
	}

}
