package com.aula4;

public class Main {

    public static void main(String[] args) {

        // Criando os objetos
        Animal gato = new Gato("Dora");
        Gato gato2 = new Gato("Mimi");

        System.out.println("=== Teste de Sobrescrita ===");
        gato.emitirSom();
        gato.mover(); 

        System.out.println("=== Teste de Sobrecarga ===");

        gato2.emitirSom("bravo");
        gato2.mover(3.5);

    }
}
