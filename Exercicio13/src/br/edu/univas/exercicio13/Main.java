package br.edu.univas.exercicio13;

public class Main {
    public static void main(String[] args) {
        LojaVirtual loja = new LojaVirtual();

        loja.cadastrarProduto("Notebook", 3000.0, 5);
        loja.cadastrarProduto("Smartphone", 1500.0, 10);
        loja.cadastrarProduto("Teclado", 200.0, 20);

        loja.exibirProdutos();

        loja.adicionarAoCarrinho("Notebook", 1);
        loja.adicionarAoCarrinho("Teclado", 2);

        loja.finalizarCompra(10.0);  // Aplicar 10% de desconto
    }
}
