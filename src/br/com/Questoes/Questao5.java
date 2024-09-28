package br.com.Questoes;

public class Questao5 {
    public static void perquntaQuestao5(){
        System.out.println("5. Interruptores e Lâmpadas \n" +
                "Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas diferentes.\n" +
                "Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser.\n" +
                "Seu objetivo é descobrir qual interruptor controla qual lâmpada.\n" +
                "Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?");
    }
    public static void respostaQuestao5(){
        System.out.println("Primeiro, ligue o primeiro interruptor e deixe-o ligado por 10 minutos. Isso fará com que a lâmpada esquente.\n" +
                "Depois de 10 minutos, desligue o primeiro interruptor e ligue o segundo interruptor, mantendo o primeiro desligado e o segundo ligado.\n" +
                "Em seguida, vá até a sala onde estão as lâmpadas. Toque nas lâmpadas que estão apagadas e veja qual está quente, identificando assim a lâmpada do primeiro interruptor.\n" +
                "A lâmpada que está acesa corresponde ao segundo interruptor, e a lâmpada que está apagada e fria corresponde ao terceiro interruptor.\n\n" +
                "Resumo:\n" +
                "Interruptor 1 → Lâmpada quente e apagada.\n" +
                "Interruptor 2 → Lâmpada acesa.\n" +
                "Interruptor 3 → Lâmpada apagada e fria.");
    }
}
