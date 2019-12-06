/**
 * Exercício 11 - Faça um programa recursivo que calcule o fatorial de um número qualquer.
 * O que é o fatorial?
 * Seja n um número natural, tal que n >= 2, chama-se fatorial de n o produto de
 * todos os números naturais consecutivos de n até 1.
 * Por exemplo: 5! = 1*2*3*4*5 = 120
 * 
 * programador: Diego Couto
 * 
 * Data: 2019-12-06
 * 
 * */

package App;

import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o número que irá ser fatorado: ");
		
		int num = ler.nextInt();
		ler.close();
		
		//Chama o método Fatorial e imprimi o resultado
		System.out.println("O resultado do fatorial é: " + Fatorial(num));
		
		
	}

	private static int Fatorial(int num) {
		
		//se numero for maior que 0
		if(num > 0)
			return num * Fatorial(num -1);
		else
			return 1;
	}
}
