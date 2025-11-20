package exercicios.POO.exerciciosGoogle;

public class Matematica {

    int matricula;
    String nome;
    double prova1;
    double prova2;
    double trabalho;
    double media;

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Nota da prova 1: " + this.prova1);
        System.out.println("Nota da prova 2; " + this.prova2);
        System.out.println("Nota do trabalho: " + this.trabalho);
    }

    public void media() {
        media = ((prova1 * 2.5) + (prova2 * 2.5) + (trabalho * 2)) / 7;
        System.out.printf("A média é: %.2f%n", media);
    }

    public void Final() {
        if (this.media > 7) {
            System.out.println("Aprovado");
        }
        else {
            double falta = 7 - media;
            System.out.printf("Faltam %.2f pontos", falta);
        }
    }
}
