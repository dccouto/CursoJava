//Programa para calcular impostos de area construida e não construida

package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        float taxConstruida = 5.00f; //valor fixo da taxa de área construida
        float taxNaoConstruida = 3.80f; //valor fixo da taxa de área não construida

        Scanner ler = new Scanner(System.in);
        System.out.println("Entre com a área total do terreno: ");
        float areaTotal = ler.nextFloat();
        System.out.println("Entre com a área construída: ");
        float areaConstruida = ler.nextFloat();

        ler.close();

        float total = taxNaoConstruida * ( areaTotal - areaConstruida); // calcula o valor do imposto da área não construída
        total = total + (areaConstruida * taxConstruida);// calcula o valor do imposto da área construída

        System.out.println("O valor total dos impostos: " + total);
    }
}