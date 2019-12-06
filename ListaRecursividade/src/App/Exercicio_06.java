/**
 * 6. Faça uma função recursiva que recebe um vetor preenchi do e a quantidade de
 * posições deste vetor, e retorna a soma de todos os elementos do veto r.
 * 
 * Programador: Diego Couto
 * Data: 2019-12-05
 * */

package App;

import java.util.Random;

public class Exercicio_06 {

	public static void main(String[] args) {
		
		//Array de array de 50 posições
		int[] array = new int[50];
		
		//objeto que gera números randômicos
		Random random = new Random();
		
		//loop para prencher o array com números aleatório
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(20);
		}
		
		//loop para imprimi o array
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		
		//imprimi e chama a função recursiva
		System.out.print("\n" + SomaArray(array, 0));
		
	}
	
	
	//função recursiva para somar elementos do array
	public static int SomaArray(int[] array, int index) {
		
		//verifica se o index é menor que o array
		if(index < array.length) {
			
			return array[index] + SomaArray(array, index + 1);		
			
		}
		else {
			return 0;
		}
	}

}
