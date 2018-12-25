package br.builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.chainResponsability.Item;
import br.observer.AcaoAposGerarNota;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private String cnpj;
	private Calendar dataEmissao;
	private String observacao;
	private List<Item> itens = new ArrayList<>();
	private double totalValorItens;
	private List<AcaoAposGerarNota> todasAcoesASeremExecutadas;
	
//	Varargs ...
	public void adicionaAcao(AcaoAposGerarNota... acao) {
		for (AcaoAposGerarNota i : acao) {
			this.todasAcoesASeremExecutadas.add(i);
		}
	}
	
	public NotaFiscalBuilder() {
		this.todasAcoesASeremExecutadas = new ArrayList<>();
	}

	public NotaFiscalBuilder setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public NotaFiscalBuilder setCnpj(String string) {
		this.cnpj = string;
		return this;
	}

	public NotaFiscalBuilder setDataEmissao(Calendar instance) {
		this.dataEmissao = instance;
		return this;
	}

	public NotaFiscalBuilder setObs(String string) {
		this.observacao = string;
		return this;
	}

	public NotaFiscalBuilder setItem(Item item) {
		itens.add(item);
		totalValorItens += item.getValor();
		return this;
	}

	public double getImposto(double percImposto) {
		return this.totalValorItens * percImposto;
	}
	
	public double getTotalValorItens() {
		return totalValorItens;
	}
	
	public NotaFiscal montaNotaFiscal(){
		NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, dataEmissao, itens, observacao);
		
//		Sera notificada cada classe com suas respectivas responsabilidades de 
//		cada acao adicionada na lista de acoes
		for (AcaoAposGerarNota acao : this.todasAcoesASeremExecutadas) {
			acao.executar(nf);
		}
		
		return nf;
	}
}
