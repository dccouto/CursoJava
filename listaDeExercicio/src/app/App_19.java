package app;

import java.util.Scanner;

/**
 * Exercício 19. Determine a quantidade de homens e mulheres (separadamente) que são maiores
 * de idade, baseado numa lista de 10 pessoas.
 * 
 * */

public class App_19 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int genero;
		int idade;
		int quantSexoM = 0;
		int quantSexoF = 0;

		//Repetição para leitura de 10 pessoas
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Escolha a opção:"
					+"\n1 - Homem"
					+"\n2 - Mulher");
			genero = ler.nextInt();
			System.out.println("Digite a idade");
			idade = ler.nextInt();//leitura da idade
			
			
			//Compara o genero e se é maior de 18
			if(genero == 1 && idade >= 18){
				
				quantSexoM++;//incrementa variável contadora
				
			}else if(genero == 2 && idade >= 18){
				
				quantSexoF++;//incrementa variável contadora
			}			
			
		}
		
		ler.close();
		
		System.out.println("A quantidade de Mulheres maiores de idade são: " + quantSexoF);
		System.out.println("A quantidade de Homens maiores de idade são: " + quantSexoM);
	}

}
