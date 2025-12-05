package com.aula4;

public abstract class Animal {

    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void emitirSom() {
        System.out.println(nome + " emite um som genérico (Animal).");
    }

    public void mover() {
        System.out.println(nome + " se move de forma genérica (Animal).");
    }

    public String getNome() {
        return nome;
    }
}
