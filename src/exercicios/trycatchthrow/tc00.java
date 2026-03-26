package exercicios.trycatchthrow;

import java.util.Scanner;

public class tc00 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço:");
        String entrada = sc.nextLine();

        double preco = 0;

        try {
            preco = Double.parseDouble(entrada);;
        } catch (NumberFormatException e) {
            System.out.println("Preço inválido. Digite apenas números.");
        }
        System.out.println("Preço digitado: " + preco);
    }
}
