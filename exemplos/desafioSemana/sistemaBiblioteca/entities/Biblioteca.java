package entities;

import java.util.ArrayList;
import entities.Funcionario;
import entities.Usuario;
import entities.Livro;

public class Biblioteca {
    // atributos
    public String nomeBiblioteca;
    public ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
    public ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    public ArrayList<Livro> listaLivros = new ArrayList<>();

    // construtor
    public Biblioteca(String nomeBiblioteca){
        this.nomeBiblioteca = nomeBiblioteca;
        System.out.printf("Biblioteca '%s' criada\n", nomeBiblioteca);
    }

    // métodos
    public void adicionaFuncionario(Funcionario funcionarioNovo){
        listaFuncionarios.add(funcionarioNovo);
    }
    public void adicionaLivro(Livro livroNovo){
        listaLivros.add(livroNovo);
    }
    public void mostraFuncionarios(){
        System.out.println("- Funcionários da biblioteca:");
        if (listaFuncionarios.size() > 0){
            for (Funcionario funcionario: listaFuncionarios){
                System.out.println("  - " + funcionario);
            }
        }
        else {
            System.out.println("Nenhum funcionário cadastrado");
        }
    }
    public void mostraUsuarios(){
        System.out.println("- Usuários cadastrados na biblioteca:");
        if (listaUsuarios.size() > 0){
            for (Usuario usuario: listaUsuarios){
                System.out.println("  - " + usuario);
            }
        }
        else {
            System.out.println("Nenhum usuário cadastrado");
        }
    }
    public void mostraLivros(){
        System.out.println("- Livros da biblioteca:");
        if (listaLivros.size() > 0){
            for (Livro livro: listaLivros){
                System.out.println("  - " + livro);
            }
        }
        else {
            System.out.println("Nenhum livro cadastrado");
        }
    }
}
