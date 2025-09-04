package com.example;

public class ExemploMatrizNumeros {
    public static void main(String[] args) {
        int[][] matriz = {
            {5, 8, 12},
            {3, 25, 7},
            {9, 14, 2}
        };

        int maior = matriz[0][0];
        int menor = matriz[0][0];
        int busca = 14;
        boolean encontrado = false;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int valor = matriz[i][j];

                if (valor > maior) maior = valor;
                if (valor < menor) menor = valor;
                if (valor == busca) encontrado = true;
            }
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        if (encontrado) {
            System.out.println("Número " + busca + " encontrado!");
        } else {
            System.out.println("Número " + busca + " não encontrado.");
        }
    }
}

