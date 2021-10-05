package br.com.letscode.biblioteca.Livros;


import br.com.letscode.biblioteca.Usuario.Aluno;
import br.com.letscode.biblioteca.Usuario.Professor;

import java.time.LocalDate;
import java.util.ArrayList;


public class RegistroLivro {

    private ArrayList <Livro> rL;


    public RegistroLivro(){
        this.rL = new ArrayList<Livro>();
    }

    public void addLivro(Livro livro){
        rL.add(livro);
    }


    public Livro getLivro (int indice){
        return rL.get(indice);
    }

    public int size(){
        return rL.size();
    }

    public void devolverLivro(Object object){
        if (object instanceof Aluno) {
            for (Livro livro : ((Aluno) object).getEmprestimo().getEmprestimo()) {
                rL.add(livro);
            }
            if(((Aluno) object).getEmprestimo().getDataDevolucao().isAfter(LocalDate.now())){
                ((Aluno) object).setDiasAtraso(new GerenciaDia().calcularDataAtraso(LocalDate.now(),((Aluno) object).getEmprestimo().getDataDevolucao() ));
            }
        }
        if (object instanceof Professor) {
            for (Livro livro : ((Professor) object).getEmprestimo().getEmprestimo()) {
                rL.add(livro);
            }
            if(((Aluno) object).getEmprestimo().getDataDevolucao().isAfter(LocalDate.now())){
                ((Aluno) object).setDiasAtraso(new GerenciaDia().calcularDataAtraso(LocalDate.now(),((Aluno) object).getEmprestimo().getDataDevolucao() ));
            }
        }


    }



}
