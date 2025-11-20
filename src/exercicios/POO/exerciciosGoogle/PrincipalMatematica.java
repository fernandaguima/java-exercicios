package exercicios.POO.exerciciosGoogle;

public class PrincipalMatematica {

    public static void main(String[] args) {

        Matematica aluno1 = new Matematica();

        aluno1.nome = "Theo";
        aluno1.matricula = 2332;
        aluno1.prova1 = 6.5;
        aluno1.prova2 = 7.5;
        aluno1.trabalho = 5;

        aluno1.imprimir();

        System.out.println("Calculando. . .");

        aluno1.media();
        aluno1.Final();
    }
}
