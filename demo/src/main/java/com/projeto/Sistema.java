package com.projeto;

import java.util.ArrayList;

public class Sistema {

    private ArrayList<Pessoa> pessoas = new ArrayList<>();

    public void cadastrarPessoa(Pessoa p) {
        pessoas.add(p);
        System.out.println("Pessoa cadastrada com sucesso!\n");
    }

    public void listarPessoas() {
        if (pessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa cadastrada.\n");
            return;
        }

        System.out.println("=== Lista de Pessoas ===");
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }
        System.out.println();
    }

    public void buscarPorNome(String nome) {
        boolean encontrado = false;

        for (Pessoa p : pessoas) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Encontrado: " + p);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Nenhuma pessoa com esse nome encontrada.\n");
        }
    }
}
