package exercicio_03;

/**
 * Exercício 3. Faça um programa para controle de empréstimo de livros, com as classes Emprestimo, Livro e Pessoa.
 * 
 * @author Diego
 * author Weslei
 * 
 * Data 2019/12/10
 * 
 * */

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		//objeto classe pessoa
		Pessoa pessoa = null; 
		
		//Objeto classe livro
		Livro livro;
		
		//objeto classe emprestimo
		Emprestimo emprestimo;
		
		//lista de livros
		ArrayList<Livro> listaLivro = new ArrayList<Livro>();
		
		int operacao;
	
		//loop para interação do usuário
		do {
			System.out.println("\n\nCadastro de Usuário digite (1)");
			System.out.println("Cadastro de Livros digite (2)");
			System.out.println("Efetivar empréstimo (3)");
			System.out.println("Visualizar empestimo (4)");
			System.out.println("Para Sair digite (0)");
			System.out.println("Opção: ");
			
			operacao = ler.nextInt();
		
		switch (operacao) {
		case 1:
			
			System.out.println("\nCadastro de Usuário");
			System.out.println("\nNome: ");
			String nome = ler.next();
			System.out.println("\nE-mail: ");
			String email = ler.next();
			System.out.println("\nTelefone: ");
			String telefone = ler.next();
		
			//nova instância do objeto pessoa passando dados pelo construtor
			pessoa = new Pessoa(nome, telefone, email);
			break;
		
		case 2: 
			System.out.println("\nDigite os dados do Livro que irá compor o empréstimo");
			System.out.println("\nNome do Livro: ");
			String nomeLivro = ler.next();
			System.out.println("\nAutor : ");
			String nomeAutor = ler.next();
			System.out.println("\nGenero : ");
			String genero = ler.next();
			System.out.println("\nAno: ");			
			String ano = ler.next();
			
			//nova instância do objeto livro passando dados pelo construtor
			livro = new Livro(nomeLivro, nomeAutor, genero, ano);
			
			//adicionando o objeto livro na lista de livros
			listaLivro.add(livro);
			break;
		
		case 3: 
			//nova instância do objeto emprestimo passando dados pelo construtor
			emprestimo = new Emprestimo(pessoa, listaLivro);
			
			break;
			
		case 4:
			//imprime a pessoa e a lista de livros do emprestimo
			System.out.println(pessoa.toString());
			for (Livro l : listaLivro) {
				System.out.println(l);
			}
			
			break;
		default:
			
			System.out.println("Finalizando Programa!");
			break;
		}
			
		} while (operacao != 0); 
		
		ler.close();


		
	}

}
