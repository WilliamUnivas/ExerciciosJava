package br.edu.univas.exercicio5;

public class Funcionario {
    private String nome;
    private String cargo;
    private int salario;

    public Funcionario(String nome, String cargo, int salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public int getSalario() {
        return salario;
    }

    public void calcularSalario() {
        float salarioLiquido = (float) (salario * 0.8);
        System.out.println(salarioLiquido);
    }
}
