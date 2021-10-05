package br.com.letscode;

import br.com.letscode.Usuario.Aluno;
import br.com.letscode.Livro;
import br.com.letscode.GerenciaDia;
import br.com.letscode.Usuario.Professor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;


public class RegistroLivro {

    private ArrayList <Livro> rL;

    //construtor
    public RegistroLivro(){
        rL = new ArrayList<Livro>();
    }

    //add livro
    public void addLivro(Livro livro){
        rL.add(livro);
    }

    //mostra livro
    public Livro getLivro (int indice){
        return rL.get(indice);
    }

    //tamanho lista de livros
    public int size(){
        return rL.size();
    }

    //emprestar livro       ----- falta adicionar o usuario
    public void emprestaLivro(Livro livro){
        LocalDateTime now = LocalDateTime.now();
        livro.setDataEmprestimo(now);
        //livro.setUsuario(usuario);
    }

    //ordena lista de livros A-Z
    public void ordenaTitulos(){
        //Collections.sort(rL);   deu erro
    }

    //devolver livro
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
