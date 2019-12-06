package app;

/**
 * 20. Exiba os 50 primeiros números da seqüência de Fibonacci
 * 
 * Criado em 04-12-2019
 * */

public class App_20_Fibonacci {

	public static void main(String[] args) {
		
		int aux = 0;
		int a = 0;
		int b = 1;
		System.out.print(b + ","); //Imprimo o primeiro elemento da sequência

		for (int i = 1; i <= 50; i++) { // Repetição de 50 vezes
			
			aux = a + b; //Recebe a soma 
			a = b; // Armazena o valor anterior
			b = aux; // armazena o valor da soma
			System.out.print(aux + ",");

		}

	}

}
