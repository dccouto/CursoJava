package app;

import java.util.Scanner;

/**
 * App_13_DataAniversario
 * 
 * Exercício 14 - Programa para verificar se o dia e mês inserido pelo usuário é válido e mostrar o signo
 */
public class App_14 {
    
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

                    if (dia >= 20){ //Verifica o signo e imprime
                        System.out.println("Aguário");
                    } else{
                        System.out.println("Capricórnio");

                    }

                } else {
                    System.out.println("Dia inválido");
                }
                    
                    break;
                case 2:
                    if (dia >= 1 && dia <= 28) { //verifica se os dias estão no intervalo correto do mês de Fevereiro
                        System.out.println("Fevereiro");

                        if (dia >= 19){//Verifica o signo e imprime
                            System.out.println("Peixes");
                        } else{
                            System.out.println("Aquário");
    
                        }

                    } else {
                        System.out.println("Dia inválido");
                    }
                    break;
                case 3:
                    if (dia >= 1 && dia <= 31) { //verifica se os dias estão no intervalo correto do mês de Março
                        System.out.println("Março");

                        if (dia >= 21){//Verifica o signo e imprime
                            System.out.println("Áries");
                        } else{
                            System.out.println("Peixes");
    
                        }

                    } else {
                        System.out.println("Dia inválido");
                    }
                    
                    
                    break;
                case 4:
                    if (dia >= 1 && dia <= 30) { //verifica se os dias estão no intervalo correto do mês de Abril
                        System.out.println("Abril");

                        if (dia >= 20){//Verifica o signo e imprime
                            System.out.println("Touro");
                        } else{
                            System.out.println("Áries");
    
                        }
                    } else {
                        System.out.println("Dia inválido");
                    }
                    
                    
                    break;
                case 5:
                    if (dia >= 1 && dia <= 31) { //verifica se os dias estão no intervalo correto do mês de Maio
                        System.out.println("Maio");

                        if (dia >= 21){//Verifica o signo e imprime
                            System.out.println("Gêmeos");
                        } else{
                            System.out.println("Touro");
    
                        }

                    } else {
                        System.out.println("Dia inválido");
                    }

                    
                    
                    break;
                case 6:
                    if (dia >= 1 && dia <= 30) { //verifica se os dias estão no intervalo correto do mês de Junho
                        System.out.println("Junho");

                        if (dia >= 21){//Verifica o signo e imprime
                            System.out.println("Câncer");
                        } else{
                            System.out.println("Gêmeos");
    
                        }

                    } else {
                        System.out.println("Dia inválido");
                    }

                    
                    
                    break;
                case 7:
                    if (dia >= 1 && dia <= 31) { //verifica se os dias estão no intervalo correto do mês de Julho
                        System.out.println("Julho");

                        if (dia >= 23){//Verifica o signo e imprime
                            System.out.println("Leão");
                        } else{
                            System.out.println("Câncer");
    
                        }
                    } else {
                        System.out.println("Dia inválido");
                    }

                    
                    
                    break;
                case 8:
                    if (dia >= 1 && dia <= 31) { //verifica se os dias estão no intervalo correto do mês de Agosto
                        System.out.println("Agosto");

                        if (dia >= 23){//Verifica o signo e imprime
                            System.out.println("Virgem");
                        } else{
                            System.out.println("Leão");
    
                        }

                    } else {
                        System.out.println("Dia inválido");
                    }
                    break;
                case 9:
                    if (dia >= 1 && dia <= 30) { //verifica se os dias estão no intervalo correto do mês de Setembro
                        System.out.println("Setembro");

                        if (dia >= 23){//Verifica o signo e imprime
                            System.out.println("Libra");
                        } else{
                            System.out.println("Virgem");
    
                        }

                    } else {
                        System.out.println("Dia inválido");
                    }
                    
                    break;
                case 10:
                    if (dia >= 1 && dia <= 31) { //verifica se os dias estão no intervalo correto do mês de Outubro
                        System.out.println("Outubro");

                        if (dia >= 23){//Verifica o signo e imprime
                            System.out.println("Escorpião");
                        } else{
                            System.out.println("Libra");
    
                        }

                    } else {
                        System.out.println("Dia inválido");
                    }
                    
                    break;
                case 11:
                    if (dia >= 1 && dia <= 30) { //verifica se os dias estão no intervalo correto do mês de Novembro
                        System.out.println("Novembro");

                        if (dia >= 22){//Verifica o signo e imprime
                            System.out.println("Sagitário");
                        } else{
                            System.out.println("Escorpião");
    
                        }

                    } else {
                        System.out.println("Dia inválido");
                    }
                    
                    break;
                case 12:
                    if (dia >= 1 && dia <= 31) { //verifica se os dias estão no intervalo correto do mês de Dezembro
                        System.out.println("Dezembro");

                        if (dia >= 22){//Verifica o signo e imprime
                            System.out.println("Capricórnio");
                        } else{
                            System.out.println("Sagitário");
    
                        }

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