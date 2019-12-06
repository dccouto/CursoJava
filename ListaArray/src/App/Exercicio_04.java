/**
 * Exercício 4: Crie um método que recebe um array de inteiros e retorna a quantidade de elementos
 * do array que são números negativos.
 * 
 * Programador: Diego Couto
 * Data: 2019-12-05
 * */

package App;

import java.util.Random;

public class Exercicio_04 {

	public static void main(String[] args) {
		
		
		Random random = new Random();
		
		//array de 100 posições
		int[] array = new int[100];
		
		//loop para inserir no array números positivos e negativos randomicamente
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(50) - 25;
		}
		
		//variável contadora
		int cont = 0;
		
		//loop para correr o array.
		for (int i = 0; i < array.length; i++) {
			
			//Verifica se o elemento é negativo
			if(array[i] < 0) {
				cont++;
			}
		}
		
		System.out.print(cont);
		
		
	}

}
