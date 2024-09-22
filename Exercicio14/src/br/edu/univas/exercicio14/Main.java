package br.edu.univas.exercicio14;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.adicionarContato("Maria Silva", "1234-5678");
        agenda.adicionarContato("João Pereira", "9876-5432");

        agenda.exibirContatos();

        agenda.editarContato("Maria Silva", "Maria Souza", "4321-8765");

        agenda.exibirContatos();

        Contato contato = agenda.buscarContatoPorTelefone("9876-5432");
        if (contato != null) {
            System.out.println("Contato encontrado: " + contato);
        } else {
            System.out.println("Contato não encontrado.");
        }

        agenda.removerContato("João Pereira");

        agenda.exibirContatos();
    }
}
