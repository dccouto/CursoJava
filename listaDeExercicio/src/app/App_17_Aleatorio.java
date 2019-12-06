package app;

import java.util.Random;

/**
 * App_17_Aleatorio
 * Exercício 17. Exiba 50 números sorteados de 1 a 100 para o usuário.
 */
public class App_17_Aleatorio {

    public static void main(String[] args) {
        Random random = new Random(); //Usei o Random para gerar número aleatório

        for (int i = 0; i < 50; i++) { //repetição de 50 vezes
            System.out.println(random.nextInt(100) + 1);//Exibe randomicamente um número de 1 a 100
        }
    }
}