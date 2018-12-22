package br.chainResponsability;

import br.strategy.Orcamento;

public class CalculadoraDeDesconto {
	
	public double calcula(Orcamento orcamento) {
		
		IDesconto descontoPorQtdItens 		= new DescontoPorQtdItens();
		IDesconto descontoPorValorOrcamento = new DescontoPorValorOrcamento();
		IDesconto descontoZero 				= new DescontoZero();
		
		descontoPorQtdItens.setProximoDesconto(descontoPorValorOrcamento);
		descontoPorValorOrcamento.setProximoDesconto(descontoZero);
		
		return descontoPorQtdItens.descontar(orcamento);
	}

}
