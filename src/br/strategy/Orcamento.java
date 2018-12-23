package br.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import br.chainResponsability.Item;
import br.state.EmAprovacao;
import br.state.EstadoDeUmOrcamento;

public class Orcamento {
	
	public double valor;
	private List<Item> itens;
	
	/**
	 * Apesar de public, correto ser protected, pois os estados sao parte do orcamento,
	 *	por isso do faz sentido que estejam no mesmo pacote e obtem sua visibilidade.
	 */
	public EstadoDeUmOrcamento estadoAtual;

	
	
	public Orcamento(double valor) {
		this.valor = valor;
		this.itens = new ArrayList<>();
		this.estadoAtual = new EmAprovacao();
	}

	public double getValor() {
		return valor;
	}

	public void setItens(Item item) {
		this.itens.add(item);
		
	}
	
	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public void aplicaDescontoExtra() {
		this.estadoAtual.aplicaDescontoExtra(this);
	}
	
	public void aprova() {
		this.estadoAtual.aprova(this);
	}
	
	public void reprova() {
		this.estadoAtual.reprova(this);
	}
	
	public void finaliza() {
		this.estadoAtual.finalza(this);
	}

}
