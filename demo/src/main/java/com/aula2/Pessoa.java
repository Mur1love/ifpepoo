package com.aula2;

//Classe que segue boas práticas de programação orientada a objetos

public class Pessoa {

    // Atributos privados (encapsulamento)
    private String nome;
    private String cpf;
    private int idade;

    // Construtor completo
    public Pessoa(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    // Construtor sobrecarregado com idade padrão (0)
    public Pessoa(String nome, String cpf) {
        this(nome, cpf, 0);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
    }

    // ======== MÉTODOS DE MANIPULAÇÃO DE STRINGS ========

    public boolean compararNome(String outroNome) {
        return this.nome.equals(outroNome);
    }

    public String nomeEmMaiusculas() {
        return this.nome.toUpperCase();
    }

    public boolean nomeContem(String termo) {
        return this.nome.contains(termo);
    }
}

