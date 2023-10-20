package video.curso.metodomodificador;

public class Main {
    public static void main(String[] args) {

        Livro l1 = new Livro("alo", "inveja", 852);
        l1.getNome();
        l1.getAutor();
        l1.getIsbn();
        l1.getQuantidadePagina();
        System.out.println(l1.getNome() + " " + l1.getAutor()+ " " + l1.getIsbn()+ " " + l1.getQuantidadePagina());
    }
}
