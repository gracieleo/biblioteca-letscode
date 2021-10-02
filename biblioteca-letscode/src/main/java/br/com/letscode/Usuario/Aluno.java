package br.com.letscode.Usuario;
import br.com.letscode.Livro;
import java.util.ArrayList;

public class Aluno extends Usuario{
    public Aluno() {
    }
    public Aluno(String nome, String matricula, String email) {
        super(nome, matricula, email);
    }

    public boolean emprestar(ArrayList<Livro> vetorLivros ) {
        return false;
    }
    public boolean devolver(ArrayList<Livro> vetorLivros) {
        return false;
    }
}