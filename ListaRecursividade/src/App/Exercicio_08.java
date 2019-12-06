/**
 * Exercício 8. Escreva uma função recursiva, int SomaSerie (in t i, int j, in t k), que
 * imprime na tela a soma de valores do intervalo [i ,j], com incremento k.
 * 
 * Programador: Diego Couto
 * 
 * Data: 2019-12-06
 * 
 * */

package App;

import java.util.Scanner;

public class Exercicio_08 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número: ");
		int num1 = ler.nextInt();
		
		System.out.println("Entre com o segundo número: ");
		int num2 = ler.nextInt();
		
		System.out.println("Entre com o terceiro número: ");
		int num3 = ler.nextInt();
		
		ler.close();
		
		//Chama a função recursiva e imprimi o resultado
		System.out.println("O resultado é: " + SomaSerie(num1, num2, num3));
	}
	
	//Função recursiva
	private static int SomaSerie(int i, int j, int k) {
		
		//Verifica se o i é menor ou igual o j
		if(i <= j) {
			return i + k + SomaSerie(i + 1 , j, k);
		}
		//senão retorna 0
		else
			return 0;
		
	}

}
