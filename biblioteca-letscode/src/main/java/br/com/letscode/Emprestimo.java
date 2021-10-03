package br.com.letscode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Emprestimo {
    private ArrayList<Livro> emprestimo;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo() {
    }

    public Emprestimo(ArrayList<Livro> emprestimo, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        this.emprestimo = emprestimo;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public ArrayList<Livro> getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(ArrayList<Livro> emprestimo) {
        this.emprestimo = emprestimo;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }


}
