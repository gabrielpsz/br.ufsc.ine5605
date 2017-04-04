package br.ufsc.ine5605.testeInterfaces;

import java.util.ArrayList;

public class ControladorVenda {

	private ArrayList<Orcamento> orcamentos;
	private ControladorEstoque ctrlEstoque;
	
	
	public ControladorVenda() {
		this.orcamentos = new ArrayList<>();
		this.ctrlEstoque = new ControladorEstoque();
	}
	
	public void iniciar() {
		System.out.println("Cadastrar itens");
		
		ItemComprado itemComprado = new ItemComprado(1, "HD", 1, "Samsung");
		ItemComprado itemComprado2 = new ItemComprado(2, "Placa de rede", 2, "Intelbras");
		ItemComprado itemComprado3 = new ItemComprado(3, "Placa-mãe", 1, "PC Chips");
		
		ItemProduzido itemProduzido = new ItemProduzido(4, "Computador HP EliteOne 800", 1, 2500f);
		ItemProduzido itemProduzido2 = new ItemProduzido(5, "Computador Laptop HP", 1, 4500f);
		
		itemProduzido.addItem(itemComprado);
		itemProduzido.addItem(itemComprado2);
		
		itemProduzido2.addItem(itemComprado2);
		itemProduzido2.addItem(itemComprado3);
		
		Servico servico = new Servico(1, "Manutenção geral PC", "Contrato de suporte", 2, 750);
		
		
		Orcamento orcamento = new Orcamento(1);
		orcamento.addItem(itemProduzido);
		orcamento.addItem(itemProduzido2);
		orcamento.addItem(servico); 
		
		imprimeOrcamento(orcamento);
		
	}

	private void imprimeOrcamento(Orcamento orcamento) {
		// TODO Auto-generated method stub
		System.out.println("Orcamento: " +orcamento.getNumero());
		System.out.println("Itens do orcamento");
		for (Vendavel itemVendavel : orcamento.getItensOrcamento()) {
			System.out.println("Item: " +itemVendavel.getCodigo());
			System.out.println("Preco: " +itemVendavel.getPrecoVenda());
			System.out.println("Descrição: " +itemVendavel.getDescricao());
			if (itemVendavel instanceof ItemProduzido) {
				System.out.println("Item Produzido. Estrutura: ");
				for (ItemComprado itemComprado : ((ItemProduzido) itemVendavel).getEstrutura()) {
					System.out.println("     Componente: " +itemComprado.getCodigo());
				}
			}
		}
	}
	

}
