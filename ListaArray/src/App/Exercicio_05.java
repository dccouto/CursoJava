package App;

import java.util.Random;
import java.util.Scanner;

/**
 * Exercício 5: Crie um método que recebe um array de inteiros a e um valor inteiro x e retorna a
 * quantidade de vezes que x aparece no array a.
 * 
 * Data de criação 2019-12-04
 * */

public class Exercicio_05 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		//instância de um objeto que gera números randômicos
		Random random = new Random();
		
		//Array de 500 posições
		int[] a = new int[500];
		
		//Leitura do array e inserção de cada numero criado randômicamente
		for (int i = 0; i < 500; i++) {
			
			a[i] = random.nextInt(100);
		}
		
		
		System.out.println("Insira um numero para verificar se existe no array: ");
		int x = ler.nextInt();
		ler.close();
		
		//variável contadora para controle de vezes que o número foi achado
		int count = 0;
		
		//loop para verificação do número
		for (int i = 0; i < a.length; i++) {
			if(x == a[i]) {//verifica se o número existe
				count++;
			}
		}
		
		System.out.println("O número "+ x + " foi encontrado "+count+ " vezes!");

	}

}
