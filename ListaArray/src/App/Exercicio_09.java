package App;

import java.util.Random;

/**
 * Exercício 9: Crie um método que recebe um array de inteiros positivos e substitui seus elementos
 * de valor ímpar por -1 e os pares por +1.
 * 
 * Data de criação: 2019-12-05
 * */

public class Exercicio_09 {

	public static void main(String[] args) {

		Random random = new Random();
		
		//array de 100 posições
		int[] array = new int[100];
		
		
		//loop para adicionar valor randomico no array
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100) + 1;
		}
		
		
		//chama o método passado o array.
		AlteraValorParImpar(array);
		
	}
	
	
	//método para alterar valores pares para 1 e impar para -1
	public static void AlteraValorParImpar(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] % 2 == 0) {//se for par
				array[i] = 1;
			
			}else {//se for impar
				array[i] = -1;
			}
		}
		
		//imprimi o array
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}

}
