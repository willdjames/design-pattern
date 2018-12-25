package br.builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.chainResponsability.Item;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private String cnpj;
	private Calendar dataEmissao;
	private String observacao;
	private List<Item> itens = new ArrayList<>();
	private double totalValorItens;

	NotaFiscalBuilder setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	NotaFiscalBuilder setCnpj(String string) {
		this.cnpj = string;
		return this;
	}

	NotaFiscalBuilder setDataEmissao(Calendar instance) {
		this.dataEmissao = instance;
		return this;
	}

	NotaFiscalBuilder setObs(String string) {
		this.observacao = string;
		return this;
	}

	NotaFiscalBuilder setItem(Item item) {
		itens.add(item);
		totalValorItens += item.getValor();
		return this;
	}

	double getImposto(double percImposto) {
		return this.totalValorItens * percImposto;
	}
	
	double getTotalValorItens() {
		return totalValorItens;
	}
	
	NotaFiscal montaNotaFiscal(){
		return new NotaFiscal(razaoSocial, cnpj, dataEmissao, itens, observacao);
	}
}
