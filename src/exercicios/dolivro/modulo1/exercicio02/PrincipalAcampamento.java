package exercicios.dolivro.modulo1.exercicio02;

public class PrincipalAcampamento {

    public static void main(String[] args) {

        Acampamento novo  = new Acampamento();

        novo.nome = "Theo";
        novo.idade = 10;

        novo.imprimir();
        novo.separarGrupo();
        novo.imprimir();

    }
}
