package exercicios;

import java.util.Scanner;

public class ForMyBf {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String nome;

        System.out.println("Qual seu nome?");
        nome = teclado.next();

        if (nome.equals("juan")) {
            System.out.println("te amoooooooooooo");
        } else { //o erro tava aqui, tenho q deixar o else grudado/na mesma linha do fechamento do if
                System.out.println("xexelento");
            }
        }
    }
