package com.aula3;

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

    // Método para exibir informações formatadas da pessoa
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
    }

    // ======== MÉTODOS DE MANIPULAÇÃO DE STRINGS ========

    // 1. Compara o nome da pessoa com outro nome usando equals()
    public boolean compararNome(String outroNome) {
        return this.nome.equals(outroNome);
    }

    // 2. Retorna o nome em letras maiúsculas (toUpperCase)
    public String nomeEmMaiusculas() {
        return this.nome.toUpperCase();
    }

    // 3. Verifica se o nome contém um determinado termo (contains)
    public boolean nomeContem(String termo) {
        return this.nome.contains(termo);
    }
}

