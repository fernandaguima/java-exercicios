package exercicios.trycatchthrow;

public class tc03 {
    private String nome;
    private double preco;

    public tc03(String nome, double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("Preço não pode ser negativo");
        }
        if (nome.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }
        this.nome = nome;
        this.preco = preco;
    }
}
