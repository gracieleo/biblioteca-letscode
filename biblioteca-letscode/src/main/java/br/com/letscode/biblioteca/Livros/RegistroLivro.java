package br.com.letscode.biblioteca.Livros;


import java.util.ArrayList;


public class RegistroLivro {

    private ArrayList <Livro> rL;


    public RegistroLivro(){
        rL = new ArrayList<Livro>();
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


}
