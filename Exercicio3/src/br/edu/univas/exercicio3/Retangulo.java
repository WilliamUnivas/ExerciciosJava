package br.edu.univas.exercicio3;

public class Retangulo {
    private int largura;
    private int altura;

    public Retangulo(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public int getAltura() {
        return altura;
    }

    public void calcularArea() {
        double area = largura * altura;
        System.out.println("Area: " + area);
    }

    public void calcularPerimetro() {
        double perimetro = largura + altura;
        System.out.println("Perimetro: " + perimetro);
    }
}
