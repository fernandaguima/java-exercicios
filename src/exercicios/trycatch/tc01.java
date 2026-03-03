package exercicios.trycatch;

import java.util.Scanner;

public class tc01 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro número:");
        int a = teclado.nextInt();

        System.out.print("Digite o segundo número:");
        int b = teclado.nextInt();

        int resultado = 0;

        try {
            resultado = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir por zero.");
        }

        System.out.println("Resultado: " + resultado);
    }
}
