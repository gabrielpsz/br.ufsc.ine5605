package br.ufsc.ine5605.testeInterfaces;

public class ItemComprado extends ItemEstoque{
	
	private String fornecedor;
	
	public ItemComprado(int codigo, String descricao, float quantidadeEstoque, String fornecedor) {
		super(codigo, descricao, quantidadeEstoque);
		this.fornecedor = fornecedor;
	}

}
