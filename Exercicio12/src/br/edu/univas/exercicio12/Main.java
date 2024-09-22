package br.edu.univas.exercicio12;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Exemplo");

        banco.cadastrarCliente("Maria Silva", "12345678900");
        banco.cadastrarCliente("João Pereira", "09876543211");

        banco.abrirConta("12345678900");
        banco.abrirConta("09876543211");

        banco.depositar(1001, 500);
        banco.sacar(1001, 100);
        banco.transferir(1001, 1002, 200);
    }
    }
}
