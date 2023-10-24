package video.curso.polimorfismo;

public class Tartaruga extends Reptil{
    @Override
    public void locomover() {
        super.locomover();
        System.out.println("Andando bem devagar!");
    }
}
