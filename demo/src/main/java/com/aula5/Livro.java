package com.aula5;

/**
 * Classe que representa um livro na biblioteca
 */
public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private int anoPublicacao;
    private boolean emprestado;

    /**
     * Construtor da classe Livro
     * @param titulo Título do livro
     * @param autor Autor do livro
     * @param isbn ISBN do livro
     * @param anoPublicacao Ano de publicação do livro
     */
    public Livro(String titulo, String autor, String isbn, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anoPublicacao = anoPublicacao;
        this.emprestado = false;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    /**
     * Empresta o livro
     * @return true se o empréstimo foi bem-sucedido, false se o livro já estava emprestado
     */
    public boolean emprestar() {
        if (!emprestado) {
            emprestado = true;
            return true;
        }
        return false;
    }

    /**
     * Devolve o livro
     * @return true se a devolução foi bem-sucedida, false se o livro não estava emprestado
     */
    public boolean devolver() {
        if (emprestado) {
            emprestado = false;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                ", emprestado=" + emprestado +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Livro livro = (Livro) obj;
        return isbn.equals(livro.isbn);
    }

    @Override
    public int hashCode() {
        return isbn.hashCode();
    }
}
