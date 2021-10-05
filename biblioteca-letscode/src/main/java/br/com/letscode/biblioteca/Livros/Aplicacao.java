package br.com.letscode.biblioteca.Livros;

import br.com.letscode.biblioteca.Emprestimo;

import java.util.Scanner;


public class Aplicacao {

    private static Scanner sc = new Scanner(System.in);
    private static RegistroLivro rL;


    private static void contaDias(Emprestimo emprestimo) {
    }

    private static void emprestaLivro() {
        System.out.println("Digite o login do usuário:");
        String login = sc.next();
        System.out.println("Digite a senha do usuario");
        String senha = sc.next();
        for () {
        }
    }

        private static void adicionaLivro () {
            String titulo, autor, editora, isbn;
            Livro v;
            System.out.println("Para adicionar um livro, preencha os dados:");
            System.out.println("Titulo: ");
            titulo = sc.nextLine();
            System.out.println("Autor: ");
            autor = sc.nextLine();
            System.out.println("Isbn: ");
            isbn = sc.nextLine();
            System.out.println("Editora: ");
            editora = sc.next();
            sc.nextLine();
            System.out.println("Livro adicionado!");

            v = new Livro(titulo, autor, isbn, editora);
            rL.addLivro(v);
        }


        private static void mostrarLivrosDisponiveis () {
            System.out.println("Estante de livros disponiveis");
            System.out.println("ISBN\t\t\t Título\t\t\t Autor\t\t\t Editora");
            for (int i = 0; i < rL.size(); i++) {
                Livro v = rL.getLivro(i);
                if (v.getDataEmprestimo() == null) {
                    System.out.printf("%s\t\t\t %s\t\t %s\t\t %s\t\t\n", v.getIsbn(), v.getTitulo(), v.getAutor(), v.getEditora());
                }
            }
        }


        public static void mostrarTodosLivros () {
            System.out.println("Lista de livros: ");
            System.out.println("Isbn\t Titulo\t\t\t\t Autor\t\t\t\t\t Editora\t\t\t Situacao\t\t");
            for (int i = 0; i < rL.size(); i++) {
                Livro v = rL.getLivro(i);
                if (v.getDataEmprestimo() == null) {
                    System.out.printf("%s\t %s\t\t\t\t %s\t\t\t\t\t %s\t\t\t Livro Disponivel\n", v.getIsbn(), v.getTitulo(), v.getAutor(), v.getEditora());
                } else {
                    System.out.printf("%s\t %s\t\t\t\t %s\t\t\t\t\t %s\t\t\t\n", v.getIsbn(), v.getTitulo(), v.getAutor(), v.getEditora());
                }

            }
        }

        public static void devolveLivro () {
            boolean indice = false;
            String cod;
            System.out.println("Digite codigo do livro que vai devolver: ");
            cod = sc.nextLine();
            //sc.nextLine();
            for (int i = 0; i < rL.size(); i++) {
                Livro v = rL.getLivro(i);
                if (v.getIsbn() == cod) {
                    v.setDataEmprestimo(null);
                    indice = true;
                    System.out.println("livro codigo " + v.getIsbn() + " devolvido!");
                }
                if (indice == false) {
                    System.out.print("Livro não encontrado.\n");
                }
            }
        }


        public static void main (String[]args){
            rL = new RegistroLivro();

            Livro l1 = new Livro("Código Limpo", "Robert C Martin", "9788576082675", "Prentice Hall");
            Livro l2 = new Livro("Java como programar", "Paulo Deitel", "6789123", "Pearson");
            Livro l3 = new Livro("Java para iniciantes", "Hebert Schildt", "9788582603369", "Bookman");
            Livro l4 = new Livro("Algoritmos teoria e pratica", "Clifford Stein", "8535236996", "LTC");
            Livro l5 = new Livro("Entendendo Algoritmos", "Aditya B.", "9788575225639", "Novatec");
            rL.addLivro(l1);
            rL.addLivro(l2);
            rL.addLivro(l3);
            rL.addLivro(l4);
            rL.addLivro(l5);


            int op;
            do {
                System.out.println("Menu Biblioteca Let's Code:\n ");
                System.out.println("0 - sair ");
                System.out.println("1 - adicionar livro ");
                System.out.println("2 - adicionar usuario ");
                System.out.println("3 - emprestar livro");
                System.out.println("4 - devolver livro ");
                System.out.println("5 - listar livros ");
                System.out.println("6 - listar livros disponiveis ");
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
                        //adicionarUsuario();
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
                    case 6:
                        mostrarLivrosDisponiveis();
                        break;
                    default:
                        System.out.println("Opção inválida! \n\n");
                        break;
                }
            } while (op != 0);
        }
    }
}


