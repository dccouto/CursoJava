/**
 * Exercício 1. Identifique as classes e implemente um programa para a seguinte especificação:
 * “O supermercado vende diferentes tipos de produtos. Cada produto tem um preço e uma
 * quantidade em estoque. Um pedido de um cliente é composto de itens, onde cada item especifica
 * o produto que o cliente deseja e a respectiva quantidade.Esse pedido pode ser pago em dinheiro,
 * cheque ou cartão.”
 * 
 * @author Diego
 * 
 * Date: 2019/12/10
 * 
 * */


package exercicio_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		//Lista de produto
		List<Produto> listProduto = new ArrayList<Produto>();
		
		//instância da classe pedido
		Pedido pedido = null;
		
		//variável contadora
		int quant = 0;
		
		//Loop de repetição condicional
		while (quant < 2) {
			
			System.out.println("Entre com o Nome do produto");
			String nome = ler.next();
			
			System.out.println("Entre com o preco do produto");
			double preco = ler.nextDouble();
			
			System.out.println("Entre com o quantidade do produto");
			int quantidade = ler.nextInt();
			
			
			//Cria novo objeto passando os dados para o construtor
			Produto p1 = new Produto(nome, preco, quantidade);
			
			
			//adiciona a lista de produtos
			listProduto.add(p1);
			
			quant++;
		}
		
		ler.close();
		
		//Instância do objeto passado aobjeto para o construtor
		pedido = new Pedido(listProduto);
		
		//Imprime o total
		System.out.println("O total da compra é: "+pedido.getTotal());
		

	}

}
