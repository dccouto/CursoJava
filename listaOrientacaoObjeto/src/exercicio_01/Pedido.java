package exercicio_01;

import java.util.List;

public class Pedido {
	//Lista de produtos
	private List<Produto> produto;
	private double total;
	
	//Construtor
	public Pedido(List<Produto> produto) {
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
