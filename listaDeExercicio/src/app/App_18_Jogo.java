package app;

import java.util.Random;
import java.util.Scanner;

/**
 * App_18_Jogo
 * Exercício 18. Crie um jogo para o usuário descobrir um número sorteado de 1 a 100. A cada
 * tentativa dele, forneça uma dica mostrando se o número é maior ou menor.
 * Quando ele descobrir exiba uma mensagem de parabéns e mostre em quantas
 * tentativas ele conseguiu.
 */
public class App_18_Jogo {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Random random = new Random();

        int numero = random.nextInt(100) + 1;
        int num = 0;
        int tentativa = 1;

        do {
            System.out.println("Qual é o número? ");
            num = ler.nextInt();

            if (num > numero) {
                System.out.println("\nO número correto é MENOR!");
                tentativa++;

            }else if(num < numero){
                System.out.println("\nO número correto é MAIOR!");
                tentativa++;

            }else{
                System.out.println("\nParabéns!!! Você acertou com " + tentativa + " tentativas");

            }
        } while (num != numero);
        ler.close();
    }
}