package com.atividade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int artesao;
        int horas;
        double valorHora;
        double salario;

        artesao = sc.nextInt();
        horas = sc.nextInt();
        valorHora = sc.nextDouble();

        salario = horas * valorHora;

        System.out.println("ARTESAO = " + artesao);
        System.out.printf("SALARIO = R$ %.2f%n", salario);

        sc.close();
    }
}