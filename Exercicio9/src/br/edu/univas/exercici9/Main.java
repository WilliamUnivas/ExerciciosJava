package br.edu.univas.exercici9;

public class Main {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("José", 23);
        paciente.exibirConsultas();
        paciente.adicionarConsulta("Consulta de dermatologista");
        paciente.adicionarConsulta("Exame de Sangue");
        paciente.exibirConsultas();
    }
}
