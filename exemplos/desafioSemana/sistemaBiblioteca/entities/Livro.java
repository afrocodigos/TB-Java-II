package entities;

public class Livro {
    // atributos
    public String tituloLivro;
    public String autorLivro;
    public int anoPublicacaoLivro;
    public String statusLivro;

    // construtor
    public Livro(String tituloLivro, String autorLivro, int anoPublicacaoLivro){
        this.tituloLivro = tituloLivro;
        this.autorLivro = autorLivro;
        this.anoPublicacaoLivro = anoPublicacaoLivro;
        this.statusLivro = "Disponível";
        System.out.printf("Livro '%s' criado\n", tituloLivro);
    }

    public void mostraInformacaoLivro(){
        System.out.println("Título do livro: " + tituloLivro);
        System.out.println("Autor: " + autorLivro);
        System.out.println("Ano de publicação: " + anoPublicacaoLivro);
        System.out.println("Status do livro: " + statusLivro);
    }
    public String getStatusLivro(){
        return this.statusLivro;
    }
    public void setStatusLivro(String statusLivro){
        this.statusLivro = statusLivro;
    }

    @Override
    public String toString() {
        return this.tituloLivro + ", " + this.autorLivro + " (" + this.statusLivro + ")";
    }
}
