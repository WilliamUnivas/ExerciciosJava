package br.edu.univas.exercicio1;

public class Círculo {
    private float raio;

    public Círculo(float raio) {
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public void calcularArea() {
        double area;
        area = 3.14 * (raio * raio);
        System.out.println("Area: " + area);
    }

    public void calcularPerimetro() {
        double perimetro;
        perimetro = 3.14 * (2 * raio);
        System.out.println("Perimetro: " + perimetro);
    }
}
