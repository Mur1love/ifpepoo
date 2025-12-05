package com.aula4;

public class Gato extends Animal {

    public Gato(String nome) {
        super(nome);
    }

    // Sobrescreve emitirSom() — uso do @Override
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " mia: Miau miau!");
    }
    // Sobrecarga local: mesma assinatura emitirSom mas com parâmetro — NÃO é override
    public void emitirSom(String humor) {
        System.out.println(getNome() + " mia de forma '" + humor + "': Miau miau!");
    }

    // Sobrescreve mover() — uso do @Override
    @Override
    public void mover() {
        System.out.println(getNome() + " anda e caminha.");
    }



    // Sobrecarregando mover com outro tipo (por exemplo altura do pulo)
    public void mover(double alturaDoPulo) {
        System.out.println(getNome() + " pula " + alturaDoPulo + " metros.");
    }
}
