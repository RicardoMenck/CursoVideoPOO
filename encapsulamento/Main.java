package video.curso.encapsulamento;

public class Main {
    public static void main(String[] args) {
        ControleRemoto c1 = new ControleRemoto();
        c1.ligar();
        c1.abrirMenu();
        c1.fecharMenu();
        c1.maisVolume();
        c1.ligarMudo();
        c1.play();
        c1.abrirMenu();
    }
}
