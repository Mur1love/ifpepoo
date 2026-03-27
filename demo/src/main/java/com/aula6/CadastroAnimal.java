package com.aula6;

import java.util.ArrayList;
import java.util.List;

public class CadastroAnimal {
    private List<Animal> animais;

    public CadastroAnimal() {
        this.animais = new ArrayList<>();
    }

    public void cadastrar(Animal animal) {
        animais.add(animal);
    }

    public void listarAnimais() {
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
        } else {
            for (Animal a : animais) {
                System.out.println("-------------------");
                a.exibirInfo();
            }
        }
    }

    public int getTotalAnimais() {
        return animais.size();
    }
}