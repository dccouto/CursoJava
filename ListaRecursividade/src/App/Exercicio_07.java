/**
 * Exercício 7 - Faça uma função recursiva que realize a multiplicação entre dois valores int,
 * sem utilizar o operador *.
 * 
 * Programador: Diego Corrêa Couto
 * Data: 2019-12-06
 * */

package App;

import java.util.Scanner;

public class Exercicio_07 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número: ");
		int num1 = ler.nextInt();
		
		System.out.println("Entre com o segundo número: ");
		int num2 = ler.nextInt();
		
		ler.close();
		
		//Chama a função recursiva e imprime o resultado
		System.out.println("O resultado é: " + Multiplicar(num1, num2));
		
	}

	
	//Funcção recursiva que realiza multiplicação
	private static int Multiplicar(int num1, int num2) {
		
		//Verifica se o segundo número é maior que 2
		if(num2 > 0) {
			return num1 + Multiplicar(num1, num2 - 1);
		}
		else {
			return 0;
		}
	}
		

}