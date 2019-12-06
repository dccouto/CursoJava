package app;

import java.util.Scanner;

/**
 * 21. Desenhe a seguinte pirâmide de números. O usuário determina a quantidade de linhas.
 * 
 * Criado em 2019-12-04
 * 
 * 
 * */

public class App_21 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);		
		
		System.out.println("Entre com a quantidade de linhas que deseja: ");
		
		int quant = ler.nextInt();//ler a quantidade de linhas
		
		ler.close();
		
		for (int i = 1; i <= quant; i++) { //Loop de interações de acordo com a quantidade de iterações desejadas
			
			for (int j = 1; j < i+1; j++) {//loop para imprimir a quantidade de linha
				
				if(i <= 9) { // verificação para acrescentar o 0 ao número de 1 a 9
					System.out.print(" 0" + i);
				}else {
					System.out.print(" "+i);

				}
								
			}
			System.out.println("");
		}
		
	}

}
