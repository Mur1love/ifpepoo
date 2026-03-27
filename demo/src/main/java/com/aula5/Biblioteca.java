package com.aula5;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa uma biblioteca e gerencia a coleção de livros
 */
public class Biblioteca {
    private String nome;
    private List<Livro> livros;

    /**
     * Construtor da classe Biblioteca
     * @param nome Nome da biblioteca
     */
    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    /**
     * Adiciona um livro à biblioteca
     * @param livro Livro a ser adicionado
     * @return true se o livro foi adicionado, false se já existe
     */
    public boolean adicionarLivro(Livro livro) {
        if (!livros.contains(livro)) {
            livros.add(livro);
            return true;
        }
        return false;
    }

    /**
     * Remove um livro da biblioteca pelo ISBN
     * @param isbn ISBN do livro a ser removido
     * @return true se o livro foi removido, false se não foi encontrado
     */
    public boolean removerLivro(String isbn) {
        return livros.removeIf(livro -> livro.getIsbn().equals(isbn));
    }

    /**
     * Busca um livro pelo ISBN
     * @param isbn ISBN do livro
     * @return O livro encontrado ou null se não existir
     */
    public Livro buscarPorIsbn(String isbn) {
        for (Livro livro : livros) {
            if (livro.getIsbn().equals(isbn)) {
                return livro;
            }
        }
        return null;
    }

    /**
     * Busca livros pelo título (busca parcial, case-insensitive)
     * @param titulo Título ou parte do título do livro
     * @return Lista de livros encontrados
     */
    public List<Livro> buscarPorTitulo(String titulo) {
        List<Livro> resultado = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                resultado.add(livro);
            }
        }
        return resultado;
    }

    /**
     * Busca livros pelo autor (busca parcial, case-insensitive)
     * @param autor Autor ou parte do nome do autor
     * @return Lista de livros encontrados
     */
    public List<Livro> buscarPorAutor(String autor) {
        List<Livro> resultado = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.getAutor().toLowerCase().contains(autor.toLowerCase())) {
                resultado.add(livro);
            }
        }
        return resultado;
    }

    /**
     * Lista todos os livros da biblioteca
     * @return Lista com todos os livros
     */
    public List<Livro> listarTodos() {
        return new ArrayList<>(livros);
    }

    /**
     * Lista todos os livros disponíveis (não emprestados)
     * @return Lista de livros disponíveis
     */
    public List<Livro> listarDisponiveis() {
        List<Livro> disponiveis = new ArrayList<>();
        for (Livro livro : livros) {
            if (!livro.isEmprestado()) {
                disponiveis.add(livro);
            }
        }
        return disponiveis;
    }

    /**
     * Lista todos os livros emprestados
     * @return Lista de livros emprestados
     */
    public List<Livro> listarEmprestados() {
        List<Livro> emprestados = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.isEmprestado()) {
                emprestados.add(livro);
            }
        }
        return emprestados;
    }

    /**
     * Retorna o número total de livros na biblioteca
     * @return Quantidade de livros
     */
    public int quantidadeLivros() {
        return livros.size();
    }

    /**
     * Retorna o nome da biblioteca
     * @return Nome da biblioteca
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da biblioteca
     * @param nome Novo nome da biblioteca
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nome='" + nome + '\'' +
                ", totalLivros=" + livros.size() +
                '}';
    }
}
