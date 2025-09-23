package POO.Banco;

public class Aula05 {
    public static void main(String[] args) {

        ContaBanco u1 = new ContaBanco();
        u1.setNumConta(1111);
        u1.setDono("Fulano");
        u1.abrirConta("cc");
        u1.estadoAtual();
    }
}
