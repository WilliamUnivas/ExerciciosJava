package br.edu.univas.exercicio17;

import java.util.ArrayList;
import java.util.List;

public class RedeSocial {
    private List<Usuario> usuarios;

    public RedeSocial() {
        usuarios = new ArrayList<>();
    }

    public void adicionarUsuario(String nome) {
        Usuario usuario = new Usuario(nome);
        usuarios.add(usuario);
        System.out.println("Usuário " + nome + " cadastrado na rede social.");
    }

    public Usuario buscarUsuario(String nome) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equalsIgnoreCase(nome)) {
                return usuario;
            }
        }
        System.out.println("Usuário " + nome + " não encontrado.");
        return null;
    }

    public void mostrarUsuarios() {
        System.out.println("Usuários cadastrados na rede social:");
        for (Usuario usuario : usuarios) {
            System.out.println("- " + usuario.getNome());
        }
    }
}
