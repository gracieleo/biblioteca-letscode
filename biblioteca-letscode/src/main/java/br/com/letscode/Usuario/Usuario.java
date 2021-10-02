package br.com.letscode.Usuario;
import br.com.letscode.Livro;
import java.util.ArrayList;

public interface Usuario {
    boolean emprestar(ArrayList<Livro> livros);
    boolean devolver(ArrayList<Livro> livros);
}
