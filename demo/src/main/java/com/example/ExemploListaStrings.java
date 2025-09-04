package com.example;

import java.util.ArrayList;
import java.util.List;

public class ExemploListaStrings {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Beatriz");
        nomes.add("Camila");
        nomes.add("João");

        // Strings que começam com "C" usando for normal
        System.out.println("Nomes que começam com 'C':");
        for (int i = 0; i < nomes.size(); i++) {
            String nome = nomes.get(i);
            if (nome.startsWith("C")) {
                System.out.println(nome);
            }
        }

        // Buscar string específica
        String busca = "João";
        boolean encontrado = false;
        for (int i = 0; i < nomes.size(); i++) {
            if (nomes.get(i).equals(busca)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O nome '" + busca + "' foi encontrado na lista!");
        } else {
            System.out.println("O nome '" + busca + "' não está na lista.");
        }
    }
}
