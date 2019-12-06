//Programa para fazer a Média de 4 notas
package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int i = 0;
        float soma = 0;
        while(i < 4){//repetição para pegar as 4 notas
            System.out.println("Nota "+(i+1) +":");
            soma += ler.nextFloat(); // armazeno a soma das notas
            i++;
        }
        ler.close();
        System.out.println("Média:  " + soma /4);//imprimo a média das 4 notas


    }
}