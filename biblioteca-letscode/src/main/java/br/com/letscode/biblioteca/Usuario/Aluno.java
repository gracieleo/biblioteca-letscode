package br.com.letscode.biblioteca.Usuario;
import br.com.letscode.biblioteca.Emprestimo;
import br.com.letscode.biblioteca.Livros;
import br.com.letscode.biblioteca.Livros.RegistroLivro;
import br.com.letscode.GerenciaDia;
import br.com.letscode.biblioteca.Emprestimo;

import java.time.LocalDate;

public class Aluno implements Usuario {
    private String nome;
    private String matricula;
    private String email;
    private Emprestimo emprestimo;
    private LocalDate dataAtraso;
    private final int diasEmprestimo = 10;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }

    public LocalDate getDiasAtraso() {
        return dataAtraso;
    }

    public void setDiasAtraso(LocalDate dataAtraso) {
        this.dataAtraso = dataAtraso;
    }
    public int getDiasEmprestimo() {
        return diasEmprestimo;
    }

    public Aluno() {
    }
    public Aluno(String nome, String matricula, String email) {
        this.nome=nome;
        this.matricula=matricula;
        this.email=email;
    }

    @Override
    public void emprestar(Emprestimo emprestimo) {

    }

    @Override
    public void devolver(RegistroLivro registroLivro, Emprestimo emprestimo, LocalDate data) {

    }
}
