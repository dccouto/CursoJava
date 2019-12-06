package app;

import java.util.Scanner;

/**
 * App_15_Emprestimo
 * 
 * Exiba o valor do empréstimo possível para um funcionário de uma empresa.
 *Sabe-se:
 *Cargo % do salário
 *Diretoria 30%
 *Gerência 25%
 *Operacional 20%
 */
public class App_15_Emprestimo {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Entre com o salário: ");
        float salario = ler.nextFloat(); //leitura do salário

        // Exibe as opções
        System.out.println("Escolha a opção..."
        +"\n1 para Diretoria"
        +"\n2 para Gerência"
        +"\n3 para Operacional");
        System.out.print("Opção: ");
        short op = ler.nextShort(); //ler a opção

        ler.close();

        switch (op) {
            case 1:
                System.out.printf("\nEmprestimo disponível de R$%.2f", (salario * 0.3)); //Calcula e exibe o valor permitido para empréstimo
                
                break;
                
            case 2:
                System.out.printf("\nEmprestimo disponível de R$%.2f", (salario * 0.25)); //Calcula e exibe o valor permitido para empréstimo
                
                break;

            case 3:
                System.out.printf("\nEmprestimo disponível de R$%.2f", (salario * 0.20)); //Calcula e exibe o valor permitido para empréstimo
                
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

    }
}