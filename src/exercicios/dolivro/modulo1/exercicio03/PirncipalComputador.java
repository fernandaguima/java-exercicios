package exercicios.dolivro.modulo1.exercicio03;

public class PirncipalComputador {

    public static void main(String[] args) {

        Computador novo1 = new Computador();

        novo1.marca = "HP";
        novo1.cor = "Preto";
        novo1.modelo = "L1485";
        novo1.numeroSerie = 12345;
        novo1.preco = 3000;

        System.out.println("Primeiro Computador:");
        novo1.calcularValor();
        novo1.imprimir();

        Computador novo2 = new Computador();

        novo2.marca = "IBM";
        novo2.cor = "Azul";
        novo2.modelo = "F1006";
        novo2.numeroSerie = 54321;
        novo2.preco = 2000;

        System.out.println("Segundo computador:");
        novo2.calcularValor();
        novo2.imprimir();


    }
}
