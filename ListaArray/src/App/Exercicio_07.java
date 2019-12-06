package App;

import java.util.Random;

/**
 * Exercício 7: Escreva um método que recebe um array de números e devolve a posição onde se
 * encontra o maior valor do array. Se houver mais de um valor maior, devolver a posição da primeira
 * ocorrência.
 * 
 * Criado em 2019-12-05
 * */

public class Exercicio_07 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[] array = new int[10];
		
		
		//loop para preencher o array com o número random
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(20);
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}
		
		//imprime o retorno do maior índice
		System.out.print("O indice da maior é: " + RetornaPosicaoMaior(array));
		
		
		

	}
	
	//Metodo para retornar a maior posiçao
	public static int RetornaPosicaoMaior(int[] array) {
		
		int maior = 0;
		
		//Loop para verificar a maior posição
		for (int i = 1; i < array.length; i++) {			
	
			//verifica a a posição maior	
			if(array[maior] < array[i]) {
				maior = i; //guarda o indice da maior posição				
			}	
		}
		//retorna a variável maior
		return maior;
	}

}
