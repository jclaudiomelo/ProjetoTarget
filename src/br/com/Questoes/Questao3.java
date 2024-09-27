package br.com.Questoes;

public class Questao3 {
    public static void soma(){
        int INDICE = 12, SOMA = 0, K = 1;
        while (K < INDICE){
            K = K + 1;
            SOMA = SOMA + K;
        }
        System.out.println("----------------------------------------------------------");
        System.out.println("int INDICE = 12, SOMA = 0, K = 1; \n" +
                "enquanto K < INDICE faça { \n" +
                "    K = K + 1; \n" +
                "    SOMA = SOMA + K; \n" +
                "} \n" +
                "imprimir(SOMA);");
        System.out.println("O valor da Soma é " + SOMA);
    }
}
