package exercicios.dolivro.modulo1.exercicio11;

public class PrincipalEstoque {
    public static void main(String[] args) {

        Estoque novo1 = new Estoque();

        novo1.nomeProduto = "Mochilas";
        novo1.valor = 10;
        novo1.quantidade = 100;

        novo1.imprimir();

        int ret = novo1.verificarDisponinibilidade(100);
        if (ret == 1) {
            System.out.println("Produto na quantidade informada disponível");
        }
        else{
            System.out.println("Produto na quantidade informada NÃO disponível");
        }

    }
}
