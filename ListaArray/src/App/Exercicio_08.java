package App;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Exercício 8: Faça um método que devolve um array de números lidos do teclado.
 * 
 * Data de criação: 2019-12-05
 * */

public class Exercicio_08 {

	public static void main(String[] args) {
		
		//ArrayList para adicionar
		ArrayList<Integer> arrayList;
		
		
		//Chama o método LerNumeros
		arrayList = LerNumeros();
		
		
		for (Integer integer : arrayList) {
			//imprime a lista
			System.out.print(integer + " ");
		}

	}
	
	
	//método para ler e adicionar no array
	public static ArrayList<Integer> LerNumeros() {
		
		Scanner ler = new Scanner(System.in);

		//ArrayList para adicionar
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		
		for (int i = 0; i < 10; i++) {
			//Adiciona o item a lista
			arrayList.add(ler.nextInt());
		}
		
		ler.close();
		return arrayList;
	}

}
