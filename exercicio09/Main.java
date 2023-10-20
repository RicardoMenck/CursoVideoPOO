package video.curso.exercicio09;

public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro [] l = new Livro[3];

        p[0] = new Pessoa("Pedro", 23,'M');
        p[1] = new Pessoa("Maria!", 25, 'F');

        l[0] = new Livro("Aprendendo Java","José da silva",300, p[0]);
        l[1] = new Livro("POO", "Pedro Paulo", 158,p[1]);
        l[2] = new Livro("Java avancado", "Maria d", 258, p[1]);


        l[0].abrir();
        l[0].folhear(300);
        l[0].voltarPag();
        System.out.println(l[0].detalhes());
        l[0].folhear(0);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());

        l[1].abrir();
        l[1].folhear(159);
        l[1].voltarPag();
        System.out.println(l[1].detalhes());
        l[1].folhear(0);
        l[1].avancarPag();
        System.out.println(l[1].detalhes());

    }
}
