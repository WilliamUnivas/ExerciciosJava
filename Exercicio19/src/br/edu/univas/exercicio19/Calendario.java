package br.edu.univas.exercicio19;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;

public class Calendario {
    private Map<String, String> feriados;

    public Calendario() {
        feriados = new HashMap<>();
        feriados.put("01-01", "Ano Novo");
        feriados.put("25-12", "Natal");
        feriados.put("07-09", "Independência do Brasil");
        feriados.put("15-11", "Proclamação da República");
    }

    public void exibirCalendario(int mes, int ano) {
        System.out.println("Calendário de " + mes + "/" + ano + ":");
        LocalDate data = LocalDate.of(ano, mes, 1);
        int ultimoDia = data.lengthOfMonth();

        for (int dia = 1; dia <= ultimoDia; dia++) {
            LocalDate dataAtual = LocalDate.of(ano, mes, dia);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            System.out.println(dataAtual.format(formatter));
        }
    }

    public boolean isFeriado(LocalDate data) {
        String chave = String.format("%02d-%02d", data.getDayOfMonth(), data.getMonthValue());
        if (feriados.containsKey(chave)) {
            System.out.println("A data " + data + " é feriado: " + feriados.get(chave));
            return true;
        } else {
            System.out.println("A data " + data + " não é feriado.");
            return false;
        }
    }

    public long calcularDiferencaDias(LocalDate data1, LocalDate data2) {
        long diferenca = ChronoUnit.DAYS.between(data1, data2);
        System.out.println("A diferença entre " + data1 + " e " + data2 + " é de " + Math.abs(diferenca) + " dias.");
        return Math.abs(diferenca);
    }
}
