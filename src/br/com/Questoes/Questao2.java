package br.com.Questoes;

import java.util.Scanner;

public class Questao2 {
    public static void VerificaLetraA(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma Palavra ");

        String palavra = scanner.nextLine();
        int contador = contarLetraA(palavra);

        if (contador > 0){
            System.out.println("A Letra (a A) aparece " + contador + "vezes na palavra: " + "( " + palavra + ")");
        }else{
            System.out.println("Não foi encontrado a letra (a A) na palavra digitada ");
        }

    }
    public static int contarLetraA(String string){
        int count = 0;
        for (char c : string.toCharArray()){
            if(c == 'a' || c == 'A'){
                count++;
            }
        }return count;
    }

}
