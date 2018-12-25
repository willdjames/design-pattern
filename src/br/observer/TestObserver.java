package br.observer;

import br.builder.NotaFiscal;
import br.builder.NotaFiscalBuilder;
import br.chainResponsability.Item;

public class TestObserver {

	public static void main(String[] args) {
		
//		Utilizamos o builder para facilitar a criacao de uma nf para exemplo
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		
		builder.adicionaAcao(new NotaFiscalDAO()
				, new ImpressaoNotaFiscal());
		
		NotaFiscal notaFiscal = builder.setItem(new Item("Item 1", 200.0))
									.setItem(new Item("Item 2", 800.0))
									.montaNotaFiscal();
		
		
		System.out.println(notaFiscal.getTotalValorItens());
		
		
	}

}
