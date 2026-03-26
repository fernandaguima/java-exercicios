package exercicios.trycatchthrow.tc04;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite o preço: ");
        String entrada = sc.nextLine();

        double preco = 0;

        try {
            preco = Double.parseDouble(entrada);
            Produto p = new Produto(nome, preco);
            System.out.println("Produto criado com sucesso!");
        } catch (NumberFormatException e) {
            System.out.println("Preço inválido. Digite apenas números.");;
        }
    }
}
