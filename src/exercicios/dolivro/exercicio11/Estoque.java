package exercicios.dolivro.exercicio11;

public class Estoque {

    String nomeProduto;
    int quantidade;
    double valor;

    public void imprimir() {
        System.out.println("Nome do produto: " + this.nomeProduto);
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Valor: " + this.valor);
    }

    public int verificarDisponinibilidade(int quant) {

        if ((this.quantidade > 0) && (this.quantidade >= quant)) {
            return 1;
        }
        return 0;
    }
    public int removerProdutos(int quant) {
        int ret = verificarDisponinibilidade(quant);
        if (ret == 1) {
            this.quantidade = this.quantidade - quant;
            return 1;
        }
        return 0;
    }
}
