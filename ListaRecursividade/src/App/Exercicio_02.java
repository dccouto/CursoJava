/**
 * 2. Faça uma função recursiva para elevar um valor base a potência do valor
 * expoente.
 * 
 * Programador: Diego Couto
 * 
 * Data: 2019-12-05
 * */

package App;

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o número que será elevado a sua potência: ");
		
		int num = ler.nextInt();
		ler.close();
		
		//Chama a função recursiva e imprime 
		System.out.println(Potencia(num));
		
		
	}


	//Funcção recursiva de potência
	
	public static int Potencia(int num) {
	
		//Se num for igual a 0 irá retornar 1
		if(num <= 0){
			return 1;
		}
		else {			
			return num * Potencia(num - 1);			
		}
		
	}

}
