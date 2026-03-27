package com.aula7;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String apresentar() {
        return "Olá, eu sou " + nome + " e tenho " + idade + " anos.";
    }
}
