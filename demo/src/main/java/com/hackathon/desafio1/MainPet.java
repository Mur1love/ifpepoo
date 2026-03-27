package com.hackathon.desafio1;

import java.util.Scanner;

public class MainPet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== BEM-VINDO AO PET VIRTUAL ===");
        System.out.print("Digite o nome do seu pet: ");
        String nomePet = scanner.nextLine();

        Pet pet = new Pet(nomePet);

        System.out.println("\n🎉 Parabéns! Você adotou " + nomePet + "!");

        boolean continuar = true;

        while (continuar && pet.estaVivo()) {
            exibirMenu();
            System.out.print("Escolha uma opção: ");

            try {
                int opcao = scanner.nextInt();
                scanner.nextLine(); // Limpar buffer

                switch (opcao) {
                    case 1:
                        pet.brincar();
                        break;
                    case 2:
                        pet.comer();
                        break;
                    case 3:
                        pet.dormir();
                        break;
                    case 4:
                        pet.status();
                        break;
                    case 5:
                        System.out.println("\n👋 Até logo! Cuide bem do " + nomePet + "!");
                        continuar = false;
                        break;
                    default:
                        System.out.println("❌ Opção inválida! Tente novamente.");
                }
            } catch (Exception e) {
                System.out.println("❌ Entrada inválida! Digite um número.");
                scanner.nextLine(); // Limpar buffer
            }
        }

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n----- MENU -----");
        System.out.println("1. 🎾 Brincar");
        System.out.println("2. 🍖 Comer");
        System.out.println("3. 😴 Dormir");
        System.out.println("4. 📊 Ver Status");
        System.out.println("5. 🚪 Sair");
        System.out.println("----------------");
    }
}
