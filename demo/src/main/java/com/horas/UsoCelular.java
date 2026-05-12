package com.horas;

import java.util.Scanner;

public class UsoCelular {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        double horas;
        double total = 0;
        double media;

        for(int i = 1; i<=5; i++) {
            System.out.println("Digite quanto de tempo de tela no dia "+ i);
            horas = ler.nextDouble();
            total = total + horas;
        }
        System.out.println("Total de horas: " + total);
        media = total / 5;
        System.out.println("Média: "+ media);
        if (media >= 3) {
            System.out.println("Uso Elevado");
        } else {
            System.out.println("Uso moderado");
        }       


    }
        
}