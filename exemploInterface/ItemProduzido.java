package br.ufsc.ine5605.testeInterfaces;

import java.util.ArrayList;

public class ItemProduzido extends ItemEstoque implements Vendavel{
	
	private ArrayList<ItemComprado> estrutura;
	private float precoVenda;

	public ItemProduzido(int codigo, String descricao, float quantidadeEstoque, float precoVenda) {
		super(codigo, descricao, quantidadeEstoque);
		this.estrutura = new ArrayList<>();
		this.precoVenda = precoVenda;
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
		return this.precoVenda;
	}

	public ArrayList<ItemComprado> getEstrutura() {
		return estrutura;
	}
	
	@Override
	public String getDescricao() {
		return super.getDescricao() +" -> PRODUZIDO";
		
	}
	
	
	
	
}
