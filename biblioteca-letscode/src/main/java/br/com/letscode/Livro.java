package br.com.letscode;

import java.time.LocalDateTime;

public class Livro implements Comparable <Livro>{

    private String titulo;
    private int isbn;
    private String autor;
    private String editora;
    private LocalDateTime dataEmprestimo;
    private static int codigo = 1;
    //Usuario usuario ;    exemplo


    public Livro(){}

    public Livro(String titulo, String autor){
        super();
        this.titulo = titulo;
        this.autor = autor;
        dataEmprestimo = null;
        //usuario = null;
        this.isbn = codigo;
        codigo++;

    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public LocalDateTime getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDateTime dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public static int getCodigo() {
        return codigo;
    }

    public static void setCodigo(int codigo) {
        Livro.codigo = codigo;
    }


    @Override
    public int compareTo(Livro v) {
        return this.titulo.compareToIgnoreCase(v.getTitulo());
    }
}
