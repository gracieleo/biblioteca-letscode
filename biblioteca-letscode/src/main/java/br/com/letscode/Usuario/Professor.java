package br.com.letscode.Usuario;
import br.com.letscode.Emprestimo;
import br.com.letscode.GerenciaDia;
import br.com.letscode.Livro;
import br.com.letscode.RegistroLivro;

import java.time.LocalDate;
import java.util.ArrayList;

public class Professor implements Usuario {
    private String nome;
    private String matricula;
    private String email;
    private ArrayList<Livro> emprestimo;
    private int diasAtraso = 0;
    private final int diasEmprestimo = 20;


    public Professor() {
    }

    public Professor(String nome, String matricula, String email) {
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
    }

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

    public ArrayList<Livro> getEmprestimo() {
        return emprestimo;
    }
    public int getDiasAtraso() {
        return diasAtraso;
    }

    public void setDiasAtraso(int diasAtraso) {
        this.diasAtraso = diasAtraso;
    }

    public void setEmprestimo(ArrayList<Livro> emprestimo) {
        this.emprestimo = emprestimo;
    }

    public int getDiasEmprestimo() {
        return diasEmprestimo;
    }

    public void emprestar(Emprestimo emprestimo) {

        if (emprestimo.getEmprestimo().size() > 3 && this.emprestimo.size()+emprestimo.getEmprestimo().size()>5 ) {
            System.out.println("Emprestimo não permitido");
        } else if (emprestimo.getEmprestimo().size() < 4 && emprestimo.getEmprestimo().size() > 0 && getDiasAtraso() == 0) {
            System.out.println("Emprestimo permitido");
            System.out.println("Emprestimo permitido");
            GerenciaDia dia = new GerenciaDia();
            dia.setDia(dia.calcularDataDevolucao( emprestimo.getDataEmprestimo(), getDiasEmprestimo()));
            emprestimo.setDataEmprestimo(dia.getDia());
            this.emprestimo=emprestimo.getEmprestimo();
        }
    }

    public void devolver(RegistroLivro registroLivro,Emprestimo emprestimo, LocalDate dataDevolucao) {
        if (emprestimo.getDataDevolucao().isBefore(dataDevolucao)){
            while(emprestimo.getDataDevolucao().isBefore(dataDevolucao)) {
                emprestimo.setDataDevolucao(emprestimo.getDataDevolucao().plusDays(1));
                setDiasAtraso(getDiasAtraso()+1);
            }
        }
        for (Livro livro : emprestimo.getEmprestimo() ){
            registroLivro.addLivro(livro);
        }

        setEmprestimo(null);
    }


}