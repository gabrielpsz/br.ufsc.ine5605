package br.ufsc.ine5605.testeInterfaces;

import java.util.ArrayList;

public class Orcamento {
	
	private ArrayList<Vendavel> itensOrcamento;
	
	public Orcamento() {
		this.itensOrcamento = new ArrayList<>();
	}
	
	private void addItem(Vendavel item) {
		//testes
		this.itensOrcamento.add(item);
	}
	
	

}
