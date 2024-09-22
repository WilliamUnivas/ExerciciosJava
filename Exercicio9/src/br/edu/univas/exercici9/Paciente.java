package br.edu.univas.exercici9;

import java.util.ArrayList;

public class Paciente {

    private String nome;
    private int idade;
    private ArrayList<String> historicoDeConsultas;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setHistoricoDeConsultas(ArrayList<String> historicoDeConsultas) {
        this.historicoDeConsultas = historicoDeConsultas;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public ArrayList<String> getHistoricoDeConsultas() {
        return historicoDeConsultas;
    }

    public Paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.historicoDeConsultas = new ArrayList<>();
    }

    public void adicionarConsulta(String Consulta) {
        historicoDeConsultas.add(Consulta);
    }

    public void exibirConsultas() {
        if(historicoDeConsultas.isEmpty()) {
            System.out.println("O paciente não possui nenhuma consulta.");
        }
        else {
            System.out.println("Consultas:");
            for(String consulta : historicoDeConsultas) {
                System.out.println("- " + consulta);
            }
        }
    }

}
