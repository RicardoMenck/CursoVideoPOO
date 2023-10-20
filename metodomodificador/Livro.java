package video.curso.metodomodificador;

public class Livro {
    private String nome;
    private String autor;
    private String isbn;
    private int quantidadePagina;


    //Método Construtor
    public Livro(String nome, String autor, String isbn, int quantidadePagina) {
        this.autor = autor;
        this.nome = nome;
        this.isbn = isbn;
        this.quantidadePagina = quantidadePagina;
    }

    public Livro(String nome, String autor, int quantidadePagina) {
        this.autor = autor;
        this.nome = nome;
        this.quantidadePagina = quantidadePagina;
    }


    //Métodos Acessores e Modificadores (get and set)

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getQuantidadePagina() {
        return quantidadePagina;
    }

    public void setQuantidadePagina(int quantidadePagina) {
        this.quantidadePagina = quantidadePagina;
    }
}
