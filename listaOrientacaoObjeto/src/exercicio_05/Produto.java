package exercicio_05;

/**
 * @author Diego
 * Data 2019/12/10
 * 
 * Classe produto
 * 
 * 
 * */

public class Produto {
	
	private String nome;
	private double preco;
	private int quantidade;
	
	
	//Construtor
	public Produto() {
		super();
	}
	//Construtor
	public Produto(String nome, double preco, int quantidade) {
		super();
		this.nome = nome;
		
		//verifica se o preço é negativo
		if(preco < 0)
		{
			this.preco = 0;
		}
		else {
			this.preco = preco;
		}
		
		//verifica se a quantidade é negativa
		if(quantidade < 0) {
			this.quantidade = 0;
		}
		else {
			this.quantidade = quantidade;
		}
	}
	
	//Métodos set e get	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
