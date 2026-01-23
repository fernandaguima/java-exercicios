package exercicios.POO.dolivro.modulo1.exercicio01;

public class PrincipalApolice {

    public static void main(String[] args) {
        Apolice novoObj = new Apolice();

        novoObj.idade = 25;
        novoObj.nome = "Theo";
        novoObj.valorPremio = 100;

        novoObj.imprimir();

        novoObj.calcularPremioApolice();

        System.out.println("Desconto oferecido:");

        novoObj.oferecerDesconto("Curitiba");

        novoObj.imprimir();
    }
}
