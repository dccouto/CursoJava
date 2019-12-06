//Exercício 3 - Programa para calcular a área do retângulo e o perímetro

package app;

import java.util.Scanner;

public class App_03 {
    public static void main(String[] args) throws Exception {
        try{
            Scanner ler = new Scanner(System.in);
            System.out.println("Entre com a medida do comprimento:");
            float comprimento = ler.nextFloat(); //ler o comprimento
            System.out.println("Entre com a largura:");
            float largura = ler.nextFloat(); // ler a largura

            ler.close();//fecha a variável scanner

            System.out.println("A área do retângulo é: " + comprimento * largura);//calcula o retângulo
            System.out.println("O perímetro é: " + ((2 * comprimento) + (2 * largura)));//calcula o perímetro

        }
        catch(Exception e){
            System.out.println("Apenas números");
        }
    }
}