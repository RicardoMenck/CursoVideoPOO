package video.curso.polimorfismo;

public class Canguru extends Mamifero {
    @Override //Sobreposição ou sobreescrever
    public void locomover() {
        System.out.println("Saltando");
    }

    public void usarBolsa() {
        System.out.println("Usando bolsa");
    }
}
