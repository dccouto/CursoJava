/**
 * Exercício 4 - Faça uma função recursiva que calcule o M.D.C. pelo algoritmo de Euclides.
 * Por exemplo, divide-se a por b e obtém-se o quociente q e o resto r. Se r for
 * zero, b é o m.d.c.; se não for, divide-se b por r e assim sucessivamente até
 * encontra r um resto zero. O último divisor é o M.D.C.
 * 
 * Data: 2019-12-06
 * 
 * */


package App;

import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		//ler o dividendo
		System.out.println("Entre com o dividendo: ");
		int num1 = ler.nextInt();

		//ler o divisor
		System.out.println("Entre com o divisor: ");
		int num2 = ler.nextInt();
		
		ler.close();
		
		
		//ler e chama a função recursiva de mdc
		System.out.println("O máximo divisor comum é: " + mdc(num1, num2));
		
	}
	
	//Função recursiva de mdc
	public static double mdc(double a, double b) {
	    if (b == 0) {
	        
	    	return b;
	    	
	    } else {
	    	
	        return mdc(b, (a % b));
	    }

	}
		
		

	}


