package br.ufsc.ine5605.testeInterfaces;

public class Servico implements Vendavel{
	
	private int codigo;
	private String descricao;
	private String contrato;
	private int horasServico;
	private float valorHora;
	
	public Servico(int codigo, String descricao, String contrato, int horasServico, float valorHora) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.contrato = contrato;
		this.horasServico = horasServico;
		this.valorHora = valorHora;
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
	
	public String getContrato() {
		return contrato;
	}
	
	public void setContrato(String contrato) {
		this.contrato = contrato;
	}

	@Override
	public float getPrecoVenda() {
		// TODO Auto-generated method stub
		return this.valorHora * this.horasServico;
	}
	
	

}
