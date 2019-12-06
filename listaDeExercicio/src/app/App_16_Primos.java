package app;

import java.util.Scanner;

/**
 * App_16_Primos
 * Exiba todos os números pares de 10 a 200.
 * a)Exiba os números primos
 * b) Exiba os pares
 */
public class App_16_Primos {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escolha a opção desejada."
                        +"\n1 - Para Números Primos"
                        +"\n2 - Para Números Pares");
        byte op = ler.nextByte();
        
        switch (op) {
            case 1:
                primo();    
                break;
            
            case 2:
                par();    
                break;
        
            default:
                break;
        }
        ler.close();



    }
    
    private static void par() {
        for (int i = 20; i <= 200; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    private static void primo() {
        short aux = 0;
        for (int i = 20; i < 200; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    aux++;
            }
            if (aux == 2) {
                System.out.println("O número "+ i + " é primo");
            }
            aux = 0;
        }
    }
}