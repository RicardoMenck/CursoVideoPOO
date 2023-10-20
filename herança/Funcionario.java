package video.curso.herança;

public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;

    //Método da classe
    public void mudarTrabalho() {
        this.trabalhando = !this.trabalhando;
    }

    //Método acessores e modificadores

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

}
