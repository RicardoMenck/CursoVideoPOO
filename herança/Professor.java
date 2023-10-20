package video.curso.herança;

public class Professor extends Pessoa {
    private String especialidade;
    private double salario;

    //Método da classe
    public void receberAumento(double aum) {
        this.salario += aum;
    }

    //Método acessores e modificadores

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
