package exercicios.POO.ProjetoFinalCurso;

public class Gafanhoto extends Pessoa {

    private String login;
    private int totalAssistido;

    @Override
    protected void ganharExp() {
        System.out.println("Ganhou experiência");
    }

    protected void viuMaisUm() {
        totalAssistido++;
    }
}
