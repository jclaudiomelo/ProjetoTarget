package br.com.Questoes;

public class Questao3 {
    public static void Soma(){
        int INDICE = 12, SOMA = 0, K = 1;
        while (K < INDICE){
            K = K + 1;
            SOMA = SOMA + K;
        }
        System.out.println("O valor da Soma é " + SOMA);
    }
}
