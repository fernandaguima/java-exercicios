package exercicios.condicionais;

import java.util.Scanner;

 public class Emprestimo {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int idade;

        int salario;

        System.out.println("Qual a sua idade?");
        idade = teclado.nextInt();

        System.out.println("Qual o seu salario?");
        salario = teclado.nextInt();

        System.out.println("Seu nome está limpo?");
        String nomeLimpo = teclado.next();

        if (idade >=20 && salario >=3500 && nomeLimpo.equalsIgnoreCase("sim")) {
            System.out.println("Pode fazer empréstimo");
        } else System.out.println("Não pode fazer empréstimo");

    }
}