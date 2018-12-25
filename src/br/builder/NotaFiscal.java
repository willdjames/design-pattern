package br.builder;

import java.util.Calendar;
import java.util.List;

import br.chainResponsability.Item;

public class NotaFiscal {

	private String razaoSocial;
	private String cnpj;
	private Calendar dataEmissao;
	private double impostos;
	private List<Item> itens;
	private String obs;

	public NotaFiscal(String razaoSocial, String cnpj, Calendar dataEmissao, List<Item> itens,
			String obs) {
				this.razaoSocial = razaoSocial;
				this.cnpj = cnpj;
				this.dataEmissao = dataEmissao;
				this.itens = itens;
				this.obs = obs;		
		
	}
	
	double getTotalValorItens() {
		double total = 0.0;
		for (Item item : this.itens) {
			total += item.getValor();
		}
		return total;
	}
	
	public void setImpostos(double impostos) {
		this.impostos = this.getTotalValorItens() * impostos;
	}

	public double getImpostos() {
		return impostos;
	}

	double getImposto(double percImposto) {
		return this.getTotalValorItens() * percImposto;
	}
}
