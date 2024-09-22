package br.edu.univas.exercicio7;

public class Main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(3, 4, 5);

        if (triangulo.ehValido()) {
            System.out.printf("Área do triângulo: %.2f%n", triangulo.calcularArea());
        } else {
            System.out.println("Os lados fornecidos não formam um triângulo válido.");
        }
    }
}
