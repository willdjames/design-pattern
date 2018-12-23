package br.decorator;

import br.strategy.Orcamento;

public class ISS extends Imposto {
	
	protected ISS(Imposto outroImposto) {
		super(outroImposto);
	}
	
	protected ISS() {
		
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + calculaOutroImposto(orcamento);
	}

}
