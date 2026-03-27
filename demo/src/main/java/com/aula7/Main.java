package com.aula7;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Ana", 30);
        Aluno aluno = new Aluno("Bruno", 20, "2024A123");

        System.out.println("=== Apresentações ===");
        System.out.println(pessoa.apresentar());
        System.out.println(aluno.apresentar());
    }
}
