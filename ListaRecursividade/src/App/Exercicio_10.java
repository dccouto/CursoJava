/**
 * Exercício 10 - Faça um programa recursivo que calcule a sequencia de Fibonacci.
 * O que é o sequencia de Fibonacci?
 * 
 * Programador: Diego Couto
 * 
 * Data: 2019-12-06
 * 
 * */

package App;

public class Exercicio_10 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			System.out.print(" " + Fibonacci(i));
		}
		
		
	}
	
	private static int Fibonacci(int n) {
		
		if (n < 2) { 
		    return n;
		    }
		return Fibonacci(n - 1) + Fibonacci(n - 2);
		
	}

}
