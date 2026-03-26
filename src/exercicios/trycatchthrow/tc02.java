package exercicios.trycatchthrow;
import java.util.Scanner;

public class tc02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        String entrada = sc.nextLine();

        int numero = 0;

        try {
            numero = Integer.parseInt(entrada);
        } catch (NumberFormatException e) {
            System.out.println("Valor inválido. Digite apenas números inteiros.");
        }
        System.out.println("Número digitado: " + numero);
    }
}
