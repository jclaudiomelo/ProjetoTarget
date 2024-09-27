package br.com.Questoes;

public class Questao4 {

    public static void sequencia() {

        int[] sequenciaA = {1, 3, 5, 7};
        System.out.println("a) 1, 3, 5, 7," + " ( " + proximoElementoA(sequenciaA) + " ) " + " Essa sequência representa números ímpares consecutivos. O próximo número ímpar após 7 é 9.");

        int[] sequenciaB = {2, 4, 8, 16, 32, 64};
        System.out.println("b) 2, 4, 8, 16, 32, 64," + " ( " + proximoElementoB(sequenciaB) + " ) " +  " Cada número é o dobro do anterior, ou seja, é uma sequência de potências de 2. ");

        int[] sequenciaC = {0, 1, 4, 9, 16, 25, 36};
        System.out.println("c) 0, 1, 4, 9, 16, 25, 36," + " ( " + proximoElementoC(sequenciaC) + " ) " + " Essa sequência representa os quadrados perfeitos dos números naturais:");

        int[] sequenciaD = {4, 16, 36, 64};
        System.out.println("d) 4, 16, 36, 64, " + " ( " + proximoElementoD(sequenciaD) + " ) " + " Essa sequência é formada pelos quadrados dos números pares:");

        int[] sequenciaE = {1, 1, 2, 3, 5, 8};
        System.out.println("e) 1, 1, 2, 3, 5, 8," + " ( " + proximoElementoE(sequenciaE) + " ) " +  " Essa sequência é formada pelos quadrados dos números pares:");

        int[] sequenciaF = {2, 10, 12, 16, 17, 18, 19};
        System.out.println("f) 2, 10, 12, 16, 17, 18, 19" + " ( " + proximoElementoF(sequenciaF) + " ) " + " Essa é a sequência de Fibonacci, em que cada termo é a soma dos dois anteriores.");
    }

    public static int proximoElementoA(int[] sequencia) {
        return sequencia[sequencia.length - 1] + 2;
    }

    public static int proximoElementoB(int[] sequencia) {
        return sequencia[sequencia.length - 1] * 2;
    }

    public static int proximoElementoC(int[] sequencia) {
        int tamanho = sequencia.length;
        return tamanho * tamanho;
    }

    public static int proximoElementoD(int[] sequencia) {
        int tamanho = (sequencia.length + 1) * 2;
        return tamanho * tamanho;
    }

    public static int proximoElementoE(int[] sequencia) {
        int tamanho = sequencia.length;
        return sequencia[tamanho - 1] + sequencia[tamanho - 2];
    }

    public static int proximoElementoF(int[] sequencia) {
        return 200;
    }
}
