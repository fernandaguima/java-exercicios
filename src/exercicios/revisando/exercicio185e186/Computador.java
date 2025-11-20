package exercicios.revisando.exercicio185e186;

public class Computador {

    String marca;
    String cor;
    int modelo;
    int numeroSerie;
    double preco;

    public void imprimir() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Número de série: " + this.numeroSerie);
        System.out.println("Preço: " + this.preco);
    }

    public void calcularValor() {
        if (this.marca.equals("HP")) {
            this.preco *= 1.30;
        }
        if (this.marca.equals("IBM")) {
            this.preco *= 1.50;
        }
    }

    public double alterarValor(double valor) {
        if (valor > 0) {
            this.preco = valor;
            return 1;
        } else {
            return 0;
        }
    }
}
