package br.edu.univas.exercicio12;

import java.util.ArrayList;
import java.util.HashMap;

public class Banco {
        private String nomeBanco;
        private ArrayList<Cliente> clientes;
        private HashMap<Integer, ContaBancaria> contas;

        public Banco(String nomeBanco) {
            this.nomeBanco = nomeBanco;
            this.clientes = new ArrayList<>();
            this.contas = new HashMap<>();
        }

        public void cadastrarCliente(String nome, String cpf) {
            Cliente cliente = new Cliente(nome, cpf);
            clientes.add(cliente);
            System.out.println("Cliente " + nome + " cadastrado com sucesso.");
        }

        public void abrirConta(String cpf) {
            Cliente cliente = buscarClientePorCpf(cpf);
            if (cliente != null) {
                ContaBancaria conta = new ContaBancaria(cliente);
                contas.put(conta.getNumeroDaConta(), conta);
                System.out.println("Conta " + conta.getNumeroDaConta() + " aberta com sucesso para o cliente " + cliente.getNome());
            } else {
                System.out.println("Cliente com CPF " + cpf + " não encontrado.");
            }
        }

        private Cliente buscarClientePorCpf(String cpf) {
            for (Cliente cliente : clientes) {
                if (cliente.getCpf().equals(cpf)) {
                    return cliente;
                }
            }
            return null;
        }

        public void sacar(int numeroDaConta, double valor) {
            ContaBancaria conta = contas.get(numeroDaConta);
            if (conta != null) {
                conta.sacar(valor);
            } else {
                System.out.println("Conta " + numeroDaConta + " não encontrada.");
            }
        }

        public void depositar(int numeroDaConta, double valor) {
            ContaBancaria conta = contas.get(numeroDaConta);
            if (conta != null) {
                conta.depositar(valor);
            } else {
                System.out.println("Conta " + numeroDaConta + " não encontrada.");
            }
        }

        public void transferir(int contaOrigem, int contaDestino, double valor) {
            ContaBancaria origem = contas.get(contaOrigem);
            Banco.ContaBancaria destino = contas.get(contaDestino);
            if (origem != null && destino != null) {
                origem.transferir(destino, valor);
            } else {
                System.out.println("Conta de origem ou destino não encontrada.");
            }
        }

    public class ContaBancaria {
        public void transferir(ContaBancaria destino, double valor) {

        }
    }
}

