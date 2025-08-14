package exercicios.condicionais;
import java.util.Scanner;

public class imparPar {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("digite um número:");
        int n = teclado.nextInt();

        if (n % 2 == 0) {
            System.out.println("o número é par");
        } else {
            System.out.println("o número é ímpar");
        }
    }
}
