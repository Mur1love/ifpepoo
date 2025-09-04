package com.example;

public class Matriz3D {
    public static void main(String[] args) {
        // [aluno][disciplina][unidade]
        double[][][] notas = {
            {   // Aluno 1
                {10, 5, 8},       // Disciplina 1
                {7, 6.7, 9}       // Disciplina 2
            },
            {   // Aluno 2
                {0, 6, 8.8},      // Disciplina 1
                {4, 5.7, 5}       // Disciplina 2
            }
        };

        // Impressão das notas
        for (int aluno = 0; aluno < notas.length; aluno++) {
            System.out.println("Aluno " + (aluno + 1) + ":");

            for (int disciplina = 0; disciplina < notas[aluno].length; disciplina++) {
                System.out.print("  Disciplina " + (disciplina + 1) + ": ");
                
                for (int unidade = 0; unidade < notas[aluno][disciplina].length; unidade++) {
                    System.out.print(notas[aluno][disciplina][unidade] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
