package br.com.Questoes;


import java.util.Scanner;

public class Questao1 {

    public static boolean isFibonacci(int n) {
        int a = 5 * n * n + 4;
        int b = 5 * n * n - 4;
        return isPerfectSquare(a) || isPerfectSquare(b);
    }

    public static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return (sqrt * sqrt == num);
    }

    public static void CalculoFibanacci() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int number = scanner.nextInt();

        if (isFibonacci(number)) {
            System.out.println("_____________________________________________________________");
            System.out.println("O número " + number + " pertence à sequência de Fibonacci.");

        } else {
            System.out.println("_____________________________________________________________");
            System.out.println("O número " + number + " não pertence à sequência de Fibonacci.");
        }


//        scanner.close();
    }
}