/**
 * Exercício 2. Faça um programa de agenda telefônica, com as classes Agenda e Contato.
 * 
 * @author Diego
 * @author Diego
 * 
 * 
 * */

package exercicio_02;

import java.util.ArrayList;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {

		//Objeto para leitura
		Scanner ler = new Scanner(System.in);
		
		//Declaração da classe 
		Contato contato =  null;
		
		//Lista de Contatos
		ArrayList<Contato> agenda = new ArrayList<Contato>();
		
		int op;
		
		//Loop de Repetição
		do {
			
			System.out.print("\nEscolha a opção"
					+ "\n1 Para novo contato."
					+ "\n2 Para exibir os contatos"
					+ "\n-1 Para sair"
					+ "\nOpção: ");
			op = ler.nextInt();
			
			switch (op) {
			case 1:
				System.out.println("Digite o nome: ");
				String nome = ler.next();
				System.out.println("Digite o e-mail: ");
				String email = ler.next();
				System.out.println("Digite o telefone: ");
				String telefone = ler.next();
				
				//Instância do objeto contato passando os dados para o construtor
				contato = new Contato(nome, email, telefone);
				
				//Armazeno na lista de contatos
				agenda.add(contato);
										
					
				break;
				
			case 2:
				
				//Percorre e imprimi a lista de contatos
				for (Contato c : agenda) {
					System.out.println(c.toString());
				}
				
				break;
			//opção de saída
			case -1:
				ler.close();
				break;
			default:
				System.out.println("\nOpção inválida!\n");
				break;
			}
			
		} while (op != -1);//Cláusula de parada
		
		
		
	}

}
