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
        Canguru c = new Canguru();
        Cachorro k =  new Cachorro();
        Cobra s = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara b = new Arara();

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

        c.locomover();
        k.locomover();
        c.emitirSom();
        k.emitirSom();

        k.reagir("Olá");
        k.reagir("Vai pra la");
        k.reagir(11, 45);
        k.reagir(21, 00);
        k.reagir(true);
        k.reagir(false);
        k.reagir(8, 4.5f);
        k.reagir(2, 12.5f);

    }
}
