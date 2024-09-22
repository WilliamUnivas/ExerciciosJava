package br.univas.edu.exercicio10;

public class Livro {

    private String titulo;
    private String autor;
    private int numeroPaginas;
    private boolean disponivel;

    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
        } else {
            System.out.println("Já está emprestado");
        }
    }

    public void devolver(){
            if(!disponivel){
                disponivel = true;
            }
            else{
                System.out.println("O livro já foi devolvido");
            }
        }

    public void verificarDisponibilidade(){
            if(disponivel){
                System.out.println("Disponivel");
            }
            else{
                System.out.println("Emprestado");
            }
        }
}
