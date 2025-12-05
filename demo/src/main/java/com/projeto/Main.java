package com.projeto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sistema sistema = new Sistema();

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("===== MENU =====");
            System.out.println("1 – Cadastrar pessoa");
            System.out.println("2 – Listar pessoas");
            System.out.println("3 – Buscar por nome");
            System.out.println("0 – Sair");
            System.out.print("Escolha: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    System.out.println("Cadastrar:");
                    System.out.println("1 - Aluno");
                    System.out.println("2 - Professor");
                    System.out.print("Tipo: ");
                    int tipo = Integer.parseInt(sc.nextLine());

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("CPF: ");
                    String cpf = sc.nextLine();

                    if (tipo == 1) {
                        System.out.print("Matrícula: ");
                        String mat = sc.nextLine();
                        sistema.cadastrarPessoa(new Aluno(nome, cpf, mat));
                    } else if (tipo == 2) {
                        System.out.print("Salário: ");
                        double sal = Double.parseDouble(sc.nextLine());
                        sistema.cadastrarPessoa(new Professor(nome, cpf, sal));
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;

                case 2:
                    sistema.listarPessoas();
                    break;

                case 3:
                    System.out.print("Nome para buscar: ");
                    String busca = sc.nextLine();
                    sistema.buscarPorNome(busca);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}

