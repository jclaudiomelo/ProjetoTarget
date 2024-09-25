import br.com.Questoes.Questao1;
import br.com.Questoes.Questao2;
import br.com.Questoes.Questao3;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = -1;

        do {
            try {
                do {
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("Escolha o numero referente a Questão proposta no Projeto:");
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("1 Dado a sequência de Fibonacci");
                    System.out.println("2 Escreva um programa que verifique, em uma string");
                    System.out.println("3 Qual será o valor da variável SOMA");
                    System.out.println("4 Descubra a lógica e complete o próximo elemento");
                    System.out.println("5 Você está em uma sala com três interruptores");
                    System.out.println("Digite 0 para Sair");
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.print("Digite sua escolha: ");

                    option = scanner.nextInt();

                    if (option < 0 || option > 5) {
                        System.out.println("Opção inválida. Digite um número entre 0 e 5.");


                    }
                } while (option < 0 || option > 5);



                switch (option) {
                    case 1:
                        Questao1.CalculoFibanacci();
                        Tempo();
                        break;
                    case 2:
                        Questao2.VerificaLetraA();
                        Tempo();
                        System.out.println("_____________________________________________________________");
                        break;
                    case 3:
                        Questao3.Soma();
                        Tempo();
                        System.out.println("____________________________________________________________");
                        break;
                    case 4:
                        System.out.println("Questao 4");
                        Tempo();
                        System.out.println("____________________________________________________________");
                        break;
                    case 5:
                        System.out.println("Questao 5");
                        Tempo();
                        System.out.println("____________________________________________________________");
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        System.out.println("____________________________________________________________");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite um número válido.");
                Tempo();
                scanner.nextLine();
            }
        } while (option != 0);

        scanner.close();
    }

    public static void Tempo() {
        try {
            Thread.sleep(1500); //
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
