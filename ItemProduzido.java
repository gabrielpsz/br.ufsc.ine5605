package br.ufsc.ine5605.testeInterfaces;

import java.util.ArrayList;

public class ItemProduzido extends ItemEstoque implements Vendavel{
	
	private ArrayList<ItemComprado> estrutura;

	public ItemProduzido(int codigo, String descricao, float quantidadeEstoque) {
		super(codigo, descricao, quantidadeEstoque);
		this.estrutura = new ArrayList<>();
	}	
	
	public void addItem(ItemComprado itemComprado) {
		//testes
		this.estrutura.add(itemComprado);
	}
	
	@Override
	public int getCodigo() {
		return super.getCodigo();
	}
	
	@Override
	public float getPrecoVenda() {
		return 0;
	}
	
	
	
	
}
