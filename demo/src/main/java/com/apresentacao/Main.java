package com.apresentacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite sua cidade:");
        String cidade = sc.nextLine();

        System.out.println("Digite seu curso:");
        String curso = sc.nextLine();

        System.out.println("Qual pilar do PIBID você mais gostou?");
        String pilar = sc.nextLine();

        System.out.println("\n--- Apresentação ---");
        System.out.println("Meu nome é " + nome + ", tenho " + idade + " anos.");
        System.out.println("Sou da cidade de " + cidade + ".");
        System.out.println("Faço o curso de " + curso + ".");
        System.out.println("O pilar que mais me interessou foi: " + pilar + ".");
    }
}
