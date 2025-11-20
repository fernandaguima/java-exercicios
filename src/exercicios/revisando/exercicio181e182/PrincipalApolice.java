package exercicios.revisando.exercicio181e182;

public class PrincipalApolice {

    public static void main(String[] args) {

        Apolice novoObj = new Apolice();

        novoObj.nomeSegurado = "Theo";
        novoObj.idade = 45;
        novoObj.valorPremio = 550.0;
        System.out.println("Imprimindo dados iniciais");
        novoObj.imprimir();

        novoObj.calcularPremioApolice();
        System.out.println("Imprimindo dados após a execução do método Calcular");
        novoObj.imprimir();

        novoObj.oferecerDesconto("Rio de Janeiro");
        System.out.println("Após executar método desconto");
        novoObj.imprimir();

    }
}
