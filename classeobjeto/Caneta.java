package video.curso.classeobjeto;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected double carga;
    private boolean tampada;

    //Contrutor
//    public Caneta(String modelo, String cor, float ponta, double carga, boolean tampada) {
//        this.modelo = modelo;
//        this.cor =cor;
//        this.ponta = ponta;
//        this.carga = carga;
//        this.tampada = tampada;
//    }

    //Metodo

    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada " + this.tampada);
    }

    public void rabiscar() {
        if(this.tampada == true) {
            System.out.println("Erro! Não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando!");
        }
    }

    protected void destampar() {
        this.tampada =  false;
    }

    protected void tampar() {
        this.tampada = true;
    }
}





