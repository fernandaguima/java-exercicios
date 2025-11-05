package exercicios.dolivro.modulo1.exercicio03;

public class Computador {

    String marca, cor, modelo;
    int numeroSerie;
    double preco;

    public void imprimir() {
        System.out.println("Marca : " + this.marca);
        System.out.println("Modelo :" + this.modelo);
        System.out.println("Número de série: " + this.numeroSerie);
        System.out.println("Cor: " + this.cor);
        System.out.println("Preco: " + this.preco);
    }

    public void calcularValor() {
        if (marca.equals("HP")) {
            this.preco = this.preco * 1.30;
        }
        if (marca.equals("IBM")) {
            this.preco = this.preco * 1.50;
        }
        else {
            this.preco = this.preco;
        }
    }

    public int alterarValor(double novoValor) {
        if (novoValor > 0) {
            this.preco = novoValor;
            return 1;
        }
        return 0;
    }
}
