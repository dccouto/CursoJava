// Exercicio 7 - Calcular volume
package app;

import java.util.Scanner;

public class App_07 {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        final double pi = 3.14159f; //constante do valor de Pi

        System.out.println("Entre com o valor do raio: ");
        double raio = ler.nextFloat(); // leitura do raio
        System.out.println("Entre com o valor do altura: ");
        double altura = ler.nextFloat(); // leitura da altura

        ler.close();

        System.out.println("O valor do volume da lata de óleo é: " + (pi * raio * raio * altura)); // calculo e exibição do valor do volume
    }
}