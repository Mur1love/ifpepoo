package com.aula4;

public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }

    // Sobrescreve emitirSom() — uso do @Override
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " late: Au au!");
    }

    // Sobrescreve mover() — uso do @Override
    @Override
    public void mover() {
        System.out.println(getNome() + " corre alegremente.");
    }

    // Sobrecarga local: mesma assinatura emitirSom mas com parâmetro — NÃO é override
    public void emitirSom(String humor) {
        System.out.println(
            getNome() + " late de forma '" + humor + "': Au au!"
        );
    }

    // Sobrecarregando mover com outro tipo (por exemplo velocidade)
    public void mover(double velocidade) {
        System.out.println(
            getNome() + " se move a " + velocidade + " m/s (mover(double))."
        );
    }
}
