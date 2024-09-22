package br.edu.univas.exercicio20;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    private int numeroAleatorio;
    private int tentativas;

    public JogoAdivinhacao(int limite) {
        Random random = new Random();
        this.numeroAleatorio = random.nextInt(limite) + 1;
        this.tentativas = 0;
    }

    public void jogar() {
        Scanner scanner = new Scanner(System.in);
        int palpite;
        boolean acertou = false;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e " + numeroAleatorio + ".");

        while (!acertou) {
            System.out.print("Digite o seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
                acertou = true;
            } else if (palpite > numeroAleatorio) {
                System.out.println("O número é menor que " + palpite + ". Tente novamente.");
            } else {
                System.out.println("O número é maior que " + palpite + ". Tente novamente.");
            }
        }
    }
}
