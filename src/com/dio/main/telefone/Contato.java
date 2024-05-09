package com.dio.main.telefone;

import com.dio.main.internet.Email;

public class Contato {
    public Contato(String nome, String sobrenome, Telefone telefone, Email email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.email = email;
    }

    public Contato(String nome, String sobrenome, Telefone telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
    }

    private String nome;
    private String sobrenome;
    private Telefone telefone;
    private Email email;

    public void criarContato() {
        System.out.println("Contato criado.");
    }
}
