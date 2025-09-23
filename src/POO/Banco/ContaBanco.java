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
        setTipo(t);
        setStatus(true);

        if (tipo == "cc") {
            setSaldo(50);
        } else if (tipo == "cp") {
            setSaldo(150);
        }
        System.out.println("Conta aberta. Bem-vindo(a)!");
    }
    
    public void fecharConta() {
        if (getSaldo() > 0) {
            System.out.println("Saldo existente, não é possível fechar a conta.");
        } else if (getSaldo() < 0 ) {
            System.out.println("Conta em débito, não é possível fechar a conta");
        } else {
            setStatus(false);
            System.out.println("Conta fechada.");
        }
    }

    public void depositar(float v) {
        if (getStatus() == true) {
            setSaldo(getSaldo() + v);
        } else {
        System.out.println("Impossível depositar.");
        }
    }

    public void sacar(float v) {
        if (getStatus() == true) {
            if (getSaldo() > v) {
                setSaldo(getSaldo() - v);
            }
        } else {
            System.out.println("Impossível sacar.");
        }
    }

    public void pagarMensal() {
         double v;
        if (getTipo() == "cc") {
            v = 12;
        } else if (getTipo() == "cp") {
            v = 20;
        }
        if (getStatus() == true) {
            if (getSaldo() > v) {
                setSaldo(getSaldo() - v);
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