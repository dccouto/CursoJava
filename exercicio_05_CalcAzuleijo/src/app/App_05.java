// programa para calcular a quantidade de azuleijos para uma parede
package app;

import java.util.Scanner;

public class App_05 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        //Entrada de dados do tamanho da parede e dos azuleijos
        System.out.println("Entre com a altura da parede: ");
        float hp = ler.nextFloat();
        System.out.println("Entre com a largura da parede: ");
        float lp = ler.nextFloat();
        System.out.println("Entre com a altura da azuleijo: ");
        float ha = ler.nextFloat();
        System.out.println("Entre com a largura da azuleijo: ");
        float la = ler.nextFloat();

        ler.close();

        float areaParede = hp * lp; // calculo de area da parede

        float areaAzuleijo = ha * la; // calculo de area da azuleijo

        System.out.println("Quantidade de azuleijos necessários é: " + (areaParede / areaAzuleijo)); // Calculo dos azuleijos


    }
}