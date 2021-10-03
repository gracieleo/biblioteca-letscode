package br.com.letscode.Usuario;
import br.com.letscode.Emprestimo;
import br.com.letscode.Livro;
import br.com.letscode.RegistroLivro;
import br.com.letscode.GerenciaDia;

import java.time.LocalDate;
import java.util.Date;

public class Aluno implements Usuario{
    private String nome;
    private String matricula;
    private String email;
    private Emprestimo emprestimo;
    private int diasAtraso=0;
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

    public int getDiasAtraso() {
        return diasAtraso;
    }

    public void setDiasAtraso(int diasAtraso) {
        this.diasAtraso = diasAtraso;
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

    public void emprestar(Emprestimo emprestimo ) {

        if(emprestimo.getEmprestimo().size()>3){
            System.out.println("Emprestimo não permitido");
        }else if(this.emprestimo.getEmprestimo().size()<1 && emprestimo.getEmprestimo().size()<4 && emprestimo.getEmprestimo().size()>0 && getDiasAtraso()==0){
            System.out.println("Emprestimo permitido");
            GerenciaDia dia = new GerenciaDia();
            dia.setDia(dia.calcularDataDevolucao( emprestimo.getDataEmprestimo(), getDiasEmprestimo()));
            emprestimo.setDataEmprestimo(dia.getDia());
            this.emprestimo=emprestimo;
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