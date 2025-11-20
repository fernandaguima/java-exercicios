package exercicios.dolivro.modulo2.exercicio29e210;

public class ContaCorrente {

    int conta;
    int agencia;
    double saldo;
    String nome;

    public double sacar(double valor) {
        if (valor >= this.saldo) {
            return 0;
        }
        this.saldo = this.saldo - valor;
        return 1;
    }

    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Agência: " + this.agencia);
        System.out.println("Conta: " + this.conta);
        System.out.println("Saldo: " + this.saldo);
    }
}
