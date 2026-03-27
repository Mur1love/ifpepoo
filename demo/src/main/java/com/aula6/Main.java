package com.aula6;

public class Main {
    public static void main(String[] args) {
        CadastroAnimal cadastro = new CadastroAnimal();

        Animal dog = new Animal("Rex", "Cachorro", 3);
        Animal cat = new Animal("Miau", "Gato", 2);
        Animal bird = new Animal("Piu", "Pássaro", 1);

        cadastro.cadastrar(dog);
        cadastro.cadastrar(cat);
        cadastro.cadastrar(bird);

        System.out.println("=== Cadastro de Animais ===\n");
        cadastro.listarAnimais();

        System.out.println("\nTotal de animais: " + cadastro.getTotalAnimais());
    }
}