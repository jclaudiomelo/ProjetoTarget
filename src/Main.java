import br.com.Questoes.Questao1;
import br.com.Questoes.Questao2;
import br.com.Questoes.Questao3;
import br.com.Questoes.Questao4;
import br.com.Questoes.Questao5;

import java.util.InputMismatchException;
import java.util.Scanner;

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
                    System.out.println("1 Sequência de Fibonacci");
                    System.out.println("2 Verifica se Contem a letra A na palavra");
                    System.out.println("3 Qual será o valor da variável SOMA");
                    System.out.println("4 Descubra a lógica e complete o próximo elemento");
                    System.out.println("5 Desafio da sala com três interruptores");
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
                        Questao1.calculoFibanacci();
                        enter(scanner);
                        break;
                    case 2:
                        Questao2.verificaLetraA();
                        enter(scanner);
                        System.out.println("_____________________________________________________________");
                        break;
                    case 3:
                        Questao3.soma();
                        enter(scanner);
                        System.out.println("____________________________________________________________");
                        break;
                    case 4:
                        Questao4.sequencia();
                        enter(scanner);
                        System.out.println("____________________________________________________________");
                        break;
                    case 5:
                        Questao5.perquntaQuestao5();
                        enter(scanner);
                        Questao5.respostaQuestao5();
                        enter(scanner);
                        System.out.println("____________________________________________________________");
                        break;
                    case 0:
                        System.out.println("____________________________________________________________");
                        System.out.println("Obrigado, Esse teste foi um aprendizado enorme, estou muito orgulhoso do resultado, espero que gostem \n " +
                                "Aguardo um retorno de voces da Target Sistemas");
                        System.out.println("____________________________________________________________");
                        System.out.println("Saindo...");

                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite um número válido.");
                scanner.nextLine();
            }
        } while (option != 0);

        scanner.close();
    }

     public static void enter(Scanner scanner) {
        System.out.println("----------------------------------------------------------");
        System.out.println("Pressione Enter para continuar...");
        scanner.nextLine();
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

}
