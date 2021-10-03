package br.com.letscode.biblioteca.Livros;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Livro implements Comparable <Livro>{

    private String titulo;
    private String isbn;
    private String autor;
    private String editora;
    private LocalDateTime dataEmprestimo;


    public Livro(){}

    public Livro(String titulo, String autor,String isbn,String editora){
        super();
        this.titulo = titulo;
        this.autor = autor;
        dataEmprestimo = null;
        this.isbn = isbn;
        this.editora = editora;

    }


    @Override
    public int compareTo(Livro v) {
        return this.titulo.compareToIgnoreCase(v.getTitulo());
    }

}
