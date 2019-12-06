/**
 * Exercício 9 - Um problema típico em ciência da computação consiste em converter um
 * número da sua forma decimal para a forma binária. Por exemplo, o
 * número 12 tem a sua representação binária igual a 1100. A forma mais
 * simples de fazer isso é dividir o número sucessivamente por 2 , onde o
 * resto da i-ésima divisão vai ser o dígito i do número binário (da direita para a
 * esquerda).
 * Por exemplo:
 * 12 / 2 = 6, resto 0 (1o dígito da direita para esquerda)
 * 6 / 2 = 3, resto 0 (2o dígito da direita para esquerda)
 * 3 / 2 = 1 resto 1 (3o dígito da direita para esquerda)
 * 1 / 2 = 0 resto 1 (4o dígito da direita para esquerda).
 * Resultado: 12 = 1100.
 * Faça uma função recursiva que dado um número decimal imprima a sua
 * representação binária corretamente.
 * 
 * 
 * Programador: Diego Couto
 * 
 * Data: 2019-12-06
 * */
package App;

import java.util.Scanner;

public class Exercicio_09 {

	public static void main(String[] args) {
		
		Scanner ler = new  Scanner(System.in);
		
		System.out.println("Entre com o número se irá ser convertido para binário: ");
		int num = ler.nextInt();
		
		ler.close();
		
		//Chama a função para transformar o número em binário
		Binario(num);
		
		
	}
	
	//Função recursiva
	private static int Binario(int num) {
		
		//verifica se o número é maior que zero
		if(num > 0) {
			//imprimi o resto da divisão por 2
			System.out.print(" "+ num % 2);
			//retorna a divisão de 2 sem o resto
			return Binario(num/2)  ;
		}
		else
			return 0;
	}

}
