package exercicios.POO.heranca.guanabara.aula11;

public class Bolsista extends Aluno {
    private int bolsa;

    public void RenovarBolsa() {
        System.out.println("Bolsa renovada!");
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("Bolsa paga!");
    }
}
