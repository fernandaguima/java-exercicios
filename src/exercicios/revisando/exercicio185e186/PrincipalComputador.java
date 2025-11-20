package exercicios.revisando.exercicio185e186;

public class PrincipalComputador {

    public static void main(String[] args) {

        Computador novo1 = new Computador();

        novo1.marca = "HP";
        novo1.cor = "preto";
        novo1.modelo = 23434;
        novo1.numeroSerie = 12345;
        novo1.preco = 750;

        novo1.imprimir();
        System.out.println("Calculando valor. . .");
        novo1.calcularValor();
        novo1.imprimir();

        System.out.println("================");

        Computador novo2 = new Computador();

        novo2.marca = "IBM";
        novo2.cor = "azul";
        novo2.modelo = 23454;
        novo2.numeroSerie = 123456;
        novo2.preco = 500;

        novo2.imprimir();
        System.out.println("Alterando valor. . .");
        novo2.alterarValor(550);
        novo2.imprimir();
    }
}
