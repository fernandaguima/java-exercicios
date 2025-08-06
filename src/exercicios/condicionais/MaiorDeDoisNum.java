package exercicios.condicionais;
import java.util.Scanner;
//29
public class MaiorDeDoisNum {
    public static void main(String[] args) {

        int num1, num2;

        Scanner teclado = new Scanner (System.in);

        System.out.print("Número 1:");
        num1 = teclado.nextInt();

        System.out.print("Número 2:");
        num2 = teclado.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " é maior");
        } else if (num1 < num2) {
            System.out.println(num2 + " é maior");
        } else {
            System.out.println("Inválido");
        }




    }
}
