package br.edu.univas.exercicio6;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Sapato", 30, 49.90);
        produto.valorEmEstoque();
        produto.verificarEstoque();
    }
}
