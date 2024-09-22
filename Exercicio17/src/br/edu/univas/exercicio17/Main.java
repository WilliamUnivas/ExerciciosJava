package br.edu.univas.exercicio17;

public class Main {
    public static void main(String[] args) {
        RedeSocial rede = new RedeSocial();

        rede.adicionarUsuario("Alice");
        rede.adicionarUsuario("Bob");
        rede.adicionarUsuario("Charlie");

        Usuario alice = rede.buscarUsuario("Alice");
        Usuario bob = rede.buscarUsuario("Bob");

        if (alice != null && bob != null) {
            alice.adicionarAmigo(bob);
        }

        if (alice != null) {
            alice.publicarPost("Olá, este é meu primeiro post!");
        }

        if (bob != null && alice != null) {
            bob.comentarPost("Olá, este é meu primeiro post!", "Legal! Bem-vinda à rede!");
        }

        if (alice != null) {
            alice.mostrarPosts();
        }

        rede.mostrarUsuarios();
    }
}
