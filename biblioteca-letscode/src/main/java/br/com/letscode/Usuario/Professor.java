package br.com.letscode.Usuario;
import br.com.letscode.Livro;
import java.util.ArrayList;

public class Professor implements Usuario{
    private String nome;
    private String matricula;
    private String email;

    public Professor(){
    }
    public Professor(String nome, String matricula, String email) {
        this.nome=nome;
        this.matricula=matricula;
        this.email=email;
    }

    public boolean emprestar(ArrayList<Livro> vetorLivros ) {
        return false;
    }


    public boolean devolver(ArrayList<Livro> vetorLivros) {
        return false;
    }
}
