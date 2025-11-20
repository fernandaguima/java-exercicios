package exercicios.POO.repeticao;
import java.util.Scanner;

public class password2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String senhaCorreta = "ihatechatgpt"; //esqueci das aspas

        String senhaDigitada;

        do {
            System.out.print("Digite a senha:");
            senhaDigitada = teclado.next();
            if (!senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Senha incorreta.");
            }
        } while (!senhaDigitada.equals(senhaCorreta));

        System.out.println("Senha correta!");
    }
}
