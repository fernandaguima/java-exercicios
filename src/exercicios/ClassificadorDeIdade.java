package exercicios;
import java.util.Scanner;

public class ClassificadorDeIdade {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual é a sua idade?");
        int idade = teclado.nextInt();

        if (idade <= 12) {
            System.out.println("Você é criança");
        } else if (idade < 18) {
            System.out.println("Você é adolescente");
        } else if (idade >= 18 && idade < 60) {
            System.out.println("Você é adulto");
        } else {
            System.out.println("Você é idoso");
        }
    }
}
