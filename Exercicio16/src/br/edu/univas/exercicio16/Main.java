package br.edu.univas.exercicio16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de jogadores: ");
        int numJogadores = scanner.nextInt();

        JogoCartas jogo = new JogoCartas(numJogadores);
        jogo.embaralharBaralho();
        jogo.distribuirCartas(7);

        boolean jogoAtivo = true;

        while (jogoAtivo) {
            jogo.mostrarCartasJogador(jogo.jogadorAtual);

            System.out.println("Carta atual: " + jogo.cartaAtual);
            System.out.print("Escolha a carta para jogar (digite o número): ");
            int escolha = scanner.nextInt() - 1;

            jogo.jogarCarta(jogo.jogadorAtual, escolha);

            if (jogo.verificarVitoria(jogo.jogadorAtual)) {
                System.out.println("Jogador " + (jogo.jogadorAtual + 1) + " venceu!");
                jogoAtivo = false;
            } else {
                jogo.proximoJogador();
            }
        }

        scanner.close();
    }
}

