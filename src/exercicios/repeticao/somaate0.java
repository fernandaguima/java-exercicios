package exercicios.repeticao;
import java.util.Scanner;

public class somaate0 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int a;
        int b;
        int soma;

        System.out.println("somando números uhul");
        System.out.println("digite o primeiro número:");
        a = teclado.nextInt();

        System.out.println("digite o segundo número:");
        b = teclado.nextInt();

        soma = a + b;

        //se o usuario digitar 0 em algum a soma para

        while (a == 0 || b == 0) {
            System.out.println("fim da soma");
            break;
        }

        System.out.println("o resultado da soma é " + soma);

    }
}
