package com.atividade2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idade;
        boolean acompanhado;

        idade = sc.nextInt();
        acompanhado = sc.nextBoolean();

        if (idade >= 16 || acompanhado == true) {
            System.out.println("Permitido");
        } else {
            System.out.println("Bloqueado");
        }

        sc.close();
    }
}
