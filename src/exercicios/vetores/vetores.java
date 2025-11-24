package exercicios.vetores;

public class vetores {
    public static void main(String[] args) {

        int[] vetor = {2, 4, 2, 1};
        int soma = 0; // variavel

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];

        } // meu erro aqui foi que eu tava colocando o sout dentro do loop

        System.out.println("A soma é: " + soma);
//        int[] numeros = {1, 2, 3, 4, 5};
//        for (int i = 0; i < numeros.length; i++) {
//            System.out.println(numeros[i]);
//        }
    }
}
