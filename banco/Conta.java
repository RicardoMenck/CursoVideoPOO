package video.curso.banco;

public class Conta {
    public int num;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    //Método Construtor
    public Conta() {
        this.num = num;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = 0.0;
        this.status = false;
    }

    //Método acessor e modificador
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Metódos da classe Conta
    public void abrirConta(String t) {
        Conta conta = new Conta();
        this.setStatus(true);
        this.tipo = t;
        if(t == "cc") {
            this.setSaldo(this.getSaldo() + 50.00);
        } else if(t == "cp") {
            this.saldo = saldo + 150.00;
        } else {
            this.saldo = 0;
        }
    }

    public void fecharConta() {
    if(this.status = true && (this.saldo < 0.0 || this.saldo > 0.0)) {
        System.out.println("Há pendencias em sua conta. Não podemos executar o procedimento");
    } else {
        this.status = false;
        System.out.println("Conta desabilitada!");
    }
    }

    public void depositar(int i) {
        if(this.status == true) {
            this.saldo += i;
        } else {
            System.out.println("Erro!");
        }
    }

    public void sacar(int i) {
        if(this.status = true) {
            if(this.saldo >= i) {
                this.saldo -= i;
                System.out.println(this.getDono() + " efetuou um saque no valor de: " + i);
            } else {
                System.out.println("Não possui saldo suficiente");
            }
        } else {
            System.out.println("Erro!");
        }
    }

    public void pagarMensal() {
        if(this.tipo == "cc") {
            this.saldo -= 12.00;
        } else if(this.tipo == "cp") {
            this.saldo -= 20.00;
        } else {
            System.out.println("Seu tipo de conta deixa você isento");
        }
    }

    public void estadoAtual()
    {
        System.out.println("===============================");
        System.out.println("Conta: " + this.getNum());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
        System.out.println("===============================");
    }
}
