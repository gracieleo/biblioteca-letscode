package br.com.letscode;

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
    public void devolverLivro(){

    }
}
