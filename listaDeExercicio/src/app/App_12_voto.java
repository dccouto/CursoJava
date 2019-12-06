package app;

import java.util.Scanner;

/**
 * App_12_voto
 * Programa para verificar se o usuário pode votar
 */
public class App_12_voto {
    public static void main(String[] args) throws Exception {
        System.out.println("Entre com a idade: ");
        Scanner ler = new Scanner(System.in);
        int idade = ler.nextInt();//ler a idade

        if (idade < 16) { //verifica se é menor de 16
            System.out.println("Não é permitido votar!");
        }else if (idade >= 18 && idade <= 70) { //verifica se a idade está entre 18 e 70
            System.out.println("Voto obrigatório.");
        } else { // voto facultativo para as demais
            System.out.println("Voto facultativo!");

        }
        ler.close();

    }
    
}