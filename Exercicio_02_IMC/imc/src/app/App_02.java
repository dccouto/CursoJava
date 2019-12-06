//programa para calcular o IMC (Indice de massa corporal)
package app;

import java.util.Scanner;

public class App_02 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        //entrada dos dados de altura
        System.out.println("Entre com a altura");
        float altura = ler.nextFloat();
        //entrada dos dados de peso

        System.out.println("Entre com o peso");
        float peso = ler.nextFloat();
        //exibindo o resultado do calculo do IMC
        System.out.println(peso/(altura*altura));
        ler.close();
    }
}