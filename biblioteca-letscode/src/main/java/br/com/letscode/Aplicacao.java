package br.com.letscode;

import br.com.letscode.Usuario.Usuario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.Date;

public class Aplicacao {

    private static Scanner sc = new Scanner(System.in);
    private static RegistroLivro rL;

    //chamar de usuario também
    //conta dias de entrega
    private static void contaDias(Emprestimo emprestimo) {
    }


    private static void emprestaLivro() {
        System.out.println("Digite o login do usuário:");
        String login = sc.next();
        System.out.println("Digite a senha do usuario");
        String senha = sc.next();
        for ()
    }

    //add livro na lista de livros
    private static void adicionaLivro() {
        String titulo, autor;
        Livro v;
        System.out.println("Para adicionar um livro, preencha os dados:\n");
        System.out.println("Titulo: ");
        titulo = sc.nextLine();
        System.out.println("Autor: ");
        autor = sc.nextLine();
        System.out.println("Livro adicionado!");

        v = new Livro(titulo, autor);
        rL.addLivro(v);
    }

    //livros disponiveis
    private static void mostrarLivrosDisponiveis() {
        System.out.println("Estante de livros disponiveis");
        System.out.println("ISBN\t Título\t Autor\t Editora");
        for (int i = 0; i < rL.size(); i++) {
            Livro v = rL.getLivro(i);
            if (v.getDataEmprestimo() == null) {
                System.out.printf("%s\t %s\t %s\t %s\t\n", v.getIsbn(), v.getTitulo(), v.getAutor(), v.getEditora());
            }
        }
    }

    //listar usuarios


    public static void mostrarTodosLivros() {
        System.out.println("Lista de livros: ");
        System.out.println("Cod\t Titulo\t\t\t\t Autor\t\t\t\t\t Situacao\t\t");
        for (int i = 0; i < rL.size(); i++) {
            Livro v = rL.getLivro(i);
            if (v.getDataEmprestimo() == null) {
                System.out.printf("%s\t %s\t\t\t\t %s\t\t\t\t\t Livro Disponivel\n", v.getIsbn(), v.getTitulo(), v.getAutor());
            } else {
                System.out.printf("%s\t %s\t\t\t\t %s\t\t\t\t\tn", v.getIsbn(), v.getTitulo(), v.getAutor());   //add usuario com livro
            }

        }

    }


    //emprestimo do livro --- aguardado lista de usuarios
    //private static void emprestarLivro() {
    //  boolean idicador = false;
    //boolean indicUsuario = false;
    //int cod;
    //int codUsuario;
    //System.out.println("Digite o código do livro do qual quer emprestado: ");
    //cod = sc.nextInt();
    //sc.nextLine();
    //Main.listarTodosUsuarios();
    //System.out.println("Digite matricula do usuario:");
    //codUsuario = sc.nextInt();
    //sc.nextLine();
    //  for (int iv = o; iv < rU.size(); iv++) {
    //      Livro v = rL.getLivro(iv);
    //       if (v.getIsbn() == cod && v.getDataEmprestimo() == null) {
    //            rL.emprestaLivro(v, usuario);
    //            System.out.println("código do livro" + v.getIsbn() + "emprestimo efetuado para" + v.getMatricula);
    //           System.out.println("Data de emprestimo: " + v.getDataEmprestimo());
    //            indicador = true;
    //         }
    //     }
    //    if (indicador == false) {
    //        System.out.println("Livro já emprestado.");
    //    }
    //    if(indicUsuario==false){
    //        System.out.println("Usuario não encontrado.");
//
    //     }
    //   }


    public static void devolveLivro() {
        boolean ind = false;
        int cod2;
        System.out.println("Digite codigo do livro que vai devolver: ");
        cod2 = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < rL.size(); i++) {
            Livro v = rL.getLivro(i);
            if (v.getIsbn() == cod2) {
                v.setDataEmprestimo(null);
                ind = true;
                System.out.println("livro codigo" + v.getIsbn() + "devolvido.");
            }
        }
        if (ind == false) {
            System.out.println("Livro não encontrado.");
        }
    }

    //private static void listarLivros()
    //}


    public static void main(String[] args) {
        rL = new RegistroLivro();

        Livro l1 = new Livro("Código Limpo", "Robert C Martin");
        Livro l2 = new Livro("Java como programar", "Paulo Deitel");
        Livro l3 = new Livro("Java para iniciantes", "Hebert Schildt");
        Livro l4 = new Livro("Algoritmos teoria e pratica", "Clifford Stein");
        Livro l5 = new Livro("Entendendo Algoritmos", "Aditya B.");
        rL.addLivro(l1);
        rL.addLivro(l2);
        rL.addLivro(l3);
        rL.addLivro(l4);
        rL.addLivro(l5);


    }

    {
        int op;
        do {
            System.out.println("Menu Biblioteca Let's Code:\n ");
            System.out.println("0 - sair ");
            System.out.println("1 - adicionar livro ");
            System.out.println("2 - adicionar usuário ");
            System.out.println("3 - emprestar livro");
            System.out.println("4 - devolver livro ");
            System.out.println("5 - listar livros ");
            System.out.println("Opção: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 0:
                    System.out.println("Até mais..");
                    break;
                case 1:
                    adicionaLivro();
                    break;
                case 2:
                    //adicionaUsuario();
                    break;
                case 3:
                    //emprestarLivro();
                    break;
                case 4:
                    devolveLivro();
                    break;
                case 5:
                    mostrarTodosLivros();
                    break;
                default:
                    System.out.println("Opção inválida! \n\n");
                    break;
            }
        } while (op != 0);
    }
}



