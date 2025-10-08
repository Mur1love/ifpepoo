package com.aula3;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Maria Silva", "12345678900", 25);
        Pessoa pessoa2 = new Pessoa("João Souza", "98765432100");

        System.out.println("=== Dados das Pessoas ===");
        pessoa1.exibirInformacoes();
        System.out.println();
        pessoa2.exibirInformacoes();

        // ======= TESTE 1: COMPARAR NOMES (equals) =======
        System.out.println("\n=== Teste 1: Comparar nomes com equals() ===");
        String outroNome = "Maria Antonia";
        if (pessoa1.compararNome(outroNome)) {
            System.out.println("O nome da pessoa é igual a \"" + outroNome + "\"");
        } else {
            System.out.println("O nome da pessoa é diferente de \"" + outroNome + "\"");
        }

        // ======= TESTE 2: NOME EM MAIÚSCULAS (toUpperCase) =======
        System.out.println("\n=== Teste 2: Nome em letras maiúsculas ===");
        System.out.println("Nome original: " + pessoa1.getNome());
        System.out.println("Nome em maiúsculas: " + pessoa1.nomeEmMaiusculas());

        // ======= TESTE 3: VERIFICAR SE O NOME CONTÉM UM TERMO (contains) =======
        System.out.println("\n=== Teste 3: Verificar se o nome contém determinado termo ===");
        String termo = "Silva";
        if (pessoa1.nomeContem(termo)) {
            System.out.println("O nome contém o termo \"" + termo + "\"");
        } else {
            System.out.println("O nome NÃO contém o termo \"" + termo + "\"");
        }

        // ======= TESTE EXTRA: DIFERENTES CASOS DE ENTRADA =======
        System.out.println("\n=== Teste Extra: Explorando diferentes termos ===");
        System.out.println("Contém 'silva'? " + pessoa1.nomeContem("silva"));
        System.out.println("Contém 'Maria'? " + pessoa1.nomeContem("Maria"));
        System.out.println("Contém 'Souza'? " + pessoa2.nomeContem("Souza"));
    }

}
