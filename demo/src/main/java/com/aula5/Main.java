package com.aula5;

import java.util.List;

/**
 * Classe principal para demonstrar o funcionamento do sistema de biblioteca
 */
public class Main {

    public static void main(String[] args) {
        // Criar uma biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central IFPE");
        System.out.println("=== Sistema de Biblioteca ===");
        System.out.println(biblioteca);
        System.out.println();

        // Criar e adicionar livros
        System.out.println("=== Adicionando Livros ===");
        Livro livro1 = new Livro(
            "Clean Code",
            "Robert C. Martin",
            "978-0132350884",
            2008
        );
        Livro livro2 = new Livro(
            "Design Patterns",
            "Gang of Four",
            "978-0201633610",
            1994
        );
        Livro livro3 = new Livro(
            "Effective Java",
            "Joshua Bloch",
            "978-0134685991",
            2017
        );
        Livro livro4 = new Livro(
            "Java: Como Programar",
            "Deitel & Deitel",
            "978-8543004792",
            2016
        );
        Livro livro5 = new Livro(
            "Refactoring",
            "Martin Fowler",
            "978-0134757599",
            2018
        );

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);
        biblioteca.adicionarLivro(livro5);

        System.out.println(
            "Total de livros na biblioteca: " + biblioteca.quantidadeLivros()
        );
        System.out.println();

        // Listar todos os livros
        System.out.println("=== Todos os Livros ===");
        List<Livro> todosLivros = biblioteca.listarTodos();
        for (Livro livro : todosLivros) {
            System.out.println(livro);
        }
        System.out.println();

        // Buscar livro por título
        System.out.println("=== Buscar por Título (Java) ===");
        List<Livro> livrosJava = biblioteca.buscarPorTitulo("Java");
        for (Livro livro : livrosJava) {
            System.out.println(livro);
        }
        System.out.println();

        // Buscar livro por autor
        System.out.println("=== Buscar por Autor (Martin) ===");
        List<Livro> livrosMartin = biblioteca.buscarPorAutor("Martin");
        for (Livro livro : livrosMartin) {
            System.out.println(livro);
        }
        System.out.println();

        // Buscar por ISBN
        System.out.println("=== Buscar por ISBN ===");
        Livro livroEncontrado = biblioteca.buscarPorIsbn("978-0132350884");
        if (livroEncontrado != null) {
            System.out.println("Livro encontrado: " + livroEncontrado);
        } else {
            System.out.println("Livro não encontrado");
        }
        System.out.println();

        // Emprestar livros
        System.out.println("=== Empréstimos ===");
        if (livro1.emprestar()) {
            System.out.println(
                "Livro '" + livro1.getTitulo() + "' emprestado com sucesso!"
            );
        }
        if (livro3.emprestar()) {
            System.out.println(
                "Livro '" + livro3.getTitulo() + "' emprestado com sucesso!"
            );
        }
        System.out.println();

        // Tentar emprestar novamente
        System.out.println("=== Tentando emprestar livro já emprestado ===");
        if (!livro1.emprestar()) {
            System.out.println(
                "Erro: O livro '" + livro1.getTitulo() + "' já está emprestado!"
            );
        }
        System.out.println();

        // Listar livros disponíveis
        System.out.println("=== Livros Disponíveis ===");
        List<Livro> disponiveis = biblioteca.listarDisponiveis();
        for (Livro livro : disponiveis) {
            System.out.println(livro.getTitulo());
        }
        System.out.println();

        // Listar livros emprestados
        System.out.println("=== Livros Emprestados ===");
        List<Livro> emprestados = biblioteca.listarEmprestados();
        for (Livro livro : emprestados) {
            System.out.println(livro.getTitulo());
        }
        System.out.println();

        // Devolver livro
        System.out.println("=== Devoluções ===");
        if (livro1.devolver()) {
            System.out.println(
                "Livro '" + livro1.getTitulo() + "' devolvido com sucesso!"
            );
        }
        System.out.println();

        // Remover livro
        System.out.println("=== Remover Livro ===");
        if (biblioteca.removerLivro("978-0201633610")) {
            System.out.println(
                "Livro 'Design Patterns' removido da biblioteca"
            );
        }
        System.out.println(
            "Total de livros após remoção: " + biblioteca.quantidadeLivros()
        );
        System.out.println();

        // Status final
        System.out.println("=== Status Final da Biblioteca ===");
        System.out.println(biblioteca);
        System.out.println(
            "Livros disponíveis: " + biblioteca.listarDisponiveis().size()
        );
        System.out.println(
            "Livros emprestados: " + biblioteca.listarEmprestados().size()
        );
    }
}
