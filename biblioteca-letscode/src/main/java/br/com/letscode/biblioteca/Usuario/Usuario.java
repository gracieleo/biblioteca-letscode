package br.com.letscode.biblioteca.Usuario;

import br.com.letscode.*;
import br.com.letscode.biblioteca.Emprestimo;
import br.com.letscode.biblioteca.Livros.RegistroLivro;

import java.time.LocalDate;

public interface Usuario {
    void emprestar(Emprestimo emprestimo);

    void devolver(RegistroLivro registroLivro, Emprestimo emprestimo, LocalDate data);

}
