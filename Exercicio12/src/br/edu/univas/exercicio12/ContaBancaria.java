package br.edu.univas.exercicio12;

import java.util.ArrayList;
import java.util.HashMap;

public class ContaBancaria {
    private static int contadorDeContas = 1000;
    private int numeroDaConta;
    private Banco.Cliente cliente;
    private double saldo;

    public ContaBancaria(Banco.Cliente cliente) {
        this.numeroDaConta = ++contadorDeContas;
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public ContaBancaria(Cliente cliente) {
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public Banco.Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saque não realizado. Saldo insuficiente ou valor inválido.");
        }
    }

    public void transferir(Banco.ContaBancaria contaDestino, double valor) {
        if (valor > 0 && valor <= saldo) {
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transferência de R$ " + valor + " realizada para a conta " + contaDestino.getNumeroDaConta());
        } else {
            System.out.println("Transferência não realizada. Saldo insuficiente ou valor inválido.");
        }
    }
}
