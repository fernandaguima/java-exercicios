package exercicios.repeticao;
import java.util.Scanner;

public class somaate0 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int a;
        int b;
        int soma;

        //se o usuario digitar 0 em algum a soma para

        while (true) {
            System.out.println("somando números uhul");
            System.out.println("digite o primeiro número:");
            a = teclado.nextInt();

            System.out.println("digite o segundo número:");
            b = teclado.nextInt();

            if (a == 0 || b == 0) {
                System.out.println("NAO VOU somar numero com zero filho");
                break;
            }
        }

        soma = a + b;

        System.out.println("o resultado da soma é " + soma);

    }
}
