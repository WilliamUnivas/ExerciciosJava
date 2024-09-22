package br.edu.univas.exercicio13;

import java.util.HashMap;

public class CarrinhoDeCompras {
    private HashMap<Produto, Integer> itens; // Produto e quantidade

    public CarrinhoDeCompras() {
        itens = new HashMap<>();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        if (produto.getQuantidade() >= quantidade) {
            itens.put(produto, quantidade);
            produto.setQuantidade(produto.getQuantidade() - quantidade);
            System.out.println(quantidade + " unidades de " + produto.getNome() + " adicionadas ao carrinho.");
        } else {
            System.out.println("Quantidade insuficiente em estoque.");
        }
    }

    public void exibirCarrinho() {
        System.out.println("Itens no carrinho:");
        for (Produto produto : itens.keySet()) {
            System.out.println(produto.getNome() + " - " + itens.get(produto) + " unidades - R$ " + produto.getPreco());
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : itens.keySet()) {
            total += produto.getPreco() * itens.get(produto);
        }
        return total;
    }

    public double aplicarDesconto(double percentual) {
        double total = calcularTotal();
        double desconto = total * (percentual / 100);
        return total - desconto;
    }
}
