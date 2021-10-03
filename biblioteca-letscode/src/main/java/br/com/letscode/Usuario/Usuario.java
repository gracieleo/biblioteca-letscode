package br.com.letscode.Usuario;
import br.com.letscode.*;

import java.time.LocalDate;

public interface Usuario {
    void emprestar(Emprestimo emprestimo);

    void devolver(RegistroLivro registroLivro,Emprestimo emprestimo, LocalDate data);



}
