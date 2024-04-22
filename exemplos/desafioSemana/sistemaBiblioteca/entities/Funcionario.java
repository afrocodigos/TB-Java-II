package entities;

import entities.Usuario;
import entities.Livro;
import entities.Biblioteca;

import java.util.ArrayList;

public class Funcionario {
    // atributos
    public String nomeFuncionario;
    public String enderecoFuncionario;
    public String telefoneFuncionario;
    public String cargoFuncionario;
    public double salarioFuncionario;

    //construtor
    public Funcionario(String nomeFuncionario, String enderecoFuncionario, String telefoneFuncionario){
        this.nomeFuncionario = nomeFuncionario;
        this.enderecoFuncionario = enderecoFuncionario;
        this.telefoneFuncionario = telefoneFuncionario;
        this.cargoFuncionario = "Bibliotecário";
        this.salarioFuncionario = 10000.00;
        System.out.printf("Funcionário '%s' adicionado\n", this.nomeFuncionario);
    }

    // métodos
    public void cadastraUsuario(Biblioteca biblioteca, Usuario usuarioNovo){
        biblioteca.listaUsuarios.add(usuarioNovo);
    }
    public void gerenciaLivros(Livro livro, String statusLivro){
        livro.setStatusLivro(statusLivro);
    }
    public void emprestaLivro(Livro livro){
        gerenciaLivros(livro, "Emprestado");
        System.out.println("'" + livro.tituloLivro + "' emprestado");
    }
    public void reservaLivro(Livro livro){
        gerenciaLivros(livro, "Reservado");
        System.out.println("'" + livro.tituloLivro + "' reservado");
    }
    public void devolveLivro(Livro livro){
        gerenciaLivros(livro, "Disponível");
        System.out.println("'" + livro.tituloLivro + "' devolvido");
    }

    @Override
    public String toString() {
        return this.nomeFuncionario + " (" + this.cargoFuncionario + ")";
    }
}
