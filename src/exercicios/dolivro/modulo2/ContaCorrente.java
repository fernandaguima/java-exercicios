package exercicios.dolivro.modulo2;

public class ContaCorrente {

    public String nome;
    public int conta;
    public int agencia;
    public double saldo;

    public int sacar(double valor) {
        if (this.saldo <= valor) {
            return 1;
        }
        return 0;
    }

    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    public void imprimir() {
        System.out.println("=====================");
        System.out.println("Nome: " + this.nome);
        System.out.println("Conta: " + this.conta);
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("=====================");
    }
}
