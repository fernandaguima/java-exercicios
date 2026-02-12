package exercicios.arrayList.Produto;

public class Produto {

    private String nome;
    private double preco;
    private int quant;

    public Produto(String nome, double preco, int quant) {
        this.nome = nome;
        this.preco = preco;
        this.quant = quant;
    }

    public double calcularTotal() {
        return preco * quant;
    }

    public void adicionarEstoque(int qtd) {
        this.quant += qtd;
    }
}
