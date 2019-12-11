package exercicio_05;

/**
 * Exercício 5. Crie uma classe chamada Invoice que possa ser utilizado por uma loja de suprimentos de informática
 *para representar uma fatura de um item vendido na loja.
 *Uma fatura deve incluir as seguintesinformações como atributos:
 *•o número do item faturado,
 *•a descrição do item,
 *•a quantidade comprada do item e
 *•o preço unitário do item.
 *Sua classe deve ter um construtor que inicialize os quatro atributos. Se a quantidade não for
 *positiva, ela deve ser configurada como 0. Se o preço por item não for positivo ele deve ser
 *configurado como 0.0. Forneça um método chamado getInvoiceAmount que calcula o valor da
 *fatura (isso é, multiplica a quantidade pelo preço por item) e depois retorna o valor como um
 *double. Escreva um aplicativo de teste que demonstra as capacidades da classe Invoice.
 * 
 * 
 * 
 * 
 * @author Diego
 * Data: 2019/12/10
 * 
 * */





import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exercicio_01.Pedido;
import exercicio_01.Produto;

public class Principal {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		//Lista de produto
		List<Produto> listProduto = new ArrayList<Produto>();
		
		//instância da classe pedido
		Pedido pedido = null;
		
		int op;
		//Loop de repetição enquanto a opção não seja 0
		do {
			System.out.println("\nEscolha a opção:"
					+ "\n1 para incluir item a lista de compras"
					+ "\n2 para imprimir o total da compra"
					+ "\n0 para sair"
					+ "\nOpção: ");
			op = ler.nextInt();
			
			switch (op) {
			case 1:
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
				break;
			case 2:
				//Instância do objeto passado aobjeto para o construtor
				pedido = new Pedido(listProduto);
				
				//Imprime o total
				System.out.println("O total da compra é: "+pedido.getTotal());
				break;

			case 0:
				ler.close();
				break;
			default:
				System.out.println("Opção inválida!");
			}			
			
		} while (op != 0);
		
		
	}

}
