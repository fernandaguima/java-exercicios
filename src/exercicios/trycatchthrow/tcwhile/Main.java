package exercicios.trycatchthrow.tcwhile;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean valido = false;

        Scanner sc = new Scanner(System.in);

        while (!valido) {
            System.out.println("Digite o preço:");
            String entrada = sc.nextLine();
            try {
                double preco = Double.parseDouble(entrada);
                if (preco < 0) {
                    System.out.println("Preço não pode ser negativo");
                } else {
                    valido = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Preço inválido. Digite apenas números.");
            }
        }
    }
}
