package br.edu.univas.exercicio16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JogoCartas {
    private List<Carta> baralho;
    private List<List<Carta>> maosJogadores;
    private Carta cartaAtual;
    private int jogadorAtual;

    public JogoCartas(int numJogadores) {
        baralho = criarBaralho();
        maosJogadores = new ArrayList<>();

        for (int i = 0; i < numJogadores; i++) {
            maosJogadores.add(new ArrayList<>());
        }

        jogadorAtual = 0;
    }

    private List<Carta> criarBaralho() {
        String[] cores = {"Vermelho", "Verde", "Azul", "Amarelo"};
        String[] valores = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "Pular", "Reverter", "+2"};
        List<Carta> baralho = new ArrayList<>();

        for (String cor : cores) {
            for (String valor : valores) {
                baralho.add(new Carta(cor, valor));
                baralho.add(new Carta(cor, valor));
            }
        }
        return baralho;
    }

    public void embaralharBaralho() {
        Collections.shuffle(baralho);
        System.out.println("Baralho embaralhado.");
    }

    public void distribuirCartas(int numCartasPorJogador) {
        for (int i = 0; i < maosJogadores.size(); i++) {
            for (int j = 0; j < numCartasPorJogador; j++) {
                maosJogadores.get(i).add(baralho.remove(0));
            }
            System.out.println("Cartas distribuídas para o jogador " + (i + 1) + ".");
        }

        cartaAtual = baralho.remove(0);
        System.out.println("Carta inicial: " + cartaAtual);
    }

    public void jogarCarta(int jogador, int indiceCarta) {
        Carta cartaJogada = maosJogadores.get(jogador).get(indiceCarta);

        if (cartaJogada.getCor().equals(cartaAtual.getCor()) || cartaJogada.getValor().equals(cartaAtual.getValor())) {
            cartaAtual = cartaJogada;
            maosJogadores.get(jogador).remove(indiceCarta);
            System.out.println("Jogador " + (jogador + 1) + " jogou: " + cartaJogada);
        } else {
            System.out.println("Jogada inválida. Tente novamente.");
        }
    }

    public void mostrarCartasJogador(int jogador) {
        System.out.println("Cartas do jogador " + (jogador + 1) + ":");
        List<Carta> mao = maosJogadores.get(jogador);
        for (int i = 0; i < mao.size(); i++) {
            System.out.println((i + 1) + ". " + mao.get(i));
        }
    }

    public void proximoJogador() {
        jogadorAtual = (jogadorAtual + 1) % maosJogadores.size();
        System.out.println("Agora é a vez do jogador " + (jogadorAtual + 1));
    }

    public boolean verificarVitoria(int jogador) {
        return maosJogadores.get(jogador).isEmpty();
    }
}
