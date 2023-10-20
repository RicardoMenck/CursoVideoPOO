package video.curso.encapsulamento;

public class ControleRemoto implements Controlador {
    //Atributos

    private int volume;
    private boolean ligado;
    private boolean tocando;

    //Construtores
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    //Métodos de atribuição e modificação.
    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    // Método abstrato

    @Override //Sobrescrever
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado? " +this.isLigado());
        System.out.println("Está tocando? " + this.isTocando());
        System.out.print("Volume: " + this.getVolume());
        for(int i = 0; i <=this.volume;i+= 10) {
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu");
    }

    @Override
    public void maisVolume() {
        if (isLigado()) {
            this.setVolume(this.getVolume()+10);
        }
    }

    @Override
    public void menosVolume() {
        if (isLigado()) {
            this.setVolume(this.getVolume()-10);
        }
    }

    @Override
    public void ligarMudo() {
        if(this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.isLigado() && this.getVolume() == 0) {
            this.setVolume(10);
        }
    }

    @Override
    public void play() {
        if(this.isLigado() && !(this.isTocando())) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.isLigado() && this.isTocando()) {
            this.setTocando(false);
        }
    }
}
