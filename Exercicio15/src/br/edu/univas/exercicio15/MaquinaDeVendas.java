package br.edu.univas.exercicio15;

import java.util.ArrayList;

public class MaquinaDeVendas {
    private ArrayList<Produto> produtos;
    private double saldo;

    public MaquinaDeVendas() {
        produtos = new ArrayList<>();
        saldo = 0.0;
    }

    public void cadastrarProduto(String nome, double preco, int quantidade) {
        Produto produto = new Produto(nome, preco, quantidade);
        produtos.add(produto);
        System.out.println("Produto " + nome + " cadastrado com sucesso.");
    }

    public void exibirProdutos() {
        System.out.println("Produtos disponíveis:");
        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);
            System.out.println(i + 1 + ". " + produto);
        }
    }

    public Produto selecionarProduto(int codigoProduto) {
        if (codigoProduto > 0 && codigoProduto <= produtos.size()) {
            Produto produto = produtos.get(codigoProduto - 1);
            if (produto.getQuantidade() > 0) {
                return produto;
            } else {
                System.out.println("Produto esgotado.");
            }
        } else {
            System.out.println("Código de produto inválido.");
        }
        return null;
    }

    public void inserirDinheiro(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Você inseriu R$ " + valor + ". Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public void comprarProduto(Produto produto) {
        if (produto != null) {
            if (saldo >= produto.getPreco()) {
                saldo -= produto.getPreco();
                produto.setQuantidade(produto.getQuantidade() - 1);
                System.out.println("Compra realizada com sucesso! Produto: " + produto.getNome());
                retornarTroco();
            } else {
                System.out.println("Saldo insuficiente. Faltam R$ " + (produto.getPreco() - saldo));
            }
        }
    }

    public void retornarTroco() {
        if (saldo > 0) {
            System.out.println("Seu troco é R$ " + saldo);
            saldo = 0.0;
        } else {
            System.out.println("Sem troco a devolver.");
        }
    }
}
