package App;

/**
 * Exercício 1: Para cada conjunto de valores abaixo, escreva o código Java, usando laço(s), que
 * preencha um array com os valores:
 * 
 * Criado em 2019-12-04
 * */

public class exercicio_01 {

	public static void main(String[] args) {
		//==============================================================
		/**
		 * Exercício A - Preencher o array com: 10 9 8 7 6 5 4 3 2 1
		 * */
		//==============================================================
		
		//Cria array de 10 posições
		int[] listInteiro = new int[10];
		
		//Variável auxiliar para ser adicionada no array
		int aux = 10;
		
		//repetição de 10 posições
		for (int i = 0; i < 10; i++) {
			
			//adiciona ao array o valor da aux
			listInteiro[i] = aux;
			aux--;
		}
		
		// Imprimir array
		for(int i = 0 ; i < listInteiro.length ; i++) {
			System.out.print(listInteiro[i] + " ");
		}
		//=======================================================
		/**
		 * Exercício B - Preencha com a sequência 0 1 4 9 16 25 36 49 64 81 100
		 * */
		//=======================================================
		//Cria array de 11 posições
		int[] list2 = new int[11];
		
	
		//repetição de 10 posições
		for (int i = 0; i <= 10; i++) {
			
			//adiciona ao array o valor da aux
			list2[i] = i*i;
		}
		System.out.println("");

		for(int i = 0 ; i < list2.length ; i++) {
			System.out.print(list2[i] + " ");
		}
		
		System.out.println("");

		
		/**================================================================
		 * Exercício C - Preencha com a sequência 1 2 3 4 5 10 20 30 40 50
		 * ================================================================
		 * */
		
		//Cria array de 10 posições
		int[] list3 = new int[10];
		
		int aux2 = 1;
		
		//repetição de 10 posições		
		for (int i = 0; i < list3.length; i++) {
			
			//adiciono a lista a variavel i+1 nas primeiras 5 posições
			if(i < 5) {
				list3[i] = i + 1;
			}
			
			//Adiciono a variavel aux * 10 após a 5ª posição 
			else {
				list3[i] = aux2 * 10;
				aux2++;
			}
		}
		
		//imprimir a lista
		for (int i = 0; i < list3.length; i++) {
			System.out.print(list3[i] + " ");
		}
		
		
		
		/**================================================================
		 * Exercício D - Preencha com a sequência 3 4 7 12 19 28 39 52 67 84
		 * ================================================================
		 * */
		
		//Cria array de 10 posições
		int[] list4 = new int[10];
		int aux3 = 1;
		int aux4 = 3;

		list4[0] = 3;
		//repetição de 10 posições		
		for (int i = 1; i < 10; i++) {
			
			list4[i] = aux4 + aux3; //adiciona o soma na lista 
			
			aux3 += 2; //soma de 2 em 2
			
			aux4 = list4[i]; //guarda o número anterior
			
		}
		
		System.out.println("");
		//imprimir a lista
		for (int i = 0; i < list4.length; i++) {
			System.out.print(list4[i] + " ");
		}
	}
}



















