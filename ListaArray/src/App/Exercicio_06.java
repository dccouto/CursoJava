package App;

import java.util.Random;

/**
 * Exercício 6: Escreva um método que recebe um array de inteiros a e devolve um array de boolean
 * onde, cada posição indique true se o elemento da posição correspondente de a é positivo e false
 * caso seja negativo ou zero.
 * 
 * Criado em 2019-12-04
 * */

public class Exercicio_06 {

	public static void main(String[] args) {

		//inicializo uma instância do uma classe que gera números randômicos
		Random random = new Random();
		
		//array de 500 posições
		int[] array = new int[500];
		
		
		//loop para preencher randomicamente o array com números positivos e negativos 
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(50) - 25;
		}
		
		//Chamo o método para gerar o array de boolean
		boolean[] arrayBool = convertForBool(array);
		
		
		//imprimir na tela o array de boolean
		for (int i = 0; i < arrayBool.length; i++) {
			System.out.println(arrayBool[i]);
		}
	}
	
	
	//Método para gerar o array de boolean de acordo com o array de int
	public static boolean[] convertForBool(int[] array) {

		
		//array criado de acordo com o tamanho do array recebido
		boolean[] arrayBool = new boolean[array.length];
		
		
		//loop para verificar se o número é posito ou negativo
		for (int i = 0; i < array.length; i++) {
			
			if(array[i] > 0) {//testa se é maior que 0
				arrayBool[i] = true;
			}
			else {//caso seja 0 ou negativo
				arrayBool[i] = false;
			}
				
		}
		
		return arrayBool; // retorna o array
	}

}
