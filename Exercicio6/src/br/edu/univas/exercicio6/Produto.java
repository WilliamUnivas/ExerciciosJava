package br.edu.univas.exercicio6;

public class Produto {

    private String nome;
    private int quantidade;
    private double preco;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public void valorEmEstoque() {
        System.out.println("Valor total do estoque: " + quantidade * preco);
    }

    public void verificarEstoque() {
        if (quantidade > 0) {
            System.out.println("Estoque em quantidade: " + quantidade);
        }
        else {
            System.out.println("Sem estoque");
        }
    }

}
