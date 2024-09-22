package br.edu.univas.exercicio2;

public class ContaBancaria {
    private int numeroDaConta;
    private String titular;
    private double saldo;

    public ContaBancaria(int numeroDaConta, String titular, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depositado com sucesso o valor de " + valor + "!!!");
    }

    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        }
        else{
            System.out.println("Saldo insuficiente para sacar!!!");
        }
        System.out.println("Saldo atual: " + this.saldo);
    }
}
