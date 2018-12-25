package br.observer;

import br.builder.NotaFiscal;

public class ImpressaoNotaFiscal implements AcaoAposGerarNota {

	@Override
	public void executar(NotaFiscal notaFiscal) {
		System.out.println("Nota fiscal impressa!");
		
	}
	
	

}
