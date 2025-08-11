package exercicios.repeticao;
import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = teclado.nextInt();

        for (int t = 1; t <= 10; t++)
        System.out.println(numero + " x " + t + " = " + (numero * t));
    }
}
