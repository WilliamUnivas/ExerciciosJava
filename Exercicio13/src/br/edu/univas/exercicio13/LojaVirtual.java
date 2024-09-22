package br.edu.univas.exercicio13;

import java.util.ArrayList;

public class LojaVirtual {
    private ArrayList<Produto> produtosDisponiveis;
    private CarrinhoDeCompras carrinho;

    public LojaVirtual() {
        produtosDisponiveis = new ArrayList<>();
        carrinho = new CarrinhoDeCompras();
    }

    public void cadastrarProduto(String nome, double preco, int quantidade) {
        Produto produto = new Produto(nome, preco, quantidade);
        produtosDisponiveis.add(produto);
        System.out.println("Produto " + nome + " cadastrado com sucesso.");
    }

    public void exibirProdutos() {
        System.out.println("Produtos disponíveis:");
        for (Produto produto : produtosDisponiveis) {
            System.out.println(produto.getNome() + " - R$ " + produto.getPreco() + " - Estoque: " + produto.getQuantidade());
        }
    }

    public void adicionarAoCarrinho(String nomeProduto, int quantidade) {
        Produto produtoEncontrado = null;
        for (Produto produto : produtosDisponiveis) {
            if (produto.getNome().equalsIgnoreCase(nomeProduto)) {
                produtoEncontrado = produto;
                break;
            }
        }

        if (produtoEncontrado != null) {
            carrinho.adicionarProduto(produtoEncontrado, quantidade);
        } else {
            System.out.println("Produto " + nomeProduto + " não encontrado.");
        }
    }

    public void finalizarCompra(double descontoPercentual) {
        carrinho.exibirCarrinho();
        double totalComDesconto = carrinho.aplicarDesconto(descontoPercentual);
        System.out.println("Total com " + descontoPercentual + "% de desconto: R$ " + totalComDesconto);
    }
}
