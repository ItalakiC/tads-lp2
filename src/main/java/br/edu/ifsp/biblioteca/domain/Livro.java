package br.edu.ifsp.biblioteca.domain;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private Long id;
    private String isbn;
    private String titulo;
    private int anoPublicacao;
    private List<Exemplar> listaDeExemplares;
    private List<Autor> autores;

    public Livro(Long id, String isbn, String titulo, int anoPublicacao) {
        this.id = id;
        this.isbn = isbn;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.listaDeExemplares = new ArrayList<>();
        this.autores = new ArrayList<>();
    }

    public int getAnoPublicacao () {
        return this.anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    public void adicionarExemplar(Exemplar item){
        this.listaDeExemplares.add(item);
    }

    public void adicionarAutor(Autor item) {
        this.autores.add(item);
    }

    public String getTitulo () {
        return this.titulo;

    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn () {
        return this.isbn;

    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Long getId() {
            return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}
