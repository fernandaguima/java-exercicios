package POO.Banco;

public class ContaBanco {
//atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }
//metodos

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);

        if (tipo == "cc") {
            this.setSaldo(50);
        } else if (tipo == "cp") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta. Bem-vindo(a)!");
    }
    
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Saldo existente, não é possível fechar a conta.");
        } else if (this.getSaldo() < 0 ) {
            System.out.println("Conta em débito, não é possível fechar a conta");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada.");
        }
    }

    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        } else {
        System.out.println("Impossível depositar em uma conta fechada.");
        }
    }

    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                setSaldo(getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada.");
        }
    }

    public void pagarMensal() {
         int v = 0;
        if (this.getTipo() == "cc") {
            v = 12;
        } else if (this.getTipo() == "cp") {
            v = 20;
        }
        if (this.getStatus()) {
            if (this.getSaldo() > v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso.");
            } else {
                System.out.println("Saldo insuficiente.");
            }
        }
    }

//metodos getters e setters
    public void setNumConta(int n) {
        this.numConta = n;
    }

    public int getNumConta() {
        return this.numConta;
    }

    protected void setTipo(String t) {
        this.tipo = t;
    }

    protected String getTipo() {
        return this.tipo;
    }

    private void setDono(String d) {
        this.dono = d;
    }

    private String getDono() {
        return this.dono;
    }

    private void setSaldo(double s) {
        this.saldo = s;
    }

    private double getSaldo() {
        return this.saldo;
    }

    private void setStatus(boolean s) {
        this.status = s;
    }

    private boolean getStatus() {
        return this.status;
    }
}