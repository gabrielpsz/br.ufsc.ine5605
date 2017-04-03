package br.ufsc.ine5605.testeInterfaces;

import java.util.ArrayList;

public class ControladorEstoque {
	
	private ArrayList<ItemEstoque> itens;
	
	public ControladorEstoque() {
		this.itens = new ArrayList<>();
	}
	
	public void addItem(ItemEstoque item) {
		//tratar null, duplicidade, sincronizacao
		this.itens.add(item);
	}
	
	public void removeItem() {
		
	}
 }
