package video.curso.herança;

public class Bolsista extends Aluno {
    private float bolsa;


    //métodos da classe
    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + this.getNome());
    }


    public void pagarMensalidade() {
        System.out.println(this.getNome() + " é bolsista! Pagamento facilitado.");
    }


    //Métodos acessores e modificadores


    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
