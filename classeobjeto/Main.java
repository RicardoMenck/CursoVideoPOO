package video.curso.classeobjeto;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "Azul";
        c1.carga = 90.0;
        //c1.ponta = 0.5f;
        //c1.tampada = false;
        c1.status();
        c1.tampar();
        c1.rabiscar();
        c1.destampar();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.modelo = "Bic";
        c2.cor = "Preto";
        c2.carga = 65.0;
        //c2.ponta = 0.8f;
        //c2.tampada = false;
        c2.destampar();
        c2.status();
        }
}
