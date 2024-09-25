import br.com.Questoes.Questao1;
import br.com.Questoes.Questao2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        do {

            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Escolha o numero referente a Questão proposta no Projeto:");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("1 Dado a sequência de Fibonacci");
            System.out.println("2 Escreva um programa que verifique, em uma string");
            System.out.println("3 Qual será o valor da variável SOMA");
            System.out.println("4 Descubra a lógica e complete o próximo elemento");
            System.out.println("5 Você está em uma sala com três interruptores");
            System.out.println("0. Sair");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.print("Digite sua escolha: ");

            // Lê a escolha do usuário
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    Questao1.CalculoFibanacci();
                    break;
                case 2:
                    Questao2.VerificaLetraA();
                    System.out.println("_____________________________________________________________");
                    break;
                case 3:
                    System.out.println("Questao 3");
                    System.out.println("____________________________________________________________");

                    break;
                case 4:
                    System.out.println("Questao 4");
                    System.out.println("____________________________________________________________");
                    break;
                case 5:
                    System.out.println("Questao 5");
                    System.out.println("____________________________________________________________");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    System.out.println("____________________________________________________________");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (option != 0);

        scanner.close();
    }

}
