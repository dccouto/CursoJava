//Exercicio número 9 - Efetuar a troca de dois valores inteiros das variáveis A e B
package app;

import java.util.Scanner;

public class App_09 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        System.out.println("Entre com o valor de A: ");
        int a = ler.nextInt(); //lendo o valor de A
        System.out.println("Entre com o valor de B: ");
        int b = ler.nextInt(); //lendo o valor de B
        ler.close();
        a = a + b; // A recebe a soma das variáveis
        b = a - b; // B recebe o valor que tinha em A
        a = a - b; // A recebe o valor  que tinha em B

        System.out.println("O valor de A = " + a); //Imprime o valor de A
        System.out.println("O valor de B = " + b); //Imprime o valor de B



    }
}