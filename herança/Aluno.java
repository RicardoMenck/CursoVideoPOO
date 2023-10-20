package video.curso.herança;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    //Método da classe

    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade de aluno " +  this.getNome());
    }
    public void canceçarMatricula(){
        System.out.println("Matricula cancelada!");
    }

    //Método acessores e modificadores

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        curso = curso;
    }
}
