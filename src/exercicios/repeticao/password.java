package exercicios.repeticao;
import java.util.Scanner;

public class password {
    public static void main(String[] args) {

        String senhaCorreta = "jellyous";

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a senha:");
        String senhaDigitada = teclado.next();

        while (!senhaDigitada.equals("jellyous")) {
            System.out.println("senha incorreta");
            System.out.print("digite a senha correta:");
            senhaDigitada = teclado.next();
        }

        System.out.println("senha correta");



    }
}
