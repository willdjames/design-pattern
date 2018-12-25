package br.builder;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import br.chainResponsability.Item;

public class TestBuilder {

	public static void main(String[] args) {
		
		
//		Nota de complexidade para criar objeto sem builder
		
		String razaoSocial 	= "Loja 1";
		String cnpj			= "12.345.567.999/0001-99";
		Calendar dataEmissao= Calendar.getInstance();
		List<Item> itens	= Arrays.asList(new Item("Item 1", 200.0)
										, new Item("Item 2", 350.0));		
		String obs			= "Alguma obs.";
		
		NotaFiscal notalFiscalSemBuilder = new NotaFiscal(razaoSocial, cnpj, dataEmissao, itens, obs);
		notalFiscalSemBuilder.setImpostos(0.05);
		
		System.out.println(notalFiscalSemBuilder.getTotalValorItens());
		System.out.println(notalFiscalSemBuilder.getImpostos());
		
		
//		Criacao de um novo objeto com pattern Builder
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		
		builder.setRazaoSocial("Loja 2")
		.setCnpj("12.345.567.000/0001-99")
		.setDataEmissao(Calendar.getInstance())
		.setObs("Alguma observacao")
		.setItem(new Item("Item 3", 200.0))
		.setItem(new Item("Item 3", 350.0));
		
		NotaFiscal notaFiscalComBuilder = builder.montaNotaFiscal();
		
		System.out.println(notaFiscalComBuilder.getTotalValorItens());
		System.out.println(notaFiscalComBuilder.getImposto(0.05));
	}

}
