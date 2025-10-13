package exercicios.POO.Banco;

public class Aula05 {
    public static void main(String[] args) {

        ContaBanco u1 = new ContaBanco();
        u1.setNumConta(1111);
        u1.setDono("Fulano");
        u1.abrirConta("cc");

        ContaBanco u2 = new ContaBanco();
        u2.setNumConta(2222);
        u2.setDono("Fulana");
        u2.abrirConta("cp");

        u1.depositar(100);
        u2.depositar(500);

        u2.sacar(100);

        u1.fecharConta();

        u1.estadoAtual();
        u2.estadoAtual();
    }
}
