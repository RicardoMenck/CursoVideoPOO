package video.curso.banco;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.setNum(111);
        c1.setDono("Ricard");
        c1.estadoAtual();
        c1.abrirConta("cc");
        c1.estadoAtual();

        Conta c2 = new Conta();
        c2.setNum(123);
        c2.setDono("Zé");
        c2.estadoAtual();
        c2.abrirConta("cp");
        c2.depositar(200);
        c2.sacar(250);
        c2.setSaldo(-2500.00);
        c2.estadoAtual();
        c2.fecharConta();
    }
}
