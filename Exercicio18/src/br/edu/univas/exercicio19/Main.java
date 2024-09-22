package br.edu.univas.exercicio19;

public class Main {
    Biblioteca biblioteca = new Biblioteca();

    // Cadastrar alguns livros
        biblioteca.cadastrarLivro("O Senhor dos Anéis", "J.R.R. Tolkien");
        biblioteca.cadastrarLivro("1984", "George Orwell");
        biblioteca.cadastrarLivro("Dom Quixote", "Miguel de Cervantes");

    // Listar livros cadastrados
        biblioteca.listarLivros();

    // Verificar disponibilidade de um livro
        biblioteca.verificarDisponibilidade("1984");

    // Emprestar um livro
        biblioteca.emprestarLivro("1984");

    // Verificar disponibilidade novamente
        biblioteca.verificarDisponibilidade("1984");

    // Tentar emprestar um livro já emprestado
        biblioteca.emprestarLivro("1984");

    // Devolver um livro
        biblioteca.devolverLivro("1984");

    // Verificar disponibilidade novamente após a devolução
        biblioteca.verificarDisponibilidade("1984");

    // Listar livros após empréstimos e devoluções
        biblioteca.listarLivros();
}
