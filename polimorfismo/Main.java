package video.curso.polimorfismo;

public class Main {
    public static void main(String[] args) {
        Animal n = new Animal() {
            @Override
            public void locomover() {
                System.out.println("Abstrato");
            }

            @Override
            public void alimentar() {
                System.out.println("Abstrato");

            }

            @Override
            public void emitirSom() {
                System.out.println("Abstrato");

            }
        };

        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        m.setIdade(4);
        m.setPeso(35.2f);
        m.setCorPelo("Caramelo");
        m.alimentar();
        m.locomover();
        m.emitirSom();

        r.setIdade(2);
        r.setPeso(1.23f);
        r.setCorEscama("Brown");
        r.alimentar();
        r.locomover();
        r.emitirSom();

        p.setIdade(3);
        p.setPeso(.91f);
        p.setCorEscama("Dourado");
        p.alimentar();
        p.locomover();
        p.emitirSom();
        p.soltarBolha();

        a.setIdade(7);
        a.setPeso(2.31f);
        a.setCorPena("Verde");
        a.alimentar();
        a.locomover();
        a.emitirSom();
        a.fazerNinho();

    }
}
