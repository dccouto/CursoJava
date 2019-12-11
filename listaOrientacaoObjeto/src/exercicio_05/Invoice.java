package exercicio_05;

/**
 * @author Diego
 * Data 2019/12/10
 * 
 * Classe invoice
 * 
 * */

import java.util.List;

public class Invoice {
	//Lista de produtos
	private List<Produto> produto;
	private double total;
	
	//Construtor
	public Invoice(List<Produto> produto) {
		super();
		this.produto = produto;
		this.total = 0;
	}
	
	public List<Produto> getProduto() {
		return produto;
	}
	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
	
	
	//Retorna o total dos pedidos
	public double getTotal() {
		for (Produto prod : produto) {
			total += prod.getQuantidade() * prod.getPreco();
		}
		return total;
	}

}
