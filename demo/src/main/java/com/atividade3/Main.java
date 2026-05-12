package com.atividade3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        int nivel;
        int quantidadeElite = 0;

        n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            nivel = sc.nextInt();

            if (nivel % 2 == 0 && nivel > 15) {
                quantidadeElite++;
            }
        }

        System.out.println(quantidadeElite);

        sc.close();
    }
}
