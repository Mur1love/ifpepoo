package com.horas;

import java.util.Scanner;

public class UsoCelular {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double horas;
        double total = 0;
        double media;

        for (int dia = 1; dia <= 5; dia++) {
            System.out.print("Digite a quantidade de horas de uso no dia " + dia + ": ");
            horas = entrada.nextDouble();

            System.out.println("Dia " + dia + ": " + horas + " horas registradas.");

            total = total + horas;
        }

        media = total / 5;

        System.out.println("Total de horas de uso: " + total);
        System.out.println("Média diária de uso: " + media + " horas");

        if (media <= 3) {
            System.out.println("Classificação: Uso controlado");
        } else {
            System.out.println("Classificação: Uso elevado");
        }

        entrada.close();
    }
}