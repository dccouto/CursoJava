package app;

import java.util.Scanner;

/**
 * App_13_DataAniversario
 * 
 * Exercício 13 - Programa para verificar se o dia e mês inserido pelo usuário é válido
 */
public class App_13_DataAniversario {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Short dia;
        Short mes;

        for (int i = 0 ; i < 2 ; i++) {
            System.out.println("Entre com o DIA do nascimento: ");
            dia = ler.nextShort();//ler dia
            System.out.println("Entre com o MES do nascimento: ");
            mes = ler.nextShort();//ler mes

            
            switch (mes) {
                case 1: //caso mês seja 1
                if (dia >= 1 && dia <= 31) { //verifica se os dias estão no intervalo correto do mês de Janeiro
                    System.out.println("Janeiro");

                } else {
                    System.out.println("Dia inválido");
                }
                    
                    break;
                case 2:
                    if (dia >= 1 && dia <= 28) { //verifica se os dias estão no intervalo correto do mês de Fevereiro
                        System.out.println("Fevereiro");

                    } else {
                        System.out.println("Dia inválido");
                    }
                    break;
                case 3:
                    if (dia >= 1 && dia <= 31) { //verifica se os dias estão no intervalo correto do mês de Março
                        System.out.println("Março");

                    } else {
                        System.out.println("Dia inválido");
                    }
                    
                    break;
                case 4:
                    if (dia >= 1 && dia <= 30) { //verifica se os dias estão no intervalo correto do mês de Abril
                        System.out.println("Abril");

                    } else {
                        System.out.println("Dia inválido");
                    }
                    
                    break;
                case 5:
                    if (dia >= 1 && dia <= 31) { //verifica se os dias estão no intervalo correto do mês de Maio
                        System.out.println("Maio");

                    } else {
                        System.out.println("Dia inválido");
                    }
                    
                    break;
                case 6:
                    if (dia >= 1 && dia <= 30) { //verifica se os dias estão no intervalo correto do mês de Junho
                        System.out.println("Junho");

                    } else {
                        System.out.println("Dia inválido");
                    }
                    
                    break;
                case 7:
                    if (dia >= 1 && dia <= 31) { //verifica se os dias estão no intervalo correto do mês de Julho
                        System.out.println("Julho");

                    } else {
                        System.out.println("Dia inválido");
                    }
                    
                    break;
                case 8:
                    if (dia >= 1 && dia <= 31) { //verifica se os dias estão no intervalo correto do mês de Agosto
                        System.out.println("Agosto");

                    } else {
                        System.out.println("Dia inválido");
                    }
                    break;
                case 9:
                    if (dia >= 1 && dia <= 30) { //verifica se os dias estão no intervalo correto do mês de Setembro
                        System.out.println("Setembro");

                    } else {
                        System.out.println("Dia inválido");
                    }
                    
                    break;
                case 10:
                    if (dia >= 1 && dia <= 31) { //verifica se os dias estão no intervalo correto do mês de Outubro
                        System.out.println("Outubro");

                    } else {
                        System.out.println("Dia inválido");
                    }
                    
                    break;
                case 11:
                    if (dia >= 1 && dia <= 30) { //verifica se os dias estão no intervalo correto do mês de Novembro
                        System.out.println("Novembro");

                    } else {
                        System.out.println("Dia inválido");
                    }
                    
                    break;
                case 12:
                    if (dia >= 1 && dia <= 31) { //verifica se os dias estão no intervalo correto do mês de Dezembro
                        System.out.println("Dezembro");

                    } else {
                        System.out.println("Dia inválido");
                    }
                    
                    break;            
            
                default:
                    System.out.println("Mês inválido");

                    break;
            }
            
        }
        ler.close();

    }

   
}