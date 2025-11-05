package exercicios.dolivro.modulo1.exercicio9Eleitoral;

public class Eleitoral {

    String nome;
    int idade;

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        verificar();
    }

    public void verificar() {
        if (idade<16) {
            System.out.println("Eleitor não pode votar");
        } if ((idade >= 16) && (idade <= 65)) {
            System.out.println("Eleitor deve votar");
        } if (idade > 65) {
            System.out.println("Voto facultativo");
        }
    }
}
