//Exercicio 11 - programa para verificar se o cliente pode solicitar uma quantia de emprestimo.
package app;

import java.util.Scanner;

public class App_11 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        final float taxa = 0.3f; //taxa constante - de 30% do valor do salário

        System.out.println("Entre com o valor do salário Bruto: ");
        float salarioBruto = ler.nextFloat(); //leitura do salário bruto
        System.out.println("Entre com o valor do desconto salarial: ");
        float desconto = ler.nextFloat(); //leitura do desconto salarial
        System.out.println("Entre com o valor do empréstimo requerido: ");
        float emprestimo = ler.nextFloat(); //Leitura do valor que o usuário deseja receber de emprestimo

        ler.close();

        if ((salarioBruto - desconto) * taxa >= emprestimo) { //Verifica se o valor de emprestimo desejado é menor ou igual a taxa de 30% do salario líquido
            System.out.println("O valor poderá ser concedido");           
            
        }
        else{
            System.out.println("O valor NÃO poderá ser concedido");           

        }

    }
}