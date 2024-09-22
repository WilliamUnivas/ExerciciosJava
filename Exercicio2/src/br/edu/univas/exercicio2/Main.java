package br.edu.univas.exercicio2;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(3, "William", 5000);
        conta.depositar(4000);
        conta.sacar(4000);
        conta.sacar(7000);

    }
}
