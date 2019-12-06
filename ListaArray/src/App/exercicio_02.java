package App;


/**
 * Exercício 2: Escreva um trecho Java que exiba os valores de um array a double numa mesma
 * linha.
 * 
 * Data de criação 2019-12-04
 * */


public class exercicio_02 {

	public static void main(String[] args) {
		
		double[] a = new double[6];
		
		for (int i = 1; i < a.length; i++) {
			a[i] = i * 3.1415f;
		}
		
		for (int i = 1; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
