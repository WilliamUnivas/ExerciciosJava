package br.edu.univas.exercicio19;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void cadastrarLivro(String titulo, String autor) {
        Livro livro = new Livro(titulo, autor);
        livros.add(livro);
        System.out.println("Livro '" + titulo + "' cadastrado com sucesso.");
    }

    public void emprestarLivro(String titulo) {
        Livro livro = buscarLivro(titulo);
        if (livro != null) {
            if (!livro.isEmprestado()) {
                livro.emprestar();
                System.out.println("Livro '" + titulo + "' emprestado com sucesso.");
            } else {
                System.out.println("O livro '" + titulo + "' já está emprestado.");
            }
        } else {
            System.out.println("Livro '" + titulo + "' não encontrado.");
        }
    }

    public void devolverLivro(String titulo) {
        Livro livro = buscarLivro(titulo);
        if (livro != null) {
            if (livro.isEmprestado()) {
                livro.devolver();
                System.out.println("Livro '" + titulo + "' devolvido com sucesso.");
            } else {
                System.out.println("O livro '" + titulo + "' não está emprestado.");
            }
        } else {
            System.out.println("Livro '" + titulo + "' não encontrado.");
        }
    }

    public void verificarDisponibilidade(String titulo) {
        Livro livro = buscarLivro(titulo);
        if (livro != null) {
            if (livro.isEmprestado()) {
                System.out.println("O livro '" + titulo + "' está emprestado.");
            } else {
                System.out.println("O livro '" + titulo + "' está disponível.");
            }
        } else {
            System.out.println("Livro '" + titulo + "' não encontrado.");
        }
    }

    private Livro buscarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            System.out.println("Livros cadastrados na biblioteca:");
            for (Livro livro : livros) {
                System.out.println("- " + livro.getTitulo() + " por " + livro.getAutor() +
                        (livro.isEmprestado() ? " (Emprestado)" : " (Disponível)"));
            }
        }
}
