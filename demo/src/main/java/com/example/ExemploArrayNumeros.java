package com.example;

public class ExemploArrayNumeros {
    public static void main(String[] args) {
        int[] numeros = {5, 12, 7, 3, 25, 8};
        
        // Maior número
        int maior = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (i > maior) {
                maior = i;
            }
        }
        
        // Menor número
        int menor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (i < menor) {
                menor = i;
            }
        }
        
        // Buscar número específico
        int busca = 7;
        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            if (i == busca) {
                encontrado = true;
                break;
            }
        }
        
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

        if (encontrado) {
            System.out.println("Número " + busca + " encontrado!");
        } else {
            System.out.println("Número " + busca + " não encontrado.");
        }

    }
}
