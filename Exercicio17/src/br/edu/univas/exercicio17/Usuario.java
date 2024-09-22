package br.edu.univas.exercicio17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Usuario {
    private String nome;
    private List<Usuario> amigos;
    private List<String> posts;
    private Map<String, List<String>> comentarios;

    public Usuario(String nome) {
        this.nome = nome;
        this.amigos = new ArrayList<>();
        this.posts = new ArrayList<>();
        this.comentarios = new HashMap<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Usuario> getAmigos() {
        return amigos;
    }

    public void adicionarAmigo(Usuario amigo) {
        if (!amigos.contains(amigo)) {
            amigos.add(amigo);
            amigo.getAmigos().add(this);
            System.out.println(nome + " adicionou " + amigo.getNome() + " como amigo.");
        } else {
            System.out.println(amigo.getNome() + " já é amigo de " + nome);
        }
    }

    public void publicarPost(String mensagem) {
        posts.add(mensagem);
        comentarios.put(mensagem, new ArrayList<>());
        System.out.println(nome + " publicou: " + mensagem);
    }

    public void comentarPost(String post, String comentario) {
        if (comentarios.containsKey(post)) {
            comentarios.get(post).add(comentario);
            System.out.println(nome + " comentou: " + comentario + " no post: " + post);
        } else {
            System.out.println("Post não encontrado.");
        }
    }

    public void mostrarPosts() {
        System.out.println("Posts de " + nome + ":");
        for (String post : posts) {
            System.out.println(post);
            List<String> listaComentarios = comentarios.get(post);
            if (listaComentarios != null && !listaComentarios.isEmpty()) {
                System.out.println("  Comentários:");
                for (String comentario : listaComentarios) {
                    System.out.println("  - " + comentario);
                }
            } else {
                System.out.println("  Sem comentários.");
            }
        }
    }
}
