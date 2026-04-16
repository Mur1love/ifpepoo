package com.situacaoAluno;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota do aluno:");
        double nota = sc.nextDouble();

        System.out.println("Digite a frequência do aluno (em %):");
        double frequencia = sc.nextDouble();

        if (frequencia < 75) {
            System.out.println("Aluno Reprovado por frequência");
        } else if (nota >= 6) {
            System.out.println("Aluno aprovado");
        } else if (nota >= 5 && nota < 6) {
            System.out.println("Aluno em recuperação");
        } else {
            System.out.println("Aluno reprovado por nota!");
        }
        


    }
    
}
