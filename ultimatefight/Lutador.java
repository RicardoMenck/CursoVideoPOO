package video.curso.ultimatefight;

public class Lutador {
    private String nome;
    private String nacionadade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;

    public Lutador(String nome, String nacionadade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionadade = nacionadade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    // Métodos acessores e modificadores


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionadade() {
        return nacionadade;
    }

    public void setNacionadade(String nacionadade) {
        this.nacionadade = nacionadade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    private void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.getPeso() < 52.2) {
            this.categoria = "Inválida";
        } else if (this.getPeso() <= 70.3) {
            this.categoria = "Leve";
        } else if (this.getPeso() <= 83.9) {
            this.categoria = "Médio";
        } else if (this.getPeso() <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Absoluto";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    // Métodos
    public void apresentar() {
        System.out.println("Lutador: " + this.getNome() + "/nOrigem: " + this.getNacionadade() + "/nIdade: " + this.getIdade() + "/nAltura: " + this.getAltura() + "/nPesando: " + this.getPeso() + "/nGanhou: " + this.getVitorias() + "/nPerdeu: " + this.getDerrotas() + "/nEmpatou: " + this.getEmpates());
    }
    public void status() {
        System.out.println(this.getNome() + " é um peso " + this.getCategoria() + " com " + getVitorias() + getDerrotas() + getEmpates());
    }
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }


}
