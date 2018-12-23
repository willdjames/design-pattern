package br.decorator;

import br.strategy.Orcamento;
import br.templateMethod.IKC;

public class TestDeImpostosComplexos {

	public static void main(String[] args) {
		
		/**
		 * Decorator tem a funcao de juntar comportamentos de classes diferentes
		 * atraves da composicao
		 * 
		 */
		Imposto iss = new ISS( new ICMS( new IKC()) );
		
		Orcamento orcamento = new Orcamento(500);
		double valor = iss.calcula(orcamento);
		
		System.out.println(valor);
		

	}

}
