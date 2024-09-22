package br.univas.edu.exercicio10;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Senhoor dos Aneis", "Não sei", 1000);
        livro.verificarDisponibilidade();
        livro.emprestar();
        livro.verificarDisponibilidade();
        livro.devolver();
        livro.verificarDisponibilidade();
    }
}
