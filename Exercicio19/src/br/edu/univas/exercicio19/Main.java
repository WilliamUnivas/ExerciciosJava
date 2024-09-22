package br.edu.univas.exercicio19;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Calendario calendario = new Calendario();

        calendario.exibirCalendario(9, 2024);

        LocalDate data1 = LocalDate.of(2024, 1, 1);
        calendario.isFeriado(data1);

        LocalDate data2 = LocalDate.of(2024, 10, 12);
        calendario.isFeriado(data2);

        LocalDate data3 = LocalDate.of(2024, 9, 7);
        LocalDate data4 = LocalDate.of(2024, 11, 15);
        calendario.calcularDiferencaDias(data3, data4);
    }
}
