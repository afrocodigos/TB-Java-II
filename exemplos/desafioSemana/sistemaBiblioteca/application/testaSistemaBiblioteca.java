package application;

import entities.Biblioteca;
import entities.Funcionario;
import entities.Livro;
import entities.Usuario;

public class testaSistemaBiblioteca {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------------");
        System.out.println("Testando criação de biblioteca");
        System.out.println("--------------------------------------------------------------");
        Biblioteca biblioteca = new Biblioteca("Alfa's Library");
        System.out.print("\nDados da biblioteca\n");
        biblioteca.mostraLivros();
        biblioteca.mostraFuncionarios();
        biblioteca.mostraUsuarios();

        System.out.println("--------------------------------------------------------------");
        System.out.println("Testando adição de livros");
        System.out.println("--------------------------------------------------------------");
        Livro livro1 = new Livro("Duna","Frank Herbert",1965);
        Livro livro2 = new Livro("Flores para Algernon","Daniel Keyes",1959);
        Livro livro3 = new Livro("Emma","Jane Austen",1815);
        Livro livro4 = new Livro("E não sobrou nenhum","Agatha Christie",1939);
        Livro livro5 = new Livro("Um estudo em vermelho","Arthur Conan Doyle",1887);
        Livro livro6 = new Livro("Dom Casmurro","Machado de Assis",1899);
        biblioteca.adicionaLivro(livro1);
        biblioteca.adicionaLivro(livro2);
        biblioteca.adicionaLivro(livro3);
        biblioteca.adicionaLivro(livro4);
        biblioteca.adicionaLivro(livro5);
        biblioteca.adicionaLivro(livro6);
        biblioteca.mostraLivros();

        System.out.println("--------------------------------------------------------------");
        System.out.println("Testando adição de funcionário");
        System.out.println("--------------------------------------------------------------");
        Funcionario funcionario1 = new Funcionario("José","Rua das cores, nº 0", "1234-5678");
        biblioteca.adicionaFuncionario(funcionario1);
        Funcionario funcionario2 = new Funcionario("Maria","Rua das cores, nº 0", "1234-5678");
        biblioteca.adicionaFuncionario(funcionario2);
        biblioteca.mostraFuncionarios();

        System.out.println("--------------------------------------------------------------");
        System.out.println("Testando criação de usuário");
        System.out.println("--------------------------------------------------------------");
        Usuario usuario1 = new Usuario("Ana", 0001);
        Usuario usuario2 = new Usuario("Lili", 0002);
        funcionario2.cadastraUsuario(biblioteca, usuario1);
        funcionario1.cadastraUsuario(biblioteca, usuario2);
        biblioteca.mostraUsuarios();

        System.out.println("--------------------------------------------------------------");
        System.out.println("Testando empréstimo de livro");
        System.out.println("--------------------------------------------------------------");
        usuario1.solicitaEmprestimo(funcionario1, livro1);
        usuario1.solicitaEmprestimo(funcionario1, livro2);
        usuario2.solicitaEmprestimo(funcionario1, livro1);
        usuario2.solicitaEmprestimo(funcionario1, livro4);
        biblioteca.mostraLivros();

        System.out.println("--------------------------------------------------------------");
        System.out.println("Testando reserva de livro");
        System.out.println("--------------------------------------------------------------");
        usuario2.solicitaReserva(funcionario2, livro2);
        usuario2.solicitaReserva(funcionario2, livro3);
        biblioteca.mostraLivros();

        System.out.println("--------------------------------------------------------------");
        System.out.println("Testando devolução de livro");
        System.out.println("--------------------------------------------------------------");
        usuario1.solicitaDevolucao(funcionario1, livro1);
        usuario2.solicitaDevolucao(funcionario1, livro2);
        biblioteca.mostraLivros();
    }
}