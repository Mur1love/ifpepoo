package com.aula7;

public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String apresentar() {
        return "Olá, eu sou " + getNome() + ", tenho " + getIdade()
                + " anos e minha matrícula é " + matricula + ".";
    }
}
