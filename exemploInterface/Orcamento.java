package br.ufsc.ine5605.testeInterfaces;

import java.util.ArrayList;

public class Orcamento {
	
	private ArrayList<Vendavel> itensOrcamento;
	private int numero;
	
	public Orcamento(int numero) {
		this.itensOrcamento = new ArrayList<>();
		this.numero = numero;
	}
	
	public void addItem(Vendavel item) {
		//testes
		this.itensOrcamento.add(item);
	}

	public ArrayList<Vendavel> getItensOrcamento() {
		return itensOrcamento;
	}

	public int getNumero() {
		return numero;
	}
	
	
	
	

}
