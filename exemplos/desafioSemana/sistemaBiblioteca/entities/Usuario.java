package entities;

import entities.Biblioteca;
import entities.Livro;
import entities.Funcionario;

import java.util.ArrayList;

public class Usuario {
    // atributos
    public String nomeUsuario;
    public int identificacaoUsuario;
    public ArrayList<Livro> livrosEmprestados = new ArrayList<>();

    // construtor
    public Usuario (String nomeUsuario, int identificacaoUsuario){
        this.nomeUsuario = nomeUsuario;
        this.identificacaoUsuario = identificacaoUsuario;
        System.out.printf("Usuário '%s (id %d)' adicionado\n", nomeUsuario, identificacaoUsuario);
    }

    // métodos
    public void getLivrosEmprestados(){
        System.out.println("- Livros emprestados por " + this.nomeUsuario + ":");
        if (livrosEmprestados.size() > 0){
            for (Livro livro: livrosEmprestados){
                System.out.println("  - " + livro);
            }
        }
        else {
            System.out.println("Usuário não emprestou nenhum livro");
        }
    }
    public void solicitaEmprestimo(Funcionario funcionario, Livro livro){
        System.out.println("Solicitação de empréstimo de '" + livro.tituloLivro + "' para o usuário " + this.nomeUsuario + " (id " + identificacaoUsuario + ")");

        if (livro.getStatusLivro() == "Disponível"){
            funcionario.emprestaLivro(livro);
            this.livrosEmprestados.add(livro);
        }
        else {
            System.out.println("Desculpe, o livro está indisponível no momento");
        }
    }
    public void solicitaReserva(Funcionario funcionario, Livro livro){
        System.out.println("Solicitação de reserva de '" + livro.tituloLivro + "' para o usuário " + this.nomeUsuario + " (id " + identificacaoUsuario + ")");

        if (livro.getStatusLivro() == "Disponível"){
            funcionario.reservaLivro(livro);
        }
        else {
            System.out.println("Desculpe, o livro está indisponível no momento");
        }
    }
    public void solicitaDevolucao(Funcionario funcionario, Livro livro){
        System.out.println("Devolução do livro '" + livro.tituloLivro + "' pelo usuário " + this.nomeUsuario + " (id " + identificacaoUsuario + ")");
        if (this.livrosEmprestados.contains(livro)){
            funcionario.devolveLivro(livro);
            this.livrosEmprestados.remove(livro);
        }
        else {
            System.out.println("Usuário não pode resolver um livro que não emprestou");
        }
    }


    @Override
    public String toString() {
        return this.identificacaoUsuario + " - " + this.nomeUsuario;
    }
}
