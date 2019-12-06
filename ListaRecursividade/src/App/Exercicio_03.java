package App;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		
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
	public static double mdc(double dividendo, double divisor) {
	    if ((dividendo % divisor == 0)) {
	        
	    	return divisor;
	    	
	    } else {
	    	
	        return mdc(divisor, (dividendo % divisor));
	    }

	}
}
