/**
 * 5. Faça um programa que receba um valor n, e imprima a contagem
 * regressiva a partir deste valor. Por exemplo, se o usuário digitar 5, o
 * programa irá imprimir 5, 4, 3, 2, 1, 0.
 * 
 * Programador: Diego Couto
 * Data: 2019-12-05
 * 
 * */

package App;

import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o número para inicar a contagem regressiva: ");
		int num = ler.nextInt();
		
		ler.close();
		
		//Chama a função recursiva
		ContagemRegressiva(num);
		
		
		

	}
	
	
	//Funcção recursiva de contagem regressiva
	public static int ContagemRegressiva(int num) {
		
		System.out.println(num);
		if(num == 0)
			return 1;
		else
			return ContagemRegressiva(num - 1);
	}

}
