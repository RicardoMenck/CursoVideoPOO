package video.curso.polimorfismo;

public abstract class Animal {
    private float peso;
    private int idade;

    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    // Métodos acessores e modificadores

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
