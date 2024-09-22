package br.edu.univas.exercicio15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MaquinaDeVendas maquina = new MaquinaDeVendas();
        Scanner scanner = new Scanner(System.in);

        maquina.cadastrarProduto("Refrigerante", 5.00, 10);
        maquina.cadastrarProduto("Chips", 3.50, 5);
        maquina.cadastrarProduto("Chocolate", 4.00, 8);

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n1. Exibir produtos");
            System.out.println("2. Selecionar produto");
            System.out.println("3. Inserir dinheiro");
            System.out.println("4. Comprar produto");
            System.out.println("5. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    maquina.exibirProdutos();
                    break;

                case 2:
                    System.out.print("Digite o código do produto que deseja comprar: ");
                    int codigoProduto = scanner.nextInt();
                    Produto produtoSelecionado = maquina.selecionarProduto(codigoProduto);
                    break;

                case 3:
                    System.out.print("Digite o valor a ser inserido: ");
                    double valor = scanner.nextDouble();
                    maquina.inserirDinheiro(valor);
                    break;

                case 4:
                    System.out.print("Digite o código do produto que deseja comprar: ");
                    codigoProduto = scanner.nextInt();
                    Produto produto = maquina.selecionarProduto(codigoProduto);
                    maquina.comprarProduto(produto);
                    break;

                case 5:
                    continuar = false;
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }
}

