package App;

import java.util.Scanner;

/**
 * 1. Faça um programa (utilizando recursividade) que peça para o usuário digitar um
 * número, em seguida, faça a soma de todos os algarismos do número.
 * Exemplo: 1111 = 1+1+1+1= 4
 * 2090 = 2+0+9+0= 11
 * 
 * Programador: Diego Couto
 * 
 * Data: 2019-12-06
 * 
 * */

public class Exercicio_01 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);		
		System.out.print("Digite o número");		
		int num = ler.nextInt();		
		ler.close();
		
		//Converte número para string		
		String txt = Integer.toString(num); 
		
		//cria array no tamanho da string
		int[] aux = new int[txt.length()];

		
		//loop para realizar a conversão de char para int
		for (int i = 0; i < txt.length(); i++) {
			aux[i] = (int) txt.charAt(i) - 48;
		}
		
		//variável que irá receber a soma
		int soma = 0;
		
		
		//Chama o método recursivo e imprimi o resultado
		System.out.print("O resultado é: " + RecursivoSoma(aux, 0)); 
		
		
	}
	
	
	//Funcção recursiva
	public static int RecursivoSoma(int[] numero, int index) {		
		
		//Se o index for menor que o tamanho do array
		if(index < numero.length)
			return numero[index] + RecursivoSoma(numero, index + 1);
		return 0;
	}

}















