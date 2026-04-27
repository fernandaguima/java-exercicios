package exercicios.carrinhodecompras;

public class Produto {

    private String nome;
    private double preco;
    private int quant;

    public Produto(String nome, double preco, int quant) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }
        if (preco < 0) {
            throw new IllegalArgumentException("Preço não pode ser negativo");
        }
        if (quant <= 0) {
            throw new IllegalArgumentException("Insira uma quantidade válida");
        }
        this.nome = nome;
        this.preco = preco;
        this.quant = quant;
    }
    public double calcularTotal() {
        return preco * quant;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuant() {
        return quant;
    }
}
