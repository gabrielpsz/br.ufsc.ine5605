package br.ufsc.ine5605.testeInterfaces;

public class ItemEstoque {
	
	private int codigo;
	private String descricao;
	private float quantidadeEstoque;

	public ItemEstoque(int codigo, String descricao, float quantidadeEstoque) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(float quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	
	

}
