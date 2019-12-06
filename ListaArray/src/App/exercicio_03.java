package App;

import java.util.Scanner;

/**
 * Exercício 3: Escreva um trecho Java que leia 10 valores double do teclado e armazene-os num
 * array d.
 * 
 * Data de criação 2019-12-04
 * */

public class exercicio_03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double[] d = new double[10];
		
		//repetição de 10 vezes
		for (int i = 0; i < d.length; i++) {
			
			System.out.println("Entre com o valor");
			
			//insiro o que foi digitado pelo usuário no array
			d[i] = ler.nextDouble();
		}
		
		ler.close();
	}

}
