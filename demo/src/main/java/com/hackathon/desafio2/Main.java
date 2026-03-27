package com.hackathon.desafio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Aluno> alunos = new ArrayList<>();
    private static List<Professor> professores = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE CONTROLE ACADEMICO ===\n");

        boolean continuar = true;

        while (continuar) {
            exibirMenu();
            System.out.print("Escolha uma opcao: ");

            try {
                int opcao = scanner.nextInt();
                scanner.nextLine(); // Limpar buffer

                switch (opcao) {
                    case 1:
                        cadastrarAluno();
                        break;
                    case 2:
                        cadastrarProfessor();
                        break;
                    case 3:
                        listarAlunos();
                        break;
                    case 4:
                        listarProfessores();
                        break;
                    case 5:
                        System.out.println("\nEncerrando sistema... Ate logo!");
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opcao invalida! Tente novamente.\n");
                }
            } catch (Exception e) {
                System.out.println("Entrada invalida! Digite um numero.\n");
                scanner.nextLine(); // Limpar buffer
            }
        }

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("========== MENU ==========");
        System.out.println("1. Cadastrar Aluno");
        System.out.println("2. Cadastrar Professor");
        System.out.println("3. Listar Alunos");
        System.out.println("4. Listar Professores");
        System.out.println("5. Sair");
        System.out.println("==========================");
    }

    private static void cadastrarAluno() {
        System.out.println("\n--- CADASTRAR ALUNO ---");

        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Matricula: ");
        String matricula = scanner.nextLine();

        Aluno aluno = new Aluno(nome, matricula);
        alunos.add(aluno);

        System.out.println("Aluno cadastrado com sucesso!\n");
    }

    private static void cadastrarProfessor() {
        System.out.println("\n--- CADASTRAR PROFESSOR ---");

        System.out.print("Nome do professor: ");
        String nome = scanner.nextLine();

        System.out.print("Disciplina: ");
        String disciplina = scanner.nextLine();

        Professor professor = new Professor(nome, disciplina);
        professores.add(professor);

        System.out.println("Professor cadastrado com sucesso!\n");
    }

    private static void listarAlunos() {
        System.out.println("\n========== LISTA DE ALUNOS ==========");

        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado ainda.\n");
            return;
        }

        for (int i = 0; i < alunos.size(); i++) {
            Aluno aluno = alunos.get(i);
            System.out.println((i + 1) + ". Nome: " + aluno.getNome() + " | Matricula: " + aluno.getMatricula());
        }
        System.out.println("=====================================\n");
    }

    private static void listarProfessores() {
        System.out.println("\n========== LISTA DE PROFESSORES ==========");

        if (professores.isEmpty()) {
            System.out.println("Nenhum professor cadastrado ainda.\n");
            return;
        }

        for (int i = 0; i < professores.size(); i++) {
            Professor professor = professores.get(i);
            System.out.println((i + 1) + ". Nome: " + professor.getNome() + " | Disciplina: " + professor.getDisciplina());
        }
        System.out.println("==========================================\n");
    }
}
