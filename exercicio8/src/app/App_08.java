//programa para converter de Fahrenheit para Celcius

package app;

import java.util.Scanner;

public class App_08 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        System.out.println("Entre com a temperatura em Fahrenheit: ");
        float tempFah = ler.nextFloat(); //ler a temperatura em Fahrenheit
        ler.close();

        System.out.println("A temperatura em Celcius é: " +((tempFah - 32) * 5)/9); //Executa e exibe a conversão de Celcius para Celcius
    }
}