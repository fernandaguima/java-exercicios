package exercicios.vetores;
import java.util.Scanner;

public class vetores {
    public static void main(String[] args) {
        // exercicios nivel 1

//        int[] vetor = {2, 4, 2, 1};
//        int soma = 0; // variavel
//
//        for (int i = 0; i < vetor.length; i++) {
//            soma += vetor[i];
//
//        } // meu erro aqui foi que eu tava colocando o sout dentro do loop
//
//       System.out.println("A soma é: " + soma);


//        int[] numeros = {1, 2, 3, 4, 9};
//        for (int i = 0; i < numeros.length; i++) {
//            System.out.println(numeros[i]);
//        }

//        int[] numeros = {1,2,3};
//
//                System.out.println(numeros[0]);
//                System.out.println(numeros[2]);
//
//        int soma;
//        int[] numeros = {1, 2, 3, 4, 5};
//            soma = numeros[0] + numeros[3];
//            System.out.println("A soma é: " + soma);

        // exercicios nivel 2

          Scanner op = new Scanner(System.in);
//        int[] idades = new int[3];
//
//        for (int i = 0; i < idades.length; i++) {
//            System.out.println("Digite uma idade:");
//            idades[i] = op.nextInt();
//        }
//
//        System.out.println("Você digitou:");
//        for (int i = 0; i < idades.length; i++) {
//            System.out.println(idades[i]);
//        }

//        int[] numeros = new int[5];
//
//        for (int i = 0; i < numeros.length; i++) {
//            System.out.println("Digite um número:");
//            int valor = op.nextInt();
//            numeros[i] = valor;
//        }
//
//        int maior = numeros[0];
//
//        for (int i = 0; i < numeros.length; i++) {
//            if (numeros[i] > maior) {
//                maior = numeros[i];;
//            }
//        }
//        System.out.println("O maior número é: " + maior);

        int[] numeros = new int[4];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número:");
            int valor = op.nextInt();
            numeros[i] = valor;
        }

        int menor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("O menor número é: " + menor);
    }
}

