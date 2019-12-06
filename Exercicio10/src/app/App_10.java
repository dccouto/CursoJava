//Programa para ler  o total de venda de 5 vendedores, calcular comissão de 10%, total de vendas e média

package app;

import java.util.Scanner;

public class App_10 {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);
        int op = 0;
        float vendedor1 = 0, vendedor2 = 0, vendedor3 = 0, vendedor4 = 0, vendedor5 = 0; //inicialização das variáveis

        //inicio do ciclo de repetição do/While
        do { 
            System.out.println("Entre com a opção desejada:"
            +"\n 1 para Inserir a venda de vendedor "
            +"\n 2 para Calcular a comissão de 10% "
            +"\n 3 para Calcular o Total de Vendas "
            +"\n 4 para Calcular a média "
            +"\n -99 Sair "
            +"\n Opção: ");

            op = ler.nextInt(); // ler a opção inserida

            switch (op) {
                case 1: //Caso seja 1 irá realizar a leitura das vendas de cada vendedor
                    System.out.println("Insira a venda do vendedor 1: ");
                    vendedor1 = ler.nextFloat();
                    System.out.println("Insira a venda do vendedor 2: ");
                    vendedor2 = ler.nextFloat();
                    System.out.println("Insira a venda do vendedor 3: ");
                    vendedor3 = ler.nextFloat();
                    System.out.println("Insira a venda do vendedor 4: ");
                    vendedor4 = ler.nextFloat();
                    System.out.println("Insira a venda do vendedor 5: ");
                    vendedor5 = ler.nextFloat();
                    
                    break;
                case 2: //Caso seja 2, irá realizar o calculo de comissão de cada vendedor
                    System.out.println("A comissão do vendedor 1: " + (vendedor1 * 0.1f));
                    System.out.println("A comissão do vendedor 2: " + (vendedor2 * 0.1f));
                    System.out.println("A comissão do vendedor 3: " + (vendedor3 * 0.1f));
                    System.out.println("A comissão do vendedor 4: " + (vendedor4 * 0.1f));
                    System.out.println("A comissão do vendedor 5: " + (vendedor5 * 0.1f));

                    break;
                case 3: //Caso seja 3, irá calcular o total de vendas de todos os vendedores
                    System.out.println("O Total de vendas: " + (vendedor1 + vendedor2 + vendedor3 + vendedor4 + vendedor5));
                
                    break;
                case 4: //Caso seja 4, irá calcular a média de vendas
                    System.out.println("O Média de vendas: " + ((vendedor1 + vendedor2 + vendedor3 + vendedor4 + vendedor5) / 5));

                
                    break;
                case -99: // Caso seja -99 irá sair do programa
                    ler.close();
                    break;
            
            
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (op != -99); //irá repitir até que seja digitado -99

    }
}