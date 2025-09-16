package POO.Banco;

public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
//getters e setters
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
