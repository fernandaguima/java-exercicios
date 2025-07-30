package exercicios;
import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);

        System.out.println("Qual é o seu peso?");
        double peso = teclado.nextDouble();

        System.out.println("Qual é a sua altura?");
        double altura = teclado.nextDouble();

        double imc = peso / (altura * altura);

        if (imc <18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >=18.5 && imc <=29.9) {
            System.out.println("Peso normal");
        } else if (imc >=25.0 && imc <=29.9) {
            System.out.println("Sobrepeso");
        } else if (imc >=30.0) {
            System.out.println("Obesidade");
        }
    }
}
