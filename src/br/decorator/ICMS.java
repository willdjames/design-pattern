package br.decorator;

import br.strategy.Orcamento;

public class ICMS extends Imposto {
	
	protected ICMS(Imposto outroImposto) {
		super(outroImposto);
	}
	protected  ICMS() {
	}
	
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.1 + calculaOutroImposto(orcamento);
	}

}
