package br.observer;

import br.builder.NotaFiscal;

public class NotaFiscalDAO implements AcaoAposGerarNota {

	@Override
	public void executar(NotaFiscal notaFiscal) {
		System.out.println("Nota fiscal persistida no BD!");
		
	}
	
	

}
