package video.curso.projeto;

public abstract class Pessoa {

    //Atributos da Classe
    private String nome;
    private int idade;
    private char sexo;
    private float experiencia;

    //Classe contrutura

    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }

    //Métodos da Classe
    public void ganharEXP() {
        experiencia += 1;
    }

    //Métodos acessores e modificadores


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome +
                ", idade=" + idade +
                ", sexo=" + sexo +
                ", experiencia=" + experiencia +
                '}';
    }
}
