package br.observer;

import br.builder.NotaFiscal;

public class EnviadorDeEmail implements AcaoAposGerarNota {

	@Override
	public void executar(NotaFiscal notaFiscal) {
		System.out.println("Email enviado!");
		
	}
	
	

}
