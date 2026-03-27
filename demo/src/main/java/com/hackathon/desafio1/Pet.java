package com.hackathon.desafio1;

public class Pet {
    private String nome;
    private int energia;
    private int fome;
    private int felicidade;

    public Pet(String nome) {
        this.nome = nome;
        this.energia = 50;
        this.fome = 50;
        this.felicidade = 50;
    }

    public void brincar() {
        if (energia < 20) {
            System.out.println(nome + " está muito cansado para brincar!");
            return;
        }
        energia -= 15;
        fome += 10;
        felicidade += 20;
        System.out.println(nome + " brincou e está muito feliz! 🎾");
    }

    public void comer() {
        if (fome < 10) {
            System.out.println(nome + " não está com fome agora!");
            return;
        }
        fome -= 30;
        energia += 10;
        felicidade += 5;
        System.out.println(nome + " comeu e está satisfeito! 🍖");
    }

    public void dormir() {
        energia = 100;
        fome += 15;
        System.out.println(nome + " dormiu e recuperou toda a energia! 😴");
    }

    public void status() {
        System.out.println("\n========== STATUS DO PET ==========");
        System.out.println("Nome: " + nome);
        System.out.println("Energia: " + getBarraStatus(energia));
        System.out.println("Fome: " + getBarraStatus(fome));
        System.out.println("Felicidade: " + getBarraStatus(felicidade));
        System.out.println("Estado: " + getEstado());
        System.out.println("===================================\n");
    }

    private String getBarraStatus(int valor) {
        int barras = valor / 10;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < 10; i++) {
            if (i < barras) {
                sb.append("█");
            } else {
                sb.append("░");
            }
        }
        sb.append("] ").append(Math.min(valor, 100)).append("%");
        return sb.toString();
    }

    private String getEstado() {
        if (energia < 20) return "Muito cansado 😴";
        if (fome > 70) return "Com muita fome 😢";
        if (felicidade > 80) return "Muito feliz! 😄";
        if (felicidade < 30) return "Triste 😔";
        return "Normal 🙂";
    }

    public boolean estaVivo() {
        if (fome >= 100) {
            System.out.println("\n💔 " + nome + " ficou com muita fome e desmaiou!");
            return false;
        }
        return true;
    }
}
