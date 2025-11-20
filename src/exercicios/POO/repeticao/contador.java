package exercicios.POO.repeticao;
import java.util.Scanner;

public class contador {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        System.out.print("contar até:");
        int n = teclado.nextInt();

        int c = 1;

        while (c <= n) {
            System.out.println(c);
            c++;
        }
    }
}
